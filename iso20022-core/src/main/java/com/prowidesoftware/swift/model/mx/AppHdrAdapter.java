package com.prowidesoftware.swift.model.mx;

import com.google.gson.*;
import java.lang.reflect.Type;

/**
 * Gson {@link JsonSerializer} and {@link JsonDeserializer} for {@link AppHdr}.
 *
 * <p>During serialization, the header namespace is added to the JSON object so that the concrete
 * implementation class can be resolved during deserialization. If no namespace is found in the JSON
 * upon deserialization, {@link LegacyAppHdr} is used as the default.
 *
 * @since 9.1.7
 */
public class AppHdrAdapter implements JsonSerializer<AppHdr>, JsonDeserializer<AppHdr> {

    private static final String NAMESPACE = "namespace";

    @Override
    public JsonElement serialize(AppHdr hdr, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject json = context.serialize(hdr).getAsJsonObject();
        json.addProperty(NAMESPACE, hdr.namespace());
        return json;
    }

    @Override
    public AppHdr deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {

        // resolve header implementation class
        JsonElement namespace = json.getAsJsonObject().get(NAMESPACE);
        Class type = null;
        if (namespace != null) {
            type = AppHdrType.of(namespace.getAsString());
        }

        if (type == null) {
            // default to legacy header
            type = LegacyAppHdr.class;
        }

        return context.deserialize(json, type);
    }
}
