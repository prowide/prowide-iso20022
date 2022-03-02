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

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple DTO to encapsulate parameters in the different model-to-XML serialization methods in the API
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
     * Specific adapters for date time, date, time (none by default)
     * See {@link MxWriteConfiguration}
     */
    public List<XmlAdapter> adapters;

    public MxWriteParams() {
        this.prefix = null;
        this.includeXMLDeclaration = false;
        this.escapeHandler = null;
        this.adapters = new ArrayList<>();
    }

    MxWriteParams(MxWriteConfiguration conf) {
        this();
        this.includeXMLDeclaration = conf.includeXMLDeclaration;
        this.escapeHandler = conf.escapeHandler;
        this.adapters.add(conf.dateTimeAdapter);
        this.adapters.add(conf.dateAdapter);
        this.adapters.add(conf.timeAdapter);
    }

}
