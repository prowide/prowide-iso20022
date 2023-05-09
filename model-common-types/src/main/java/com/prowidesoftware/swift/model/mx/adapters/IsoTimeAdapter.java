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

import java.time.OffsetTime;

/**
 * Configured adapter for time elements.
 * <p>
 * This implementation is applied in the model with the @XmlJavaTypeAdapter(IsoTimeAdapter.class) annotation to
 * all schema elements with type "ISOTime".
 * <p>
 * It is implemented as wrapper to inject your own instances when calling the different write/read methods in the model.
 *
 * @since 9.2.6
 */
public class IsoTimeAdapter extends XmlAdapter<String, OffsetTime> {

    private final XmlAdapter<String, OffsetTime> customAdapterImpl;

    /**
     * Default constructor for jaxb when non is set via API
     */
    public IsoTimeAdapter() {
        this.customAdapterImpl = new OffsetTimeAdapter();
    }

    /**
     * Creates a time adapter injecting a custom implementation
     */
    public IsoTimeAdapter(XmlAdapter<String, OffsetTime> customAdapterImpl) {
        this.customAdapterImpl = customAdapterImpl;
    }

    /**
     * Invokes the wrapped adapter implementation of the unmarshal method.
     *
     * @param value the XML date time value to convert
     * @return created OffsetTime object or null if cannot be parsed
     */
    @Override
    public OffsetTime unmarshal(String value) throws Exception {
        return this.customAdapterImpl.unmarshal(value);
    }

    /**
     * Invokes the wrapped adapter implementation of the marshal method.
     *
     * @param offsetTime the model OffsetTime to marshal
     * @return formatted content for the XML
     */
    @Override
    public String marshal(OffsetTime offsetTime) throws Exception {
        return this.customAdapterImpl.marshal(offsetTime);
    }

    @Override
    public String toString() {
        return "IsoTimeAdapter{" +
                "customAdapterImpl=" + customAdapterImpl +
                '}';
    }
}
