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

import java.lang.ref.WeakReference;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    /**
     * Tracks OffsetDateTime instances that were parsed from XML values without an explicit offset.
     * Uses {@link IdentityWeakRef} wrappers to combine identity semantics (==) with weak references:
     * <ul>
     *   <li>Identity semantics ensure that two different OffsetDateTime instances with the same value
     *       are treated as distinct entries (e.g., one parsed without offset and another with an explicit
     *       offset that happens to match).</li>
     *   <li>Weak references allow entries to be garbage collected when the OffsetDateTime is no longer
     *       referenced by the model object, preventing memory leaks.</li>
     * </ul>
     * ThreadLocal ensures thread safety across concurrent unmarshal/marshal operations.
     *
     * @since 10.3.5
     */
    private static final ThreadLocal<Set<IdentityWeakRef>> NO_OFFSET_INSTANCES =
            ThreadLocal.withInitial(HashSet::new);

    private static final int CLEANUP_THRESHOLD = 100;

    /**
     * Formatter for marshalling OffsetDateTime instances that were parsed without an explicit offset.
     * Uses an explicit pattern instead of {@link java.time.LocalDateTime#toString()} to ensure seconds
     * are always included (XSD dateTime requires seconds, but toString() omits them when zero).
     */
    private static final DateTimeFormatter NO_OFFSET_FORMAT = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd'T'HH:mm:ss")
            .optionalStart()
            .appendFraction(ChronoField.NANO_OF_SECOND, 0, 9, true)
            .optionalEnd()
            .toFormatter();

    private final DateTimeFormatter marshalFormat;
    private final DateTimeFormatter unmarshalFormat;
    private final XmlAdapter<String, OffsetDateTime> customAdapterImpl;
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
            // If this instance was parsed from an XML value without offset, marshal it back without offset
            if (offsetDateTime != null && NO_OFFSET_INSTANCES.get().contains(new IdentityWeakRef(offsetDateTime))) {
                return offsetDateTime.toLocalDateTime().format(NO_OFFSET_FORMAT);
            }

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

            Set<IdentityWeakRef> set = NO_OFFSET_INSTANCES.get();
            set.add(new IdentityWeakRef(dateTime));

            // Periodically clean up dead weak references to prevent unbounded growth
            if (set.size() > CLEANUP_THRESHOLD) {
                set.removeIf(ref -> ref.get() == null);
            }

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

    /**
     * WeakReference wrapper that uses identity semantics (reference equality) for equals/hashCode.
     * This ensures that two different OffsetDateTime instances with the same value are treated as
     * distinct entries, while allowing garbage collection of unreferenced instances.
     */
    private static final class IdentityWeakRef extends WeakReference<OffsetDateTime> {
        private final int hash;

        IdentityWeakRef(OffsetDateTime referent) {
            super(referent);
            this.hash = System.identityHashCode(referent);
        }

        @Override
        public int hashCode() {
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof IdentityWeakRef)) return false;
            OffsetDateTime a = this.get();
            OffsetDateTime b = ((IdentityWeakRef) obj).get();
            return a != null && a == b;
        }
    }
}
