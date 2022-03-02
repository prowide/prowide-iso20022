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
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Default adapter for date elements.
 * <p>
 * Marshals the date time as YYY-MM-DD which is aligned with ISO 8601.
 * <p>
 * This implementation is applied in the model with the @XmlJavaTypeAdapter(IsoDateAdapter.class) annotation to
 * all schema elements with type "ISODate".
 * <p>
 * This class is provided also as a hook to inject your own instance via the {@link MxWriteConfiguration} if you need
 * the datetime elements formatted differently. You can create an instance with a specific date format parameter
 * or you can also extend this class and inject an instance of your own adapter implementation.
 *
 * @since 9.2.6
 */
public class IsoDateAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private final SimpleDateFormat dateFormat;

    /**
     * Creates the adapter with the default format
     */
    public IsoDateAdapter() {
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    /**
     * Creates an adapter with a specific given format
     */
    public IsoDateAdapter(SimpleDateFormat dateFormat) {
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
     * Applies the configured format to the calendar.
     *
     * @param cal the model calendar to marshal
     * @return formatted content for the XML
     * @throws Exception
     */
    @Override
    public String marshal(XMLGregorianCalendar cal) throws Exception {
        synchronized (dateFormat) {
            return format(cal);
        }
    }

    private String format(XMLGregorianCalendar calendar) {
        GregorianCalendar gCalender = calendar.toGregorianCalendar();
        java.util.Date date = gCalender.getTime();
        dateFormat.setCalendar(gCalender);
        return dateFormat.format(date);
    }

}
