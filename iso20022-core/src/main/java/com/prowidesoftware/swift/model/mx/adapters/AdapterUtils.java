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


import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Reusable code for adapters implementations
 */
class AdapterUtils {
    private static final transient Logger log = Logger.getLogger(AdapterUtils.class.getName());

    static String format(DateTimeFormatter dateTimeFormatter, Calendar calendar) {
        //LocalDateTime localDateTime = LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId());
        //OffsetDateTime offsetDateTime = OffsetDateTime.from(localDateTime);

        //LocalDateTime localDateTime = LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId());
        //OffsetDateTime offsetDateTime = OffsetDateTime.from(calendar.toInstant());

        ZoneId zoneId = calendar.getTimeZone().toZoneId();
        ZoneOffset zoneOffSet = zoneId.getRules().getOffset(calendar.toInstant());
        OffsetDateTime offsetDateTime = OffsetDateTime.of(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND), 0, zoneOffSet);
        return dateTimeFormatter.format(offsetDateTime);

    }

    static String formatTime(DateTimeFormatter dateTimeFormatter, Calendar calendar) {
        ZoneId zoneId = calendar.getTimeZone().toZoneId();
        ZoneOffset zoneOffSet = zoneId.getRules().getStandardOffset(calendar.toInstant());
        OffsetTime offsetTime = OffsetTime.of(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND), 0, zoneOffSet);
        return dateTimeFormatter.format(offsetTime);

    }

    static Calendar parse(DateTimeFormatter dateTimeFormatter, String value) {
        if (value == null) {
            return null;
        }
        try {
            // attempt lexical representation parsing
/*            OffsetDateTime dateTime = OffsetDateTime.parse(value, dateTimeFormatter);
            Date d = Date.from(dateTime.toInstant());
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            return c;*/

            //Anda si la fecha SI tiene Offset
            ZonedDateTime zdt = ZonedDateTime.parse(value, dateTimeFormatter);
            Calendar calendar = GregorianCalendar.from(zdt);
            return calendar;


 /*         //Anda si la fecha NO tiene Offset
            OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.parse(value, dateTimeFormatter), ZoneOffset.UTC);
            Date d = Date.from(offsetDateTime.toInstant());
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            return c;*/



        } catch (IllegalArgumentException | DateTimeParseException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing to Calendar: " + e.getMessage());
            }
        }
        //TODO ESTO Comparar como se hacia con XMLGregorianCalendar
/*        try {
            ZonedDateTime zdt = ZonedDateTime.parse(value, dateFormat);
            Calendar calendar = GregorianCalendar.from(zdt);
            return calendar;
        } catch (ParseException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing Calendar with " + dateFormat.toPattern() + ": " + e.getMessage());
            }
        }*/

        try {
            //Anda si la fecha NO tiene Offset
            OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.parse(value, dateTimeFormatter), ZoneOffset.UTC);
            Date d = Date.from(offsetDateTime.toInstant());

            LocalDateTime localDateTime = LocalDateTime.parse(value, dateTimeFormatter);
            Calendar c = Calendar.getInstance();
            c.set(Calendar.YEAR, localDateTime.getYear());
            c.set(Calendar.MONTH, localDateTime.getMonthValue());
            c.set(Calendar.DAY_OF_MONTH, localDateTime.getDayOfMonth());
            c.set(Calendar.HOUR_OF_DAY, localDateTime.getHour());
            c.set(Calendar.MINUTE, localDateTime.getMinute());
            c.set(Calendar.SECOND, localDateTime.getSecond());
            c.set(Calendar.MILLISECOND, 0);



            return c;
        } catch (DateTimeParseException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing XMLGregorianCalendar with " + dateTimeFormatter + ": " + e.getMessage());
            }
        }


        return null;
    }


    static Calendar parseTime(DateTimeFormatter dateTimeFormatter, String value) {
        if (value == null) {
            return null;
        }
        try {
            // attempt lexical representation parsing
            LocalTime localTime = LocalTime.parse(value, dateTimeFormatter);
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, localTime.getHour());
            calendar.set(Calendar.MINUTE, localTime.getMinute());
            calendar.set(Calendar.SECOND, localTime.getSecond());
            calendar.set(Calendar.MILLISECOND, 0);
            return calendar;

            // return DatatypeFactory.newInstance().newCalendar(value);
        } catch (IllegalArgumentException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing to Calendar: " + e.getMessage());
            }
        }
        //TODO ESTO Comparar como se hacia con XMLGregorianCalendar
/*        try {
            ZonedDateTime zdt = ZonedDateTime.parse(value, dateFormat);
            Calendar calendar = GregorianCalendar.from(zdt);
            return calendar;
        } catch (ParseException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing Calendar with " + dateFormat.toPattern() + ": " + e.getMessage());
            }
        }*/
        return null;
    }

}
