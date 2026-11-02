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

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * XMl writer for MX model classes.
 *
 * <p>The model elements are marshalled without namespace and are written with the configured default prefix, bound
 * to the main namespace of the message. Wildcard (xs:any) content, such as supplementary data envelopes and
 * signatures, is written exactly as JAXB sends it: from the first element whose namespace is neither empty, the
 * main namespace nor an xsys namespace (the same boundary rule applied by {@link NamespaceAndElementFilter} on
 * parse) up to its matching end tag, element prefixes, namespace declarations and attribute prefixes are kept as
 * received, and only a namespace bound outside the wildcard content (such as the main namespace) is declared
 * again locally, or undeclared with {@code xmlns=""} for an element without namespace when the main namespace is
 * the default one.
 *
 * <p>Known limitations: wildcard content whose root element has no namespace cannot be told apart from model
 * elements and is written in the main namespace; whitespace inside wildcard content is not preserved; and with
 * no default prefix an unprefixed QName value (such as {@code xsi:type="T"}) that refers to no namespace resolves
 * to the main namespace in the output.
 *
 * @since 7.8
 */
public final class XmlEventWriter implements XMLEventWriter {
    private static final transient java.util.logging.Logger log =
            java.util.logging.Logger.getLogger(XmlEventWriter.class.getName());
    static String DEFAULT_INDENT = "    ";
    private String indent = DEFAULT_INDENT;
    private final Writer out;
    private StartElement delayedStart;
    private boolean startTagIncomplete = false;
    private int startElementCount;
    private int nestedLevel;
    private String defaultPrefix;
    private Map<String, String> preferredPrefixes;
    private boolean includeXMLDeclaration;
    private String rootElement;
    private String currentElement;
    private boolean preserveQnamePrefixes = false;
    private int previousNestedStartLevel;
    private XMLEvent previousEvent;
    private EscapeHandler escapeHandler;
    private String mainNamespace;
    // namespace declared as default (without prefix) by the model content, if any
    private String modelDefaultNamespace;
    // depth inside wildcard (foreign) content, zero while writing model content
    private int foreignDepth = 0;
    // namespace bindings declared inside the foreign content, one map per open foreign element
    private final Deque<Map<String, String>> foreignScopes = new ArrayDeque<>();
    // prefixes used by the open foreign start tag that must be bound when the tag is closed
    private final Map<String, String> pendingBindings = new LinkedHashMap<>();

    /**
     * @param baos                  output buffer to write
     * @param defaultPrefix         optional prefix (empty by default) to used for all elements that are not binded to a specific prefix
     * @param includeXMLDeclaration true to include the XML declaration (true by default)
     * @param rootElement           local name of the root element of the XML fragment to create, used to declare namespace
     * @param escapeHandler         escape handler to use or null to use the default
     * @param indent                optional indent string to use when marshalling into XML, if null, a four spaces string will be used as default
     * @see #setPreferredPrefixes(Map)
     * @since 9.1.7
     */
    public XmlEventWriter(
            Writer baos,
            final String defaultPrefix,
            boolean includeXMLDeclaration,
            final String rootElement,
            final EscapeHandler escapeHandler,
            final String indent) {
        this.out = baos;
        this.startElementCount = 0;
        this.nestedLevel = 0;
        this.defaultPrefix = defaultPrefix;
        this.includeXMLDeclaration = includeXMLDeclaration;
        this.rootElement = rootElement;
        this.escapeHandler = escapeHandler != null ? escapeHandler : new DefaultEscapeHandler();
        if (indent != null) {
            this.indent = indent;
        }
    }

    public void add(final XMLEvent event) throws XMLStreamException {
        if (event != null) {
            try {
                final int type = event.getEventType();
                switch (type) {
                    case XMLEvent.START_DOCUMENT: {
                        if (this.includeXMLDeclaration) {
                            String encoding = ((StartDocument) event).getCharacterEncodingScheme();
                            String encodingOrDefault = encoding != null ? encoding : "UTF-8";
                            out.write("<?xml version=\"1.0\" encoding=\"" + encodingOrDefault + "\" ?>\n");
                        } else {
                            log.finest("skipping xml declaration");
                        }
                        this.previousEvent = event;
                        break;
                    }

                    case XMLEvent.START_ELEMENT: {
                        this.startElementCount++;
                        closeStartTagIfNeeded();
                        final StartElement se = event.asStartElement();
                        final QName name = se.getName();
                        final String localPart = name.getLocalPart();
                        /*
                         * the startElementyCount below fixes the bug related to not opening nested Document inside xs:any
                         */
                        if (StringUtils.equals(localPart, this.rootElement) && this.startElementCount == 1) {
                            delayedStart = se;
                            if (this.mainNamespace == null && StringUtils.isNotEmpty(name.getNamespaceURI())) {
                                // the AppHdr root is marshalled with its namespace in the QName
                                this.mainNamespace = name.getNamespaceURI();
                            }
                            log.finest("local part is Document, initializing delayed start, startElementCount="
                                    + this.startElementCount);
                        } else {
                            writeIndentIfNeeded(out, nestedLevel);
                            if (this.foreignDepth > 0 || isForeign(name.getNamespaceURI())) {
                                startForeignElement(name);
                            } else {
                                out.write("<" + prefixString(name) + localPart);
                            }
                            /*
                             * to support attributes instead of closing here we set a flag and close this later
                             */
                            startTagIncomplete = true;
                        }
                        this.previousNestedStartLevel = nestedLevel;
                        this.nestedLevel++;
                        this.currentElement = localPart;
                        this.previousEvent = event;
                        break;
                    }

                    case XMLEvent.NAMESPACE: {
                        final Namespace ne = (Namespace) event;
                        StringBuilder sb = new StringBuilder();
                        if (this.delayedStart != null) {
                            final String localPart = delayedStart.getName().getLocalPart();
                            sb.append("<" + prefixString(ne.getName()) + localPart);
                            this.delayedStart = null;
                            this.currentElement = localPart;
                            if (this.mainNamespace == null) {
                                // the Document root is marshalled without namespace (see MxWriteImpl), when the
                                // main namespace was not set its namespace is the first one declared
                                this.mainNamespace = ne.getValue();
                            }
                        }
                        sb.append(this.foreignDepth > 0 ? foreignNamespace(ne) : namespace(ne));
                        out.write(sb.toString());
                        startTagIncomplete = true;
                        this.previousEvent = event;
                        break;
                    }

                    case XMLEvent.CHARACTERS: {
                        closeStartTagIfNeeded();
                        final Characters ce = event.asCharacters();
                        if (ce.isIgnorableWhiteSpace()) {
                            this.previousEvent = event;
                            break;
                        }
                        if (ce.isWhiteSpace()
                                && this.previousEvent != null
                                && this.previousEvent.getEventType() == XMLEvent.END_ELEMENT) {
                            this.previousEvent = event;
                            break;
                        }
                        final char[] arr = ce.getData().toCharArray();
                        String escapedString = this.escapeHandler.escape(arr, false);
                        out.write(escapedString);
                        this.previousEvent = event;
                        break;
                    }

                    case XMLEvent.END_ELEMENT: {
                        this.nestedLevel--;
                        closeStartTagIfNeeded();
                        final EndElement ee = event.asEndElement();
                        final String localPart = ee.getName().getLocalPart();

                        // Evaluates if previous end tag is the same as current.
                        // Needed because of embedded tags with same name.
                        // E.g:<Doc:Dt>
                        //          <Doc:Dt>2020-09-01</Doc:Dt>
                        //     </Doc:Dt>
                        if (!localPart.equals(this.currentElement)) {
                            // we are closing a nested element
                            writeIndentIfNeeded(out, nestedLevel);
                        } else {
                            if (localPart.equals(this.currentElement) && this.previousNestedStartLevel != nestedLevel) {
                                previousNestedStartLevel--;
                                writeIndentIfNeeded(out, previousNestedStartLevel);
                            }
                        }

                        if (this.foreignDepth > 0) {
                            out.write("</" + prefixString(ee.getName().getPrefix()) + localPart + ">");
                            this.foreignScopes.pop();
                            this.foreignDepth--;
                        } else {
                            out.write("</" + prefixString(ee.getName()) + localPart + ">");
                        }

                        // Records previous level
                        previousNestedStartLevel = nestedLevel;
                        this.previousEvent = event;
                        break;
                    }

                    case XMLEvent.END_DOCUMENT: {
                        closeStartTagIfNeeded();
                        /*
                         * No need to do anything while writing to a string
                         */
                        this.previousEvent = event;
                        break;
                    }

                    case XMLEvent.ATTRIBUTE: {
                        final Attribute a = (Attribute) event;
                        String escapedString = a.getValue() != null
                                ? this.escapeHandler.escape(a.getValue().toCharArray(), true)
                                : "";
                        out.write(" " + attributeName(a.getName()) + "=\"" + escapedString + "\"");
                        this.previousEvent = event;
                        break;
                    }

                    default: {
                        log.finer("PW Unhandled XMLEvent " + ToStringBuilder.reflectionToString(event));
                        this.previousEvent = event;
                        break;
                    }
                }
            } catch (IOException e) {
                log.severe("PW I/O error: " + e.getMessage());
                log.log(Level.FINER, "PW I/O error: ", e);
                throw new XMLStreamException(e);
            }
        }
    }

    /**
     * For a nested level above zero, writes the proportional identation
     */
    private void writeIndentIfNeeded(Writer writer, int nestedLevel) throws IOException {
        out.write(System.lineSeparator());
        if (nestedLevel > 0) {
            for (int i = 0; i < nestedLevel; i++) {
                writer.write(indent);
            }
        }
    }

    /**
     * Given a namespace event, returns the xmlns declaration with proper prefix
     */
    private String namespace(final Namespace namespace) {
        StringBuilder sb = new StringBuilder(" xmlns");
        String prefix = resolvePrefix(namespace);
        if (StringUtils.isNotEmpty(prefix)) {
            sb.append(":").append(prefix);
        } else {
            this.modelDefaultNamespace = namespace.getValue();
        }
        sb.append("=\"").append(namespace.getValue()).append("\"");
        return sb.toString();
    }

    private String prefixString(final QName qname) {
        return prefixString(resolvePrefix(qname));
    }

    private static String prefixString(final String prefix) {
        return StringUtils.isNotEmpty(prefix) ? prefix + ":" : "";
    }

    /**
     * Returns the qualified attribute name: the local name for attributes without namespace, otherwise the prefix
     * JAXB bound to the attribute namespace followed by the local name
     */
    private String attributeName(final QName name) {
        if (StringUtils.isEmpty(name.getNamespaceURI())) {
            return name.getLocalPart();
        }
        if (StringUtils.isEmpty(name.getPrefix())) {
            // not expected from JAXB, which always binds a prefix for a namespaced attribute
            log.warning("PW namespaced attribute without prefix, written without namespace: " + name);
            return name.getLocalPart();
        }
        if (this.foreignDepth > 0 && !XMLConstants.XML_NS_PREFIX.equals(name.getPrefix())) {
            this.pendingBindings.put(name.getPrefix(), name.getNamespaceURI());
        }
        return name.getPrefix() + ":" + name.getLocalPart();
    }

    /*
     * Wildcard (foreign) content: the boundary is the same as in NamespaceAndElementFilter, model content is
     * either without namespace, in the main namespace or in an xsys namespace; anything else is written as
     * received from JAXB.
     */

    private boolean isForeign(final String namespaceURI) {
        return StringUtils.isNotEmpty(namespaceURI)
                && this.mainNamespace != null
                && !namespaceURI.equals(this.mainNamespace)
                && !XsysNamespaces.isXsysNamespace(namespaceURI);
    }

    private void startForeignElement(final QName name) throws IOException {
        this.foreignDepth++;
        this.foreignScopes.push(new HashMap<>());
        out.write("<" + prefixString(name.getPrefix()) + name.getLocalPart());
        // an element without namespace is pending the undeclaration xmlns="" (JAXB does not send it because it
        // never binds the default namespace, but this writer does when there is no document prefix)
        this.pendingBindings.put(
                StringUtils.defaultString(name.getPrefix()), StringUtils.defaultString(name.getNamespaceURI()));
    }

    /**
     * A namespace declaration inside foreign content is written as received, including a default namespace
     * declaration and the undeclaration xmlns=""
     */
    private String foreignNamespace(final Namespace namespace) {
        final String prefix = StringUtils.defaultString(namespace.getPrefix());
        this.foreignScopes.peek().put(prefix, namespace.getValue());
        this.pendingBindings.remove(prefix);
        return " xmlns" + (prefix.isEmpty() ? "" : ":" + prefix) + "=\"" + namespace.getValue() + "\"";
    }

    /**
     * Declares in the open foreign start tag the prefixes it uses that are not bound inside the foreign content:
     * JAXB binds the main namespace (and other namespaces known to the context) on the root element and does not
     * declare them again, but the root declarations are written with the configured prefixes instead
     */
    private void writePendingBindings() throws IOException {
        for (Map.Entry<String, String> binding : this.pendingBindings.entrySet()) {
            final String prefix = binding.getKey();
            if (!binding.getValue().equals(boundForeignNamespace(prefix))) {
                out.write(" xmlns" + (prefix.isEmpty() ? "" : ":" + prefix) + "=\"" + binding.getValue() + "\"");
                this.foreignScopes.peek().put(prefix, binding.getValue());
            }
        }
        this.pendingBindings.clear();
    }

    /**
     * Returns the namespace bound to the prefix at the current position of the foreign content: the innermost foreign
     * declaration, or for the default namespace (empty prefix) the one declared by the model content, if any
     */
    private String boundForeignNamespace(final String prefix) {
        for (Map<String, String> scope : this.foreignScopes) {
            if (scope.containsKey(prefix)) {
                return scope.get(prefix);
            }
        }
        return prefix.isEmpty() ? StringUtils.defaultString(this.modelDefaultNamespace) : null;
    }

    /**
     * Return the prefix for the preferred prefix map, from the current element qname, or from default in that order
     */
    private String resolvePrefix(final QName qname) {
        if (this.preferredPrefixes != null) {
            String prefix = this.preferredPrefixes.get(qname.getNamespaceURI());
            if (prefix != null) {
                return prefix;
            }
        }
        if (this.preserveQnamePrefixes && StringUtils.isNotBlank(qname.getPrefix())) {
            return qname.getPrefix();
        }
        return this.defaultPrefix;
    }

    /**
     * Return the prefix for the preferred prefix map, from the current element qname, or from default in that order
     */
    private String resolvePrefix(final Namespace namespace) {
        if (this.preferredPrefixes != null) {
            String prefix = this.preferredPrefixes.get(namespace.getValue());
            if (prefix != null) {
                return prefix;
            }
        }
        if (this.preserveQnamePrefixes && StringUtils.isNotBlank(namespace.getPrefix())) {
            return namespace.getPrefix();
        }
        return this.defaultPrefix;
    }

    private void closeStartTagIfNeeded() throws IOException {
        if (this.startTagIncomplete) {
            if (this.foreignDepth > 0 && !this.pendingBindings.isEmpty()) {
                writePendingBindings();
            }
            out.write('>');
            this.startTagIncomplete = false;
        }
    }

    public void add(XMLEventReader arg0) {}

    public void close() {}

    public void flush() throws XMLStreamException {
        try {
            out.flush();
        } catch (IOException e) {
            throw new XMLStreamException(e);
        }
    }

    public NamespaceContext getNamespaceContext() {
        return null;
    }

    public void setNamespaceContext(NamespaceContext arg0) {}

    public String getPrefix(String arg0) {
        return null;
    }

    public void setDefaultNamespace(String arg0) {}

    public void setPrefix(String arg0, String arg1) {}

    /**
     * @return the namespace prefix used for elements that have no explicit prefix configured
     * @since 7.9.3
     */
    public String getDefaultPrefix() {
        return defaultPrefix;
    }

    /**
     * @param defaultPrefix the namespace prefix to use for elements with no explicit prefix configured
     * @since 7.9.3
     */
    public void setDefaultPrefix(String defaultPrefix) {
        this.defaultPrefix = defaultPrefix;
    }

    /**
     * @return the map of namespace URI to preferred prefix overrides, or null if not set
     * @since 9.0.2
     */
    public Map<String, String> getPreferredPrefixes() {
        return preferredPrefixes;
    }

    /**
     * Custom optional prefix configuration, if provided, this prefixes will
     * be used regardless of any other context namespaces and prefix configuration.
     *
     * @param preferredPrefixes a map with namespaceURIs as keys and prefixes as values
     * @since 9.0.2
     */
    public void setPreferredPrefixes(Map<String, String> preferredPrefixes) {
        this.preferredPrefixes = preferredPrefixes;
    }

    /**
     * @return true if the XML declaration line will be included in the output
     * @since 7.9.3
     */
    public boolean isIncludeXMLDeclaration() {
        return includeXMLDeclaration;
    }

    /**
     * @param includeXMLDeclaration true to include the XML declaration in the output
     * @since 7.9.3
     */
    public void setIncludeXMLDeclaration(boolean includeXMLDeclaration) {
        this.includeXMLDeclaration = includeXMLDeclaration;
    }

    /**
     * @return the local name of the root element being written
     * @since 7.9.3
     */
    public String getRootElement() {
        return rootElement;
    }

    /**
     * @param rootElement the local name of the root element being written
     * @since 7.9.3
     */
    public void setRootElement(String rootElement) {
        this.rootElement = rootElement;
    }

    /**
     * Main namespace of the message, used to tell model content from wildcard (xs:any) content. The Document root
     * is marshalled with a QName without namespace (see {@link MxWriteImpl}), so when this is not set the first
     * namespace declared on the root element is used.
     *
     * @param mainNamespace the namespace of the message
     */
    void setMainNamespace(String mainNamespace) {
        this.mainNamespace = mainNamespace;
    }

    /**
     * @param preserveQnamePrefixes if true, QName prefixes from the JAXB model are preserved in the output
     * @since 9.0.2
     */
    public void setPreserveQnamePrefixes(boolean preserveQnamePrefixes) {
        this.preserveQnamePrefixes = preserveQnamePrefixes;
    }
}
