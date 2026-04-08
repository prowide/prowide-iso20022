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
import java.time.YearMonth;

/**
 * Gson {@link JsonSerializer} and {@link JsonDeserializer} for {@link YearMonth}, converting
 * to/from a JSON object with {@code year} and {@code month} integer fields.
 *
 * @since 10.1.0
 */
public class YearMonthJsonAdapter implements JsonSerializer<YearMonth>, JsonDeserializer<YearMonth> {
    private final Gson gson = new Gson();

    /**
     * Serializes a {@link YearMonth} to a JSON object with {@code year} and {@code month}
     * integer fields.
     *
     * @param yearMonth                the year-month to serialize
     * @param type                     the type of the source object
     * @param jsonSerializationContext the serialization context
     * @return a JSON object representing the year-month
     */
    @Override
    public JsonElement serialize(YearMonth yearMonth, Type type, JsonSerializationContext jsonSerializationContext) {
        YearMonthJsonDTO yearJsonDTO = new YearMonthJsonDTO();
        yearJsonDTO.year = yearMonth.getYear();
        yearJsonDTO.month = yearMonth.getMonth().getValue();
        return gson.toJsonTree(yearJsonDTO, YearMonthJsonDTO.class);
    }

    /**
     * Deserializes a JSON object with {@code year} and {@code month} integer fields into a
     * {@link YearMonth}.
     *
     * @param jsonElement                the JSON element to deserialize
     * @param type                       the type of the desired object
     * @param jsonDeserializationContext the deserialization context
     * @return the deserialized {@link YearMonth}
     */
    @Override
    public YearMonth deserialize(
            JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        YearMonthJsonDTO yearMonthJsonDTO = gson.fromJson(jsonElement, YearMonthJsonDTO.class);
        return YearMonth.of(yearMonthJsonDTO.year, yearMonthJsonDTO.month);
    }

    static class YearMonthJsonDTO {
        int year;
        int month;
    }
}
