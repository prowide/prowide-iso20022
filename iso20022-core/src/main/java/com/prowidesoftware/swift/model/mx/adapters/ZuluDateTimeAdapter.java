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

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * XMLGregorianCalendar adapter for date time elements.
 * <p>
 * Marshals the date time as a Zulu time with format YYYY-MM-DDThh:mm:ss[.sss]Z which is aligned
 * with ISO 8601. Dislike the default jaxb implementation, this adapter will always print the Z
 * The fractional seconds is printed only when it is different from zero.
 * <p>
 * Notice the configured adapter in the model is the {@link IsoDateTimeAdapter} wrapper class, but you can pass this
 * default implementation or your own in the constructor.
 *
 * @see TypeAdaptersConfiguration
 * @since 9.4,5
 */
public class ZuluDateTimeAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private final SimpleDateFormat marshalFormat;
    private final SimpleDateFormat unmarshalFormat;
    private final XmlAdapter<String, XMLGregorianCalendar> customAdapterImpl;

    /**
     * Creates a date time adapter with the default format
     */
    public ZuluDateTimeAdapter() {
        this.marshalFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        this.unmarshalFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss[.SSS]['Z']");
        this.customAdapterImpl = null;
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling
     */
    public ZuluDateTimeAdapter(SimpleDateFormat dateFormat) {
        this.marshalFormat = dateFormat;
        this.unmarshalFormat = dateFormat;
        this.customAdapterImpl = null;
    }

    /**
     * Creates a date time adapter injecting a custom implementation
     */
    public ZuluDateTimeAdapter(XmlAdapter<String, XMLGregorianCalendar> customAdapterImpl) {
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
                // Create a new Calendar with the Date represented in Zulu Time
                XMLGregorianCalendar xmlGregorianCalendarZulu = getXmlGregorianCalendarInZulu(cal);
                formatted = AdapterUtils.format(this.marshalFormat, xmlGregorianCalendarZulu);
            }
            return formatted.replace(".000", "");
        }
    }

    private static XMLGregorianCalendar getXmlGregorianCalendarInZulu(XMLGregorianCalendar cal)
            throws DatatypeConfigurationException {
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar();
        GregorianCalendar gregorianCalendar = xmlGregorianCalendar.toGregorianCalendar();
        gregorianCalendar.setTime(cal.toGregorianCalendar().getTime());
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone("Z"));
        return datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
    }
}
