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

import static com.prowidesoftware.swift.model.mx.MxParseUtils.makeXmlLenient;

import java.util.Objects;
import java.util.Optional;
import javax.xml.transform.sax.SAXSource;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

/**
 * @since 9.1.2
 */
public class AppHdrParser {

    /**
     * Detects the header version by reading the namespace in the AppHdr element and parses the header content to
     * a specific header model: {@link LegacyAppHdr}, {@link BusinessAppHdrV01} or {@link BusinessAppHdrV02}
     *
     * Default adapters are applied, for more options use {@link #parse(String, MxReadParams)}
     *
     * @param xml a not null XML to parse, only the AppHdr element is parse, the rest of the XML content is silently ignored
     * @return parsed header
     */
    public static Optional<AppHdr> parse(final String xml) {
        Objects.requireNonNull(xml, "The xml to parse cannot be null");
        return parse(xml, new MxReadParams());
    }

    /**
     * Detects the header version by reading the namespace in the AppHdr element and parses the header content to
     * a specific header model: {@link LegacyAppHdr}, {@link BusinessAppHdrV01} or {@link BusinessAppHdrV02}
     *
     * @param xml an not null XML to parse, only the AppHdr element is parse, the rest of the XML content is silently ignored
     * @param params not null unmarshalling parameters
     * @return parsed header
     * @since 9.2.6
     */
    public static Optional<AppHdr> parse(final String xml, MxReadParams params) {
        Objects.requireNonNull(xml, "The xml to parse cannot be null");
        Objects.requireNonNull(params, "The unmarshalling params cannot be null");
        try {

            Optional<String> namespace = NamespaceReader.findAppHdrNamespace(xml);

            boolean headerIsPresent =
                    namespace.isPresent() || NamespaceReader.elementExists(xml, AppHdr.HEADER_LOCALNAME);

            if (headerIsPresent) {
                AppHdr parsedHeader = parseHeaderFromSAXSource(xml, namespace.orElse(null), params);
                return Optional.ofNullable(parsedHeader);
            }

        } catch (Exception e) {
            MxParseUtils.handleParseException(e);
        }

        return Optional.empty();
    }

    private static AppHdr parseHeaderFromSAXSource(
            final String xml, final String namespace, final MxReadParams params) {
        SAXSource source = MxParseUtils.createFilteredSAXSource(makeXmlLenient(xml), AppHdr.HEADER_LOCALNAME);

        if (StringUtils.equals(LegacyAppHdr.NAMESPACE, namespace)) {
            // parse legacy AH
            return (LegacyAppHdr)
                    MxParseUtils.parseSAXSource(source, LegacyAppHdr.class, LegacyAppHdr._classes, params);

        } else if (StringUtils.equals(BusinessAppHdrV02.NAMESPACE, namespace)) {
            // parse BAH version 2
            return (BusinessAppHdrV02)
                    MxParseUtils.parseSAXSource(source, BusinessAppHdrV02.class, BusinessAppHdrV02._classes, params);

        } else if (StringUtils.equals(BusinessAppHdrV03.NAMESPACE, namespace)) {
            // parse BAH version 3
            return (BusinessAppHdrV03)
                    MxParseUtils.parseSAXSource(source, BusinessAppHdrV03.class, BusinessAppHdrV03._classes, params);

        } else {
            // by default try to parse to BAH version 1
            return (BusinessAppHdrV01)
                    MxParseUtils.parseSAXSource(source, BusinessAppHdrV01.class, BusinessAppHdrV01._classes, params);
        }
    }

    /**
     * Parse the business header from an XML Element node
     * <p>The implementation serializes the element into XML and calls {@link #parse(String)}
     */
    public static Optional<AppHdr> parse(final Element e) {
        return parse(asXml(e));
    }

    private static String asXml(Element e) {
        DOMImplementationLS lsImpl =
                (DOMImplementationLS) e.getOwnerDocument().getImplementation().getFeature("LS", "3.0");
        LSSerializer serializer = lsImpl.createLSSerializer();
        serializer.getDomConfig().setParameter("xml-declaration", false);
        return serializer.writeToString(e);
    }
}
