package com.prowidesoftware.swift.model.mx.adapters.v9;

import com.google.gson.*;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregorianCalendarFromJsonAdapter
        implements JsonSerializer<XMLGregorianCalendar>, JsonDeserializer<XMLGregorianCalendar> {
    private static final Logger log = Logger.getLogger(XMLGregorianCalendarFromJsonAdapter.class.getName());

    private final Gson gson = new Gson();

    @Override
    public JsonElement serialize(
            XMLGregorianCalendar calendar, Type type, JsonSerializationContext jsonSerializationContext) {

        DateTimeOffsetDTO dateTimeOffsetDTO = new DateTimeOffsetDTO();

        dateTimeOffsetDTO.dateTime.date.year = calendar.getYear();
        dateTimeOffsetDTO.dateTime.date.month = calendar.getMonth();
        dateTimeOffsetDTO.dateTime.date.day = calendar.getDay();
        dateTimeOffsetDTO.dateTime.time.hour = calendar.getHour();
        dateTimeOffsetDTO.dateTime.time.minute = calendar.getMinute();
        dateTimeOffsetDTO.dateTime.time.second = calendar.getSecond();
        dateTimeOffsetDTO.dateTime.time.nano =
                (int) (calendar.getFractionalSecond().doubleValue() * 1000_000_000);
        dateTimeOffsetDTO.offset = new OffsetDTO();
        dateTimeOffsetDTO.offset.totalSeconds = calendar.getTimezone() * 3600;

        return gson.toJsonTree(dateTimeOffsetDTO, DateTimeOffsetDTO.class);
    }

    @Override
    public XMLGregorianCalendar deserialize(
            JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            XMLGregorianCalendarDTO calendar = gson.fromJson(jsonElement, XMLGregorianCalendarDTO.class);

            TimeZone timeZone = TimeZone.getTimeZone("GMT");
            if (calendar.timezone != null) {
                timeZone.setRawOffset(calendar.timezone * 1000); // -180 minutes in milliseconds
            }

            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.set(
                    calendar.year, calendar.month - 1, calendar.day, calendar.hour, calendar.minute, calendar.second);

            if (calendar.fractionalSecond != null) {
                gregorianCalendar.set(
                        GregorianCalendar.MILLISECOND, (int) (calendar.fractionalSecond.doubleValue() * 1000));
            }

            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (Exception e) {
            log.log(Level.FINEST, "Cannot parse JSON into XMLGregorianCalendar: " + e.getMessage(), e);
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
