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

import java.time.Year;

/**
 * Configured adapter for elements containing just an year.
 * <p>
 * This implementation is applied in the model with the @XmlJavaTypeAdapter(IsoYearAdapter.class) annotation to
 * all schema elements with type "IsoYear".
 * <p>
 * It is implemented as wrapper to inject your own instances when calling the different write/read methods in the model.
 *
 * @since 10.0.0
 */
public class IsoYearAdapter extends XmlAdapter<String, Year> {

    private final XmlAdapter<String, Year> customAdapterImpl;

    /**
     * Default constructor for jaxb when non is set via API
     */
    public IsoYearAdapter() {
        this.customAdapterImpl = new YearAdapter();
    }

    /**
     * Creates a date adapter injecting a custom implementation
     */
    public IsoYearAdapter(XmlAdapter<String, Year> customAdapterImpl) {
        this.customAdapterImpl = customAdapterImpl;
    }

    /**
     * Invokes the wrapped adapter implementation of the unmarshal method.
     *
     * @param value the XML date time value to convert
     * @return created Year object or null if it cannot be parsed
     */
    @Override
    public Year unmarshal(String value) throws Exception {
        return this.customAdapterImpl.unmarshal(value);
    }

    /**
     * Invokes the wrapped adapter implementation of the marshal method.
     *
     * @param year the model Year to marshal
     * @return formatted content for the XML
     */
    @Override
    public String marshal(Year year) throws Exception {
        return this.customAdapterImpl.marshal(year);
    }

    @Override
    public String toString() {
        return "IsoYearAdapter{" +
                "customAdapterImpl=" + customAdapterImpl +
                '}';
    }
}
