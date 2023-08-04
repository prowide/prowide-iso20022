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
 * Options to customize the behaviour of the MX parser (XML into model) in the {@link AbstractMX} and its specific
 * types subclasses.
 *
 * @since 9.2.6
 */
public class MxReadConfiguration {

    /**
     * Type adapters for the marshaller
     * @since 9.2.6
     */
    public TypeAdaptersConfiguration adapters;

    /**
     * Optional instance to pass to the read method, if null, a new instance will be created when needed
     * @since 9.3.5
     */
    public JAXBContext context;

    /**
     * Creates a configuration with the default adapters
     */
    public MxReadConfiguration() {
        this.adapters = new TypeAdaptersConfiguration();
    }

    /**
     * Propagates the adapters from write to read configuration
     */
    public MxReadConfiguration(MxWriteConfiguration writeConf) {
        this.adapters = writeConf.adapters;
        this.context = writeConf.context;
    }
}
