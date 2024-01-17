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

import com.prowidesoftware.swift.model.mx.adapters.TypeAdaptersConfiguration;
import jakarta.xml.bind.JAXBContext;

/**
 * Simple DTO to encapsulate parameters in the different model-to-XML serialization implementation methods in the API
 *
 * @since 9.2.6
 */
public class MxWriteParams {

    /**
     * Optional prefix for namespace (empty by default)
     */
    public String prefix;

    /**
     * True to include the XML declaration (false by default)
     */
    public boolean includeXMLDeclaration;

    /**
     * A specific escape handler for the header elements content (none by default)
     */
    public EscapeHandler escapeHandler;

    /**
     * Optional instance to pass to the write method, if null, a new instance will be created when needed
     * @since 9.3.5
     */
    public JAXBContext context;

    /**
     * Specific adapters for date time, date, time
     */
    public TypeAdaptersConfiguration adapters;

    /**
     * Optional indent string to use when marshalling into XML, if null, a four spaces string will be used as default
     * @since 9.3.6
     */
    public String indent;

    public MxWriteParams() {
        this(new MxWriteConfiguration());
    }

    MxWriteParams(MxWriteConfiguration conf) {
        this.prefix = null;
        MxWriteConfiguration notNullConf = conf == null ? new MxWriteConfiguration() : conf;
        // use same defaults as configuration
        this.includeXMLDeclaration = notNullConf.includeXMLDeclaration;
        this.escapeHandler = notNullConf.escapeHandler;
        this.adapters = notNullConf.adapters;
        this.context = notNullConf.context;
        this.indent = notNullConf.indent;
    }
}
