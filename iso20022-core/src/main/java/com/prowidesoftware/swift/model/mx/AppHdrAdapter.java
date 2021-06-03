package com.prowidesoftware.swift.model.mx;

import com.google.gson.*;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;

public class AppHdrAdapter implements JsonSerializer<AppHdr>, JsonDeserializer<AppHdr> {

    private static final String NAMESPACE = "namespace";

    @Override
    public JsonElement serialize(AppHdr hdr, Type typeOfSrc, JsonSerializationContext context) {
        try {
            String namespace = hdr.namespace();
            JsonObject json = context.serialize(hdr).getAsJsonObject();
            json.addProperty(NAMESPACE, namespace);
            return json;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public AppHdr deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            Class<?> type = LegacyAppHdr.class;
            JsonElement namespace = json.getAsJsonObject().get(NAMESPACE);
            if (namespace != null && !namespace.equals(AppHdrType.LEGACY.getNamespace())) {
                type = AppHdrType.of(namespace.getAsString());
            }
            return context.deserialize(json, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
