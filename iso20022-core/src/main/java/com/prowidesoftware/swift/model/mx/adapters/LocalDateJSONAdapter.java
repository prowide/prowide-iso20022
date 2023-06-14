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

/**
 * This adapter enables accepting LocalDate JSON formats.
 *
 * @since 10.0.0
 */
public class LocalDateJSONAdapter implements JsonSerializer<LocalDate>, JsonDeserializer<LocalDate> {

    @Override
    public JsonElement serialize(LocalDate localDate, Type typeOfSrc, JsonSerializationContext context) {
        Gson gson = new Gson();
        DateTimeDTO.DateDTO date = new DateTimeDTO.DateDTO(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        return gson.toJsonTree(date, DateTimeDTO.DateDTO.class);
    }
    @Override
    public LocalDate deserialize(final JsonElement jsonElement, final Type typeOfT,
                                 final JsonDeserializationContext context) throws JsonParseException {

        Gson gson = new Gson();
        DateTimeDTO.DateDTO date = gson.fromJson(jsonElement, DateTimeDTO.DateDTO.class);
        return LocalDate.of(date.year, date.month, date.day);
    }
}