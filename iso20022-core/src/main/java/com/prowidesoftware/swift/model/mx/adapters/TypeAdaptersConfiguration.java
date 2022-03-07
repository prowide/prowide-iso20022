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
package com.prowidesoftware.swift.model.mx.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO to encapsulate type adapters parameters for the marshalling and unmarshalling API.
 * <p>
 * This class is used to inject your own adapters to the marshaller and unmarshaller via the
 * {@link com.prowidesoftware.swift.model.mx.MxWriteConfiguration} and
 * {@link com.prowidesoftware.swift.model.mx.MxReadConfiguration} parameters in the API.
 * <p>
 * Notice the configured adapters in the model are the {@link IsoDateTimeAdapter}, {@link IsoDateAdapter} and
 * {@link IsoTimeAdapter}. These are just wrapper classes configured in the model via @XmlJavaTypeAdapter annotation.
 * The actual adapter implementation is injected in the constructor, thus you can use any of the default adapters
 * such as the {@link ZonedDateTimeAdapter} or your own.
 *
 * @since 9.2.6
 */
public class TypeAdaptersConfiguration {
    /**
     * Customized instances or subclasses of this adapter can be injected to change the default serialization of
     * date time elements.
     */
    public IsoDateTimeAdapter dateTimeAdapter;

    /**
     * Customized instances or subclasses of this adapter can be injected to change the default serialization of
     * date time elements.
     */
    public IsoDateAdapter dateAdapter;

    /**
     * Customized instances or subclasses of this adapter can be injected to change the default serialization of
     * date time elements.
     */
    public IsoTimeAdapter timeAdapter;

    /**
     * Initializes the adapters with the default implementations
     * @see SimpleDateAdapter
     * @see ZonedDateTimeAdapter
     * @see ZonedTimeAdapter
     */
    public TypeAdaptersConfiguration() {
        this.dateTimeAdapter = new IsoDateTimeAdapter(new ZonedDateTimeAdapter());
        this.dateAdapter = new IsoDateAdapter(new SimpleDateAdapter());
        this.timeAdapter = new IsoTimeAdapter(new ZonedTimeAdapter());
    }

    /**
     * @return this configuration non null adapters into a list
     */
    public List<XmlAdapter> asList() {
        List<XmlAdapter> all = new ArrayList<>();
        if (this.dateTimeAdapter != null) {
            all.add(this.dateTimeAdapter);
        }
        if (this.dateAdapter != null) {
            all.add(this.dateAdapter);
        }
        if (this.timeAdapter != null) {
            all.add(this.timeAdapter);
        }
        return all;
    }

}
