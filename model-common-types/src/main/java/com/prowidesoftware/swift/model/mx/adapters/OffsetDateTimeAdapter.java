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
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.format.DateTimeFormatterBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Default generic adapter to use when non is provided via the configuration API.
 * Used as default implementation for the {@link IsoDateTimeAdapter}.
 *
 * @since 10.0.0
 */
public class OffsetDateTimeAdapter extends XmlAdapter<String, OffsetDateTime> {
    private static final Logger log = Logger.getLogger(OffsetDateTimeAdapter.class.getName());
    private final DateTimeFormatter marshalFormat;
    private final DateTimeFormatter unmarshalFormat;
    private final XmlAdapter<String, OffsetDateTime> customAdapterImpl;
    private final String regex = "\\\\.0{1,}[Z+-]";
    private final Pattern pattern = Pattern.compile(regex);
    int minPrecision = 0;
    int maxPrecision = 9;

    /**
     * Creates a date time adapter with the default format
     */
    public OffsetDateTimeAdapter() {
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
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling
     */
    public OffsetDateTimeAdapter(DateTimeFormatter dateFormat) {
        this.marshalFormat = dateFormat;
        this.unmarshalFormat = dateFormat;
        this.customAdapterImpl = null;
    }

    /**
     * Creates a date time adapter injecting a custom implementation
     */
    public OffsetDateTimeAdapter(XmlAdapter<String, OffsetDateTime> customAdapterImpl) {
        this.marshalFormat = null;
        this.unmarshalFormat = null;
        this.customAdapterImpl = customAdapterImpl;
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
            return parseZonedDateTime(this.unmarshalFormat, value);
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
                formatted = formatted.replace(matcher.group(), "");
            }

            return formatted.replace("Z", "+00:00");
        }
    }


    static OffsetDateTime parseZonedDateTime(DateTimeFormatter dateTimeFormatter, String value) {
        if (value == null) {
            return null;
        }
        try {
            return OffsetDateTime.parse(value, dateTimeFormatter);

        } catch (IllegalArgumentException | DateTimeParseException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing to OffsetDateTime: " + e.getMessage());
            }
            ZoneId zoneId = ZoneOffset.systemDefault();
            OffsetDateTime dateTime = LocalDateTime.parse(value, dateTimeFormatter)
                    .atZone(zoneId)
                    .toOffsetDateTime();
            return dateTime;
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
