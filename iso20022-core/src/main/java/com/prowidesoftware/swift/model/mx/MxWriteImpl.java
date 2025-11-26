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

import com.prowidesoftware.swift.model.MxSwiftMessage;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

/**
 * Default implementation to serialize MX message objects into XML strings.
 * The implementation expects instances of specific subclasses of AbstractMX, such as MxCamt03400102
 *
 * @since 9.0
 */
public class MxWriteImpl {
    private static final Logger log = Logger.getLogger(MxWriteImpl.class.getName());

    /**
     * Main implementation of model to XML serialization
     *
     * @since 9.2.6
     */
    public static String write(String namespace, AbstractMX obj, Class[] classes, MxWriteParams params) {
        Objects.requireNonNull(namespace, "namespace can not be null");
        Objects.requireNonNull(obj, "AbstractMX can not be null");
        Objects.requireNonNull(classes, "Class[] can not be null");
        Objects.requireNonNull(params, "marshalling params cannot be null");

        try {
            JAXBContext context;
            if (params.context != null) {
                context = params.context;
            } else {
                context = JaxbContextLoader.INSTANCE.get(obj);
            }

            // Sin el ns en el qname, para ver si toma el default
            @SuppressWarnings({"unchecked"})
            final JAXBElement<? extends MxSwiftMessage> element =
                    new JAXBElement(new QName("Document"), obj.getClass(), null, obj);

            final Marshaller marshaller = MxWriteUtils.createMarshaller(context, params);

            final StringWriter sw = new StringWriter();
            XmlEventWriter writer = new XmlEventWriter(
                    sw, params.prefix, params.includeXMLDeclaration, "Document", params.escapeHandler, params.indent);

            Map<String, String> preferredPrefixes = new HashMap<>();
            for (XsysNamespaces xsys : XsysNamespaces.values()) {
                preferredPrefixes.put(xsys.namespaceURI(), xsys.prefix());
            }
            writer.setPreferredPrefixes(preferredPrefixes);

            marshaller.marshal(element, writer);

            if (log.isLoggable(Level.FINER)) {
                log.finer("XML: \n" + sw.getBuffer().toString());
            }
            return sw.getBuffer().toString();

        } catch (JAXBException | ExecutionException e) {
            log.log(Level.SEVERE, "Error writing XML:" + e + "\n for message: " + obj);
        }
        return null;
    }
}
