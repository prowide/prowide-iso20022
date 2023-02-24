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

import com.prowidesoftware.swift.model.MxBusinessProcess;
import com.prowidesoftware.swift.model.MxId;
import org.apache.commons.lang3.Validate;

import javax.xml.transform.sax.SAXSource;
import java.util.Objects;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Default implementation of the {@link MxRead} interface to parse XML strings into Mx message objects.
 *
 * <p>The implementation is not a straight forward jaxb unmarsahlling. Some remarks:
 * <ul>
 *     <li>The parser uses a SAX reader, to extract only the AppHdr and Document portions of the source XML,
 *     ignoring any container wrapper elements.</li>
 *
 *     <li>The parser is not namespace aware for general ISO 20022 elements, because the dictionary model classes in
 *     the library are not bounded to any specific namespace. This is due to the fact that the library is generated as
 *     a flat shared collection of elements, where the same element implementation is potentially used by many
 *     specific ISO 20022 messages.
 *     This is a special feature of the model, that is not a direct jaxb generation from hundreds of ISO schemas with
 *     each type in its own package, but a custom jaxb process to produce a shareable dictionary for the elements with
 *     minimal custom bindings.
 *     Notice however xsys messages do use namespace for the shared schemas such as Sw, SwInt, etc...</li>
 *
 *     <li>For the header, multiple variants are supported. The parser detects the specific header to parse using the
 *     namespace at the AppHdr element. By default it tries to parse the content as head.001.001.01.</li>
 * </ul>
 *
 * <p>This is the default implementation used for the direct parse calls in MX messages.
 *
 * @since 9.0
 */
public class MxReadImpl implements MxRead {
    private static final Logger log = Logger.getLogger(MxReadImpl.class.getName());

    /**
     * Static parse implementation of {@link MxRead#read(Class, String, Class[])}
     *
     * @param xml the XML to parse, should contain the Document, and optional AppHdr and any type of wrapper elements
     * @since 8.0.4
     */
    public static AbstractMX parse(final Class<? extends AbstractMX> targetClass, final String xml, final Class<?>[] classes) {
        return parse(targetClass, xml, classes, new MxReadParams());
    }

    /**
     * @since 9.2.6
     */
    public static AbstractMX parse(final Class<? extends AbstractMX> targetClass, final String xml, final Class<?>[] classes, final MxReadParams params) {
        Objects.requireNonNull(targetClass, "target class to parse must not be null");
        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        Objects.requireNonNull(classes, "object model classes array must not be null");
        Objects.requireNonNull(params, "The unmarshalling params cannot be null");

        try {

            SAXSource documentSource = MxParseUtils.createFilteredSAXSource(xml, AbstractMX.DOCUMENT_LOCALNAME, params.charset);
            final AbstractMX parsedDocument = (AbstractMX) MxParseUtils.parseSAXSource(documentSource, targetClass, classes, params);

            Optional<AbstractMX> mx = Optional.ofNullable(parsedDocument);

            Optional<AppHdr> appHdr = AppHdrParser.parse(xml, params);

            if (mx.isPresent() && appHdr.isPresent()) {
                mx.get().setAppHdr(appHdr.get());
            }

            return mx.orElse(null);

        } catch (final Exception e) {
            MxParseUtils.handleParseException(e);
            return null;
        }
    }

    /**
     * Static parse implementation of {@link MxRead#read(String, MxId)}
     *
     * @return parsed message or null if XML is malformed or unrecognized as MX message
     * @throws IllegalArgumentException if the XML parameter is blank
     * @throws NullPointerException     if the XML parameter is null
     * @since 9.0
     */
    public static AbstractMX parse(final String xml, MxId id) {
        return parse(xml, id, new MxReadParams());
    }

    /**
     * @since 9.2.6
     */
    public static AbstractMX parse(final String xml, final MxId id, final MxReadParams params) {
        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        Objects.requireNonNull(params, "unmarshalling params cannot be null");

        MxId resolvedId = id;

        if (id == null) {
            Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
            if (namespace.isPresent()) {
                resolvedId = new MxId(namespace.get());
            } else {
                Level level = params.verbose? Level.SEVERE: Level.FINE;
                log.log(level, "Cannot detect the Mx type from the XML, make sure the XML contains proper namespaces or provide an MxId object as parameter to the parse call");
                return null;
            }
        }

        AbstractMX mx = null;
        String fqn = null;
        try {
            String subPackage = resolvedId.getBusinessProcess() == MxBusinessProcess.xsys ? ".sys" : "";
            fqn = "com.prowidesoftware.swift.model.mx" + subPackage + ".Mx" + resolvedId.camelized();
            Class<? extends AbstractMX> clazz = (Class<? extends AbstractMX>) Class.forName(fqn);
            java.lang.reflect.Field _classes = clazz.getDeclaredField("_classes");
            mx = parse(clazz, xml, (Class[]) _classes.get(null), params);
        } catch (ClassNotFoundException e) {
            if (params.verbose) {
                log.log(Level.SEVERE, "Cannot find class " + fqn + " to parse the XML", e);
            } else {
                log.fine("MX model implementation not found for " + fqn);
            }
        } catch (Exception e) {
            if (params.verbose) {
                log.log(Level.SEVERE, "Error calling parse in specific MX model implementation", e);
            } else {
                log.fine("Error calling parse in specific MX model implementation");
            }
        }
        return mx;
    }

    @Override
    public AbstractMX read(final Class<? extends AbstractMX> targetClass, final String xml, final Class<?>[] classes) {
        return parse(targetClass, xml, classes, new MxReadParams());
    }

    /**
     * Parses the XML string content into a specific instance of Mx.
     *
     * <p>If the string is empty, does not contain any MX message, the message type cannot be detected or an error occur
     * reading and parsing the message content; this method returns null.
     *
     * <p>The implementation detects the message type and uses reflection to call the parser in the specific Mx
     * subclass.
     *
     * <p>If header is present, it is also parsed into the message object.
     *
     * @param xml a string containing an MX message in XML format
     * @param id  optional parameter to indicate the specific MX type to create; autodetected from namespace if null.
     * @return parser message or null if string content could not be parsed into an Mx
     * @since 7.8.4
     */
    @Override
    public AbstractMX read(final String xml, MxId id) {
        return parse(xml, id, new MxReadParams());
    }

}