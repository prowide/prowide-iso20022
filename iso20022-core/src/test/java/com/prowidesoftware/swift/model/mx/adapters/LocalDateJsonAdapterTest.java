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
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class LocalDateJsonAdapterTest {

    private final LocalDateJsonAdapter adapter = new LocalDateJsonAdapter();

    @Test
    void testSerializationAndDeserialization() {
        testSerializationAndDeserializationImpl("{\"year\":2019,\"month\":4,\"day\":28}");
        testSerializationAndDeserializationImpl("{\"year\":2019,\"month\":1,\"day\":1}");
        testSerializationAndDeserializationImpl("{\"year\":2019,\"month\":12,\"day\":31}");
        testSerializationAndDeserializationImpl("{\"year\":1973,\"month\":4,\"day\":28}");
    }

    private void testSerializationAndDeserializationImpl(String json) {
        JsonElement jsonElement = new JsonParser().parse(json);
        LocalDate date = adapter.deserialize(jsonElement, null, null);
        JsonElement valueDateResult = adapter.serialize(date, null, null);
        assertEquals(json, valueDateResult.toString());
    }
}
