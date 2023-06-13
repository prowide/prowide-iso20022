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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * This adapter enables accepting time JSON formats with or without the offset and nanoseconds.
 *
 * @since 10.0.0
 */
public class LocalDateJSONAdapter implements JsonSerializer<LocalDate>, JsonDeserializer<LocalDate> {

    private static String DATE_FORMAT = "yyyy-MM-dd";
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

    @Override
    public JsonElement serialize(final LocalDate date, final Type typeOfSrc,
                                 final JsonSerializationContext context) {
        return new JsonPrimitive(date.format(formatter));
    }

    @Override
    public LocalDate deserialize(final JsonElement json, final Type typeOfT,
                                 final JsonDeserializationContext context) throws JsonParseException {
        return LocalDate.parse(json.getAsString(), formatter);
    }
}