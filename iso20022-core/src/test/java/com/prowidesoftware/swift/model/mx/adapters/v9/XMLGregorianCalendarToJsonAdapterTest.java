package com.prowidesoftware.swift.model.mx.adapters.v9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;

class XMLGregorianCalendarToJsonAdapterTest {

    private final XMLGregorianCalendarToJsonAdapter adapter = new XMLGregorianCalendarToJsonAdapter();

    @Test
    void testSerializationAndDeserialization() {
        String sourceJsonV10;
        String expectedJsonV9;

        sourceJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2022,\"month\":11,\"day\":30},\"time\":{\"hour\":10,\"minute\":43,\"second\":57,\"nano\":412000000}},\"offset\":{\"totalSeconds\":-10800}}";
        expectedJsonV9 =
                "{\"year\":2022,\"month\":11,\"day\":30,\"timezone\":-180,\"hour\":10,\"minute\":43,\"second\":57,\"fractionalSecond\":0.412}";
        testSerializationAndDeserializationImpl(sourceJsonV10, expectedJsonV9);

        // without offset, nano 0
        sourceJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":0}}}";
        expectedJsonV9 =
                "{\"year\":2019,\"month\":4,\"day\":28,\"timezone\":0,\"hour\":12,\"minute\":13,\"second\":14,\"fractionalSecond\":0}";
        testSerializationAndDeserializationImpl(sourceJsonV10, expectedJsonV9);

        // without offset, without nano
        sourceJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14}}}";
        expectedJsonV9 =
                "{\"year\":2019,\"month\":4,\"day\":28,\"timezone\":0,\"hour\":12,\"minute\":13,\"second\":14,\"fractionalSecond\":0}";
        testSerializationAndDeserializationImpl(sourceJsonV10, expectedJsonV9);

        // without offset, nano 123456789
        sourceJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":123456789}}}";
        expectedJsonV9 =
                "{\"year\":2019,\"month\":4,\"day\":28,\"timezone\":0,\"hour\":12,\"minute\":13,\"second\":14,\"fractionalSecond\":0.123}";
        testSerializationAndDeserializationImpl(sourceJsonV10, expectedJsonV9);

        // without second, without nano
        sourceJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13}}}";
        expectedJsonV9 =
                "{\"year\":2019,\"month\":4,\"day\":28,\"timezone\":0,\"hour\":12,\"minute\":13,\"second\":0,\"fractionalSecond\":0}";
        testSerializationAndDeserializationImpl(sourceJsonV10, expectedJsonV9);

        // with offset
        sourceJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":0,\"nano\":456000000}},\"offset\":{\"totalSeconds\":7200}}";
        expectedJsonV9 =
                "{\"year\":2019,\"month\":4,\"day\":28,\"timezone\":120,\"hour\":12,\"minute\":13,\"second\":0,\"fractionalSecond\":0.456}";
        testSerializationAndDeserializationImpl(sourceJsonV10, expectedJsonV9);
    }

    private void testSerializationAndDeserializationImpl(String sourceJsonV10, String expectedJsonV9) {
        JsonElement jsonElement = new JsonParser().parse(sourceJsonV10);
        OffsetDateTime calendar = adapter.deserialize(jsonElement, null, null);
        JsonElement valueDateResult = adapter.serialize(calendar, null, null);
        assertEquals(expectedJsonV9, valueDateResult.toString());
    }
}
