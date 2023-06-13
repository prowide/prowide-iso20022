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
import java.time.YearMonth;
import java.util.logging.Logger;

/**
 * This adapter enables accepting time JSON formats with or without the offset and nanoseconds.
 *
 * @since 10.0.0
 */
public class YearMonthJSONAdapter implements JsonSerializer<YearMonth>, JsonDeserializer<YearMonth> {
    private static final Logger log = Logger.getLogger(YearMonthJSONAdapter.class.getName());

    private static final Gson gson = new Gson();

    @Override
    public JsonElement serialize(YearMonth yearMonth, Type type, JsonSerializationContext jsonSerializationContext) {
        YearMonthJsonDTO yearJsonDTO = new YearMonthJsonDTO();
        yearJsonDTO.year=yearMonth.getYear();
        yearJsonDTO.month=yearMonth.getMonth().getValue();
        return gson.toJsonTree(yearJsonDTO, YearMonthJsonDTO.class);
    }

    @Override
    public YearMonth deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        YearMonthJsonDTO yearMonthJsonDTO = gson.fromJson(jsonElement, YearMonthJsonDTO.class);
        return YearMonth.of(yearMonthJsonDTO.year, yearMonthJsonDTO.month);
    }

    static class YearMonthJsonDTO {
        int year;
        int month;
    }

}
