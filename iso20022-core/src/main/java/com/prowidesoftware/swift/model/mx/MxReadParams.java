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
 * Simple DTO to encapsulate parameters in the different XML-to-model parser implementation methods in the API
 *
 * @since 9.2.6
 */
public class MxReadParams {

    /**
     * Specific adapters for date time, date, time
     */
    public TypeAdaptersConfiguration adapters;

    public MxReadParams() {
        this.adapters = new TypeAdaptersConfiguration();
    }

    public MxReadParams(MxReadConfiguration conf) {
        this();
        if (conf != null) {
            this.adapters = conf.adapters;
        }
    }

}