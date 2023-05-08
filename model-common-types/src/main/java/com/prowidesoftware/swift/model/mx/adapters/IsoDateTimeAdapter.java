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
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Calendar;

/**
 * Configured adapter for date time elements.
 * <p>
 * This implementation is applied in the model with the @XmlJavaTypeAdapter(IsoDateTimeAdapter.class) annotation to
 * all schema elements with type "ISODateTime".
 * <p>
 * It is implemented as wrapper to inject your own instances when calling the different write/read methods in the model.
 *
 * @since 9.2.6
 */
public class IsoDateTimeAdapter extends XmlAdapter<String, Calendar> {

    private final XmlAdapter<String, Calendar> customAdapterImpl;

    /**
     * Default constructor for jaxb when non is set via API
     */
    public IsoDateTimeAdapter() throws DatatypeConfigurationException {
        this.customAdapterImpl = new DefaultCalendarAdapter();
    }

    /**
     * Creates a date time adapter injecting a custom implementation
     */
    public IsoDateTimeAdapter(XmlAdapter<String, Calendar> customAdapterImpl) {
        this.customAdapterImpl = customAdapterImpl;
    }

    /**
     * Invokes the wrapped adapter implementation of the unmarshal method.
     *
     * @param value the XML date time value to convert
     * @return created calendar object or null if cannot be parsed
     */
    @Override
    public Calendar unmarshal(String value) throws Exception {
        return this.customAdapterImpl.unmarshal(value);
    }

    /**
     * Invokes the wrapped adapter implementation of the marshal method.
     *
     * @param cal the model calendar to marshal
     * @return formatted content for the XML
     */
    @Override
    public String marshal(Calendar cal) throws Exception {
        return this.customAdapterImpl.marshal(cal);
    }

}
