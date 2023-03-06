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
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * XMLGregorianCalendar adapter for time elements.
 * <p>
 * Marshals the time as a local time with UTC offset format hh:mm:ss[.sss]+/-hh:mm which is aligned with ISO 8601.
 * Dislike the default jaxb implementation, this adapter will always print the offset, and for UTC times in particular
 * an explicit '+00:00' offset is used instead of the 'Z'. The fractional seconds is printed only when it is different
 * than zero.
 * <p>
 * Notice the configured adapter in the model is the {@link IsoTimeAdapter} wrapper class, but you can pass this
 * default implementation or your own in the constructor.
 *
 * @see TypeAdaptersConfiguration
 * @since 9.2.6
 */
public class ZonedTimeAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private final SimpleDateFormat marshalFormat;
    private final SimpleDateFormat unmarshalFormat;
    private final XmlAdapter<String, XMLGregorianCalendar> customAdapterImpl;

    /**
     * Creates a time adapter with the default format
     */
    public ZonedTimeAdapter() {
        this.marshalFormat = new SimpleDateFormat("HH:mm:ss.SSSXXX");
        this.unmarshalFormat = new SimpleDateFormat("HH:mm:ss[.SSS][XXX]");
        this.customAdapterImpl = null;
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling
     */
    public ZonedTimeAdapter(SimpleDateFormat dateFormat) {
        this.marshalFormat = dateFormat;
        this.unmarshalFormat = dateFormat;
        this.customAdapterImpl = null;
    }

    /**
     * Creates a time adapter injecting a custom implementation
     */
    public ZonedTimeAdapter(XmlAdapter<String, XMLGregorianCalendar> customAdapterImpl) {
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
            return formatted.replace(".000", "").replace("Z", "+00:00");
        }
    }

}
