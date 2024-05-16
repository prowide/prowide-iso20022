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

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.jupiter.api.Test;

public class ZuluDateTimeAdapterTest {

    private ZuluDateTimeAdapter adapter = new ZuluDateTimeAdapter();

    @Test
    public void testUnmarshallFractionOfSeconds() throws Exception {
        XMLGregorianCalendar cal = adapter.unmarshal("2022-03-04T12:50:08.123Z");
        assertEquals(2022, cal.getYear());
        assertEquals(3, cal.getMonth());
        assertEquals(4, cal.getDay());
        assertEquals(12, cal.getHour());
        assertEquals(50, cal.getMinute());
        assertEquals(8, cal.getSecond());
        assertEquals(new BigDecimal("0.123"), cal.getFractionalSecond());
        assertEquals(0, cal.getTimezone());
    }

    @Test
    public void testUnmarshallNoFractionOfSeconds() throws Exception {
        XMLGregorianCalendar cal = adapter.unmarshal("2022-03-04T12:50:08Z");
        assertEquals(2022, cal.getYear());
        assertEquals(3, cal.getMonth());
        assertEquals(4, cal.getDay());
        assertEquals(12, cal.getHour());
        assertEquals(50, cal.getMinute());
        assertEquals(8, cal.getSecond());
        assertEquals(null, cal.getFractionalSecond());
        assertEquals(0, cal.getTimezone());
    }

    @Test
    public void testUnmarshallNoOffset() throws Exception {
        XMLGregorianCalendar cal = adapter.unmarshal("2022-03-04T12:50:08");
        assertEquals(2022, cal.getYear());
        assertEquals(3, cal.getMonth());
        assertEquals(4, cal.getDay());
        assertEquals(12, cal.getHour());
        assertEquals(50, cal.getMinute());
        assertEquals(8, cal.getSecond());
        assertEquals(null, cal.getFractionalSecond());
    }

    @Test
    public void testMarshallFractionOfSeconds() throws Exception {
        XMLGregorianCalendar cal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(BigInteger.valueOf(2022), 3, 4, 12, 50, 8, new BigDecimal("0.123"), -180);
        assertEquals("2022-03-04T12:50:08.123Z", adapter.marshal(cal));
    }

    @Test
    public void testMarshallNoFractionOfSeconds() throws Exception {
        XMLGregorianCalendar cal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(BigInteger.valueOf(2022), 3, 4, 12, 50, 8, null, -180);
        assertEquals("2022-03-04T12:50:08Z", adapter.marshal(cal));
    }

    @Test
    public void testMarshallNoOffset() throws Exception {
        XMLGregorianCalendar cal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(BigInteger.valueOf(2022), 3, 4, 12, 50, 8, null, -0);
        assertEquals("2022-03-04T12:50:08Z", adapter.marshal(cal));
    }
}
