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

    private static final Gson gson = new Gson();


    @Override
    public JsonElement serialize(OffsetDateTime offsetDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        DateTimeObject.Date date = new DateTimeObject.Date(
                offsetDateTime.getYear(),
                offsetDateTime.getMonthValue(),
                offsetDateTime.getDayOfMonth()
        );

        DateTimeObject.TimeObject time = new DateTimeObject.TimeObject(
                offsetDateTime.getHour(),
                offsetDateTime.getMinute(),
                offsetDateTime.getSecond(),
                offsetDateTime.getNano()
        );

        OffsetObject offsetObject = new OffsetObject(offsetDateTime.getOffset().getTotalSeconds());

        DateTimeObject dateTimeObject = new DateTimeObject(date, time);
        DateTimeModel dateTimeModel = new DateTimeModel(dateTimeObject, offsetObject);
        return gson.toJsonTree(dateTimeModel, DateTimeModel.class);
    }

    @Override
    public OffsetDateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            //Parse DTO model
            DateTimeModel dateTimeModel = gson.fromJson(jsonElement, DateTimeModel.class);

            //Prepare OffsetDateTime
            OffsetDateTime offsetDateTime;
            int nano = 0;
            if (dateTimeModel.dateTime.time.nano != null) {
                nano = dateTimeModel.dateTime.time.nano;
            }

            if (dateTimeModel.offset != null) {
                ZoneOffset zoneoffset = ZoneOffset.ofTotalSeconds(dateTimeModel.offset.totalSeconds);
                offsetDateTime = OffsetDateTime.of(dateTimeModel.dateTime.date.year,
                        dateTimeModel.dateTime.date.month,
                        dateTimeModel.dateTime.date.day,
                        dateTimeModel.dateTime.time.hour,
                        dateTimeModel.dateTime.time.minute,
                        dateTimeModel.dateTime.time.second,
                        nano,
                        zoneoffset);
            } else {
                LocalDateTime localDateTime = LocalDateTime.of(dateTimeModel.dateTime.date.year,
                        dateTimeModel.dateTime.date.month,
                        dateTimeModel.dateTime.date.day,
                        dateTimeModel.dateTime.time.hour,
                        dateTimeModel.dateTime.time.minute,
                        dateTimeModel.dateTime.time.second,
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
