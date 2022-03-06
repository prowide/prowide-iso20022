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

import com.prowidesoftware.ProwideException;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.utils.SafeXmlUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

import javax.xml.bind.*;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.sax.SAXSource;
import java.io.StringReader;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

/**
 * @since 9.1.2
 */
public class MxParseUtils {
    private static final transient Logger log = Logger.getLogger(MxParseUtils.class.getName());

    /**
     * Creates a {@link SAXSource} for the given XML, filtering a specific element with the
     * {@link NamespaceAndElementFilter}.
     *
     * @param xml the whole XML element
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
     * @deprecated use {@link #parseSAXSource(SAXSource, Class, Class[], MxReadParams)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2023)
    static Object parseSAXSource(final SAXSource source, final Class targetClass, final Class<?>[] classes) {
        return parseSAXSource(source, targetClass, classes, new MxReadParams());
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
    static Object parseSAXSource(final SAXSource source, final Class targetClass, final Class<?>[] classes, final MxReadParams params) {
        Objects.requireNonNull(targetClass, "target class to parse must not be null");
        Objects.requireNonNull(source, "SAXSource to parse must not be null");
        Objects.requireNonNull(classes, "object model classes array must not be null");
        Objects.requireNonNull(params, "unmarshalling params cannot be null");

        try {
            JAXBContext context = JaxbContextLoader.INSTANCE.get(targetClass, classes);
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
                throw new ProwideException("Error parsing message at line " + spe.getLineNumber() + ", column " + spe.getColumnNumber(), cause);
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
     * @deprecated use {@link #parse(Class, String, Class[], String, MxReadParams)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2023)
    static Object parse(final Class targetClass, final String xml, final Class<?>[] classes, final String localName) {
        return parse(targetClass, xml, classes, localName, new MxReadParams());
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
    static Object parse(final Class targetClass, final String xml, final Class<?>[] classes, final String localName, final MxReadParams params) {
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
        for (String s : StringUtils.split(dn, ",")) {
            if (StringUtils.startsWith(s, "o=") && !StringUtils.equals(s, "o=swift")) {
                return StringUtils.upperCase(StringUtils.substringAfter(s, "o="));
            }
        }
        return null;
    }

    /**
     * Takes an xml with an MX message and detects the specific message type
     * parsing just the namespace from the Document element. If the Document
     * element is not present, or without the namespace or if the namespace url
     * contains invalid content it will return null.
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
            return Optional.of(new MxId(namespace.get()));
        }
        return Optional.empty();
    }

}