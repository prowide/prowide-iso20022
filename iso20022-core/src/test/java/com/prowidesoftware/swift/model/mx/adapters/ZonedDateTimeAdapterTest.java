package com.prowidesoftware.swift.model.mx.adapters;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZonedDateTimeAdapterTest {

    @Test
    void testDateTime() throws Exception {
        ZoneId zoneId = ZoneOffset.systemDefault();
        OffsetDateTime dateTime = LocalDateTime.parse("2021-09-19T12:13:14")
                .atZone(zoneId)
                .withEarlierOffsetAtOverlap()
                .withFixedOffsetZone()
                .withEarlierOffsetAtOverlap()
                .toOffsetDateTime();

        String offset = dateTime.getOffset().getId();

        testDateTimeImpl("2021-09-19T12:13:14", "2021-09-19T12:13:14" + offset);
        testDateTimeImpl("2021-09-19T12:13:14.1", "2021-09-19T12:13:14.100" + offset);
        testDateTimeImpl("2021-09-19T12:13:14.12", "2021-09-19T12:13:14.120" + offset);
        testDateTimeImpl("2021-09-19T12:13:14.123", "2021-09-19T12:13:14.123" + offset);

        testDateTimeImpl("2021-09-19T12:13:14+01:00", "2021-09-19T12:13:14+01:00");
        testDateTimeImpl("2021-09-19T12:13:14-01:00", "2021-09-19T12:13:14-01:00");
        testDateTimeImpl("2021-09-19T12:13:14+00:00", "2021-09-19T12:13:14+00:00");
        testDateTimeImpl("2021-09-19T12:13:14-00:00", "2021-09-19T12:13:14+00:00");
        testDateTimeImpl("2021-09-19T12:13:14+08:30", "2021-09-19T12:13:14+08:30");
        testDateTimeImpl("2021-09-19T12:13:14Z", "2021-09-19T12:13:14+00:00");

        testDateTimeImpl("2021-09-19T12:13:14.1+01:00", "2021-09-19T12:13:14.100+01:00");
        testDateTimeImpl("2021-09-19T12:13:14.12-01:00", "2021-09-19T12:13:14.120-01:00");
        testDateTimeImpl("2021-09-19T12:13:14.123+00:00", "2021-09-19T12:13:14.123+00:00");
        testDateTimeImpl("2021-09-19T12:13:14.123+08:30", "2021-09-19T12:13:14.123+08:30");
        testDateTimeImpl("2021-09-19T12:13:14.000+08:30", "2021-09-19T12:13:14+08:30");
        testDateTimeImpl("2021-09-19T12:13:14.000Z", "2021-09-19T12:13:14+00:00");
        testDateTimeImpl("2021-09-19T12:13:14.123Z", "2021-09-19T12:13:14.123+00:00");
    }

    private void testDateTimeImpl(String value, String valueResult) throws Exception {
        OffsetDateTimeAdapter zonedDateTimeAdapter = new OffsetDateTimeAdapter();
        OffsetDateTime offsetDateTime = zonedDateTimeAdapter.unmarshal(value);
        String valueDateResult = zonedDateTimeAdapter.marshal(offsetDateTime);
        assertEquals(valueResult, valueDateResult);
    }

}