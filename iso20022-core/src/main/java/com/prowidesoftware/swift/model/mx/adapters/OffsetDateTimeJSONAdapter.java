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

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.*;
import java.util.logging.Logger;

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
public class OffsetDateTimeJSONAdapter implements JsonSerializer<OffsetDateTime>, JsonDeserializer<OffsetDateTime> {
    private static final String OFFSET = "offset";

    private static final String TOTAL_SECONDS = "totalSeconds";

    private static final String DATETIME = "dateTime";

    private static final Logger log = Logger.getLogger(OffsetDateTimeJSONAdapter.class.getName());

    private static final Gson gson = new Gson();


    @Override
    public JsonElement serialize(OffsetDateTime offsetDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        Gson gson = new Gson();
        return gson.toJsonTree(offsetDateTime);
    }

    @Override
    public OffsetDateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            OffsetDateTime offsetDateTime;
            JsonObject obj = jsonElement.getAsJsonObject();

            if (obj.get(OFFSET) != null) {
                //aca esperamos el json entonces como dateTime objeto
                ZoneOffset zoneoffset = ZoneOffset.ofTotalSeconds(obj.get(OFFSET).getAsJsonObject().get(TOTAL_SECONDS).getAsInt());
                offsetDateTime = gson.fromJson(obj, OffsetDateTime.class);
                offsetDateTime = OffsetDateTime.of(offsetDateTime.toLocalDateTime(), zoneoffset);
            } else {
                //aca esperamos el json entonces como date objeto.Fixear los jsons?
                LocalDateTime localDateTime = gson.fromJson(obj, LocalDateTime.class);
                ZoneId zoneId = ZoneOffset.systemDefault();
                offsetDateTime = localDateTime.atZone(zoneId).toOffsetDateTime();
            }

            return offsetDateTime;
        } catch (Exception e) {
            log.finest("Cannot parse dateTime format" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
