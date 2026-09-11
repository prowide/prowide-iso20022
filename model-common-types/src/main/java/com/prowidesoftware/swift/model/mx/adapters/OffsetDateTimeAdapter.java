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

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.format.DateTimeFormatterBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Default generic adapter to use when non is provided via the configuration API.
 * Used as default implementation for the {@link IsoDateTimeAdapter}.
 * <p>
 * Date time values without offset in the XML are resolved in a fallback zone, by default the JVM default time zone.
 * Use {@link #OffsetDateTimeAdapter(ZoneId)} to set a specific zone.
 *
 * @since 10.0.0
 */
public class OffsetDateTimeAdapter extends XmlAdapter<String, OffsetDateTime> {
    private static final Logger log = Logger.getLogger(OffsetDateTimeAdapter.class.getName());
    private final DateTimeFormatter marshalFormat;
    private final DateTimeFormatter unmarshalFormat;
    private final XmlAdapter<String, OffsetDateTime> customAdapterImpl;
    private final ZoneId fallbackZone;
    //private final String regex = "\\\\.0{1,}[Z+-]";
    // Regex to capture three digits after a dot, representing milliseconds
    // The (?:\\d{3}) part makes the group non-capturing, but the \\d{3} matches the digits.
    // The \\. ensures we match a literal dot.
    // The (Z|[+-]\\d{2}:\\d{2}) part matches the timezone indicator (Z or offset).
    private final String regex = "(\\.\\d{1,3})(?:Z|[+-]\\d{2}:\\d{2})";
    private final Pattern pattern = Pattern.compile(regex);
    int minPrecision = 0;
    int maxPrecision = 9;

    /**
     * Creates a date time adapter with the default format, resolving values without offset in the JVM default zone
     *
     * @see #OffsetDateTimeAdapter(ZoneId)
     */
    public OffsetDateTimeAdapter() {
        this(ZoneId.systemDefault());
    }

    /**
     * Creates a date time adapter with the default format and a specific fallback zone for values without offset.
     * <p>
     * A date time without offset in the XML is a valid xs:dateTime lexical form meaning local time with indeterminate
     * zone, and it cannot be represented as such by an {@link OffsetDateTime}. The fallback zone is used to resolve
     * the offset of these values when unmarshalling, applying the zone rules in effect at the parsed date time.
     * Values with an explicit offset in the XML are not affected.
     *
     * @param fallbackZone zone used to resolve date time values without offset, for example
     *                     {@link java.time.ZoneOffset#UTC} to make the result independent of the JVM configuration
     * @since 10.3.11
     */
    public OffsetDateTimeAdapter(ZoneId fallbackZone) {
        this.marshalFormat = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd'T'HH:mm:ss")
                .optionalStart()
                .appendFraction(ChronoField.NANO_OF_SECOND, minPrecision, maxPrecision, true)
                .optionalEnd()
                .optionalStart()
                .appendPattern("XXX")
                .optionalEnd()
                .toFormatter();
        this.unmarshalFormat = this.marshalFormat;
        this.customAdapterImpl = null;
        this.fallbackZone = Objects.requireNonNull(fallbackZone, "fallback zone must not be null");
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling,
     * resolving values without offset in the JVM default zone
     *
     * @see #OffsetDateTimeAdapter(DateTimeFormatter, ZoneId)
     */
    public OffsetDateTimeAdapter(DateTimeFormatter dateFormat) {
        this(dateFormat, ZoneId.systemDefault());
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling,
     * and a specific fallback zone for values without offset
     *
     * @param dateFormat format for both the marshalling and unmarshalling
     * @param fallbackZone zone used to resolve date time values without offset
     * @see #OffsetDateTimeAdapter(ZoneId)
     * @since 10.3.11
     */
    public OffsetDateTimeAdapter(DateTimeFormatter dateFormat, ZoneId fallbackZone) {
        this.marshalFormat = dateFormat;
        this.unmarshalFormat = dateFormat;
        this.customAdapterImpl = null;
        this.fallbackZone = Objects.requireNonNull(fallbackZone, "fallback zone must not be null");
    }

    /**
     * Creates a date time adapter injecting a custom implementation
     */
    public OffsetDateTimeAdapter(XmlAdapter<String, OffsetDateTime> customAdapterImpl) {
        this.marshalFormat = null;
        this.unmarshalFormat = null;
        this.customAdapterImpl = customAdapterImpl;
        // not used, the custom implementation decides how to handle values without offset
        this.fallbackZone = null;
    }

    /**
     * Creates a OffsetDateTime parsing the value with this adapter format, or the default lexical representation as fallback.
     *
     * @param value the XML date time value to convert
     * @return created OffsetDateTime object or null if cannot be parsed
     */
    @Override
    public OffsetDateTime unmarshal(String value) throws Exception {
        if (this.customAdapterImpl != null) {
            return this.customAdapterImpl.unmarshal(value);
        } else {
            return parseZonedDateTime(this.unmarshalFormat, value, this.fallbackZone);
        }
    }

    /**
     * Applies the configured format to the OffsetDateTime. If the formats ends with an offset, and the OffsetDateTime is an UTC
     * date time, we use an explicit '+00:00' instead of the 'Z' code.
     *
     * @param offsetDateTime the model OffsetDateTime to marshal
     * @return formatted content for the XML
     */
    @Override
    public String marshal(OffsetDateTime offsetDateTime) throws Exception {
        if (this.customAdapterImpl != null) {
            return this.customAdapterImpl.marshal(offsetDateTime);
        } else {
            String formatted;
            synchronized (marshalFormat) {
                formatted = formatZonedDateTime(this.marshalFormat, offsetDateTime);
            }

            //Remove unused nano if it's only zeros
            final Matcher matcher = pattern.matcher(formatted);
            if (matcher.find()){
                String milliSec = matcher.group(1);
                if(milliSec!=null) {
                    String padMilliSec= String.format("%-4s", milliSec).replace(' ', '0');
                    formatted = formatted.replace(matcher.group(1), padMilliSec);
                }
            }
            return formatted.replace("Z", "+00:00");
        }
    }


    static OffsetDateTime parseZonedDateTime(DateTimeFormatter dateTimeFormatter, String value, ZoneId fallbackZone) {
        if (value == null) {
            return null;
        }
        try {
            return OffsetDateTime.parse(value, dateTimeFormatter);

        } catch (IllegalArgumentException | DateTimeParseException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing to OffsetDateTime: " + e.getMessage());
            }
            // no offset in the source: resolve the local date time in the fallback zone, applying the zone rules
            // in effect at that date time (daylight saving aware)
            return LocalDateTime.parse(value, dateTimeFormatter)
                    .atZone(fallbackZone)
                    .toOffsetDateTime();
        }
    }

    static String formatZonedDateTime(DateTimeFormatter dateTimeFormatter, OffsetDateTime offsetDateTime) {
        return dateTimeFormatter.format(offsetDateTime);
    }

    @Override
    public String toString() {
        return "OffsetDateTimeAdapter{ yyyy-MM-dd'T'HH:mm:ss[.[SSS][SS][S]][XXX] }";
    }
}
