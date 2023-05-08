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

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Calendar adapter for date elements.
 * <p>
 * Marshals the date time as YYY-MM-DD which is aligned with ISO 8601.
 * <p>
 * Notice the configured adapter in the model is the {@link IsoDateAdapter} wrapper class, but you can pass this
 * default implementation or your own in the constructor.
 *
 * @see TypeAdaptersConfiguration
 * @since 9.2.6
 */
public class SimpleDateAdapter extends XmlAdapter<String, Calendar> {
    private static final transient Logger log = Logger.getLogger(SimpleDateAdapter.class.getName());

    private final DateTimeFormatter dateFormat;
    private final XmlAdapter<String, Calendar> customAdapterImpl;

    /**
     * Creates a date adapter with the default format
     */
    public SimpleDateAdapter() {
        this.dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.customAdapterImpl = null;
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling
     */
    public SimpleDateAdapter(DateTimeFormatter dateFormat) {
        this.dateFormat = dateFormat;
        this.customAdapterImpl = null;
    }

    /**
     * Creates a date adapter injecting a custom implementation
     */
    public SimpleDateAdapter(XmlAdapter<String, Calendar> customAdapterImpl) {
        this.dateFormat = null;
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
            return parseSimpleDate(this.dateFormat, value);
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
            synchronized (dateFormat) {
                return formatSimpleDate(this.dateFormat, cal);
            }
        }
    }


    static Calendar parseSimpleDate(DateTimeFormatter dateTimeFormatter, String value) {
        if (value == null) {
            return null;
        }
        try {
            LocalDate localDate = LocalDate.parse(value, dateTimeFormatter);
            Calendar calendar = Calendar.getInstance();
            calendar.set(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
            calendar.setTimeZone(TimeZone.getTimeZone(ZoneOffset.from(localDate)));

            System.out.println("----parseDate");
            System.out.println("entra : " + value);
            System.out.println("localDate: "+localDate);
            System.out.println("sale : " + calendar.getTime());

            return calendar;

        } catch (IllegalArgumentException | DateTimeParseException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing to Calendar: " + e.getMessage());
            }
        }
        return null;
    }

    static String formatSimpleDate(DateTimeFormatter dateTimeFormatter, Calendar calendar) {
        ZoneId zoneId = calendar.getTimeZone().toZoneId();
        calendar.set(Calendar.MILLISECOND, 0);
        ZoneOffset zoneOffSet = zoneId.getRules().getOffset(calendar.toInstant());
        OffsetDateTime offsetDateTime = OffsetDateTime.of(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND), 0, zoneOffSet);
        return dateTimeFormatter.format(offsetDateTime);

    }

}
