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
import java.time.Instant;
import java.time.OffsetTime;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;

class OffsetTimeJsonAdapterTest {

    private final OffsetTimeJsonAdapter adapter = new OffsetTimeJsonAdapter();

    @Test
    void testSerializationAndDeserialization() {
        int systemOffsetSeconds = TimeZone.getDefault()
                .toZoneId()
                .getRules()
                .getStandardOffset(Instant.now())
                .getTotalSeconds();

        // without offset, nano 0
        String jsonActual = "{\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":0}}";
        String jsonExpected =
                "{\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":0},\"offset\":{\"totalSeconds\":"
                        + systemOffsetSeconds + "}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonExpected);

        // without offset, without nano
        jsonActual = "{\"time\":{\"hour\":12,\"minute\":13,\"second\":14}}";
        jsonExpected = "{\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":0},\"offset\":{\"totalSeconds\":"
                + systemOffsetSeconds + "}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonExpected);

        // without offset, nano 123456789
        jsonActual = "{\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":123456789}}";
        jsonExpected =
                "{\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":123456789},\"offset\":{\"totalSeconds\":"
                        + systemOffsetSeconds + "}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonExpected);

        // with offset
        jsonActual =
                "{\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":123456789},\"offset\":{\"totalSeconds\":"
                        + systemOffsetSeconds + "}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonActual);

        // without second, without nano
        jsonActual = "{\"time\":{\"hour\":12,\"minute\":13}}";
        jsonExpected = "{\"time\":{\"hour\":12,\"minute\":13,\"second\":0,\"nano\":0},\"offset\":{\"totalSeconds\":"
                + systemOffsetSeconds + "}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonExpected);

        // with offset
        jsonActual =
                "{\"time\":{\"hour\":12,\"minute\":13,\"second\":0,\"nano\":0},\"offset\":{\"totalSeconds\":-1800}}";
        jsonExpected =
                "{\"time\":{\"hour\":12,\"minute\":13,\"second\":0,\"nano\":0},\"offset\":{\"totalSeconds\":-1800}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonExpected);
    }

    private void testSerializationAndDeserializationImpl(String jsonInput, String jsonResult) {
        JsonElement jsonElement = new JsonParser().parse(jsonInput);
        OffsetTime offsetTime = adapter.deserialize(jsonElement, null, null);
        JsonElement valueDateResult = adapter.serialize(offsetTime, null, null);
        assertEquals(jsonResult, valueDateResult.toString());
    }
}
