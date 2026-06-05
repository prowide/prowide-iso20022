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

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.prowidesoftware.swift.utils.SafeXmlUtils;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

/**
 * Gson {@link JsonSerializer} and {@link JsonDeserializer} for {@link org.w3c.dom.Element}, used to
 * preserve {@code xsd:any} wildcard content (such as {@code SplmtryData/Envlp} payloads or signature
 * envelopes) when an MX message is converted to/from JSON.
 *
 * <p>Without this adapter Gson reflects over the DOM node and serializes it as an empty object
 * ({@code {}}), losing the content. The element is represented as its raw XML serialization (a JSON
 * string), which is lossless for arbitrary subtrees including namespaces, attributes and mixed content.
 *
 * <p>It must be registered with {@code registerTypeHierarchyAdapter(Element.class, ...)} rather than
 * {@code registerTypeAdapter}, because at runtime the value is a concrete DOM implementation (e.g.
 * {@code ElementNSImpl}), not the {@link Element} interface itself.
 *
 * @since 10.3.9
 */
public class ElementJsonAdapter implements JsonSerializer<Element>, JsonDeserializer<Element> {

    @Override
    public JsonElement serialize(Element element, Type typeOfSrc, JsonSerializationContext context) {
        if (element == null) {
            return JsonNull.INSTANCE;
        }
        try {
            Transformer transformer = SafeXmlUtils.transformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(element), new StreamResult(writer));
            return new JsonPrimitive(writer.toString());
        } catch (Exception e) {
            throw new JsonParseException("Error serializing org.w3c.dom.Element to JSON", e);
        }
    }

    @Override
    public Element deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        if (json == null || json.isJsonNull() || !json.isJsonPrimitive()) {
            return null;
        }
        return toElement(json.getAsString());
    }

    /**
     * Parses an XML string into a detached {@link org.w3c.dom.Element} using the hardened
     * (XXE-safe), namespace-aware document builder. Returns {@code null} for null or blank input.
     *
     * @param xml the raw XML serialization of an element
     * @return the parsed element, or {@code null} if the input is null/blank
     * @throws JsonParseException if the XML cannot be parsed
     */
    public static Element toElement(String xml) {
        if (xml == null || xml.trim().isEmpty()) {
            return null;
        }
        try {
            // namespace-aware so the restored element exposes localName/namespaceURI and re-marshals correctly
            Document document = SafeXmlUtils.documentBuilder(true).parse(new InputSource(new StringReader(xml)));
            return document.getDocumentElement();
        } catch (Exception e) {
            throw new JsonParseException("Error deserializing org.w3c.dom.Element from JSON", e);
        }
    }
}
