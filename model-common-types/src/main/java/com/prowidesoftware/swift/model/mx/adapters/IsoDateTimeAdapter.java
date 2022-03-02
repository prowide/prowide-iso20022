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

import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Default adapter for date time elements.
 * <p>
 * Marshals the date time as a local time with UTC offset format YYYY-MM-DDThh:mm:ss.sss+/-hh:mm which is aligned with
 * ISO 8601. For UTC times an explicit '+00:00' offset is used instead of the 'Z' code.
 * <p>
 * This implementation is applied in the model with the @XmlJavaTypeAdapter(IsoDateTimeAdapter.class) annotation to
 * all schema elements with type "ISODateTime".
 * <p>
 * This class is provided also as a hook to inject your own instance via the {@link MxWriteConfiguration} if you need
 * the datetime elements formatted differently. You can create an instance with a specific date format parameter
 * or you can also extend this class and inject an instance of your own adapter implementation.
 *
 * @since 9.2.6
 */
public class IsoDateTimeAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private final String pattern;
    private final SimpleDateFormat dateFormat;

    /**
     * Creates the adapter with the default format
     */
    public IsoDateTimeAdapter() {
        this.pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
        this.dateFormat = new SimpleDateFormat(this.pattern);
    }

    /**
     * Creates an adapter with a specific given format
     */
    public IsoDateTimeAdapter(SimpleDateFormat dateFormat) {
        this.pattern = null;
        this.dateFormat = dateFormat;
    }

    /**
     * Creates a calendar from the value using the default data type factory.
     *
     * @param value the XML date time value to convert
     * @return created calendar object
     * @throws Exception
     */
    @Override
    public XMLGregorianCalendar unmarshal(String value) throws Exception {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(value);
    }

    /**
     * Applies the configured format to the calendar. If the formats ends with an offset, and the calendar is an UTC
     * date time, we uses an explicit '+00:00' instead of the 'Z' code.
     *
     * @param cal the model calendar to marshal
     * @return formatted content for the XML
     * @throws Exception
     */
    @Override
    public String marshal(XMLGregorianCalendar cal) throws Exception {
        String formatted;
        synchronized (dateFormat) {
            formatted = format(cal);
        }
        if (StringUtils.endsWith(this.pattern, "XXX")) {
            return StringUtils.replace(formatted, "Z", "+00:00");
        } else {
            return formatted;
        }
    }

    private String format(XMLGregorianCalendar calendar) {
        GregorianCalendar gCalender = calendar.toGregorianCalendar();
        java.util.Date date = gCalender.getTime();
        dateFormat.setCalendar(gCalender);
        return dateFormat.format(date);
    }

}
