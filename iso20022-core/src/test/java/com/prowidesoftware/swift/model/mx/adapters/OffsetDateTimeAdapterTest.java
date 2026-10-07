package com.prowidesoftware.swift.model.mx.adapters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.*;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

class OffsetDateTimeAdapterTest {

    @Test
    void testOffsetDateTime() throws Exception {
        ZoneId zoneId = ZoneId.systemDefault();
        // Use the offset for the specific date being tested, not "now" or "standard"
        LocalDateTime testDate = LocalDateTime.parse("2021-09-19T12:13:14");
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(testDate);
        String offset = zoneOffset.toString();
        if (offset.equals("Z")) {
            offset = "+00:00";
        }

        OffsetDateTime dateTime = testDate.atZone(zoneId)
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

    @Test
    void testFallbackZoneAppliedToValuesWithoutOffset() throws Exception {
        // fixed offset zone
        OffsetDateTimeAdapter utc = new OffsetDateTimeAdapter(ZoneOffset.UTC);
        assertEquals(OffsetDateTime.parse("2021-09-19T12:13:14Z"), utc.unmarshal("2021-09-19T12:13:14"));
        assertEquals("2021-09-19T12:13:14+00:00", utc.marshal(utc.unmarshal("2021-09-19T12:13:14")));

        // region zone without daylight saving
        OffsetDateTimeAdapter kolkata = new OffsetDateTimeAdapter(ZoneId.of("Asia/Kolkata"));
        assertEquals(
                ZoneOffset.ofHoursMinutes(5, 30),
                kolkata.unmarshal("2021-09-19T12:13:14").getOffset());

        // region zone with daylight saving: the offset in effect at the parsed date time is applied, not the one now
        OffsetDateTimeAdapter berlin = new OffsetDateTimeAdapter(ZoneId.of("Europe/Berlin"));
        OffsetDateTime summer = berlin.unmarshal("2026-06-29T12:30:00");
        assertEquals(ZoneOffset.ofHours(2), summer.getOffset());
        assertEquals(LocalDateTime.parse("2026-06-29T12:30:00"), summer.toLocalDateTime());
        assertEquals(
                ZoneOffset.ofHours(1), berlin.unmarshal("2026-01-29T12:30:00").getOffset());
    }

    @Test
    void testFallbackZoneIgnoredForValuesWithOffset() throws Exception {
        OffsetDateTimeAdapter utc = new OffsetDateTimeAdapter(ZoneOffset.UTC);
        assertEquals(OffsetDateTime.parse("2021-09-19T12:13:14+08:30"), utc.unmarshal("2021-09-19T12:13:14+08:30"));
        assertEquals(
                OffsetDateTime.parse("2021-09-19T12:13:14.123-03:00"), utc.unmarshal("2021-09-19T12:13:14.123-03:00"));
        assertEquals(OffsetDateTime.parse("2021-09-19T12:13:14Z"), utc.unmarshal("2021-09-19T12:13:14Z"));
    }

    @Test
    void testFallbackZoneWithCustomFormat() throws Exception {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[XXX]");
        OffsetDateTimeAdapter adapter = new OffsetDateTimeAdapter(format, ZoneOffset.ofHours(-3));
        assertEquals(
                ZoneOffset.ofHours(-3), adapter.unmarshal("2021-09-19T12:13:14").getOffset());
        assertEquals(
                ZoneOffset.ofHours(1),
                adapter.unmarshal("2021-09-19T12:13:14+01:00").getOffset());
    }

    @Test
    void testDefaultFallbackIsSystemDefaultZone() throws Exception {
        OffsetDateTime parsed = new OffsetDateTimeAdapter().unmarshal("2021-09-19T12:13:14");
        LocalDateTime local = LocalDateTime.parse("2021-09-19T12:13:14");
        assertEquals(ZoneId.systemDefault().getRules().getOffset(local), parsed.getOffset());
        assertEquals(local, parsed.toLocalDateTime());
    }

    @Test
    void testNullFallbackZoneRejected() {
        assertThrows(NullPointerException.class, () -> new OffsetDateTimeAdapter((ZoneId) null));
        assertThrows(
                NullPointerException.class, () -> new OffsetDateTimeAdapter(DateTimeFormatter.ISO_DATE_TIME, null));
    }
}
