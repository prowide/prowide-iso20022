package com.prowidesoftware.swift.model.mx;

import com.google.gson.*;

import java.lang.reflect.Type;

public class AppHdrAdapter implements JsonSerializer<AppHdr>, JsonDeserializer<AppHdr> {

    private static final String HDR_TYPE = "hdrType";

    @Override
    public JsonElement serialize(AppHdr hdr, Type typeOfSrc, JsonSerializationContext context) {
        try {
            String[] hdrType = hdr.getClass().getCanonicalName().split("[.]");
            JsonObject json = context.serialize(hdr).getAsJsonObject();
            json.addProperty(HDR_TYPE, hdrType[hdrType.length - 1]);
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
            JsonElement identifier = json.getAsJsonObject().get(HDR_TYPE);
            if (identifier != null) {
                try {
                    type = Class.forName("com.prowidesoftware.swift.model.mx." + identifier.getAsString());
                } catch (ClassNotFoundException ignored) {}
            }
            return context.deserialize(json, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
