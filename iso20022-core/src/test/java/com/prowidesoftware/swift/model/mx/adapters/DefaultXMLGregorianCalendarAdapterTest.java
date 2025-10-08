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

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultXMLGregorianCalendarAdapterTest {

    private DefaultXMLGregorianCalendarAdapter adapter;

    @BeforeEach
    public void setup() throws DatatypeConfigurationException {
        this.adapter = new DefaultXMLGregorianCalendarAdapter();
    }

    /*
     * Date time
     */

    @Test
    public void testDateTimeWithFractionWithOffset() throws Exception {
        String dateTime = "2021-10-19T12:13:14.123-03:00";
        XMLGregorianCalendar cal = adapter.unmarshal(dateTime);
        String val = adapter.marshal(cal);
        assertEquals(dateTime, val);
    }

    @Test
    public void testDateTimeWithFractionWithUTC() throws Exception {
        String dateTime = "2021-10-19T12:13:14.123Z";
        XMLGregorianCalendar cal = adapter.unmarshal(dateTime);
        String val = adapter.marshal(cal);
        assertEquals(dateTime, val);
    }

    @Test
    public void testDateTimeNoFractionWithOffset() throws Exception {
        String dateTime = "2021-10-19T12:13:14-03:00";
        XMLGregorianCalendar cal = adapter.unmarshal(dateTime);
        String val = adapter.marshal(cal);
        assertEquals(dateTime, val);
    }

    @Test
    public void testDateTimeNoFractionUTC() throws Exception {
        String dateTime = "2021-10-19T12:13:14Z";
        XMLGregorianCalendar cal = adapter.unmarshal(dateTime);
        String val = adapter.marshal(cal);
        assertEquals(dateTime, val);
    }

    /*
     * Time
     */

    @Test
    public void testTimeWithFractionWithOffset() throws Exception {
        String dateTime = "12:13:14.123-03:00";
        XMLGregorianCalendar cal = adapter.unmarshal(dateTime);
        String val = adapter.marshal(cal);
        assertEquals(dateTime, val);
    }

    @Test
    public void testTimeWithFractionWithUTC() throws Exception {
        String dateTime = "12:13:14.123Z";
        XMLGregorianCalendar cal = adapter.unmarshal(dateTime);
        String val = adapter.marshal(cal);
        assertEquals(dateTime, val);
    }

    @Test
    public void testTimeNoFractionWithOffset() throws Exception {
        String dateTime = "12:13:14-03:00";
        XMLGregorianCalendar cal = adapter.unmarshal(dateTime);
        String val = adapter.marshal(cal);
        assertEquals(dateTime, val);
    }

    @Test
    public void testTimeNoFractionUTC() throws Exception {
        String dateTime = "12:13:14Z";
        XMLGregorianCalendar cal = adapter.unmarshal(dateTime);
        String val = adapter.marshal(cal);
        assertEquals(dateTime, val);
    }

    /*
     * Date
     */

    @Test
    public void testDate() throws Exception {
        String dateTime = "2021-10-19";
        XMLGregorianCalendar cal = adapter.unmarshal(dateTime);
        String val = adapter.marshal(cal);
        assertEquals(dateTime, val);
    }
}
