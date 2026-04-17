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
package com.prowidesoftware.swift.model.mx.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
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
 * such as the {@link OffsetDateTimeAdapter} or your own.
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
     * date-only elements.
     */
    public IsoDateAdapter dateAdapter;

    /**
     * Customized instances or subclasses of this adapter can be injected to change the default serialization of
     * time-only elements.
     */
    public IsoTimeAdapter timeAdapter;

    /**
     * Customized instances or subclasses of this adapter can be injected to change the default serialization of
     * year-month elements.
     *
     * @since 10.0.0
     */
    public IsoYearMonthAdapter yearMonthAdapter;

    /**
     * Customized instances or subclasses of this adapter can be injected to change the default serialization of
     * year elements.
     *
     * @since 10.0.0
     */
    public IsoYearAdapter yearAdapter;

    /**
     * Customized instances or subclasses of this adapter can be injected to change the default serialization of
     * month elements.
     *
     * @since 10.0.0
     */
    public IsoMonthAdapter monthAdapter;

    /**
     * Initializes the adapters with the default implementations
     *
     * @see LocalDateAdapter
     * @see OffsetDateTimeAdapter
     * @see OffsetTimeAdapter
     * @see YearMonthAdapter
     * @see YearAdapter
     * @see MonthAdapter
     */
    public TypeAdaptersConfiguration() {
        this.dateTimeAdapter = new IsoDateTimeAdapter(new OffsetDateTimeAdapter());
        this.dateAdapter = new IsoDateAdapter(new LocalDateAdapter());
        this.timeAdapter = new IsoTimeAdapter(new OffsetTimeAdapter());
        this.yearMonthAdapter = new IsoYearMonthAdapter(new YearMonthAdapter());
        this.yearAdapter = new IsoYearAdapter(new YearAdapter());
        this.monthAdapter = new IsoMonthAdapter(new MonthAdapter());
    }

    /**
     * Shallow copy of another configuration. Adapter instances are shared by reference.
     *
     * @param other configuration to copy; if null a default configuration is created
     * @since 10.3.6
     */
    public TypeAdaptersConfiguration(TypeAdaptersConfiguration other) {
        if (other == null) {
            this.dateTimeAdapter = new IsoDateTimeAdapter(new OffsetDateTimeAdapter());
            this.dateAdapter = new IsoDateAdapter(new LocalDateAdapter());
            this.timeAdapter = new IsoTimeAdapter(new OffsetTimeAdapter());
            this.yearMonthAdapter = new IsoYearMonthAdapter(new YearMonthAdapter());
            this.yearAdapter = new IsoYearAdapter(new YearAdapter());
            this.monthAdapter = new IsoMonthAdapter(new MonthAdapter());
        } else {
            this.dateTimeAdapter = other.dateTimeAdapter;
            this.dateAdapter = other.dateAdapter;
            this.timeAdapter = other.timeAdapter;
            this.yearMonthAdapter = other.yearMonthAdapter;
            this.yearAdapter = other.yearAdapter;
            this.monthAdapter = other.monthAdapter;
        }
    }

    /**
     * Returns all non-null adapters in this configuration as a list, preserving insertion order.
     * Adapter fields that are {@code null} are excluded from the result.
     *
     * @return a list of the non-null configured adapters; never {@code null}
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
        if (this.yearMonthAdapter != null) {
            all.add(this.yearMonthAdapter);
        }
        if (this.yearAdapter != null) {
            all.add(this.yearAdapter);
        }
        if (this.monthAdapter != null) {
            all.add(this.monthAdapter);
        }
        return all;
    }
}
