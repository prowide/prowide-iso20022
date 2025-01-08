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

import java.time.*;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

public class OffsetTimeAdapterTest {

    private OffsetTimeAdapter adapter = new OffsetTimeAdapter();

    @Test
    public void testUnmarshallFractionOfSeconds() throws Exception {
        OffsetTime offsetTime = adapter.unmarshal("12:50:08.123-03:00");
        assertEquals(12, offsetTime.getHour());
        assertEquals(50, offsetTime.getMinute());
        assertEquals(8, offsetTime.getSecond());
        assertEquals(123000000, offsetTime.getNano());
        assertEquals(ZoneOffset.of("-03:00"), offsetTime.getOffset());
    }

    @Test
    public void testUnmarshallNoFractionOfSeconds() throws Exception {
        OffsetTime offsetTime = adapter.unmarshal("12:50:08-03:00");
        assertEquals(12, offsetTime.getHour());
        assertEquals(50, offsetTime.getMinute());
        assertEquals(8, offsetTime.getSecond());
        assertEquals(ZoneOffset.of("-03:00"), offsetTime.getOffset());
    }

    @Test
    public void testUnmarshallNoOffset() throws Exception {
        OffsetTime systemDateTime = OffsetTime.parse(
                "12:50:08" + ZoneOffset.systemDefault().getRules().getStandardOffset(Instant.now()));
        OffsetTime offsetTime = adapter.unmarshal("12:50:08");
        assertEquals(12, offsetTime.getHour());
        assertEquals(50, offsetTime.getMinute());
        assertEquals(8, offsetTime.getSecond());
        assertEquals(systemDateTime.getOffset(), offsetTime.getOffset());
    }

    @Test
    public void testMarshallNoFractionOfSecondsAndWithFractionOfSeconds() throws Exception {
        ZoneOffset zoneOffSet = ZoneOffset.of("-03:00");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss[.SSS][XXX]");

        OffsetTime offsetTime = LocalTime.parse("12:50:08", dateTimeFormatter).atOffset(zoneOffSet);
        assertEquals("12:50:08-03:00", adapter.marshal(offsetTime));

        offsetTime = LocalTime.parse("12:50:08.123", dateTimeFormatter).atOffset(zoneOffSet);
        assertEquals("12:50:08.123-03:00", adapter.marshal(offsetTime));
    }

    @Test
    public void testMarshallNoOffset() throws Exception {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss[.SSS][XXX]");
        ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(Instant.now());
        OffsetTime offsetTime = LocalTime.parse("12:50:08", dateTimeFormatter).atOffset(offset);
        assertEquals("12:50:08" + offset, adapter.marshal(offsetTime));
    }

    @Test
    public void testOffsetTime() throws Exception {
        ZoneOffset zoneOffset = ZoneId.systemDefault().getRules().getStandardOffset(Instant.now());
        String offset = zoneOffset.toString();
        if (offset.equals("Z")) {
            offset = "+00:00";
        }

        // DateTime without offset and with/without fractional seconds
        testTimeImpl("12:13:14", "12:13:14" + offset);
        testTimeImpl("12:13:14.1", "12:13:14.1" + offset);
        testTimeImpl("12:13:14.12", "12:13:14.12" + offset);
        testTimeImpl("12:13:14.123", "12:13:14.123" + offset);
        testTimeImpl("12:13:14.123456789", "12:13:14.123456789" + offset);

        // DateTime with offset and without fractional seconds
        testTimeImpl("12:13:14+01:00", "12:13:14+01:00");
        testTimeImpl("12:13:14-01:00", "12:13:14-01:00");
        testTimeImpl("12:13:14+00:00", "12:13:14+00:00");
        testTimeImpl("12:13:14-00:00", "12:13:14+00:00");
        testTimeImpl("12:13:14+08:30", "12:13:14+08:30");
        testTimeImpl("12:13:14Z", "12:13:14+00:00");

        // DateTime with offset and fractional seconds
        testTimeImpl("12:13:14.1+01:00", "12:13:14.1+01:00");
        testTimeImpl("12:13:14.12-01:00", "12:13:14.12-01:00");
        testTimeImpl("12:13:14.123+00:00", "12:13:14.123+00:00");
        testTimeImpl("12:13:14.123+08:30", "12:13:14.123+08:30");
        testTimeImpl("12:13:14.000+08:30", "12:13:14+08:30");
        testTimeImpl("12:13:14.000Z", "12:13:14+00:00");
        testTimeImpl("12:13:14.123Z", "12:13:14.123+00:00");
        testTimeImpl("12:13:14.123456Z", "12:13:14.123456+00:00");
    }

    private void testTimeImpl(String value, String valueResult) throws Exception {
        OffsetTimeAdapter offsetTimeAdapter = new OffsetTimeAdapter();
        OffsetTime OffsetTime = offsetTimeAdapter.unmarshal(value);
        String valueDateResult = offsetTimeAdapter.marshal(OffsetTime);
        assertEquals(valueResult, valueDateResult);
    }

    @Test
    public void testOffsetTimeWithNanosOnlyZero() throws Exception {
        // removable zeros
        testTimeImpl("17:30:33.0+02:00", "17:30:33+02:00");
        testTimeImpl("17:30:33.00+02:00", "17:30:33+02:00");
        testTimeImpl("17:30:33.000+02:00", "17:30:33+02:00");
        testTimeImpl("17:30:33.0000+02:00", "17:30:33+02:00");
        testTimeImpl("17:30:33.00000+02:00", "17:30:33+02:00");
        testTimeImpl("17:30:33.000000+02:00", "17:30:33+02:00");
        testTimeImpl("17:30:33.0000000+02:00", "17:30:33+02:00");
        testTimeImpl("17:30:33.00000000+02:00", "17:30:33+02:00");
        testTimeImpl("17:30:33.000000000+02:00", "17:30:33+02:00");
        // testTimeImpl("17:30:33.0000000000+02:00", "17:30:33+02:00"); //Cannot parse more
        // than 9 characters in nano value

        // non removable zeros
        testTimeImpl("17:30:33.0+02:00", "17:30:33+02:00");
        testTimeImpl("17:30:33.01+02:00", "17:30:33.01+02:00");
        testTimeImpl("17:30:33.001+02:00", "17:30:33.001+02:00");
        testTimeImpl("17:30:33.0001+02:00", "17:30:33.0001+02:00");
        testTimeImpl("17:30:33.00001+02:00", "17:30:33.00001+02:00");
        testTimeImpl("17:30:33.000001+02:00", "17:30:33.000001+02:00");
        testTimeImpl("17:30:33.0000001+02:00", "17:30:33.0000001+02:00");
        testTimeImpl("17:30:33.00000001+02:00", "17:30:33.00000001+02:00");
        testTimeImpl("17:30:33.000000001+02:00", "17:30:33.000000001+02:00");

        // UTC
        testTimeImpl("17:30:33.0Z", "17:30:33+00:00");
        testTimeImpl("17:30:33.000000000Z", "17:30:33+00:00");
        testTimeImpl("17:30:33.000000001Z", "17:30:33.000000001+00:00");
        testTimeImpl("17:30:33.123456789Z", "17:30:33.123456789+00:00");
        testTimeImpl("17:30:33Z", "17:30:33+00:00");
    }
}
