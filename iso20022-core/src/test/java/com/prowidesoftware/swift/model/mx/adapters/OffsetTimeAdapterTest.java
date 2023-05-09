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

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OffsetTimeAdapterTest {

    private OffsetTimeAdapter adapter = new OffsetTimeAdapter();

    @Test
    public void testUnmarshallFractionOfSeconds() throws Exception {
        OffsetTime offsetTime = adapter.unmarshal("12:50:08.123-03:00");
        assertEquals(12, offsetTime.getHour());
        assertEquals(50, offsetTime.getMinute());
        assertEquals(8,  offsetTime.getSecond());
        assertEquals(123000000,  offsetTime.getNano());
        assertEquals(ZoneOffset.of("-03:00"),  offsetTime.getOffset());
    }

    @Test
    public void testUnmarshallNoFractionOfSeconds() throws Exception {
        OffsetTime offsetTime = adapter.unmarshal("12:50:08-03:00");
        assertEquals(12, offsetTime.getHour());
        assertEquals(50, offsetTime.getMinute());
        assertEquals(8,  offsetTime.getSecond());
        assertEquals(ZoneOffset.of("-03:00"),  offsetTime.getOffset());

    }

    @Test
    public void testUnmarshallNoOffset() throws Exception {
        OffsetTime systemDateTime = OffsetTime.parse("12:50:08" + ZoneOffset.systemDefault().getRules().getStandardOffset(Instant.now()));
        OffsetTime offsetTime = adapter.unmarshal("12:50:08");
        assertEquals(12, offsetTime.getHour());
        assertEquals(50, offsetTime.getMinute());
        assertEquals(8, offsetTime.getSecond());
        assertEquals(systemDateTime.getOffset(), offsetTime.getOffset());
    }

    @Test
    public void testMarshallNoFractionOfSecondsAndWithFractionOfSeconds() throws Exception {
        ZoneOffset zoneOffSet= ZoneOffset.of("-03:00");
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
        assertEquals("12:50:08"+offset, adapter.marshal(offsetTime));
    }

}