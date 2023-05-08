package com.prowidesoftware.swift.model.mx.adapters;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.*;

class ZonedDateTimeAdapterTest {

    @Test
    void testDateTime() throws Exception {

        ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(Instant.now());
        ZoneId zoneId = ZoneOffset.systemDefault();


        //testDateTimeImpl("2021-09-19T12:13:14", "2021-09-19T12:13:14"+offset);
       testDateTimeImpl("2021-01-19T12:13:14.12", "2021-01-19T12:13:14.120"+offset);
       /* testDateTimeImpl("2021-09-19T12:13:14.12");
        testDateTimeImpl("2021-09-19T12:13:14.123");

        testDateTimeImpl("2021-09-19T12:13:14+01:00");
        testDateTimeImpl("2021-09-19T12:13:14-01:00");

        testDateTimeImpl("2021-09-19T12:13:14+00:00");
        testDateTimeImpl("2021-09-19T12:13:14-00:00");

        testDateTimeImpl("2021-09-19T12:13:14+08:30");
        testDateTimeImpl("2021-09-19T12:13:14Z");

        testDateTimeImpl("2021-09-19T12:13:14.1+01:00");
        testDateTimeImpl("2021-09-19T12:13:14.12-01:00");
        testDateTimeImpl("2021-09-19T12:13:14.123+00:00");
        testDateTimeImpl("2021-09-19T12:13:14.123+08:30");

        testDateTimeImpl("2021-09-19T12:13:14.000+08:30");
        testDateTimeImpl("2021-09-19T12:13:14.000Z");

        testDateTimeImpl("2021-09-19T12:13:14.123Z");*/



    }

    private void  testDateTimeImpl(String value, String valueResult) throws Exception {
        ZonedDateTimeAdapter zonedDateTimeAdapter = new ZonedDateTimeAdapter();
        Calendar calendar = zonedDateTimeAdapter.unmarshal(value);
        String valueDateResult = zonedDateTimeAdapter.marshal(calendar);
        assertEquals(valueResult, valueDateResult);
    }

    @Test
    public void testDate(){
    /*        DateTimeFormatter marshallFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

        DateTimeFormatter unmarshallFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.SSS][XXX]");


        System.out.println(unmarshallFormat.parse("2021-09-19T12:13:14.1"));*/

/*
        String strDateTime = "2012-02-22T02:06:58.1Z";
        System.out.println(Instant.parse(strDateTime));
        System.out.println(ZonedDateTime.parse(strDateTime));
        System.out.println(OffsetDateTime.parse(strDateTime));

        // Parsing with your pattern after correction
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.[SSS][SS][S]][XXX]");
        System.out.println(formatter.parse("2021-09-19T12:13:14.1"));
        System.out.println(formatter.parse("2021-09-19T12:13:14.12"));
        System.out.println(formatter.parse("2021-09-19T12:13:14.123"));

        System.out.println(formatter.parse("2021-09-19T12:13:14.1+01:00"));
        System.out.println(formatter.parse("2021-09-19T12:13:14.12-01:00"));
        System.out.println(formatter.parse("2021-09-19T12:13:14.123+00:00"));
        System.out.println(formatter.parse("2021-09-19T12:13:14.123+08:30"));*/

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.[SSS][SS][S]][XXX]");
        System.out.println(formatter.parse("2021-09-19T12:13:14.122+01:00"));



       // LocalDateTime ldt = LocalDateTime.parse("2021-09-19T12:13:14.123", formatter);




    }

}