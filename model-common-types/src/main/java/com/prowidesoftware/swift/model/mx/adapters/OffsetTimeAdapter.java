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

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Default generic adapter to use when non is provided via the configuration API.
 * Used as default implementation for the {@link IsoTimeAdapter}.
 *
 * @since 10.0.0
 */
public class OffsetTimeAdapter extends XmlAdapter<String, OffsetTime> {
    private static final Logger log = Logger.getLogger(OffsetTime.class.getName());
    private final DateTimeFormatter marshalFormat;
    private final DateTimeFormatter unmarshalFormat;
    private final XmlAdapter<String, OffsetTime> customAdapterImpl;
    int minPrecision = 0;
    int maxPrecision = 9;

    /**
     * Creates a time adapter with the default format
     */
    public OffsetTimeAdapter() {
        this.marshalFormat = new DateTimeFormatterBuilder()
                .appendPattern("HH:mm:ss")
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
    public OffsetTimeAdapter(DateTimeFormatter dateFormat) {
        this.marshalFormat = dateFormat;
        this.unmarshalFormat = dateFormat;
        this.customAdapterImpl = null;
    }

    /**
     * Creates a time adapter injecting a custom implementation
     */
    public OffsetTimeAdapter(XmlAdapter<String, OffsetTime> customAdapterImpl) {
        this.marshalFormat = null;
        this.unmarshalFormat = null;
        this.customAdapterImpl = customAdapterImpl;
    }

    /**
     * Creates a OffsetTime parsing the value with this adapter format, or the default lexical representation as fallback.
     *
     * @param value the XML date time value to convert
     * @return created OffsetTime object or null if it cannot be parsed
     */
    @Override
    public OffsetTime unmarshal(String value) throws Exception {
        if (this.customAdapterImpl != null) {
            return this.customAdapterImpl.unmarshal(value);
        } else {
            return parseOffsetTime(this.unmarshalFormat, value);
        }
    }

    /**
     * Applies the configured format to the OffsetTime.
     *
     * @param offsetTime the model OffsetTime to marshal
     * @return formatted content for the XML
     */
    @Override
    public String marshal(OffsetTime offsetTime) throws Exception {
        if (this.customAdapterImpl != null) {
            return this.customAdapterImpl.marshal(offsetTime);
        } else {
            String formatted;
            synchronized (marshalFormat) {
                formatted = formatOffsetTime(this.marshalFormat, offsetTime);
            }
            if(formatted.contains("Z")){
                formatted = formatted.replace(".000", "").replace("Z", "+00:00");
            }
            return formatted;
        }
    }

    static String formatOffsetTime(DateTimeFormatter dateTimeFormatter, OffsetTime offsetTime) {
        return dateTimeFormatter.format(offsetTime);
    }

    static OffsetTime parseOffsetTime(DateTimeFormatter dateTimeFormatter, String value) {
        if (value == null) {
            return null;
        }
        OffsetTime offsetTime;
        try {
            // attempt lexical representation parsing
            offsetTime = OffsetTime.parse(value, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing to OffsetTime: " + e.getMessage());
            }
            ZoneOffset offset = ZoneOffset.systemDefault().getRules().getStandardOffset(Instant.now());
            offsetTime = LocalTime.parse(value, dateTimeFormatter).atOffset(offset);
        }
        return offsetTime;
    }

    @Override
    public String toString() {
        return "OffsetTimeAdapter{ HH:mm:ss[.SSS][XXX] }";
    }
}
