package com.prowidesoftware.swift.model.mx.adapters.v9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;

class V9DateTimeJsonAdapterTest {

    private final V9DateTimeJsonAdapter adapter = new V9DateTimeJsonAdapter();

    @Test
    void testDeserialization() {
        String sourceJsonV9;
        OffsetDateTime expectedOffsetDateTime;

        sourceJsonV9 =
                "{\"year\":2022,\"month\":11,\"day\":30,\"timezone\":-180,\"hour\":10,\"minute\":43,\"second\":57,\"fractionalSecond\":0.412}";
        expectedOffsetDateTime = OffsetDateTime.parse("2022-11-30T10:43:57.412-03:00");
        testDeserialization(sourceJsonV9, expectedOffsetDateTime);

        // without offset, nano 0
        sourceJsonV9 =
                "{\"year\":2019,\"month\":4,\"day\":28,\"timezone\":0,\"hour\":12,\"minute\":13,\"second\":14,\"fractionalSecond\":0}";
        expectedOffsetDateTime = OffsetDateTime.parse("2019-04-28T12:13:14.0-00:00");
        testDeserialization(sourceJsonV9, expectedOffsetDateTime);
    }

    @Test
    void testSerialization() {
        OffsetDateTime sourceOffsetDateTime;
        String expectedJsonV9;

        sourceOffsetDateTime = OffsetDateTime.parse("2022-11-30T10:43:57.412-03:00");
        expectedJsonV9 =
                "{\"year\":2022,\"month\":11,\"day\":30,\"timezone\":-180,\"hour\":10,\"minute\":43,\"second\":57,\"fractionalSecond\":0.412}";
        testSerialization(sourceOffsetDateTime, expectedJsonV9);

        // without offset, nano 0
        sourceOffsetDateTime = OffsetDateTime.parse("2019-04-28T12:13:14.0-00:00");
        expectedJsonV9 =
                "{\"year\":2019,\"month\":4,\"day\":28,\"timezone\":0,\"hour\":12,\"minute\":13,\"second\":14,\"fractionalSecond\":0}";
        testSerialization(sourceOffsetDateTime, expectedJsonV9);
    }

    private void testDeserialization(String sourceJsonV9, OffsetDateTime expected) {
        JsonElement sourceJsonElement = new JsonParser().parse(sourceJsonV9);
        OffsetDateTime deserializeResult = adapter.deserialize(sourceJsonElement, null, null);
        assertEquals(expected, deserializeResult);
    }

    private void testSerialization(OffsetDateTime sourceOffsetDateTimeV10, String expectedJsonV9) {
        JsonElement expectedJsonElement = new JsonParser().parse(expectedJsonV9);
        JsonElement serializeResult = adapter.serialize(sourceOffsetDateTimeV10, null, null);
        assertEquals(expectedJsonElement, serializeResult);
    }
}
