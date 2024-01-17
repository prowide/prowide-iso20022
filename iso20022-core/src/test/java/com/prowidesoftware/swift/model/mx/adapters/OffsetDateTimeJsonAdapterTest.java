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
import static org.junit.jupiter.api.Assertions.assertNull;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;

class OffsetDateTimeJsonAdapterTest {

    private final OffsetDateTimeJsonAdapter adapter = new OffsetDateTimeJsonAdapter();

    @Test
    void testSerializationAndDeserialization() {
        int systemOffsetSeconds = OffsetDateTime.now().getOffset().getTotalSeconds();

        // without offset, nano 0
        String jsonActual =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":0}}}";
        String jsonExpected =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":0}},\"offset\":{\"totalSeconds\":"
                        + systemOffsetSeconds + "}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonExpected);

        // without offset, without nano
        jsonActual =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14}}}";
        jsonExpected =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":0}},\"offset\":{\"totalSeconds\":"
                        + systemOffsetSeconds + "}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonExpected);

        // without offset, nano 123456789
        jsonActual =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":123456789}}}";
        jsonExpected =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":123456789}},\"offset\":{\"totalSeconds\":"
                        + systemOffsetSeconds + "}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonExpected);

        // with offset
        jsonActual =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":123456789}},\"offset\":{\"totalSeconds\":"
                        + systemOffsetSeconds + "}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonActual);

        // without second, without nano
        jsonActual =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13}}}";
        jsonExpected =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":0,\"nano\":0}},\"offset\":{\"totalSeconds\":"
                        + systemOffsetSeconds + "}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonExpected);

        // with offset
        jsonActual =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":0,\"nano\":0}},\"offset\":{\"totalSeconds\":-1800}}";
        jsonExpected =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":0,\"nano\":0}},\"offset\":{\"totalSeconds\":-1800}}";
        testSerializationAndDeserializationImpl(jsonActual, jsonExpected);

        // wrong format
        jsonActual =
                "{\"dateTime\":{\"time\":{\"hour\":12,\"minute\":13,\"second\":0,\"nano\":0},\"offset\":{\"totalSeconds\":-1800}}}";
        assertNull(adapter.deserialize(new JsonParser().parse(jsonActual), null, null));
    }

    private void testSerializationAndDeserializationImpl(String jsonInput, String jsonResult) {
        JsonElement jsonElement = new JsonParser().parse(jsonInput);
        OffsetDateTime offsetDateTime = adapter.deserialize(jsonElement, null, null);
        JsonElement valueDateResult = adapter.serialize(offsetDateTime, null, null);
        assertEquals(jsonResult, valueDateResult.toString());
    }
}
