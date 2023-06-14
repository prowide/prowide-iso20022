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
import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This adapter enables accepting OffsetTime time Json format.
 *
 * @since 10.0.1
 */
public class OffsetTimeJsonAdapter implements JsonSerializer<OffsetTime>, JsonDeserializer<OffsetTime> {
    private static final Logger log = Logger.getLogger(OffsetTimeJsonAdapter.class.getName());

    private final Gson gson = new Gson();

    @Override
    public JsonElement serialize(OffsetTime offsetTime, Type type, JsonSerializationContext jsonSerializationContext) {
        TimeOffsetDTO timeOffsetDTO = new TimeOffsetDTO();
        timeOffsetDTO.time.hour = offsetTime.getHour();
        timeOffsetDTO.time.minute = offsetTime.getMinute();
        timeOffsetDTO.time.second = offsetTime.getSecond();
        timeOffsetDTO.time.nano = offsetTime.getNano();
        if (offsetTime.getOffset() != null) {
            timeOffsetDTO.offset = new OffsetDTO();
            timeOffsetDTO.offset.totalSeconds = offsetTime.getOffset().getTotalSeconds();
        }
        return gson.toJsonTree(timeOffsetDTO, TimeOffsetDTO.class);
    }

    @Override
    public OffsetTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            OffsetTime offsetTime;
            TimeOffsetDTO timeDTO = gson.fromJson(jsonElement, TimeOffsetDTO.class);

            int nano = 0;
            if (timeDTO.time.nano != null) {
                nano = timeDTO.time.nano;
            }

            if (timeDTO.offset != null) {
                ZoneOffset zoneoffset = ZoneOffset.ofTotalSeconds(timeDTO.offset.totalSeconds);
                offsetTime = OffsetTime.of(timeDTO.time.hour, timeDTO.time.minute, timeDTO.time.second, nano, zoneoffset);
            } else {
                LocalTime localTime = LocalTime.of(timeDTO.time.hour, timeDTO.time.minute, timeDTO.time.second, nano);
                offsetTime = localTime.atOffset(ZoneOffset.systemDefault().getRules().getStandardOffset(Instant.now()));
            }

            return offsetTime;
        } catch (Exception e) {
            log.log(Level.FINEST, "Cannot parse JSON into OffsetTime: " + e.getMessage(), e);
            return null;
        }
    }

    static class TimeOffsetDTO {
        private TimeDTO time = new TimeDTO();
        private OffsetDTO offset;
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
