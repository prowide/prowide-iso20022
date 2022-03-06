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
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * XMLGregorianCalendar adapter for date elements.
 * <p>
 * Marshals the date time as YYY-MM-DD which is aligned with ISO 8601.
 * <p>
 * Notice the configured adapter in the model is the {@link IsoDateAdapter} wrapper class, but you can pass this
 * default implementation or your own in the constructor.
 *
 * @see TypeAdaptersConfiguration
 * @since 9.2.6
 */
public class SimpleDateAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private final SimpleDateFormat dateFormat;
    private final XmlAdapter<String, XMLGregorianCalendar> customAdapterImpl;

    /**
     * Creates a date adapter with the default format
     */
    public SimpleDateAdapter() {
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.customAdapterImpl = null;
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling
     */
    public SimpleDateAdapter(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
        this.customAdapterImpl = null;
    }

    /**
     * Creates a date adapter injecting a custom implementation
     */
    public SimpleDateAdapter(XmlAdapter<String, XMLGregorianCalendar> customAdapterImpl) {
        this.dateFormat = null;
        this.customAdapterImpl = customAdapterImpl;
    }

    /**
     * Creates a calendar parsing the value with this adapter format, or the default lexical representation as fallback.
     *
     * @param value the XML date time value to convert
     * @return created calendar object or null if cannot be parsed
     */
    @Override
    public XMLGregorianCalendar unmarshal(String value) throws Exception {
        if (this.customAdapterImpl != null) {
            return this.customAdapterImpl.unmarshal(value);
        } else {
            return AdapterUtils.parse(this.dateFormat, value);
        }
    }

    /**
     * Applies the configured format to the calendar.
     *
     * @param cal the model calendar to marshal
     * @return formatted content for the XML
     */
    @Override
    public String marshal(XMLGregorianCalendar cal) throws Exception {
        if (this.customAdapterImpl != null) {
            return this.customAdapterImpl.marshal(cal);
        } else {
            synchronized (dateFormat) {
                return AdapterUtils.format(this.dateFormat, cal);
            }
        }
    }

}
