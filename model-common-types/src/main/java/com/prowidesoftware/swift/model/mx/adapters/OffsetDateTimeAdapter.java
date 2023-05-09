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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Default generic adapter to use when non is provided via the configuration API.
 * Used as default implementation for the {@link IsoDateTimeAdapter}.
 *
 * @since 10.0.0
 */
public class OffsetDateTimeAdapter extends XmlAdapter<String, OffsetDateTime> {
    private static final Logger log = Logger.getLogger(OffsetDateTimeAdapter.class.getName());

    private final DateTimeFormatter marshallFormat;
    private final DateTimeFormatter unmarshallFormat;
    private XmlAdapter<String, OffsetDateTime> customAdapterImpl;

    /**
     * Creates a date time adapter with the default format
     */
    public OffsetDateTimeAdapter() {
        this.marshallFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.unmarshallFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.[SSS][SS][S]][XXX]");
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling
     */
    public OffsetDateTimeAdapter(DateTimeFormatter dateFormat) {
        this.marshallFormat = dateFormat;
        this.unmarshallFormat = dateFormat;
        customAdapterImpl = null;
    }

    /**
     * Creates a date time adapter injecting a custom implementation
     */
    public OffsetDateTimeAdapter(XmlAdapter<String, OffsetDateTime> customAdapterImpl) {
        this.marshallFormat = null;
        this.unmarshallFormat = null;
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
            return parseZonedDateTime(this.unmarshallFormat, value);
        }
    }

    /**
     * Applies the configured format to the OffsetDateTime. If the formats ends with an offset, and the OffsetDateTime is an UTC
     * date time, we uses an explicit '+00:00' instead of the 'Z' code.
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
            synchronized (marshallFormat) {
                formatted = formatZonedDateTime(this.marshallFormat, offsetDateTime);
            }
            return formatted.replace(".000", "").replace("Z", "+00:00");
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
