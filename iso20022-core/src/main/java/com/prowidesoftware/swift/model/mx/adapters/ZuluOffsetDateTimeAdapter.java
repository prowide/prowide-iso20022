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
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Zulu OffsetDateTime adapter for date time elements.
 * <p>
 * Marshals the date time as a Zulu time with format YYYY-MM-DDThh:mm:ss[.sss]Z which is aligned
 * with ISO 8601. Dislike the default jaxb implementation, this adapter will always print the Z
 * The fractional seconds is printed only when it is different from zero.
 * <p>
 * Notice the configured adapter in the model is the {@link IsoDateTimeAdapter} wrapper class, but you can pass this
 * default implementation or your own in the constructor.
 *
 * @see TypeAdaptersConfiguration
 * @since 9.4,5
 */
public class ZuluOffsetDateTimeAdapter extends XmlAdapter<String, OffsetDateTime> {
    private static final Logger log = Logger.getLogger(ZuluOffsetDateTimeAdapter.class.getName());
    private static final String FRACTIONAL_SECONDS_REGEX = "\\.0{1,}[Z+-]";
    private static final Pattern FRACTIONAL_SECONDS_PATTERN = Pattern.compile(FRACTIONAL_SECONDS_REGEX);

    private final DateTimeFormatter marshalFormat;

    /**
     * Creates a date time adapter with the default format.
     */
    public ZuluOffsetDateTimeAdapter() {
        this.marshalFormat = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd'T'HH:mm:ss")
                .optionalStart()
                .appendFraction(ChronoField.NANO_OF_SECOND, 0, 9, true)
                .optionalEnd()
                .appendPattern("'Z'")
                .toFormatter()
                .withZone(ZoneOffset.UTC);
    }

    /**
     * Parses a date-time string to create an OffsetDateTime object.
     *
     * @param value the XML date time value to convert
     * @return created OffsetDateTime object or null if it cannot be parsed
     */
    @Override
    public OffsetDateTime unmarshal(String value) {
        return parseOffsetDateTime(value);
    }

    /**
     * Formats an OffsetDateTime to a string using the configured format.
     *
     * @param offsetDateTime the model OffsetDateTime to marshal
     * @return formatted content for the XML
     */
    @Override
    public String marshal(OffsetDateTime offsetDateTime) throws Exception {
        // Convert to Zulu time (UTC) before formatting
        OffsetDateTime utcDateTime = offsetDateTime.withOffsetSameInstant(ZoneOffset.UTC);
        String formatted = formatOffsetDateTime(this.marshalFormat, utcDateTime);

        // Remove trailing fractional seconds if they are all zeros
        Matcher matcher = FRACTIONAL_SECONDS_PATTERN.matcher(formatted);
        if (matcher.find()) {
            formatted = formatted.replace(matcher.group(), "Z");
        }

        return formatted;
    }

    private static OffsetDateTime parseOffsetDateTime(String value) {
        if (value == null) {
            return null;
        }
        try {
            return OffsetDateTime.parse(value);
        } catch (DateTimeParseException e) {
            log.log(Level.FINEST, "Error parsing OffsetDateTime: " + e.getMessage());
            try {
                // Attempt to parse as LocalDateTime and assume system default time zone
                LocalDateTime localDateTime = LocalDateTime.parse(value);
                return localDateTime.atZone(ZoneId.systemDefault()).toOffsetDateTime();
            } catch (DateTimeParseException e2) {
                log.log(Level.FINEST, "Error parsing LocalDateTime: " + e2.getMessage());
                return null;
            }
        }
    }

    private static String formatOffsetDateTime(DateTimeFormatter dateTimeFormatter, OffsetDateTime offsetDateTime) {
        return dateTimeFormatter.format(offsetDateTime);
    }

    @Override
    public String toString() {
        return "ZuluOffsetDateTimeAdapter{ yyyy-MM-dd'T'HH:mm:ss[.SSS]Z }";
    }
}
