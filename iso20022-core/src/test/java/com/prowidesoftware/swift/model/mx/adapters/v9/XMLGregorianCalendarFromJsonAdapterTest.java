package com.prowidesoftware.swift.model.mx.adapters.v9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.jupiter.api.Test;

class XMLGregorianCalendarFromJsonAdapterTest {

    private final XMLGregorianCalendarFromJsonAdapter adapter = new XMLGregorianCalendarFromJsonAdapter();

    @Test
    void testSerializationAndDeserialization() {
        String sourceJsonV9;
        String expectedJsonV10;

        sourceJsonV9 =
                "{\"year\": 2022,\"month\": 11,\"day\": 30,\"timezone\": -180,\"hour\": 10,\"minute\": 43,\"second\": 57,\"fractionalSecond\": 0.412}";
        expectedJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2022,\"month\":11,\"day\":30},\"time\":{\"hour\":10,\"minute\":43,\"second\":57,\"nano\":412000000}},\"offset\":{\"totalSeconds\":-10800}}";
        testSerializationAndDeserializationImpl(sourceJsonV9, expectedJsonV10);

        // without offset, nano 0
        sourceJsonV9 =
                "{\"year\":2019,\"month\":4,\"day\":28,\"hour\":12,\"minute\":13,\"second\":14,\"fractionalSecond\":0}";
        expectedJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":0}},\"offset\":{\"totalSeconds\":0}}";
        testSerializationAndDeserializationImpl(sourceJsonV9, expectedJsonV10);

        // without offset, without nano
        sourceJsonV9 = "{\"year\":2019,\"month\":4,\"day\":28,\"hour\":12,\"minute\":13,\"second\":14}";
        expectedJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":0}},\"offset\":{\"totalSeconds\":0}}";
        testSerializationAndDeserializationImpl(sourceJsonV9, expectedJsonV10);

        // without offset, nano 123456789
        sourceJsonV9 =
                "{\"year\":2019,\"month\":4,\"day\":28,\"hour\":12,\"minute\":13,\"second\":14,\"fractionalSecond\":0.123456789}";
        expectedJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":14,\"nano\":123000000}},\"offset\":{\"totalSeconds\":0}}";
        testSerializationAndDeserializationImpl(sourceJsonV9, expectedJsonV10);

        // without second, without nano
        sourceJsonV9 = "{\"year\":2019,\"month\":4,\"day\":28,\"hour\":12,\"minute\":13}";
        expectedJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":0,\"nano\":0}},\"offset\":{\"totalSeconds\":0}}";
        testSerializationAndDeserializationImpl(sourceJsonV9, expectedJsonV10);

        // with offset
        sourceJsonV9 =
                "{\"year\":2019,\"month\":4,\"day\":28,\"timezone\": 120,\"hour\":12,\"minute\":13,\"second\":0,\"fractionalSecond\":0.456789}";
        expectedJsonV10 =
                "{\"dateTime\":{\"date\":{\"year\":2019,\"month\":4,\"day\":28},\"time\":{\"hour\":12,\"minute\":13,\"second\":0,\"nano\":456000000}},\"offset\":{\"totalSeconds\":7200}}";
        testSerializationAndDeserializationImpl(sourceJsonV9, expectedJsonV10);
    }

    private void testSerializationAndDeserializationImpl(String sourceJsonV9, String expectedJsonV10) {
        JsonElement jsonElement = new JsonParser().parse(sourceJsonV9);
        XMLGregorianCalendar calendar = adapter.deserialize(jsonElement, null, null);
        JsonElement valueDateResult = adapter.serialize(calendar, null, null);
        assertEquals(expectedJsonV10, valueDateResult.toString());
    }
}
