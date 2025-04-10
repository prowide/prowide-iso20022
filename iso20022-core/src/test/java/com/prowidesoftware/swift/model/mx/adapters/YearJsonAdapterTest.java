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

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.time.Year;
import org.junit.jupiter.api.Test;

public class YearJsonAdapterTest {

    private final YearJsonAdapter adapter = new YearJsonAdapter();

    @Test
    void testSerializationAndDeserialization() {
        testSerializationAndDeserializationImpl("{\"year\":2019}");
        testSerializationAndDeserializationImpl("{\"year\":2019}");
        testSerializationAndDeserializationImpl("{\"year\":2019}");
        testSerializationAndDeserializationImpl("{\"year\":1983}");
    }

    private void testSerializationAndDeserializationImpl(String json) {
        JsonElement jsonElement = new JsonParser().parse(json);
        Year year = adapter.deserialize(jsonElement, null, null);
        JsonElement valueDateResult = adapter.serialize(year, null, null);
        assertEquals(json, valueDateResult.toString());
    }
}
