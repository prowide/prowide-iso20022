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
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Default generic adapter to use when non is provided via the configuration API.
 * Used as default implementation for the {@link IsoTimeAdapter}.
 * <p>
 * Time values without offset in the XML are resolved in a fallback zone, by default the JVM default time zone.
 * Use {@link #OffsetTimeAdapter(ZoneId)} to set a specific zone.
 *
 * @since 10.0.0
 */
public class OffsetTimeAdapter extends XmlAdapter<String, OffsetTime> {
    private static final Logger log = Logger.getLogger(OffsetTimeAdapter.class.getName());
    private final DateTimeFormatter marshalFormat;
    private final DateTimeFormatter unmarshalFormat;
    private final XmlAdapter<String, OffsetTime> customAdapterImpl;
    private final ZoneId fallbackZone;
    int minPrecision = 0;
    int maxPrecision = 9;

    /**
     * Creates a time adapter with the default format, resolving values without offset in the JVM default zone
     *
     * @see #OffsetTimeAdapter(ZoneId)
     */
    public OffsetTimeAdapter() {
        this(ZoneId.systemDefault());
    }

    /**
     * Creates a time adapter with the default format and a specific fallback zone for values without offset.
     * <p>
     * A time without offset in the XML is a valid xs:time lexical form meaning local time with indeterminate zone,
     * and it cannot be represented as such by an {@link OffsetTime}. The fallback zone is used to resolve the offset
     * of these values when unmarshalling. Since a time carries no date to resolve daylight saving, the zone offset in
     * effect at unmarshalling time is applied. Values with an explicit offset in the XML are not affected.
     *
     * @param fallbackZone zone used to resolve time values without offset, for example {@link ZoneOffset#UTC} to make
     *                     the result independent of the JVM configuration
     * @since 10.3.11
     */
    public OffsetTimeAdapter(ZoneId fallbackZone) {
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
        this.fallbackZone = Objects.requireNonNull(fallbackZone, "fallback zone must not be null");
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling,
     * resolving values without offset in the JVM default zone
     *
     * @see #OffsetTimeAdapter(DateTimeFormatter, ZoneId)
     */
    public OffsetTimeAdapter(DateTimeFormatter dateFormat) {
        this(dateFormat, ZoneId.systemDefault());
    }

    /**
     * Creates a time adapter with a specific given format that will be used for both the marshalling and unmarshalling,
     * and a specific fallback zone for values without offset
     *
     * @param dateFormat format for both the marshalling and unmarshalling
     * @param fallbackZone zone used to resolve time values without offset
     * @see #OffsetTimeAdapter(ZoneId)
     * @since 10.3.11
     */
    public OffsetTimeAdapter(DateTimeFormatter dateFormat, ZoneId fallbackZone) {
        this.marshalFormat = dateFormat;
        this.unmarshalFormat = dateFormat;
        this.customAdapterImpl = null;
        this.fallbackZone = Objects.requireNonNull(fallbackZone, "fallback zone must not be null");
    }

    /**
     * Creates a time adapter injecting a custom implementation
     */
    public OffsetTimeAdapter(XmlAdapter<String, OffsetTime> customAdapterImpl) {
        this.marshalFormat = null;
        this.unmarshalFormat = null;
        this.customAdapterImpl = customAdapterImpl;
        // not used, the custom implementation decides how to handle values without offset
        this.fallbackZone = null;
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
            return parseOffsetTime(this.unmarshalFormat, value, this.fallbackZone);
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

            return formatted.replace("Z", "+00:00");
        }
    }

    static String formatOffsetTime(DateTimeFormatter dateTimeFormatter, OffsetTime offsetTime) {
        return dateTimeFormatter.format(offsetTime);
    }

    static OffsetTime parseOffsetTime(DateTimeFormatter dateTimeFormatter, String value, ZoneId fallbackZone) {
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
            // no offset in the source: a time carries no date to resolve daylight saving, so the fallback zone
            // offset in effect now is applied (not the standard offset, which ignores daylight saving)
            ZoneOffset offset = fallbackZone.getRules().getOffset(Instant.now());
            offsetTime = LocalTime.parse(value, dateTimeFormatter).atOffset(offset);
        }
        return offsetTime;
    }

    @Override
    public String toString() {
        return "OffsetTimeAdapter{ HH:mm:ss[.SSS][XXX] }";
    }
}
