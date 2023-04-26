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

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZonedTimeAdapterTest {

    private ZonedTimeAdapter adapter = new ZonedTimeAdapter();

    @Test
    public void testUnmarshallFractionOfSeconds() throws Exception {
        Calendar cal = adapter.unmarshal("12:50:08.123-03:00");
        cal.setTimeZone(TimeZone.getTimeZone("America/Argentina/Buenos"));
        assertEquals(12, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(50, cal.get(Calendar.MINUTE));
        assertEquals(8, cal.get(Calendar.SECOND));
        //assertEquals(new BigDecimal("0.123"), cal.get(Calendar.MILLISECOND));


        //TODO FIX estos assertEquals
        //assertEquals(new BigDecimal("0.123"), cal.getFractionalSecond());
        //assertEquals(-180, cal.getTimezone());
    }

    @Test
    public void testUnmarshallNoFractionOfSeconds() throws Exception {
        Calendar c = adapter.unmarshal("12:50:08-03:00");
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(50, c.get(Calendar.MINUTE));
        assertEquals(8,  c.get(Calendar.SECOND));
    }

    @Test
    public void testUnmarshallNoOffset() throws Exception {
        Calendar cal = adapter.unmarshal("12:50:08");
        assertEquals(12, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(50, cal.get(Calendar.MINUTE));
        assertEquals(8, cal.get(Calendar.SECOND));
        //assertEquals(null, cal.getFractionalSecond());
    }

    @Test
    public void testMarshallFractionOfSeconds() throws Exception {
        Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("America/Argentina/Buenos_Aires"));
        c.set(2022, 3, 4, 12, 50, 8);
        assertEquals("12:50:08-03:00", adapter.marshal(c));

        //c.set(Calendar.MILLISECOND, 123);
        //assertEquals("12:50:08.123-03:00", adapter.marshal(c));
        //ESTO DE FRACTIONAL QUE VAMOS A HACER?
    }

    @Test
    public void testMarshallNoFractionOfSeconds() throws Exception {
        Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("America/Argentina/Buenos_Aires"));
        c.set(2022, 3, 4, 12, 50, 8);
        assertEquals("12:50:08-03:00", adapter.marshal(c));
    }

    @Test
    public void testMarshallNoOffset() throws Exception {
        Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
        c.set(2022, 3, 4, 12, 50, 8);
        assertEquals("12:50:08+00:00", adapter.marshal(c));
    }

}
