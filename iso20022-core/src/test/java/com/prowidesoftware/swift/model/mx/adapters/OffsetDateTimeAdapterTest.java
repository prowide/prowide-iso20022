package com.prowidesoftware.swift.model.mx.adapters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.*;
import org.junit.jupiter.api.Test;

class OffsetDateTimeAdapterTest {

    @Test
    void testOffsetDateTime() throws Exception {
        ZoneId zoneId = ZoneId.systemDefault();
        ZoneOffset zoneOffset = zoneId.getRules().getStandardOffset(Instant.now());
        String offset = zoneOffset.toString();
        if (offset.equals("Z")) {
            offset = "+00:00";
        }

        OffsetDateTime dateTime = LocalDateTime.parse("2021-09-19T12:13:14")
                .atZone(zoneId)
                .withEarlierOffsetAtOverlap()
                .withFixedOffsetZone()
                .withEarlierOffsetAtOverlap()
                .toOffsetDateTime();

        // DateTime without offset and with/without fractional seconds
        testDateTimeImpl("2021-09-19T12:13:14", "2021-09-19T12:13:14" + offset);
        testDateTimeImpl("2021-09-19T12:13:14.1", "2021-09-19T12:13:14.100" + offset);
        testDateTimeImpl("2021-09-19T12:13:14.12", "2021-09-19T12:13:14.120" + offset);
        testDateTimeImpl("2021-09-19T12:13:14.123", "2021-09-19T12:13:14.123" + offset);
        testDateTimeImpl("2021-09-19T12:13:14.123456789", "2021-09-19T12:13:14.123456789" + offset);

        // DateTime with offset and without fractional seconds
        testDateTimeImpl("2021-09-19T12:13:14+01:00", "2021-09-19T12:13:14+01:00");
        testDateTimeImpl("2021-09-19T12:13:14-01:00", "2021-09-19T12:13:14-01:00");
        testDateTimeImpl("2021-09-19T12:13:14+00:00", "2021-09-19T12:13:14+00:00");
        testDateTimeImpl("2021-09-19T12:13:14-00:00", "2021-09-19T12:13:14+00:00");
        testDateTimeImpl("2021-09-19T12:13:14+08:30", "2021-09-19T12:13:14+08:30");
        testDateTimeImpl("2021-09-19T12:13:14Z", "2021-09-19T12:13:14+00:00");

        // DateTime with offset and fractional seconds
        testDateTimeImpl("2021-09-19T12:13:14.1+01:00", "2021-09-19T12:13:14.100+01:00");
        testDateTimeImpl("2021-09-19T12:13:14.12-01:00", "2021-09-19T12:13:14.120-01:00");
        testDateTimeImpl("2021-09-19T12:13:14.123+00:00", "2021-09-19T12:13:14.123+00:00");
        testDateTimeImpl("2021-09-19T12:13:14.123+08:30", "2021-09-19T12:13:14.123+08:30");
        testDateTimeImpl("2021-09-19T12:13:14.000+08:30", "2021-09-19T12:13:14+08:30");
        testDateTimeImpl("2021-09-19T12:13:14.000Z", "2021-09-19T12:13:14+00:00");
        testDateTimeImpl("2021-09-19T12:13:14.123Z", "2021-09-19T12:13:14.123+00:00");
        testDateTimeImpl("2018-01-15T17:30:33.4878001+02:00", "2018-01-15T17:30:33.4878001+02:00");
    }

    private void testDateTimeImpl(String value, String valueResult) throws Exception {
        OffsetDateTimeAdapter offsetDateTimeAdapter = new OffsetDateTimeAdapter();
        OffsetDateTime offsetDateTime = offsetDateTimeAdapter.unmarshal(value);
        String valueDateResult = offsetDateTimeAdapter.marshal(offsetDateTime);
        assertEquals(valueResult, valueDateResult);
    }

    @Test
    public void testOffsetDateTimeWithNanosOnlyZero() throws Exception {
        // removable zeros
        testDateTimeImpl("2018-01-15T17:30:33.0+02:00", "2018-01-15T17:30:33+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.00+02:00", "2018-01-15T17:30:33+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.000+02:00", "2018-01-15T17:30:33+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.0000+02:00", "2018-01-15T17:30:33+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.00000+02:00", "2018-01-15T17:30:33+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.000000+02:00", "2018-01-15T17:30:33+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.0000000+02:00", "2018-01-15T17:30:33+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.00000000+02:00", "2018-01-15T17:30:33+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.000000000+02:00", "2018-01-15T17:30:33+02:00");
        // testDateTimeImpl("2018-01-15T17:30:33.0000000000+02:00", "2018-01-15T17:30:33+02:00"); //Cannot parse more
        // than 9 characters in nano value

        // non removable zeros
        testDateTimeImpl("2018-01-15T17:30:33.0+02:00", "2018-01-15T17:30:33+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.01+02:00", "2018-01-15T17:30:33.010+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.001+02:00", "2018-01-15T17:30:33.001+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.0001+02:00", "2018-01-15T17:30:33.0001+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.00001+02:00", "2018-01-15T17:30:33.00001+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.000001+02:00", "2018-01-15T17:30:33.000001+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.0000001+02:00", "2018-01-15T17:30:33.0000001+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.00000001+02:00", "2018-01-15T17:30:33.00000001+02:00");
        testDateTimeImpl("2018-01-15T17:30:33.000000001+02:00", "2018-01-15T17:30:33.000000001+02:00");

        // UTC
        testDateTimeImpl("2018-01-15T17:30:33.0Z", "2018-01-15T17:30:33+00:00");
        testDateTimeImpl("2018-01-15T17:30:33.000000000Z", "2018-01-15T17:30:33+00:00");
        testDateTimeImpl("2018-01-15T17:30:33.000000001Z", "2018-01-15T17:30:33.000000001+00:00");
        testDateTimeImpl("2018-01-15T17:30:33.123456789Z", "2018-01-15T17:30:33.123456789+00:00");
        testDateTimeImpl("2018-01-15T17:30:33Z", "2018-01-15T17:30:33+00:00");
    }
}
