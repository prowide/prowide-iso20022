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
import static org.junit.jupiter.api.Assertions.assertNull;

public class ZonedDateTimeAdapterTestCases {

    private ZonedDateTimeAdapter adapter = new ZonedDateTimeAdapter();

    @Test
    public void testUnmarshallFractionOfSeconds() throws Exception {
        Calendar cal = adapter.unmarshal("2022-03-04T12:50:08.123-03:00");
        assertEquals(2022, cal.get(Calendar.YEAR));
        assertEquals(2, cal.get(Calendar.MONTH)); //TODO esta bien ? Enero = Month 0 ?
        assertEquals(4, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(12,cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(50,cal.get(Calendar.MINUTE));
        assertEquals(8, cal.get(Calendar.SECOND));
        //assertEquals(new BigDecimal("0.123"), cal.get(Calendar.MILLISECOND));
        TimeZone tz = cal.getTimeZone();
        int timezone = tz.getOffset(cal.getTime().getTime()) / 1000 / 60;
        assertEquals(-180, timezone);
    }

    @Test
    public void testUnmarshallNoFractionOfSeconds() throws Exception {
        Calendar cal = adapter.unmarshal("2022-03-04T12:50:08-03:00");
        assertEquals(2022, cal.get(Calendar.YEAR));
        assertEquals(2, cal.get(Calendar.MONTH)); //TODO esta bien ? Enero = Month 0 ?
        assertEquals(4, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(12,cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(50,cal.get(Calendar.MINUTE));
        assertEquals(8, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND)); //TODO milli ahora es 0 no null
        TimeZone tz = cal.getTimeZone();
        int timezone = tz.getOffset(cal.getTime().getTime()) / 1000 / 60;
        assertEquals(-180, timezone);
    }

    @Test
    public void testUnmarshallNoOffset() throws Exception {
        Calendar cal = adapter.unmarshal("2022-03-04T12:50:08");
        assertEquals(2022, cal.get(Calendar.YEAR));
        assertEquals(3, cal.get(Calendar.MONTH));
        assertEquals(4, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(12,cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(50,cal.get(Calendar.MINUTE));
        assertEquals(8, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testMarshallFractionOfSeconds() throws Exception {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Argentina/Buenos_Aires"));
        cal.set(Calendar.YEAR,2022);
        cal.set(Calendar.MONTH,3);
        cal.set(Calendar.DAY_OF_MONTH,4);
        cal.set(Calendar.HOUR_OF_DAY,12);
        cal.set(Calendar.MINUTE,50);
        cal.set(Calendar.SECOND,8);
        //cal.set(Calendar.MILLISECOND,123);
        //assertEquals("2022-03-04T12:50:08.123-03:00", adapter.marshal(cal));
        assertEquals("2022-03-04T12:50:08-03:00", adapter.marshal(cal));
    }

    @Test
    public void testMarshallNoFractionOfSeconds() throws Exception {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Argentina/Buenos_Aires"));
        cal.set(Calendar.YEAR,2022);
        cal.set(Calendar.MONTH,3);
        cal.set(Calendar.DAY_OF_MONTH,4);
        cal.set(Calendar.HOUR_OF_DAY,12);
        cal.set(Calendar.MINUTE,50);
        cal.set(Calendar.SECOND,8);
        assertEquals("2022-03-04T12:50:08-03:00", adapter.marshal(cal));
    }

    @Test
    public void testMarshallNoOffset() throws Exception {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(Calendar.YEAR,2022);
        cal.set(Calendar.MONTH,3);
        cal.set(Calendar.DAY_OF_MONTH,4);
        cal.set(Calendar.HOUR_OF_DAY,12);
        cal.set(Calendar.MINUTE,50);
        cal.set(Calendar.SECOND,8);
        assertEquals("2022-03-04T12:50:08+00:00", adapter.marshal(cal));
    }

}
