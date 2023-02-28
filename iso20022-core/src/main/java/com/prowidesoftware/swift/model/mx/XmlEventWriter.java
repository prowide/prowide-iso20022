/*
 * Copyright 2006-2021 Prowide
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

import com.prowidesoftware.deprecation.DeprecationUtils;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.logging.Level;


/**
 * XMl writer for MX model classes.
 *
 * @since 7.8
 */
public final class XmlEventWriter implements XMLEventWriter {
    private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(XmlEventWriter.class.getName());
    private String indent = "    ";
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

    /**
     * @deprecated use {@link #XmlEventWriter(Writer, String, boolean, String, EscapeHandler, String)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2023)
    public XmlEventWriter(Writer baos, final String defaultPrefix, boolean includeXMLDeclaration, final String rootElement) {
        this(baos, defaultPrefix, includeXMLDeclaration, rootElement, null, null);
        DeprecationUtils.phase2(XmlEventWriter.class, "XmlEventWriter(Writer, String, boolean, String)", "Use XmlEventWriter(Writer, String, boolean, String, EscapeHandler) instead");
    }

    /**
     * @param baos                  output buffer to write
     * @param defaultPrefix         optional prefix (empty by default) to used for all elements that are not binded to a specific prefix
     * @param includeXMLDeclaration true to include the XML declaration (true by default)
     * @param rootElement           local name of the root element of the XML fragment to create, used to declare namespace
     * @param escapeHandler         escape handler to use or null to use the default
     * @see #setPreferredPrefixes(Map)
     * @since 9.1.7
     */
    public XmlEventWriter(Writer baos, final String defaultPrefix, boolean includeXMLDeclaration, final String rootElement, final EscapeHandler escapeHandler, final String indent) {
        this.out = baos;
        this.startElementCount = 0;
        this.nestedLevel = 0;
        this.defaultPrefix = defaultPrefix;
        this.includeXMLDeclaration = includeXMLDeclaration;
        this.rootElement = rootElement;
        this.escapeHandler = escapeHandler != null ? escapeHandler : new DefaultEscapeHandler();
        if(indent!=null) {
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
                        final String localPart = se.getName().getLocalPart();
                        /*
                         * the startElementyCount below fixes the bug related to not opening nested Document inside xs:any
                         */
                        if (StringUtils.equals(localPart, this.rootElement) && this.startElementCount == 1) {
                            delayedStart = se;
                            log.finest("local part is Document, initializing delayed start, startElementCount=" + this.startElementCount);
                        } else {
                            writeIndentIfNeeded(out, nestedLevel);
                            out.write("<" + prefixString(se.getName()) + localPart);
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
                        }
                        sb.append(namespace(ne));
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
                        if (ce.isWhiteSpace() && this.previousEvent != null && this.previousEvent.getEventType() == XMLEvent.END_ELEMENT) {
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
                            if (localPart.equals(this.currentElement) &&
                                    this.previousNestedStartLevel != nestedLevel) {
                                previousNestedStartLevel--;
                                writeIndentIfNeeded(out, previousNestedStartLevel);
                            }
                        }

                        out.write("</" + prefixString(ee.getName()) + localPart + ">");

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
                        String escapedString = a.getValue() != null ? this.escapeHandler.escape(a.getValue().toCharArray(), true) : "";
                        out.write(" " + a.getName() + "=\"" + escapedString + "\"");
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
        if (prefix != null) {
            sb.append(":").append(prefix);
        }
        sb.append("=\"").append(namespace.getValue()).append("\"");
        return sb.toString();
    }

    private String prefixString(final QName qname) {
        String prefix = resolvePrefix(qname);
        if (prefix != null) {
            return prefix + ":";
        } else {
            return "";
        }
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
            out.write('>');
            this.startTagIncomplete = false;
        }
    }

    public void add(XMLEventReader arg0) {
    }

    public void close() {
    }

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

    public void setNamespaceContext(NamespaceContext arg0) {
    }

    public String getPrefix(String arg0) {
        return null;
    }

    public void setDefaultNamespace(String arg0) {
    }

    public void setPrefix(String arg0, String arg1) {
    }

    /**
     * @since 7.9.3
     */
    public String getDefaultPrefix() {
        return defaultPrefix;
    }

    /**
     * @since 7.9.3
     */
    public void setDefaultPrefix(String defaultPrefix) {
        this.defaultPrefix = defaultPrefix;
    }

    /**
     * @deprecated use {@link #getPreferredPrefixes()} instead
     */
    @ProwideDeprecated(phase4 = TargetYear.SRU2023)
    @Deprecated
    public Map<String, String> getPeferredPrefixes() {
        DeprecationUtils.phase3(XmlEventWriter.class, "getPeferredPrefixes()", "Use getPreferredPrefixes() instead");
        return getPreferredPrefixes();
    }

    /**
     * @deprecated use {@link #setPreferredPrefixes(Map)} instead
     */
    @ProwideDeprecated(phase4 = TargetYear.SRU2023)
    @Deprecated
    public void setPeferredPrefixes(Map<String, String> preferredPrefixes) {
        DeprecationUtils.phase3(XmlEventWriter.class, "setPeferredPrefixes(Map)", "Use setPreferredPrefixes(Map) instead");
        setPreferredPrefixes(preferredPrefixes);
    }

    /**
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
     * @since 7.9.3
     */
    public boolean isIncludeXMLDeclaration() {
        return includeXMLDeclaration;
    }

    /**
     * @since 7.9.3
     */
    public void setIncludeXMLDeclaration(boolean includeXMLDeclaration) {
        this.includeXMLDeclaration = includeXMLDeclaration;
    }

    /**
     * @since 7.9.3
     */
    public String getRootElement() {
        return rootElement;
    }

    /**
     * @since 7.9.3
     */
    public void setRootElement(String rootElement) {
        this.rootElement = rootElement;
    }

    /**
     * @since 9.0.2
     */
    public void setPreserveQnamePrefixes(boolean preserveQnamePrefixes) {
        this.preserveQnamePrefixes = preserveQnamePrefixes;
    }
}