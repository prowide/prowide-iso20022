package com.prowidesoftware.swift.model.mx.adapters.v9;

import com.google.gson.*;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XMLGregorianCalendarToJsonAdapter
        implements JsonSerializer<OffsetDateTime>, JsonDeserializer<OffsetDateTime> {
    private static final Logger log = Logger.getLogger(XMLGregorianCalendarToJsonAdapter.class.getName());

    private final Gson gson = new Gson();

    @Override
    public JsonElement serialize(
            OffsetDateTime offsetDateTime, Type type, JsonSerializationContext jsonSerializationContext) {

        XMLGregorianCalendarDTO xMLGregorianCalendarDTO = new XMLGregorianCalendarDTO();

        xMLGregorianCalendarDTO.year = offsetDateTime.getYear();
        xMLGregorianCalendarDTO.month = offsetDateTime.getMonthValue();
        xMLGregorianCalendarDTO.day = offsetDateTime.getDayOfMonth();
        xMLGregorianCalendarDTO.hour = offsetDateTime.getHour();
        xMLGregorianCalendarDTO.minute = offsetDateTime.getMinute();
        xMLGregorianCalendarDTO.second = offsetDateTime.getSecond();
        if (offsetDateTime.getNano() != 0) {
            xMLGregorianCalendarDTO.fractionalSecond = BigDecimal.valueOf(offsetDateTime.getNano())
                    .divide(BigDecimal.valueOf(1_000_000_000), 3, RoundingMode.DOWN);
        }
        if (offsetDateTime.getOffset() != null) {
            xMLGregorianCalendarDTO.timezone = offsetDateTime.getOffset().getTotalSeconds() / 60;
        }

        return gson.toJsonTree(xMLGregorianCalendarDTO, XMLGregorianCalendarDTO.class);
    }

    @Override
    public OffsetDateTime deserialize(
            JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            DateTimeOffsetDTO dateTimeOffsetDTO = gson.fromJson(jsonElement, DateTimeOffsetDTO.class);

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
                offsetDateTime = localDateTime.atZone(ZoneOffset.UTC).toOffsetDateTime();
            }

            return offsetDateTime;
        } catch (Exception e) {
            log.log(Level.FINEST, "Cannot parse JSON into OffsetDateTime: " + e.getMessage(), e);
            return null;
        }
    }

    static class XMLGregorianCalendarDTO {
        Integer year = 0;
        Integer month = 0;
        Integer day = 0;
        Integer timezone = 0;
        Integer hour = 0;
        Integer minute = 0;
        Integer second = 0;
        BigDecimal fractionalSecond = BigDecimal.ZERO;
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
}
