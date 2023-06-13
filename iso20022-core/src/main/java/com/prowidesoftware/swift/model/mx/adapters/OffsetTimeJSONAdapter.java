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
import java.util.logging.Logger;

/**
 * This adapter enables accepting time JSON formats with or without the offset and nanoseconds.
 *
 * @since 10.0.0
 */
public class OffsetTimeJSONAdapter implements JsonSerializer<OffsetTime>, JsonDeserializer<OffsetTime> {
    private static final String OFFSET = "offset";

    private static final String TOTAL_SECONDS = "totalSeconds";

    private static final String TIME = "time";

    private static final Logger log = Logger.getLogger(OffsetTimeJSONAdapter.class.getName());

    private static final Gson gson = new Gson();


    @Override
    public JsonElement serialize(OffsetTime offsetTime, Type type, JsonSerializationContext jsonSerializationContext) {
        DateTimeObject.TimeObject timeObject = new DateTimeObject.TimeObject(
                offsetTime.getHour(),
                offsetTime.getMinute(),
                offsetTime.getSecond(),
                offsetTime.getNano()
        );
        OffsetObject offsetObject = new OffsetObject(offsetTime.getOffset().getTotalSeconds());

        Time time = new Time(timeObject, offsetObject);
        return gson.toJsonTree(time, DateTimeObject.class);
    }

    class Time {
        private DateTimeObject.TimeObject time;
        private OffsetObject offset;

        public Time(DateTimeObject.TimeObject time, OffsetObject offset) {
            this.time = time;
            this.offset = offset;
        }

        public DateTimeObject.TimeObject getTime() {
            return time;
        }

        public void setTime(DateTimeObject.TimeObject time) {
            this.time = time;
        }

        public OffsetObject getOffset() {
            return offset;
        }

        public void setOffset(OffsetObject offset) {
            this.offset = offset;
        }
    }

    @Override
    public OffsetTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            OffsetTime offsetTime;
            JsonObject obj = jsonElement.getAsJsonObject();

            if (obj.get(OFFSET) != null) {
                ZoneOffset zoneoffset = ZoneOffset.ofTotalSeconds(obj.get(OFFSET).getAsJsonObject().get(TOTAL_SECONDS).getAsInt());
                offsetTime = gson.fromJson(obj, OffsetTime.class);
                offsetTime = OffsetTime.of(offsetTime.toLocalTime(), zoneoffset);
            } else {
                LocalTime localTime = gson.fromJson(obj.get(TIME), LocalTime.class);
                offsetTime = localTime.atOffset(ZoneOffset.systemDefault().getRules().getStandardOffset(Instant.now()));
            }

            return offsetTime;
        } catch (Exception e) {
            log.finest("Cannot parse dateTime format" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
