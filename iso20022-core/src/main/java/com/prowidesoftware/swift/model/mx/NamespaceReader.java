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

import com.prowidesoftware.swift.utils.SafeXmlUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @since 9.1.2
 */
class NamespaceReader {
    private static final transient Logger log = Logger.getLogger(NamespaceReader.class.getName());

    static Optional<String> findNamespaceForLocalName(final String xml, final String localName) {
        Validate.notNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        Validate.notNull(xml, "localName to find must not be null");

        final XMLInputFactory xif = SafeXmlUtils.inputFactory();
        try {
            final XMLStreamReader reader = xif.createXMLStreamReader(new StringReader(xml));
            while (reader.hasNext()) {
                int event = reader.next();
                if (XMLStreamConstants.START_ELEMENT == event) {
                    if (reader.getLocalName().equals(localName)) {
                        return Optional.ofNullable(readNamespace(reader));
                    }
                }
            }
        } catch (XMLStreamException e) {
            log.log(Level.WARNING, "Error reading namespace from XML", e);
        }
        return Optional.empty();
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
                    // if prefix match or is not set in both the element and the namespace we return it as found namespace
                    return reader.getNamespaceURI(nsIndex);
                }
            }
        }
        return null;
    }

}
