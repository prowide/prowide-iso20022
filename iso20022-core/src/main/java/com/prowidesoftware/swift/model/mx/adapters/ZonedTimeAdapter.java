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

import java.text.SimpleDateFormat;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Calendar adapter for time elements.
 * <p>
 * Marshals the time as a local time with UTC offset format hh:mm:ss[.sss]+/-hh:mm which is aligned with ISO 8601.
 * Dislike the default jaxb implementation, this adapter will always print the offset, and for UTC times in particular
 * an explicit '+00:00' offset is used instead of the 'Z'. The fractional seconds is printed only when it is different
 * than zero.
 * <p>
 * Notice the configured adapter in the model is the {@link IsoTimeAdapter} wrapper class, but you can pass this
 * default implementation or your own in the constructor.
 *
 * @see TypeAdaptersConfiguration
 * @since 9.2.6
 */
public class ZonedTimeAdapter extends XmlAdapter<String, Calendar> {

    private static final transient Logger log = Logger.getLogger(ZonedTimeAdapter.class.getName());

    private final DateTimeFormatter marshalFormat;
    private final DateTimeFormatter unmarshalFormat;
    private final XmlAdapter<String, Calendar> customAdapterImpl;

    /**
     * Creates a time adapter with the default format
     */
    public ZonedTimeAdapter() {
        this.marshalFormat = DateTimeFormatter.ofPattern("HH:mm:ss.SSSXXX");
        this.unmarshalFormat = DateTimeFormatter.ofPattern("HH:mm:ss[.SSS][XXX]");
        this.customAdapterImpl = null;
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling
     */
    public ZonedTimeAdapter(DateTimeFormatter dateFormat) {
        this.marshalFormat = dateFormat;
        this.unmarshalFormat = dateFormat;
        this.customAdapterImpl = null;
    }

    /**
     * Creates a time adapter injecting a custom implementation
     */
    public ZonedTimeAdapter(XmlAdapter<String, Calendar> customAdapterImpl) {
        this.marshalFormat = null;
        this.unmarshalFormat = null;
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
            return parseZonedTime(this.unmarshalFormat, value);
        }
    }

    /**
     * Applies the configured format to the calendar.
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
            synchronized (marshalFormat) {
                formatted = formatZonedTime(this.marshalFormat, cal);
            }
            return formatted.replace(".000", "").replace("Z", "+00:00");
        }
    }

    static String formatZonedTime(DateTimeFormatter dateTimeFormatter, Calendar calendar) {
        ZoneId zoneId = calendar.getTimeZone().toZoneId();
        ZoneOffset zoneOffSet = ZoneOffset.of(zoneId.getRules().getOffset(calendar.toInstant()).getId());
        OffsetTime offsetTime = OffsetTime.of(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND), 0, zoneOffSet);

        System.out.println("----parseTime");
        System.out.println("entra : " + calendar.getTime());
        System.out.println("offsetTime: "+offsetTime);
        System.out.println("sale : " + dateTimeFormatter.format(offsetTime));

        return dateTimeFormatter.format(offsetTime);
    }

    static Calendar parseZonedTime(DateTimeFormatter dateTimeFormatter, String value) {
        if (value == null) {
            return null;
        }
        try {
            // attempt lexical representation parsing
            OffsetTime offsetTime = OffsetTime.parse(value, dateTimeFormatter);

            //LocalTime localTime = LocalTime.parse(value, dateTimeFormatter);
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, offsetTime.getHour());
            calendar.set(Calendar.MINUTE, offsetTime.getMinute());
            calendar.set(Calendar.SECOND, offsetTime.getSecond());
            calendar.set(Calendar.MILLISECOND, 0);
            calendar.setTimeZone(TimeZone.getTimeZone(ZoneOffset.from(offsetTime)));



            System.out.println("----parseTime");
            System.out.println("entra : " + value);
            System.out.println("offsetTime: "+offsetTime);
            System.out.println("sale : " + calendar.getTime());



            return calendar;

            // return DatatypeFactory.newInstance().newCalendar(value);
        } catch (IllegalArgumentException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing to Calendar: " + e.getMessage());
            }
        }
        return null;
    }

}
