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

import com.google.gson.*;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This adapter enables accepting OffsetDateTime time Json format.
 * <p> The adapter supports two DTO formats: the current one and the
 * legacy one based on XMLGregorianCalendar model with Java 1.8.
 * </p>
 *
 * @since 10.0.1
 */
public class OffsetDateTimeJsonAdapter implements JsonSerializer<OffsetDateTime>, JsonDeserializer<OffsetDateTime> {
    private static final Logger log = Logger.getLogger(OffsetDateTimeJsonAdapter.class.getName());

    private final Gson gson = new Gson();

    @Override
    public JsonElement serialize(
            OffsetDateTime offsetDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        DateTimeOffsetDTO dateTimeOffsetDTO = new DateTimeOffsetDTO();

        dateTimeOffsetDTO.dateTime.date.year = offsetDateTime.getYear();
        dateTimeOffsetDTO.dateTime.date.month = offsetDateTime.getMonthValue();
        dateTimeOffsetDTO.dateTime.date.day = offsetDateTime.getDayOfMonth();
        dateTimeOffsetDTO.dateTime.time.hour = offsetDateTime.getHour();
        dateTimeOffsetDTO.dateTime.time.minute = offsetDateTime.getMinute();
        dateTimeOffsetDTO.dateTime.time.second = offsetDateTime.getSecond();
        dateTimeOffsetDTO.dateTime.time.nano = offsetDateTime.getNano();
        if (offsetDateTime.getOffset() != null) {
            dateTimeOffsetDTO.offset = new OffsetDTO();
            dateTimeOffsetDTO.offset.totalSeconds = offsetDateTime.getOffset().getTotalSeconds();
        }

        return gson.toJsonTree(dateTimeOffsetDTO, DateTimeOffsetDTO.class);
    }

    @Override
    public OffsetDateTime deserialize(
            JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            // Parse DTO from current OffsetDateTime model
            return deserializeFromOffsetDateTimeDTO(gson.fromJson(jsonElement, DateTimeOffsetDTO.class));
        } catch (final Exception e) {
            log.log(
                    Level.FINEST,
                    "Cannot parse JSON into OffsetDateTime from current DTO format: " + e.getMessage(),
                    e);
        }
        log.log(Level.FINEST, "Attempting parsing from legacy DTO format");
        try {
            // Parse DTO from legacy XMLGregorianCalendar model
            return deserializeFromXMLGregorianCalendarDTO(gson.fromJson(jsonElement, XMLGregorianCalendarDTO.class));
        } catch (final Exception e) {
            log.log(Level.FINEST, "Cannot parse JSON into OffsetDateTime from legacy DTO format: " + e.getMessage(), e);
        }
        return null;
    }

    private OffsetDateTime deserializeFromOffsetDateTimeDTO(final DateTimeOffsetDTO dateTimeOffsetDTO) {
        // Prepare OffsetDateTime
        OffsetDateTime offsetDateTime;
        int nano = 0;
        if (dateTimeOffsetDTO.dateTime.time.nano != null) {
            nano = dateTimeOffsetDTO.dateTime.time.nano;
        }

        if (dateTimeOffsetDTO.offset != null) {
            ZoneOffset zoneoffset = ZoneOffset.ofTotalSeconds(dateTimeOffsetDTO.offset.totalSeconds);
            offsetDateTime = OffsetDateTime.of(
                    dateTimeOffsetDTO.dateTime.date.year,
                    dateTimeOffsetDTO.dateTime.date.month,
                    dateTimeOffsetDTO.dateTime.date.day,
                    dateTimeOffsetDTO.dateTime.time.hour,
                    dateTimeOffsetDTO.dateTime.time.minute,
                    dateTimeOffsetDTO.dateTime.time.second,
                    nano,
                    zoneoffset);
        } else {
            LocalDateTime localDateTime = LocalDateTime.of(
                    dateTimeOffsetDTO.dateTime.date.year,
                    dateTimeOffsetDTO.dateTime.date.month,
                    dateTimeOffsetDTO.dateTime.date.day,
                    dateTimeOffsetDTO.dateTime.time.hour,
                    dateTimeOffsetDTO.dateTime.time.minute,
                    dateTimeOffsetDTO.dateTime.time.second,
                    nano);

            ZoneId zoneId = ZoneOffset.systemDefault();
            offsetDateTime = localDateTime.atZone(zoneId).toOffsetDateTime();
        }

        return offsetDateTime;
    }

    private OffsetDateTime deserializeFromXMLGregorianCalendarDTO(
            final XMLGregorianCalendarDTO xmlGregorianCalendarDTO) {
        if (Integer.MIN_VALUE == xmlGregorianCalendarDTO.year) {
            xmlGregorianCalendarDTO.year = 0;
        }
        if (Integer.MIN_VALUE == xmlGregorianCalendarDTO.month) {
            xmlGregorianCalendarDTO.month = 0;
        }
        if (Integer.MIN_VALUE == xmlGregorianCalendarDTO.day) {
            xmlGregorianCalendarDTO.day = 0;
        }
        if (Integer.MIN_VALUE == xmlGregorianCalendarDTO.hour) {
            xmlGregorianCalendarDTO.hour = 0;
        }
        if (Integer.MIN_VALUE == xmlGregorianCalendarDTO.minute) {
            xmlGregorianCalendarDTO.minute = 0;
        }
        if (Integer.MIN_VALUE == xmlGregorianCalendarDTO.second) {
            xmlGregorianCalendarDTO.second = 0;
        }
        if (Integer.MIN_VALUE == xmlGregorianCalendarDTO.timezone) {
            xmlGregorianCalendarDTO.timezone = null;
        }

        return LocalDateTime.of(
                        xmlGregorianCalendarDTO.year,
                        xmlGregorianCalendarDTO.month,
                        xmlGregorianCalendarDTO.day,
                        xmlGregorianCalendarDTO.hour,
                        xmlGregorianCalendarDTO.minute,
                        xmlGregorianCalendarDTO.second,
                        xmlGregorianCalendarDTO
                                .fractionalSecond
                                .scaleByPowerOfTen(9)
                                .toBigInteger()
                                .intValueExact())
                .atZone(
                        xmlGregorianCalendarDTO.timezone != null
                                ? ZoneOffset.ofTotalSeconds(xmlGregorianCalendarDTO.timezone * 60)
                                : ZoneOffset.systemDefault())
                .toOffsetDateTime();
    }

    static class DateTimeOffsetDTO {
        DateTimeDTO dateTime = new DateTimeDTO();
        OffsetDTO offset;
    }

    static class DateTimeDTO {
        DateDTO date = new DateDTO();
        TimeDTO time = new TimeDTO();
    }

    static class DateDTO {
        Integer year;
        Integer month;
        Integer day;
    }

    static class TimeDTO {
        Integer hour = 0;
        Integer minute = 0;
        Integer second = 0;
        Integer nano = 0;
    }

    static class OffsetDTO {
        Integer totalSeconds = 0;
    }

    static class XMLGregorianCalendarDTO {
        Integer year;
        Integer month;
        Integer day;
        Integer hour = 0;
        Integer minute = 0;
        Integer second = 0;
        BigDecimal fractionalSecond = BigDecimal.ZERO;
        Integer timezone;
    }
}
