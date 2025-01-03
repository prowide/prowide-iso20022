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

import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import java.util.Optional;
import javax.xml.stream.XMLStreamReader;
import org.apache.commons.lang3.StringUtils;

/**
 * Helper API to extract information from an XML using lightweight XML streams API
 *
 * @since 9.2.1
 */
public class NamespaceReader {

    /**
     * Extracts the document namespace from the XML, if the Document element is present
     *
     * @param xml the XML content
     * @return found namespace or empty if the Document is not found or does not contain a namespace
     */
    public static Optional<String> findDocumentNamespace(final String xml) {
        return findNamespaceForLocalName(xml, AbstractMX.DOCUMENT_LOCALNAME);
    }

    /**
     * Extracts the header namespace from the XML, if the AppHdr element is present
     *
     * @param xml the XML content
     * @return found namespace or empty if the AppHdr is not found or does not contain a namespace
     */
    public static Optional<String> findAppHdrNamespace(final String xml) {
        return findNamespaceForLocalName(xml, AppHdr.HEADER_LOCALNAME);
    }

    /**
     * Extracts the namespace for a given element
     *
     * @param xml       the XML content
     * @param localName the element local name
     * @return found namespace or empty if the element is not found or does not contain a namespace
     */
    public static Optional<String> findNamespaceForLocalName(final String xml, final String localName) {
        Optional<XMLStreamReader> reader = MxParseUtils.findElementByTags(xml, localName);
        return reader.map(NamespaceReader::readNamespace);
    }

    /**
     * @return the namespace, if any, from current position in the parameter reader
     */
    private static String readNamespace(final XMLStreamReader reader) {
        // iterate and return the namespace matching the element prefix
        if (reader.getNamespaceCount() > 0) {
            for (int nsIndex = 0; nsIndex < reader.getNamespaceCount(); nsIndex++) {
                final String nsPrefix = StringUtils.trimToNull(reader.getNamespacePrefix(nsIndex));
                final String elementPrefix = StringUtils.trimToNull(reader.getPrefix());
                if (StringUtils.equals(nsPrefix, elementPrefix)) {
                    // if prefix match or is not set in both the element and the namespace we return it as found
                    // namespace
                    return reader.getNamespaceURI(nsIndex);
                }
            }
        }
        return null;
    }

    /**
     * @deprecated use {@link MxParseUtils#elementExists(String, String)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2025)
    public static boolean elementExists(final String xml, final String localName) {
        return MxParseUtils.elementExists(xml, localName);
    }
}
