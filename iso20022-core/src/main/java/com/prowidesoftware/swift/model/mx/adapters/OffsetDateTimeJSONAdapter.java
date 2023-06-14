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
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.logging.Logger;

/**
 * This adapter enables accepting date time JSON formats with or without the offset and nanoseconds.
 *
 * @since 10.0.0
 */
public class OffsetDateTimeJSONAdapter implements JsonSerializer<OffsetDateTime>, JsonDeserializer<OffsetDateTime> {

    private static final Logger log = Logger.getLogger(OffsetDateTimeJSONAdapter.class.getName());

    Gson gson = new GsonBuilder().setPrettyPrinting().create();


    @Override
    public JsonElement serialize(OffsetDateTime offsetDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        DateTimeDTO.DateDTO date = new DateTimeDTO.DateDTO(
                offsetDateTime.getYear(),
                offsetDateTime.getMonthValue(),
                offsetDateTime.getDayOfMonth()
        );

        DateTimeDTO.TimeDTO time = new DateTimeDTO.TimeDTO(
                offsetDateTime.getHour(),
                offsetDateTime.getMinute(),
                offsetDateTime.getSecond(),
                offsetDateTime.getNano()
        );

        OffsetDTO offsetDTO = new OffsetDTO(offsetDateTime.getOffset().getTotalSeconds());

        DateTimeDTO dateTimeDTO = new DateTimeDTO(date, time);
        DateTimeOffsetDTO dateTimeOffsetDTO = new DateTimeOffsetDTO(dateTimeDTO, offsetDTO);
        return gson.toJsonTree(dateTimeOffsetDTO, DateTimeOffsetDTO.class);
    }

    @Override
    public OffsetDateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            //Parse DTO model
            DateTimeOffsetDTO dateTimeOffsetDTO = gson.fromJson(jsonElement, DateTimeOffsetDTO.class);

            //Prepare OffsetDateTime
            OffsetDateTime offsetDateTime;
            int nano = 0;
            if (dateTimeOffsetDTO.dateTime.time.nano != null) {
                nano = dateTimeOffsetDTO.dateTime.time.nano;
            }

            if (dateTimeOffsetDTO.offset != null) {
                ZoneOffset zoneoffset = ZoneOffset.ofTotalSeconds(dateTimeOffsetDTO.offset.totalSeconds);
                offsetDateTime = OffsetDateTime.of(dateTimeOffsetDTO.dateTime.date.year,
                        dateTimeOffsetDTO.dateTime.date.month,
                        dateTimeOffsetDTO.dateTime.date.day,
                        dateTimeOffsetDTO.dateTime.time.hour,
                        dateTimeOffsetDTO.dateTime.time.minute,
                        dateTimeOffsetDTO.dateTime.time.second,
                        nano,
                        zoneoffset);
            } else {
                LocalDateTime localDateTime = LocalDateTime.of(dateTimeOffsetDTO.dateTime.date.year,
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
        } catch (Exception e) {
            log.finest("Cannot parse dateTime format" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
