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
 * This adapter enables accepting LocalDate time Json format.
 *
 * @since 10.1.0
 */
public class LocalDateJsonAdapter implements JsonSerializer<LocalDate>, JsonDeserializer<LocalDate> {

    private final Gson gson = new Gson();

    @Override
    public JsonElement serialize(LocalDate localDate, Type typeOfSrc, JsonSerializationContext context) {
        DateDTO date = new DateDTO();
        date.year = localDate.getYear();
        date.month = localDate.getMonthValue();
        date.day = localDate.getDayOfMonth();
        return gson.toJsonTree(date, DateDTO.class);
    }

    @Override
    public LocalDate deserialize(
            final JsonElement jsonElement, final Type typeOfT, final JsonDeserializationContext context)
            throws JsonParseException {
        DateDTO date = gson.fromJson(jsonElement, DateDTO.class);
        return LocalDate.of(date.year, date.month, date.day);
    }

    static class DateDTO {
        Integer year;
        Integer month;
        Integer day;
    }
}
