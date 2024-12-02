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

import com.prowidesoftware.ProwideException;
import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SafeXmlUtils;
import java.io.StringReader;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.*;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.sax.SAXSource;
import org.apache.commons.lang3.Validate;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

/**
 * @since 9.1.2
 */
public class MxParseUtils {
    private static final transient Logger log = Logger.getLogger(MxParseUtils.class.getName());

    /**
     * Creates a {@link SAXSource} for the given XML, filtering a specific element with the
     * {@link NamespaceAndElementFilter}.
     *
     * @param xml       the whole XML element
     * @param localName the specific element of the subtree to propagate (normally would be Document or AppHdr)
     * @return a safe source
     * @since 9.2.1
     */
    static SAXSource createFilteredSAXSource(final String xml, final String localName) {
        XMLReader documentReader = SafeXmlUtils.reader(true, null);

        NamespaceAndElementFilter documentFilter = new NamespaceAndElementFilter(localName);
        documentFilter.setParent(documentReader);

        InputSource documentInputSource = new InputSource(new StringReader(xml));

        return new SAXSource(documentFilter, documentInputSource);
    }

    /**
     * Parse an object from an event reader.
     *
     * <p>IMPORTANT: the event must be positioned at the element to parse. And the xml must be filtered without ISO
     * namespaces and prefixes.
     *
     * @param source      the SaxSource to parse
     * @param targetClass the class of the object being parsed
     * @param classes     the object classes to build a jaxb context
     * @param params      not null unmarshalling parameters
     * @return parsed element or null if cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     * @since 9.2.6
     */
    static Object parseSAXSource(
            final SAXSource source, final Class targetClass, final Class<?>[] classes, final MxReadParams params) {
        Objects.requireNonNull(targetClass, "target class to parse must not be null");
        Objects.requireNonNull(source, "SAXSource to parse must not be null");
        Objects.requireNonNull(classes, "object model classes array must not be null");
        Objects.requireNonNull(params, "unmarshalling params cannot be null");

        try {
            JAXBContext context;
            if (params.context != null) {
                context = params.context;
            } else {
                context = JaxbContextLoader.INSTANCE.get(targetClass, classes);
            }

            final Unmarshaller unmarshaller = context.createUnmarshaller();

            if (params.adapters != null) {
                for (XmlAdapter adapter : params.adapters.asList()) {
                    unmarshaller.setAdapter(adapter);
                }
            }

            JAXBElement element = unmarshaller.unmarshal(source, targetClass);
            if (element != null) {
                return element.getValue();
            }

        } catch (JAXBException | ExecutionException e) {
            handleParseException(e);
        }
        return null;
    }

    static void handleParseException(Exception e) {
        if (e instanceof UnmarshalException) {
            final Throwable cause = e.getCause();
            if (cause instanceof SAXParseException) {
                SAXParseException spe = (SAXParseException) cause;
                throw new ProwideException(
                        "Error parsing message at line " + spe.getLineNumber() + ", column " + spe.getColumnNumber(),
                        cause);
            } else {
                throw new ProwideException("Error parsing message", cause);
            }
        }
        if (e instanceof XMLStreamException) {
            throw new ProwideException("Error parsing message: " + e.getMessage());
        }
        log.severe("An error occurred while reading XML: " + e.getMessage());
        e.printStackTrace();
    }

    /**
     * Parse an object from XML with optional wrapper and sibling elements that will be ignored.
     *
     * @param targetClass calss of the object being parsed
     * @param xml         the XML content, can contain wrapper elements that will be ignored
     * @param classes     the object classes to build a jaxb context
     * @param localName   the specific element to parse within the parameter XML
     * @param params      not null unmarshalling parameters
     * @return parsed element or null if cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     * @since 9.2.6
     */
    static Object parse(
            final Class targetClass,
            final String xml,
            final Class<?>[] classes,
            final String localName,
            final MxReadParams params) {
        Objects.requireNonNull(targetClass, "target class to parse must not be null");
        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        Objects.requireNonNull(classes, "object model classes aray must not be null");
        Validate.notBlank(localName, "The XML element to parse must not be null nor a blank string");
        Objects.requireNonNull(params, "unmarshalling params cannot be null");

        try {
            SAXSource saxSource = createFilteredSAXSource(xml, localName);
            return parseSAXSource(saxSource, targetClass, classes, params);

        } catch (final Exception e) {
            handleParseException(e);
            return null;
        }
    }

    /**
     * Distinguished Name structure: cn=name,ou=payment,o=bank,o=swift
     * <br>
     * Example: o=spxainjj,o=swift
     *
     * @param dn the DN element content
     * @return returns capitalized "bank", in the example SPXAINJJ
     */
    public static String getBICFromDN(final String dn) {
        return DistinguishedName.parseBIC(dn);
    }

    /**
     * Takes an XML with an MX message and detects the specific message type parsing just the namespace from the
     * Document element. If the Document element is not present, or without the namespace or if the namespace url
     * contains invalid content, then attempts to identify the message from the AppHdr. From the header tries to
     * get the message type from the 'MsgDefIdr' that is present in the Business Application Header, and if that
     * is not present tries to get the 'MsgName' assuming it is a legacy Application Header. If none of the above
     * is present or cannot be parsed, then returns empty.
     *
     * <p>
     * Example of a recognizable Document element:<br>
     * &lt;Doc:Document xmlns:Doc="urn:swift:xsd:camt.003.001.04" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;
     *
     * <p>
     * The implementation is intended to be lightweight and efficient, based on {@link javax.xml.stream.XMLStreamReader}
     *
     * @return id with the detected MX message type or empty if it cannot be determined.
     */
    public static Optional<MxId> identifyMessage(final String xml) {
        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        if (namespace.isPresent()) {
            return enrichBusinessService(namespace.map(MxId::new).orElse(null), xml);
        }

        // if the Document does not have a namespace, try to identify the message from the header
        Optional<XMLStreamReader> element = findElement(xml, "MsgDefIdr");
        if (!element.isPresent()) {
            // Legacy ahv10 header
            element = findElement(xml, "MsgName");
        }
        if (element.isPresent()) {
            try {
                return enrichBusinessService(new MxId(element.get().getElementText()), xml);
            } catch (XMLStreamException e) {
                log.finer("Error identifying message: " + e.getMessage());
            }
        }

        return Optional.empty();
    }

    private static Optional<MxId> enrichBusinessService(MxId mxId, final String xml) {
        if (mxId == null) {
            return Optional.empty();
        }
        Optional<XMLStreamReader> element = findElement(xml, "BizSvc");
        if (element.isPresent()) {
            try {
                mxId.setBusinessService(element.get().getElementText());
            } catch (XMLStreamException e) {
                log.finer("Error identifying business service: " + e.getMessage());
            }
        }
        return Optional.of(mxId);
    }

    /**
     * This method is intended to fix some malformed XML content that is not compliant with the XML specification
     * to enable the parsing and processing of the payload to be lenient.
     * For the moment, current implementation will just fix invalid case in the XML declaration, if present.
     *
     * @param xml original XML content
     * @return modified XML content with the XML declaration fixed to be compliant with the XML specification
     * @since 9.3.9
     */
    public static String makeXmlLenient(String xml) {
        return xml != null ? xml.replaceFirst("(?i)<\\?XML", "<?xml") : null;
    }

    /**
     * Extracts settlement information from the given XML document.
     *
     * <p>This method attempts to parse the provided XML and extract information
     * related to the settlement method and clearing system codes. Specifically:
     * <ul>
     *     <li>{@code SttlmMtd} - The settlement method.</li>
     *     <li>{@code ClrSys > Cd} - The clearing system code.</li>
     *     <li>{@code ClrSys > Prtry} - The clearing system proprietary.</li>
     * </ul>
     *
     * <p>If any of these elements are found, a {@link SettlementInfo} object is
     * created and populated with the extracted values.
     *
     * @param xml the XML document as a {@link String} to parse for settlement information.
     * @return an {@link Optional} containing the {@link SettlementInfo} if at least one
     *         of the required elements is found; otherwise, an empty {@link Optional}.
     * @throws NullPointerException if the {@code xml} is null.
     *
     * @since 9.5.5
     */
    public static Optional<SettlementInfo> getSettlementInfo(final String xml) {

        Optional<XMLStreamReader> sttlmMtdMaybe = findElement(xml, "SttlmMtd");
        Optional<XMLStreamReader> clrSysCdMaybe = findElement(xml, "ClrSys", "Cd");
        Optional<XMLStreamReader> clrSysPrtryMaybe = findElement(xml, "ClrSys", "Prtry");

        if (sttlmMtdMaybe.isPresent() || clrSysCdMaybe.isPresent() || clrSysPrtryMaybe.isPresent()) {
            SettlementInfo settlementInfo = new SettlementInfo();
            try {
                if (sttlmMtdMaybe.isPresent()) {

                    Optional<SettlementMethod> sttlmMtdLabel =
                            SettlementMethod.findByLabel(sttlmMtdMaybe.get().getElementText());
                    sttlmMtdLabel.ifPresent(settlementInfo::setSettlementMethod);
                }
                if (clrSysCdMaybe.isPresent()) {
                    settlementInfo.setClrSysCd(clrSysCdMaybe.get().getElementText());
                }
                if (clrSysPrtryMaybe.isPresent()) {
                    settlementInfo.setClrSysPrtry(clrSysPrtryMaybe.get().getElementText());
                }
                return Optional.of(settlementInfo);
            } catch (XMLStreamException e) {
                log.finer("Error identifying business service: " + e.getMessage());
            }
        }
        return Optional.empty();
    }

    /**
     * Finds an XML element within a document by traversing a specified tag hierarchy.
     *
     * <p>This method uses an {@link XMLStreamReader} to parse the provided XML document.
     * It searches for an element that matches the specified sequence of tag names (hierarchy).
     * For example, to find the {@code <Cd>} tag within {@code <ClrSys>}, you would call:
     * <pre>
     *     findElement(xml, "ClrSys", "Cd");
     * </pre>
     *
     * @param xml  the XML document as a {@link String} to search.
     * @param tags the sequence of tag names that define the hierarchy of the target element.
     * @return an {@link Optional} containing the {@link XMLStreamReader} positioned at the
     *         matching element if found; otherwise, an empty {@link Optional}.
     * @throws NullPointerException     if the {@code xml} or {@code tags} are null.
     * @throws IllegalArgumentException if the {@code xml} is a blank string.
     *
     * @since 9.5.5
     */
    public static Optional<XMLStreamReader> findElement(final String xml, String... tags) {
        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        Objects.requireNonNull(xml, "localName to find must not be null");

        final XMLInputFactory xif = SafeXmlUtils.inputFactory();
        int tagsIndex = 0;
        try {
            final XMLStreamReader reader =
                    xif.createXMLStreamReader(new StringReader(MxParseUtils.makeXmlLenient(xml)));
            while (reader.hasNext()) {
                int event = reader.next();
                if (XMLStreamConstants.START_ELEMENT == event) {
                    if (reader.getLocalName().equals(tags[tagsIndex])) {
                        if (tagsIndex == tags.length - 1) {
                            return Optional.of(reader);
                        }
                        tagsIndex++;
                    }
                }
            }
        } catch (XMLStreamException e) {
            log.log(Level.WARNING, "Error reading XML", e);
        }
        return Optional.empty();
    }
}
