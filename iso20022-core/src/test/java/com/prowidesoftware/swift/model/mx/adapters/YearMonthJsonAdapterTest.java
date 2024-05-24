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

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.prowidesoftware.swift.model.mx.MxAcmt03400104;
import java.time.YearMonth;
import org.junit.jupiter.api.Test;

public class YearMonthJsonAdapterTest {

    private final YearMonthJsonAdapter adapter = new YearMonthJsonAdapter();

    @Test
    void testSerializationAndDeserialization() {
        testSerializationAndDeserializationImpl("{\"year\":2019,\"month\":4}");
        testSerializationAndDeserializationImpl("{\"year\":2019,\"month\":1}");
        testSerializationAndDeserializationImpl("{\"year\":2019,\"month\":12}");
        testSerializationAndDeserializationImpl("{\"year\":1983,\"month\":7}");
    }

    private void testSerializationAndDeserializationImpl(String json) {
        JsonElement jsonElement = new JsonParser().parse(json);
        YearMonth yearMonth = adapter.deserialize(jsonElement, null, null);
        JsonElement valueDateResult = adapter.serialize(yearMonth, null, null);
        assertEquals(json, valueDateResult.toString());
    }

    @Test
    public void testYear_CustomPattern() {
        String jsonOrigin = "{\n" + "  \"acctSwtchReqPmt\": {\n"
                + "    \"cdtInstr\": {\n"
                + "      \"tax\": {\n"
                + "        \"rcrd\": [\n"
                + "          {\n"
                + "            \"prd\": {\n"
                + "              \"yr\": {\n"
                + "                \"year\": 2022\n"
                + "              }\n"
                + "            }\n"
                + "          }\n"
                + "        ]\n"
                + "      }\n"
                + "    }\n"
                + "  },\n"
                + "  \"type\": \"MX\",\n"
                + "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:acmt.034.001.04\",\n"
                + "  \"identifier\": \"acmt.034.001.04\"\n"
                + "}";

        final MxAcmt03400104 mx = MxAcmt03400104.fromJson(jsonOrigin);
        final String jsonParsed = mx.toJson();
        assertTrue(jsonParsed.contains("\"year\": 2022"));
    }
}
