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
 * sibling or parent content such as a transmission envelope. Then within the main element being processed, only the
 * content with a recognized namespace is propagated, meaning for example any supplementary data with Any in the schema
 * will not be parsed.
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
    private boolean inInnerElementToSkip = false;
    private String localNameToSkip;
    private final boolean unbindNamespace;

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

        if (inInnerElementToSkip) {
            return;
        }

        if (!this.inElementToPropagate && localName.equals(this.localNameToPropagate)) {
            this.inElementToPropagate = true;
            this.mainNamespace = namespace;
        }

        if (this.inElementToPropagate) {
            String namespaceToPropagate = resolveNamespaceToPropagate(namespace);
            if (namespaceToPropagate != null) {
                try {
                    super.startElement(namespaceToPropagate, localName, prefix, attributes);
                } catch (Exception e) {
                    log.warning("Error parsing " + localName + " [" + namespace + "] element: " + exceptionMessage(e));
                    if (log.isLoggable(Level.FINEST)) {
                        log.log(Level.FINEST, "Error parsing " + localName + " [" + namespace + "] element", e);
                    }
                }
            } else {
                // we have found an element within the structure to propagate with a not recognized namespace
                // so we skip this content because we don't have the model to unmarshall it properly;
                // this is normally the case of an Any element in the schema
                this.inInnerElementToSkip = true;
                this.localNameToSkip = localName;
            }
        }
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

    private boolean isXsysNamespace(String namespace) {
        return "urn:swift:snl:ns.Doc".equals(namespace)
                || "urn:swift:snl:ns.Sw".equals(namespace)
                || "urn:swift:snl:ns.SwGbl".equals(namespace)
                || "urn:swift:snl:ns.SwInt".equals(namespace)
                || "urn:swift:snl:ns.SwSec".equals(namespace);
    }

    @Override
    public void endElement(String namespace, String localName, String prefix) throws SAXException {

        if (this.inInnerElementToSkip) {
            if (localName.equals(this.localNameToSkip)) {
                // stop skipping
                this.inInnerElementToSkip = false;
                this.localNameToSkip = null;
                return;
            }
        }

        if (this.inElementToPropagate) {
            String namespaceToPropagate = resolveNamespaceToPropagate(namespace);
            if (namespaceToPropagate != null) {
                try {
                    super.endElement(namespaceToPropagate, localName, prefix);
                } catch (Exception e) {
                    log.warning("Error parsing " + localName + " [" + namespace + "] element: " + exceptionMessage(e));
                    if (log.isLoggable(Level.FINEST)) {
                        log.log(Level.FINEST, "Error parsing " + localName + " [" + namespace + "] element", e);
                    }
                }
            }
        }

        if (localName.equals(this.localNameToPropagate)) {
            // we are done (we will skip the rest of the XML content
            this.inElementToPropagate = false;
        }
    }

    @Override
    public void startPrefixMapping(String prefix, String url) throws SAXException {
        if (this.inElementToPropagate && this.mainNamespace != null) {
            if (isXsysNamespace(url)) {
                // we only propagate the xsys messages namespaces, for the main namespace we want it unbounded
                try {
                    super.startPrefixMapping(prefix, url);
                } catch (Exception e) {
                    log.warning("Error parsing " + prefix + " [" + url + "] prefix mapping: " + exceptionMessage(e));
                    if (log.isLoggable(Level.FINEST)) {
                        log.log(Level.FINEST, "Error parsing " + prefix + " [" + url + "] prefix mapping", e);
                    }
                }
            }
        }
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
