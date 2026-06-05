/*
 * Copyright 2006-2023 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.prowidesoftware.swift.model.mx;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * This filter enables extraction of a particular element from an XML.
 *
 * <p>The filter will bypass only the main element being parsed (such as the AppHdr or Document), ignoring any other
 * sibling or parent content such as a transmission envelope. Within the main element being processed, content in the
 * main message namespace is unbound (the namespace is stripped) and content in the SWIFT xsys namespaces is kept as is.
 * Any other content (foreign namespace or no namespace) is treated as {@code xsd:any} wildcard content (for example a
 * {@code SplmtryData/Envlp} payload or a signature envelope) and is forwarded verbatim, with its namespaces intact, so
 * that JAXB's {@code @XmlAnyElement} binding can materialize it as a {@link org.w3c.dom.Element}.
 *
 * <p>Known limitation: a wildcard child that happens to reuse the exact main message namespace is treated as model
 * content (unbound), not captured as wildcard, because the filter keys its decision purely on the namespace. This does
 * not affect the usual wildcard payloads, which use a foreign namespace or no namespace.
 *
 * <p>Regarding the namespace, two different behaviours are supported; bounded or unbounded.
 *
 * <p>By default the filter will unbind the propagated elements from its namespace. This is done by filtering out the
 * namespace declaration and optional associated prefix. This is useful and actually required when the filter is used
 * by the message parser. When parsing the Document or AppHdr for an MX, we have to unbind the main message namespace
 * because the generated jaxb model for element types is shared and not bounded to any specific message type. Meaning
 * we don't have duplicated type classes for each message they appear in, instead we have single non-repetitive types
 * with no namespace.
 *
 * <p>By constructor parameter, the namespace unbinding can also be switched off to let the elements namespace binding
 * untouched. This is useful when the filter is used in the context of a validation against schema.
 *
 * @since 9.2.1
 */
public class NamespaceAndElementFilter extends XMLFilterImpl {
    private static final Logger log = Logger.getLogger(NamespaceAndElementFilter.class.getName());

    private String mainNamespace;
    private boolean inElementToPropagate = false;
    private final String localNameToPropagate;
    private final boolean unbindNamespace;
    private final List<PrefixMapping> pendingPrefixMappings = new ArrayList<>();

    // Element depth within the propagated element (incremented on every forwarded startElement).
    private int depth = 0;
    // Depth at which we entered an xsd:any wildcard subtree, or -1 when not inside one.
    private int wildcardDepth = -1;
    // Prefix mappings buffered until the upcoming startElement reveals whether to forward them.
    private final List<PrefixMapping> bufferedStartMappings = new ArrayList<>();
    // Per-forwarded-element list of prefixes actually forwarded, so the matching endPrefixMapping
    // events can be synthesized in endElement (LIFO), keeping the downstream namespace stack balanced.
    private final Deque<List<String>> forwardedPrefixStack = new ArrayDeque<>();

    private static class PrefixMapping {
        final String prefix;
        final String url;

        PrefixMapping(String prefix, String url) {
            this.prefix = prefix;
            this.url = url;
        }
    }

    /**
     * @param localName the XML's element to propagate
     */
    public NamespaceAndElementFilter(String localName) {
        this(localName, true);
    }

    /**
     * Creates the filter with an option to unbinds or not the namespace from the propagated elements
     * @param localName the XML's element to propagate
     * @param unbindNamespace true to filter out the namespace declaration and optional associated prefix
     */
    public NamespaceAndElementFilter(String localName, boolean unbindNamespace) {
        super();
        this.localNameToPropagate = localName;
        this.unbindNamespace = unbindNamespace;
    }

    @Override
    public void startElement(String namespace, String localName, String prefix, Attributes attributes)
            throws SAXException {

        // Prefixes forwarded as part of entering the propagated element (GH-168 xsys replay).
        List<String> entryForwarded = null;

        if (wildcardDepth < 0 && !this.inElementToPropagate && localName.equals(this.localNameToPropagate)) {
            this.inElementToPropagate = true;
            this.mainNamespace = namespace;

            // Propagate any queued xsys prefix mappings (declared in an outer envelope before the
            // element to propagate) only when the propagated element is itself an xsys Document,
            // because only xsys Document bodies reference Sw/SwInt/SwGbl elements. Replaying them
            // for regular ISO 20022 Documents would be unnecessary and can produce spurious warnings
            // or namespace-stack errors in strict SAX-to-StAX bridges.
            if (isXsysDocumentNamespace(this.mainNamespace)) {
                entryForwarded = new ArrayList<>();
                for (PrefixMapping pm : pendingPrefixMappings) {
                    try {
                        super.startPrefixMapping(pm.prefix, pm.url);
                        entryForwarded.add(pm.prefix);
                    } catch (Exception e) {
                        log.warning("Error propagating pending prefix mapping " + pm.prefix + " [" + pm.url + "]: "
                                + exceptionMessage(e));
                        if (log.isLoggable(Level.FINEST)) {
                            log.log(Level.FINEST, "Error propagating pending prefix mapping", e);
                        }
                    }
                }
            }
            pendingPrefixMappings.clear();
        }

        if (wildcardDepth >= 0) {
            // Already inside an xsd:any wildcard subtree: forward the content verbatim with its
            // original namespace so JAXB's @XmlAnyElement binding materializes it as a DOM Element.
            forwardStart(namespace, localName, prefix, attributes, true, entryForwarded);
            return;
        }

        if (this.inElementToPropagate) {
            String namespaceToPropagate = resolveNamespaceToPropagate(namespace);
            if (namespaceToPropagate != null) {
                // recognized content: main namespace (unbound to "") or xsys namespace (kept as is)
                forwardStart(namespaceToPropagate, localName, prefix, attributes, false, entryForwarded);
            } else {
                // foreign or no-namespace content within the structure to propagate: this is the
                // xsd:any wildcard case. Enter wildcard mode and forward the subtree verbatim so
                // JAXB captures it as an org.w3c.dom.Element instead of dropping it.
                this.wildcardDepth = this.depth;
                forwardStart(namespace, localName, prefix, attributes, true, entryForwarded);
            }
        }
    }

    /**
     * Forwards a startElement downstream, first flushing the buffered prefix mappings that apply to
     * it and recording the forwarded prefixes on {@link #forwardedPrefixStack} so the matching end
     * mappings can be synthesized on the corresponding endElement.
     *
     * @param namespaceToPropagate the namespace to forward (already resolved/unbound for non-wildcard content)
     * @param wildcard true to forward every buffered mapping verbatim (wildcard content); false to forward only xsys
     * @param entryForwarded prefixes already forwarded while entering the propagated element (GH-168), or null
     */
    private void forwardStart(
            String namespaceToPropagate,
            String localName,
            String prefix,
            Attributes attributes,
            boolean wildcard,
            List<String> entryForwarded)
            throws SAXException {
        List<String> forwarded = entryForwarded != null ? entryForwarded : new ArrayList<>();
        for (PrefixMapping pm : bufferedStartMappings) {
            if (wildcard || isXsysNamespace(pm.url)) {
                try {
                    super.startPrefixMapping(pm.prefix, pm.url);
                    forwarded.add(pm.prefix);
                } catch (Exception e) {
                    log.warning(
                            "Error parsing " + pm.prefix + " [" + pm.url + "] prefix mapping: " + exceptionMessage(e));
                    if (log.isLoggable(Level.FINEST)) {
                        log.log(Level.FINEST, "Error parsing " + pm.prefix + " [" + pm.url + "] prefix mapping", e);
                    }
                }
            }
        }
        bufferedStartMappings.clear();
        forwardedPrefixStack.push(forwarded);
        try {
            super.startElement(
                    namespaceToPropagate, localName, unboundQName(namespaceToPropagate, localName, prefix), attributes);
        } catch (Exception e) {
            log.warning(
                    "Error parsing " + localName + " [" + namespaceToPropagate + "] element: " + exceptionMessage(e));
            if (log.isLoggable(Level.FINEST)) {
                log.log(Level.FINEST, "Error parsing " + localName + " [" + namespaceToPropagate + "] element", e);
            }
        }
        depth++;
    }

    /**
     * Returns the qualified name to forward downstream. When the element namespace has been unbound
     * (resolved to an empty namespace) the original prefix must be dropped, because an element in no
     * namespace cannot carry a prefix; keeping it would leave an undeclared prefix that breaks the
     * DOM construction performed by JAXB for wildcard ({@code @XmlAnyElement}) content reusing the main
     * namespace. For elements that keep their namespace (xsys or foreign wildcard) the qName is kept.
     */
    private static String unboundQName(String namespaceToPropagate, String localName, String qName) {
        return (namespaceToPropagate == null || namespaceToPropagate.isEmpty()) ? localName : qName;
    }

    private String resolveNamespaceToPropagate(String namespace) {
        if (StringUtils.equals(this.mainNamespace, namespace)) {
            if (this.unbindNamespace) {
                // we only propagate elements in the specific main namespace of the parsed element, however we do not
                // propagate the
                // namespace itself for those elements because we want the content to be unbounded to it. The only other
                // exception
                // where we propagate the elements is for xsys messages where the messages uses a main namespace plus
                // several
                // complementary reusable schemas such as "Sw".
                return "";
            } else {
                return namespace;
            }
        } else if (isXsysNamespace(namespace)) {
            return namespace;
        } else {
            return null;
        }
    }

    /**
     * Checks whether the given namespace is one of the SNL reusable schema namespaces (Sw, SwInt,
     * SwGbl, SwSec, Doc) used by xsys messages.
     */
    private boolean isXsysNamespace(String namespace) {
        return "urn:swift:snl:ns.Doc".equals(namespace)
                || "urn:swift:snl:ns.Sw".equals(namespace)
                || "urn:swift:snl:ns.SwGbl".equals(namespace)
                || "urn:swift:snl:ns.SwInt".equals(namespace)
                || "urn:swift:snl:ns.SwSec".equals(namespace);
    }

    /**
     * Checks whether the given namespace is the main namespace of an xsys Document (any namespace
     * under {@code urn:swift:xsd:xsys.*} declared on the Document root element). Used to decide
     * whether queued xsys prefix mappings must be replayed on the downstream handler.
     */
    private boolean isXsysDocumentNamespace(String namespace) {
        return namespace != null && namespace.startsWith("urn:swift:xsd:xsys.");
    }

    @Override
    public void endElement(String namespace, String localName, String prefix) throws SAXException {

        if (wildcardDepth >= 0) {
            // Inside a wildcard subtree: forward verbatim. Check before decrementing whether this
            // closes the wildcard root element.
            boolean closingWildcardRoot = (this.depth - 1 == this.wildcardDepth);
            forwardEnd(namespace, localName, prefix);
            if (closingWildcardRoot) {
                this.wildcardDepth = -1;
            }
            return;
        }

        if (this.inElementToPropagate) {
            String namespaceToPropagate = resolveNamespaceToPropagate(namespace);
            if (namespaceToPropagate != null) {
                forwardEnd(namespaceToPropagate, localName, prefix);
            }
        }

        if (localName.equals(this.localNameToPropagate)) {
            // we are done (we will skip the rest of the XML content); reset state defensively
            this.inElementToPropagate = false;
            this.depth = 0;
            this.wildcardDepth = -1;
            this.forwardedPrefixStack.clear();
            this.bufferedStartMappings.clear();
        }
    }

    /**
     * Forwards an endElement downstream and then synthesizes the matching endPrefixMapping events
     * (in reverse order) for the prefixes that were forwarded on the corresponding startElement,
     * keeping the downstream namespace stack balanced.
     */
    private void forwardEnd(String namespaceToPropagate, String localName, String prefix) throws SAXException {
        try {
            super.endElement(namespaceToPropagate, localName, unboundQName(namespaceToPropagate, localName, prefix));
        } catch (Exception e) {
            log.warning(
                    "Error parsing " + localName + " [" + namespaceToPropagate + "] element: " + exceptionMessage(e));
            if (log.isLoggable(Level.FINEST)) {
                log.log(Level.FINEST, "Error parsing " + localName + " [" + namespaceToPropagate + "] element", e);
            }
        }
        if (!forwardedPrefixStack.isEmpty()) {
            List<String> forwarded = forwardedPrefixStack.pop();
            for (int i = forwarded.size() - 1; i >= 0; i--) {
                try {
                    super.endPrefixMapping(forwarded.get(i));
                } catch (Exception e) {
                    log.warning("Error ending prefix mapping " + forwarded.get(i) + ": " + exceptionMessage(e));
                    if (log.isLoggable(Level.FINEST)) {
                        log.log(Level.FINEST, "Error ending prefix mapping " + forwarded.get(i), e);
                    }
                }
            }
        }
        depth--;
    }

    @Override
    public void startPrefixMapping(String prefix, String url) throws SAXException {
        if (this.inElementToPropagate) {
            // Inside the propagated subtree the decision (unbind the main namespace, keep xsys, or
            // capture wildcard content) depends on the upcoming element, which SAX delivers right
            // after these mappings. Buffer them and let startElement decide which to forward, so
            // start and end prefix mappings stay balanced downstream.
            bufferedStartMappings.add(new PrefixMapping(prefix, url));
        } else if (isXsysNamespace(url)) {
            // Store xsys namespace mappings that appear before the element to propagate, to replay
            // them if the propagated element turns out to be an xsys Document (GH-168 / PW-3202).
            // This handles the case where AppHdr with xsys namespaces appears before Document.
            pendingPrefixMappings.add(new PrefixMapping(prefix, url));
        }
        // other mappings declared outside the propagated element are dropped
    }

    @Override
    public void endPrefixMapping(String prefix) throws SAXException {
        // Intentionally a no-op. The matching end prefix mapping events are synthesized in endElement
        // from forwardedPrefixStack, so they balance exactly the start mappings we forwarded. Letting
        // XMLFilterImpl forward every endPrefixMapping (including the unbound main namespace and the
        // dropped outer-envelope mappings) is what underflows the downstream JAXB namespace stack,
        // producing the negative-index ArrayIndexOutOfBoundsException.
    }

    private static String exceptionMessage(Exception e) {
        String message = e.getMessage();
        if (message == null && e.getCause() != null) {
            message = e.getCause().getMessage();
        }
        if (message == null) {
            message = e.getClass().getSimpleName();
        }
        return message;
    }
}
