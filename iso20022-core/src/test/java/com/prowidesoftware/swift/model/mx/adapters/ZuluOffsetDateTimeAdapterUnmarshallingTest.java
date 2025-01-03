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

import java.time.Month;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;

public class ZuluOffsetDateTimeAdapterUnmarshallingTest {

    private final ZuluOffsetDateTimeAdapter adapter = new ZuluOffsetDateTimeAdapter();

    @Test
    public void testUnmarshallFractionOfSeconds() {
        OffsetDateTime datetime = adapter.unmarshal("2022-03-04T12:50:08.123Z");
        assertEquals(2022, datetime.getYear());
        assertEquals(Month.MARCH, datetime.getMonth());
        assertEquals(4, datetime.getDayOfMonth());
        assertEquals(12, datetime.getHour());
        assertEquals(50, datetime.getMinute());
        assertEquals(8, datetime.getSecond());
        assertEquals(123000000, datetime.getNano());
        assertEquals(0, datetime.getOffset().getTotalSeconds());
    }

    @Test
    public void testUnmarshallNoFractionOfSeconds() {
        OffsetDateTime datetime = adapter.unmarshal("2022-03-04T12:50:08Z");
        assertEquals(2022, datetime.getYear());
        assertEquals(Month.MARCH, datetime.getMonth());
        assertEquals(4, datetime.getDayOfMonth());
        assertEquals(12, datetime.getHour());
        assertEquals(50, datetime.getMinute());
        assertEquals(8, datetime.getSecond());
        assertEquals(0, datetime.getNano());
        assertEquals(0, datetime.getOffset().getTotalSeconds());
    }

    @Test
    public void testUnmarshallUTCOffset() {
        OffsetDateTime datetime = adapter.unmarshal("2022-03-04T12:50:08+00:00");
        assertEquals(2022, datetime.getYear());
        assertEquals(Month.MARCH, datetime.getMonth());
        assertEquals(4, datetime.getDayOfMonth());
        assertEquals(12, datetime.getHour());
        assertEquals(50, datetime.getMinute());
        assertEquals(8, datetime.getSecond());
        assertEquals(0, datetime.getNano());
        assertEquals(0, datetime.getOffset().getTotalSeconds());
    }

    @Test
    public void testUnmarshallOffset() {
        OffsetDateTime datetime = adapter.unmarshal("2022-03-04T12:50:08-03:00");
        assertEquals(2022, datetime.getYear());
        assertEquals(Month.MARCH, datetime.getMonth());
        assertEquals(4, datetime.getDayOfMonth());
        assertEquals(12, datetime.getHour());
        assertEquals(50, datetime.getMinute());
        assertEquals(8, datetime.getSecond());
        assertEquals(0, datetime.getNano());
        assertEquals(-10800, datetime.getOffset().getTotalSeconds()); // - 3 hours from UTC
    }

    @Test
    public void testUnmarshallNoOffset() {
        OffsetDateTime datetime = adapter.unmarshal("2022-03-04T12:50:08");
        assertEquals(2022, datetime.getYear());
        assertEquals(Month.MARCH, datetime.getMonth());
        assertEquals(4, datetime.getDayOfMonth());
        assertEquals(12, datetime.getHour());
        assertEquals(50, datetime.getMinute());
        assertEquals(8, datetime.getSecond());
        assertEquals(0, datetime.getNano());
    }
}
