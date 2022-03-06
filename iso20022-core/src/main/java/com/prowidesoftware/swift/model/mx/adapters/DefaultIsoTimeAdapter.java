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
 * Default adapter for date elements.
 * <p>
 * Marshals the time with HH:mm:ss[.SSS][XXX] format where the fractional seconds are only printed when non-zero, and
 * the offset is only printed when not 'Z'.
 * <p>
 * Notice the configured adapter in the model is the {@link IsoTimeAdapter} wrapper class, but you can pass this
 * default implementation or your own in the constructor.
 *
 * @see TypeAdaptersConfiguration
 * @since 9.2.6
 */
public class DefaultIsoTimeAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private final SimpleDateFormat marshalFormat;
    private final SimpleDateFormat unmarshalFormat;
    private final XmlAdapter<String, XMLGregorianCalendar> customAdapterImpl;

    /**
     * Creates a time adapter with the default format
     */
    public DefaultIsoTimeAdapter() {
        this.marshalFormat = new SimpleDateFormat("HH:mm:ss.SSSXXX");
        this.unmarshalFormat = new SimpleDateFormat("HH:mm:ss[.SSS][XXX]");
        this.customAdapterImpl = null;
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling
     */
    public DefaultIsoTimeAdapter(SimpleDateFormat dateFormat) {
        this.marshalFormat = dateFormat;
        this.unmarshalFormat = dateFormat;
        this.customAdapterImpl = null;
    }

    /**
     * Creates a time adapter injecting a custom implementation
     */
    public DefaultIsoTimeAdapter(XmlAdapter<String, XMLGregorianCalendar> customAdapterImpl) {
        this.marshalFormat = null;
        this.unmarshalFormat = null;
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
            return AdapterUtils.parse(this.unmarshalFormat, value);
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
            String formatted;
            synchronized (marshalFormat) {
                formatted = AdapterUtils.format(this.marshalFormat, cal);
            }
            return formatted.replace(".000", "").replace("Z", "");
        }
    }

}
