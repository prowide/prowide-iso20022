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

import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.Validate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Default implementation of the {@link MxWrite} interface to serialize MX message objects into XML strings.
 * The implementation expects instances of specific subclasses of AbstractMX, such as MxCamt03400102
 *
 * @since 9.0
 */
public class MxWriteImpl implements MxWrite {
    private static final transient Logger log = Logger.getLogger(MxWriteImpl.class.getName());

    /**
     * Static serialization implementation of {@link MxWrite#message(String, AbstractMX, Class[], String, boolean)}
     *
     * @since 9.0
     */
    public static String write(String namespace, AbstractMX obj, Class[] classes, final String prefix, boolean includeXMLDeclaration) {
        Validate.notNull(namespace, "namespace can not be null");
        Validate.notNull(obj, "MxSwiftMessage can not be null");
        Validate.notNull(classes, "Class[] can not be null");

        try {
            JAXBContext context = JaxbContextLoader.INSTANCE.get(obj);

            // Sin el ns en el qname, para ver si toma el default
            @SuppressWarnings({"unchecked"}) final JAXBElement<? extends MxSwiftMessage> element = new JAXBElement(new QName("Document"), obj.getClass(), null, obj);

            final Marshaller marshaller = context.createMarshaller();

            final StringWriter sw = new StringWriter();
            XmlEventWriter writer = new XmlEventWriter(sw, prefix, includeXMLDeclaration, "Document");

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

    /**
     * Implements serialization to XML
     *
     * @see MxWrite#message(String, AbstractMX, Class[], String, boolean)
     */
    @Override
    public String message(String namespace, AbstractMX obj, Class[] classes, final String prefix, boolean includeXMLDeclaration) {
        return write(namespace, obj, classes, prefix, includeXMLDeclaration);
    }

}
