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
import com.prowidesoftware.swift.model.mx.adapters.TypeAdaptersConfiguration;
import javax.xml.bind.JAXBContext;

/**
 * Options to customize the behaviour of the MX writer (model into XML serialization) in the {@link AbstractMX}
 * and its specific types subclasses.
 *
 * @since 9.1.7
 */
public class MxWriteConfiguration {

    /**
     * When the envelopeType is set to CUSTOM, this parameter enables configuration of the root element name to use
     * when binding the AppHdr and Document elements. If no root element name is provided and the envelopeTyoe is
     * set to CUSTOM, the value in "RequestPayload" is used as default.
     */
    public String rootElement = EnvelopeType.CUSTOM.rootElement();

    /**
     * Determines if the XML will include the XML declaration as first line. It is true by default. You can switch this
     * off if the generated XML will then be used a fragment of another XML wrapper.
     */
    public boolean includeXMLDeclaration = true;

    /**
     * Enables switching between different implementations for the element and attributes value escaping. Some
     * implementations are available in the library and your own custom class can also be used. This is useful if you
     * handle XML messages with specific charset, and you want to control what is escaped and what is propagated as is.
     */
    public EscapeHandler escapeHandler = new DefaultEscapeHandler();

    /**
     * The prefix for the header namespace. Set it to null if you don't want to have any prefix in header elements.
     * Defaults to "head".
     */
    public String headerPrefix = "head";

    /**
     * The prefix for the document namespace. Set it to null if you don't want to have any prefix in document elements.
     * It is "doc" by default.
     * <p>
     * Notice the useCategoryAsDocumentPrefix parameter takes precedence over this. Meaning if this is set to anything
     * other than null, and useCategoryAsDocumentPrefix is true, the category will be used as prefix instead of this
     * parameter value. If you want to use your own prefix and not the category, combine this parameter with the
     * useCategoryAsDocumentPrefix set to false.
     */
    public String documentPrefix = "doc";

    /**
     * Type adapters for the marshaller
     * @since 9.2.6
     */
    public TypeAdaptersConfiguration adapters = new TypeAdaptersConfiguration();

    /**
     * Optional instance to pass to the write method, if null, a new instance will be created when needed
     * @since 9.3.5
     */
    public JAXBContext context;

    /**
     * Optional indent string to use when marshalling into XML, if null, a four spaces string will be used as default
     * @since 9.3.6
     */
    public String indent = XmlEventWriter.DEFAULT_INDENT;

    /**
     * @deprecated use {@link #envelopeType} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2025)
    public EnvelopeType envelopeTyoe = EnvelopeType.CUSTOM;

    /**
     * Defaults to CUSTOM meaning the parameters for the envelope root element are used. This can be changed to
     * SWIFT, BME_V1 or BME_V2 to use the default values for those envelope types. If an envelope other than CUSTOM
     * is selected, the rootElement is ignored and the corresponding envelope structure and namespace will be used
     * instead.
     *
     * @since 9.5.3
     */
    public EnvelopeType envelopeType = EnvelopeType.CUSTOM;

    /**
     * If true, the category code will be used as prefix for the Document element. For example "camt" or "pacs"
     * depending on the message type. Default is true.
     * This parameter does not take any effect if the documentPrefix is set to null, since in that case no prefix
     * will be used.
     * @since 9.5.0
     */
    public boolean useCategoryAsDocumentPrefix = true;

    /**
     * Creates a configuration with the default options and adapters
     */
    public MxWriteConfiguration() {
        this((JAXBContext) null);
    }

    public MxWriteConfiguration(JAXBContext context) {
        this.context = context;
    }

    /**
     * Creates a configuration with the default options and propagates the adapters from read to write configuration
     * @since 9.2.6
     */
    public MxWriteConfiguration(MxReadConfiguration readConf) {
        this();
        this.adapters = readConf.adapters;
        this.context = readConf.context;
    }
}
