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

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.Month;
import java.time.YearMonth;

/**
 * Configured adapter for date elements.
 * <p>
 * This implementation is applied in the model with the @XmlJavaTypeAdapter(IsoMonthAdapter.class) annotation to
 * all schema elements with type "IsoMonth".
 * <p>
 * It is implemented as wrapper to inject your own instances when calling the different write/read methods in the model.
 *
 * @since 9.2.6
 */
public class IsoMonthAdapter extends XmlAdapter<String, Month> {

    private final XmlAdapter<String, Month> customAdapterImpl;

    /**
     * Default constructor for jaxb when non is set via API
     */
    public IsoMonthAdapter() {
        this.customAdapterImpl = new MonthAdapter();
    }

    /**
     * Creates a date adapter injecting a custom implementation
     */
    public IsoMonthAdapter(XmlAdapter<String, Month> customAdapterImpl) {
        this.customAdapterImpl = customAdapterImpl;
    }

    /**
     * Invokes the wrapped adapter implementation of the unmarshal method.
     *
     * @param value the XML date time value to convert
     * @return created Month object or null if it cannot be parsed
     */
    @Override
    public Month unmarshal(String value) throws Exception {
        return this.customAdapterImpl.unmarshal(value);
    }

    /**
     * Invokes the wrapped adapter implementation of the marshal method.
     *
     * @param month the model Month to marshal
     * @return formatted content for the XML
     */
    @Override
    public String marshal(Month month) throws Exception {
        return this.customAdapterImpl.marshal(month);
    }

}
