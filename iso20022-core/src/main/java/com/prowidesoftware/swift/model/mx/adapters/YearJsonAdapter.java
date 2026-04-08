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
import java.time.Year;

/**
 * Gson {@link JsonSerializer} and {@link JsonDeserializer} for {@link Year}, converting to/from
 * a JSON object with a single {@code year} integer field.
 *
 * @since 10.1.0
 */
public class YearJsonAdapter implements JsonSerializer<Year>, JsonDeserializer<Year> {
    private final Gson gson = new Gson();

    /**
     * Serializes a {@link Year} to a JSON object with a single {@code year} integer field.
     *
     * @param year                     the year to serialize
     * @param type                     the type of the source object
     * @param jsonSerializationContext the serialization context
     * @return a JSON object representing the year
     */
    @Override
    public JsonElement serialize(Year year, Type type, JsonSerializationContext jsonSerializationContext) {
        YearJsonDTO yearJsonDTO = new YearJsonDTO();
        yearJsonDTO.year = year.getValue();
        return gson.toJsonTree(yearJsonDTO, YearJsonDTO.class);
    }

    /**
     * Deserializes a JSON object with a {@code year} integer field into a {@link Year}.
     *
     * @param jsonElement                the JSON element to deserialize
     * @param type                       the type of the desired object
     * @param jsonDeserializationContext the deserialization context
     * @return the deserialized {@link Year}
     */
    @Override
    public Year deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        YearJsonDTO yearJsonDTO = gson.fromJson(jsonElement, YearJsonDTO.class);
        return Year.of(yearJsonDTO.year);
    }

    static class YearJsonDTO {
        int year;
    }
}
