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

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.sql.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Calendar adapter for date time elements.
 * <p>
 * Marshals the date time as a local time with UTC offset format YYYY-MM-DDThh:mm:ss[.sss]+/-hh:mm which is aligned
 * with ISO 8601. Dislike the default jaxb implementation, this adapter will always print the offset, and for UTC times
 * in particular an explicit '+00:00' offset is used instead of the 'Z'. The fractional seconds is printed only when it
 * is different than zero.
 * <p>
 * Notice the configured adapter in the model is the {@link IsoDateTimeAdapter} wrapper class, but you can pass this
 * default implementation or your own in the constructor.
 *
 * @see TypeAdaptersConfiguration
 * @since 9.2.6
 */
public class ZonedDateTimeAdapter extends XmlAdapter<String, Calendar> {
    private static final transient Logger log = Logger.getLogger(ZonedDateTimeAdapter.class.getName());

    private final DateTimeFormatter marshallFormat;
    private final DateTimeFormatter unmarshallFormat;
    private XmlAdapter<String, Calendar> customAdapterImpl;

    /**
     * Creates a date time adapter with the default format
     */
    public ZonedDateTimeAdapter() {
        this.marshallFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.unmarshallFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.[SSS][SS][S]][XXX]");
      //this.unmarshallFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.SSS][XXX]");


    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling
     */
    public ZonedDateTimeAdapter(DateTimeFormatter dateFormat) {
        this.marshallFormat = dateFormat;
        this.unmarshallFormat = dateFormat;
        customAdapterImpl = null;
    }

    /**
     * Creates a date time adapter injecting a custom implementation
     */
    public ZonedDateTimeAdapter(XmlAdapter<String, Calendar> customAdapterImpl) {
        this.marshallFormat = null;
        this.unmarshallFormat = null;
        this.customAdapterImpl = customAdapterImpl;
    }

    /**
     * Creates a calendar parsing the value with this adapter format, or the default lexical representation as fallback.
     *
     * @param value the XML date time value to convert
     * @return created calendar object or null if cannot be parsed
     */
    @Override
    public Calendar unmarshal(String value) throws Exception {
        if (this.customAdapterImpl != null) {
            return this.customAdapterImpl.unmarshal(value);
        } else {
            return parseZonedDateTime(this.unmarshallFormat, value);
        }
    }

    /**
     * Applies the configured format to the calendar. If the formats ends with an offset, and the calendar is an UTC
     * date time, we uses an explicit '+00:00' instead of the 'Z' code.
     *
     * @param cal the model calendar to marshal
     * @return formatted content for the XML
     */
    @Override
    public String marshal(Calendar cal) throws Exception {
        if (this.customAdapterImpl != null) {
            return this.customAdapterImpl.marshal(cal);
        } else {
            String formatted;
            synchronized (marshallFormat) {
                formatted = formatZonedDateTime(this.marshallFormat, cal);
            }
            return formatted.replace(".000", "").replace("Z", "+00:00");
        }
    }


    static Calendar parseZonedDateTime(DateTimeFormatter dateTimeFormatter, String value) {
        if (value == null) {
            return null;
        }
        try {
            //OffsetDateTime falla si viene sin offset
            //ZonedDateTime  falla si viene sin offset
            //LocalDateTime  falla cuando queremos obtener el ZoneOffset
            //TemporalAccessor temporalAccessor = parse(dateTimeFormatter, value);
            TemporalAccessor dateTime = dateTimeFormatter.parse(value);

/*            LocalDateTime dateTime = null;
            if(temporalAccessor instanceof LocalDateTime){
                dateTime = (LocalDateTime) temporalAccessor;
            }*/



            //ZonedDateTime offsetDateTime = ZonedDateTime.parse(value, dateTimeFormatter);
            Calendar calendar = Calendar.getInstance();
            calendar.set(dateTime.get(ChronoField.YEAR),dateTime.get(ChronoField.MONTH_OF_YEAR),dateTime.get(ChronoField.DAY_OF_MONTH),dateTime.get(ChronoField.HOUR_OF_DAY),dateTime.get(ChronoField.MINUTE_OF_HOUR), dateTime.get(ChronoField.SECOND_OF_MINUTE));

            try {
                calendar.set(Calendar.MILLISECOND, dateTime.get(ChronoField.MILLI_OF_SECOND));
            } catch (Exception e ){
                calendar.set(Calendar.MILLISECOND, 0);
            }


            try {
                calendar.setTimeZone(TimeZone.getTimeZone(ZonedDateTime.from(dateTime).getZone()));
            } catch (DateTimeException e) {
                //TODO aproposito le ponemos UTC
                log.finest("Error obtaining the TimeZone of the: " + value + "  " + e.getMessage());
                calendar.setTimeZone(TimeZone.getDefault());
            }


/*          //TODO aproposito le ponemos UTC
            if(temporalAccessor instanceof LocalDateTime){
                calendar.setTimeZone(TimeZone.getTimeZone(ZoneOffset.UTC));
            } else {
                calendar.setTimeZone(TimeZone.getTimeZone(ZoneOffset.from(dateTime)));
            }
*/

            System.out.println("----parse");
            System.out.println("entra : " + value);
            System.out.println("offset: " + dateTime);
            System.out.println("sale : "  + calendar.getTime());

            return calendar;

        } catch (IllegalArgumentException | DateTimeParseException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing to Calendar: " + e.getMessage());
            }
        }

        return null;
    }


/*    public static TemporalAccessor parse(DateTimeFormatter formatter, String toBeParsed) {
        return formatter.parseBest(toBeParsed, ZonedDateTime::from,
                OffsetDateTime::from, LocalDateTime::from);
    }*/

    static String formatZonedDateTime(DateTimeFormatter dateTimeFormatter, Calendar calendar) {
        //Aca nunca puede ser LocalDateTime porque el offset es obligatorio
        //Si llamo al formatter directo y la dateTime viene sin offset falla
        //return dateTimeFormatter.format(calendar.toInstant());

        //Default UTC si no tiene
        ZoneId zoneId = ZoneOffset.systemDefault();
        ZoneOffset zoneOffset = null;
        try {
            zoneId = calendar.getTimeZone().toZoneId();
            zoneOffset = ZonedDateTime.ofInstant(calendar.toInstant(), zoneId).withZoneSameInstant(zoneId).getOffset();
        } catch (DateTimeException e) {
            //TODO aproposito le ponemos UTC
            log.finest("Error obtaining the TimeZone of the: " + calendar + "  " + e.getMessage());
            calendar.setTimeZone(TimeZone.getDefault());
            zoneOffset = ZoneOffset.systemDefault().getRules().getOffset(Instant.now());
        }


        OffsetDateTime offsetDateTime = OffsetDateTime.of(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND), 0, zoneOffset);

        System.out.println("Calendar MONTH number:  " + calendar.get(Calendar.MONTH));
        //OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(calendar.toInstant(), zoneOffset);
        System.out.println("offsetDateTime MONTH number:  " + offsetDateTime.get(ChronoField.MONTH_OF_YEAR));
        //TODO NO PODEMOS RESTAR MONTH porque si nos mandan MES 0?

        offsetDateTime = offsetDateTime.withMonth(calendar.get(Calendar.MONTH));
        return dateTimeFormatter.format(offsetDateTime);
    }


    public DateTimeFormatter getMarshallFormat() {
        return marshallFormat;
    }

    public DateTimeFormatter getUnmarshallFormat() {
        return unmarshallFormat;
    }
}
