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

import com.prowidesoftware.swift.model.mx.adapters.TypeAdaptersConfiguration;

/**
 * Options to customize the behaviour of the MX writer (model into XML serialization) in the {@link AbstractMX}
 * and its specific types subclasses.
 *
 * @since 9.1.7
 */
public class MxWriteConfiguration {

    /**
     * The name of the envelope element that binds a Header to the message to which it applies is
     * implementation/network specific. The header root element ‘AppHdr’ and the ISO 20022 MessageDefinition
     * root element ‘Document’ must always be sibling elements in any XML document, with the AppHdr element preceding
     * the Document element. If no root elemewnt name is provided the value in {@link AbstractMX#DEFAULT_ROOT_ELEMENT}
     * is used as default
     */
    public String rootElement;

    /**
     * Determines if the XML will include the XML declaration as first line. It is true by default. You can switch this
     * off if the generated XML will then be used a a fragment of another XML wrapper.
     */
    public boolean includeXMLDeclaration;

    /**
     * Enables switching between different implementations for the element and attributes value escaping. Some
     * implementations are available in the library and your own custom class can also be used. This is useful if you
     * handle XML messages with specific charset and you want to control what is escaped and what is propagated as is.
     */
    public EscapeHandler escapeHandler;

    /**
     * The prefix for the header namespace. Set it to null if you don't want to have any prefix in header elements.
     * It is "h" by default.
     */
    public String headerPrefix;

    /**
     * The prefix for the document namespace. Set it to null if you don't want to have any prefix in document elements.
     * It is "Doc" by default.
     */
    public String documentPrefix;

    /**
     * Type adapters for the marshaller
     * @since 9.2.6
     */
    public TypeAdaptersConfiguration adapters;

    /**
     * Creates a configuration with the default options and adapters
     */
    public MxWriteConfiguration() {
        this.rootElement = AbstractMX.DEFAULT_ROOT_ELEMENT;
        this.includeXMLDeclaration = true;
        this.escapeHandler = new DefaultEscapeHandler();
        this.headerPrefix = "h";
        this.documentPrefix = "Doc";
        this.adapters = new TypeAdaptersConfiguration();
    }

    /**
     * Creates a configuration with the default options and propagates the adapters from read to write configuration
     * @since 9.2.6
     */
    public MxWriteConfiguration(MxReadConfiguration readConf) {
        this();
        this.adapters = readConf.adapters;
    }

}