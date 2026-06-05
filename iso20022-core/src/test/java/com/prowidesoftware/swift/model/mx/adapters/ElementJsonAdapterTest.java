/*
 * Copyright 2006-2026 Prowide
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

import static org.assertj.core.api.Assertions.assertThat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;

class ElementJsonAdapterTest {

    private final ElementJsonAdapter adapter = new ElementJsonAdapter();

    @Test
    void serializesElementAsRawXmlString() {
        Element element = ElementJsonAdapter.toElement(
                "<TEST:TestData xmlns:TEST=\"appian:test:smm\">" + "<TEST:tag>Hello World!</TEST:tag></TEST:TestData>");

        JsonPrimitive json = (JsonPrimitive) adapter.serialize(element, null, null);
        assertThat(json.getAsString())
                .contains("TestData")
                .contains("Hello World!")
                .doesNotContain("<?xml");
    }

    @Test
    void deserializesRawXmlStringIntoNamespaceAwareElement() {
        Element element =
                adapter.deserialize(new JsonPrimitive("<a:Foo xmlns:a=\"urn:x\"><a:Bar>v</a:Bar></a:Foo>"), null, null);

        assertThat(element).isNotNull();
        assertThat(element.getLocalName()).isEqualTo("Foo");
        assertThat(element.getNamespaceURI()).isEqualTo("urn:x");
        assertThat(element.getElementsByTagNameNS("urn:x", "Bar").getLength()).isEqualTo(1);
    }

    @Test
    void handlesNullAndBlank() {
        assertThat(adapter.serialize(null, null, null)).isEqualTo(JsonNull.INSTANCE);
        assertThat(adapter.deserialize(JsonNull.INSTANCE, null, null)).isNull();
        assertThat(adapter.deserialize(new JsonPrimitive("   "), null, null)).isNull();
        assertThat(ElementJsonAdapter.toElement(null)).isNull();
    }

    /**
     * SwAny (#41) holds a {@code List<Element>}: with the type hierarchy adapter registered, the list
     * serializes to an array of XML strings and deserializes back to a list of DOM Elements.
     */
    @Test
    void listOfElementsRoundTrips() {
        Gson gson = new GsonBuilder()
                .registerTypeHierarchyAdapter(Element.class, adapter)
                .create();
        List<Element> list = List.of(
                ElementJsonAdapter.toElement("<a:One xmlns:a=\"urn:x\"/>"),
                ElementJsonAdapter.toElement("<a:Two xmlns:a=\"urn:x\"/>"));

        String json = gson.toJson(list);
        assertThat(json).contains("One").contains("Two");

        List<Element> restored = gson.fromJson(json, new TypeToken<List<Element>>() {}.getType());
        assertThat(restored).hasSize(2);
        assertThat(restored.get(0).getLocalName()).isEqualTo("One");
        assertThat(restored.get(1).getLocalName()).isEqualTo("Two");
    }
}
