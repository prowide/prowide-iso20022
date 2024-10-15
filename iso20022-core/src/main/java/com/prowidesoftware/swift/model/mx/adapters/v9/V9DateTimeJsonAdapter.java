package com.prowidesoftware.swift.model.mx.adapters.v9;

import com.google.gson.*;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Adapter for serializing and deserializing {@link OffsetDateTime} to and from JSON in a format compatible
 * with the legacy {@code XMLGregorianCalendar} used in older versions of the library.
 * <p>
 * This adapter is used to maintain backward compatibility with systems that expect the older
 * date-time format while allowing migration to Java 11's {@code OffsetDateTime}.
 * </p>
 *
 * <p><b>Serialization</b></p>
 * The {@code serialize} method converts an {@code OffsetDateTime} object into a JSON structure
 * similar to the structure used by {@code XMLGregorianCalendar}, preserving the fields for year,
 * month, day, time, timezone, and fractional seconds if present.
 *
 * <p><b>Deserialization</b></p>
 * The {@code deserialize} method converts a JSON structure formatted for {@code XMLGregorianCalendar}
 * into an {@code OffsetDateTime} object, parsing the legacy fields and converting them to their modern
 * equivalents, including handling timezone and fractional seconds.
 *
 * @since 10.1.8
 */
public class V9DateTimeJsonAdapter implements JsonSerializer<OffsetDateTime>, JsonDeserializer<OffsetDateTime> {
    private static final Logger log = Logger.getLogger(V9DateTimeJsonAdapter.class.getName());

    private final Gson gson = new Gson();

    /**
     * Serializes an {@link OffsetDateTime} into JSON format compatible with the older
     * {@code XMLGregorianCalendar} representation.
     *
     * @param offsetDateTime the {@code OffsetDateTime} to be serialized
     * @param type the specific genericized type of the source object
     * @param jsonSerializationContext the context for serialization
     * @return a {@link JsonElement} representing the serialized date-time information
     */
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

    /**
     * Deserializes a JSON element into an {@link OffsetDateTime}, converting the legacy
     * {@code XMLGregorianCalendar} fields into their modern equivalents.
     *
     * @param xMLGregorianCalendarJsonElement the JSON data to be deserialized
     * @param type the specific genericized type of the source object
     * @param jsonDeserializationContext the context for deserialization
     * @return the deserialized {@code OffsetDateTime}, or {@code null} if parsing fails
     */
    @Override
    public OffsetDateTime deserialize(
            JsonElement xMLGregorianCalendarJsonElement,
            Type type,
            JsonDeserializationContext jsonDeserializationContext) {
        try {
            XMLGregorianCalendarDTO xMLGregorianCalendarDTO =
                    gson.fromJson(xMLGregorianCalendarJsonElement, XMLGregorianCalendarDTO.class);

            // Prepare OffsetDateTime
            ZoneOffset zoneoffset = ZoneOffset.ofTotalSeconds(xMLGregorianCalendarDTO.timezone * 60);
            return OffsetDateTime.of(
                    xMLGregorianCalendarDTO.year,
                    xMLGregorianCalendarDTO.month,
                    xMLGregorianCalendarDTO.day,
                    xMLGregorianCalendarDTO.hour,
                    xMLGregorianCalendarDTO.minute,
                    xMLGregorianCalendarDTO.second,
                    (int) (xMLGregorianCalendarDTO.fractionalSecond.doubleValue() * 1000_000_000),
                    zoneoffset);
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
}
