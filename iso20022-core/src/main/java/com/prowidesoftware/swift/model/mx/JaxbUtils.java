/*
 * Copyright 2006-2020 Prowide
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

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.util.EventReaderDelegate;
import javax.xml.transform.sax.SAXSource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;

import com.prowidesoftware.ProwideException;
import com.prowidesoftware.swift.utils.SafeXmlUtils;

/**
 * Helper jaxb based parse methods using the {@link JaxbContextLoader}
 * @since 9.0.1
 */
class JaxbUtils {
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(JaxbUtils.class.getName());

    /**
     * Parse an object from an event reader.
     *
     * <p>IMPORTANT: the event must be positioned at the element to parse. And the xml must be filtered without ISO
     * namespaces and prefixes.
     *
     * @param targetClass the class of the object being parsed
     * @param reader the event reader, must be positioned to the start element to parse
     * @param classes the object classes to build a jaxb context
     * @return parsed element or null if cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     */
    public static Object parseSAX(final Class targetClass, SAXSource source, final Class<?>[] classes) {
        Validate.notNull(targetClass, "target class to parse must not be null");
        Validate.notNull(source, "SAXSource to parse must not be null");
        Validate.notNull(classes, "object model classes aray must not be null");

        try {
            JAXBContext context = JaxbContextLoader.INSTANCE.get(targetClass, classes);
            final Unmarshaller unmarshaller = context.createUnmarshaller();
            return unmarshaller.unmarshal(source, targetClass).getValue();

        } catch (JAXBException|ExecutionException e) {
            if (e instanceof UnmarshalException) {
                final Throwable cause = e.getCause();
                if (cause instanceof SAXParseException) {
                    SAXParseException spe = (SAXParseException) cause;
                    throw new ProwideException("Error parsing XML at line "+spe.getLineNumber() +", column "+spe.getColumnNumber(), cause);
                } else {
                    throw new ProwideException("Error parsing XML", cause);
                }
            }
            log.severe("An error occurred while reading XML: " + e.getMessage());
            log.log(Level.FINEST, "Read exception while parsing "+source, e);
        }
        return null;
    }
    
    /**
     * Parse an object from an event reader.
     *
     * <p>IMPORTANT: the event must be positioned at the element to parse. And the xml must be filtered without ISO
     * namespaces and prefixes.
     *
     * @param targetClass the class of the object being parsed
     * @param reader the event reader, must be positioned to the start element to parse
     * @param classes the object classes to build a jaxb context
     * @return parsed element or null if cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     */
    public static Object parse(final Class targetClass, XMLEventReader reader, final Class<?>[] classes) {
        Validate.notNull(targetClass, "target class to parse must not be null");
        Validate.notNull(reader, "XML reader to parse must not be null");
        Validate.notNull(classes, "object model classes aray must not be null");

        try {
            JAXBContext context = JaxbContextLoader.INSTANCE.get(targetClass, classes);
            final Unmarshaller unmarshaller = context.createUnmarshaller();
            return unmarshaller.unmarshal(reader, targetClass).getValue();

        } catch (JAXBException|ExecutionException e) {
            if (e instanceof UnmarshalException) {
                final Throwable cause = e.getCause();
                if (cause instanceof SAXParseException) {
                    SAXParseException spe = (SAXParseException) cause;
                    throw new ProwideException("Error parsing XML at line "+spe.getLineNumber() +", column "+spe.getColumnNumber(), cause);
                } else {
                    throw new ProwideException("Error parsing XML", cause);
                }
            }
            log.severe("An error occurred while reading XML: " + e.getMessage());
            log.log(Level.FINEST, "Read exception while parsing "+reader, e);
        }
        return null;
    }

    /**
     * Parse an object from XML with optional wrapper and sibling elements that will be ignored.
     * @param targetClass calss of the object being parsed
     * @param xml the XML content, can contain wrapper elements that will be ignored
     * @param classes the object classes to build a jaxb context
     * @param localName the specific element to parse within the parameter XML
     * @return parsed element or null if cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     */
    static Object parse(final Class targetClass, final String xml, final Class<?>[] classes, final String localName, final String namespace) {
        Validate.notNull(targetClass, "target class to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be null nor a blank string");
        Validate.notNull(classes, "object model classes aray must not be null");
        Validate.notBlank(localName, "The XML element to parse must not be null nor a blank string");

        try {
            final XMLInputFactory xif = SafeXmlUtils.inputFactory();
            //xif.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, true);
            //xif.setProperty(XMLInputFactory.IS_VALIDATING, false);
            final StringReader stringReader = new StringReader(unbindNamespace(xml));
            final XMLEventReader reader = xif.createXMLEventReader(stringReader);
            //final XMLEventReader filteredReader = new EventReaderWithNamespace(reader, namespace);

            JAXBContext jaxbContext = JaxbContextLoader.INSTANCE.get(targetClass, classes);
            final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            XMLEvent e;
            // loop though the xml stream
            while ( (e = reader.peek()) != null ) {
                // only the specific element is parsed here, ignoring header and any possible wrapper content
                // check the event is the start element for the parameter local name
                if (e.isStartElement() && ((StartElement)e).getName().getLocalPart().equals(localName)) {
                    // unmarshal the element
                    return unmarshaller.unmarshal(reader, targetClass).getValue();
                } else {
                    reader.next();
                }
            }

        } catch (JAXBException|ExecutionException|XMLStreamException e) {
            if (e instanceof UnmarshalException) {
                final Throwable cause = e.getCause();
                if (cause instanceof SAXParseException) {
                    SAXParseException spe = (SAXParseException) cause;
                    throw new ProwideException("Error parsing XML at line "+spe.getLineNumber() +", column "+spe.getColumnNumber(), cause);
                } else {
                    throw new ProwideException("Error parsing XML", cause);
                }
            }
            log.severe("An error occurred while reading XML: " + e.getMessage());
            log.log(Level.FINEST, "Read exception while parsing "+xml, e);
        }
        return null;
    }

    /**
     * A filter to ignore all elements prefixes (for Sax)
     */
    private static class IgnorePrefixFilter extends XMLFilterImpl {
        private String namespace;

        public IgnorePrefixFilter(XMLReader reader, final String namespace) {
            super(reader);
            this.namespace = namespace;
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            int index = qName.indexOf(':');
            if (index >= 0) {
                qName = qName.substring(index + 1);
            }
            uri = this.namespace;
            super.startElement(uri, localName, qName, attributes);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            int index = qName.indexOf(':');
            if (index >= 0) {
                qName = qName.substring(index + 1);
            }
            super.endElement(uri, localName, qName);
        }
    }

    /**
     * Filter adding default namespace declaration to root element (for Stax).
     */
    private static class EventReaderWithNamespace extends EventReaderDelegate {
        private final XMLEventFactory factory = XMLEventFactory.newInstance();
        private final String namespace;

        private int startElementCount = 0;

        public EventReaderWithNamespace(XMLEventReader reader, String namespace) {
            super(reader);
            this.namespace = namespace;
        }

        /**
         * Duplicates and event adding the namespace declaration.
         * @param startElement the event
         * @return event copy with namespace
         */
        private StartElement withNamespace(StartElement startElement) {
            List<Object> namespaces = new ArrayList<>();
            namespaces.add(factory.createNamespace(namespace));
            Iterator<?> originalNamespaces = startElement.getNamespaces();
            while (originalNamespaces.hasNext()) {
                namespaces.add(originalNamespaces.next());
            }
            return factory.createStartElement(new QName(namespace, startElement.getName().getLocalPart()),
                    startElement.getAttributes(), namespaces.iterator());
        }

        @Override
        public XMLEvent nextEvent() throws XMLStreamException {
            XMLEvent event = super.nextEvent();
            if (event.isStartElement()) {
                if (++startElementCount == 1) {
                    return withNamespace(event.asStartElement());
                }
            }
            return event;
        }

        @Override
        public XMLEvent peek() throws XMLStreamException {
            XMLEvent event = super.peek();
            if (startElementCount == 0 && event != null && event.isStartElement()) {
                return withNamespace(event.asStartElement());
            } else {
                return event;
            }
        }
    }

    /**
     * Removes any SWIFT and ISO namespace and its associated prefix in the elements.
     */
    /* It is necessary to allow partial and lenient unmarshalling with the shared dictionary not bounded to specific
     * message types namespace. The implementation is not the best, but it works quite ok with reasonable performance.
     * Should be change or event removed if the parsing implementation is changed from the current stax based
     * unmarshalling to something else allowing to process not-namespace aware filtered chunks of the XML.
     */
    static String unbindNamespace(final String input) {
        String param = input;
        while (true) {
            final String replaced = unbindNamespaceIteration(param);
            if (replaced == null) {
                return param;
            } else {
                param = replaced;
            }
        }
    }

    // this patterns is for any namespace containing an MX id, not only for SWIFT and ISO namespaces
    // it also catches the AH legacy namespace
    private static final Pattern xmlnsDocumentPattern = Pattern.compile(".*([\\s]+?xmlns:?(\\w+)?\\s*=\\s*[\"|'].*([a-zA-Z]{4}\\.\\d{3}\\.\\d{3}\\.\\d{2}|ahV10)[^\\s]*[\"|']).*", Pattern.MULTILINE | Pattern.DOTALL	| Pattern.CASE_INSENSITIVE);

    /**
     * String manipulation to remove prefix and namespace from Document
     * @param input the XML to process
     * @return the same XML without prefix and namespace
     */
    // Sep 2016: The MxParser analyze cannot be used here because it detects only the first namespace
    private static String unbindNamespaceIteration(final String input) {
        final Matcher matcher = xmlnsDocumentPattern.matcher(input);
        if (matcher.matches()) {
            final String matched = matcher.group(0);
            final String completeNamespace = matcher.group(1);
            final String prefix = matcher.group(2);

            // replace whole namespace declaration
            String result = StringUtils.replace(input, completeNamespace, "");

            // replace prefix from tags
            if (prefix != null) {
                result = StringUtils.replace(result, prefix + ":", "");
                //result = removePrefixes(result, prefix);
            }

            return result;
        }
        return null;
    }

    static String removePrefixes(String xml, String prefix) {
        // FIXME
        return xml;
    }

}
