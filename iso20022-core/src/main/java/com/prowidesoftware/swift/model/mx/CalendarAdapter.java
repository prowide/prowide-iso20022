/*
 * Copyright 2006-2021 Prowide
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
package com.prowidesoftware.swift.model.mx;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Helper class for Gson serialization and deserialization of Calendar
 *
 * @since 7.10.3
 */
public class CalendarAdapter implements JsonSerializer<Calendar>, JsonDeserializer<Calendar> {

    private static final String YEAR = "year";
    private static final String MONTH = "month";
    private static final String DAY = "day";
    private static final String TIMEZONE_ID = "timezoneId";
    private static final String HOUR_OF_DAY = "hour";
    private static final String MINUTE = "minute";
    private static final String SECOND = "second";
    private static final String MILLISECONDS = "milliseconds";


    @Override
    public JsonElement serialize(Calendar cal, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject obj = new JsonObject();

        obj.addProperty(YEAR,         cal.get(Calendar.YEAR));
        obj.addProperty(MONTH,        cal.get(Calendar.MONTH));
        obj.addProperty(DAY,          cal.get(Calendar.DAY_OF_MONTH));
        obj.addProperty(TIMEZONE_ID,  cal.getTimeZone().getID());
        obj.addProperty(HOUR_OF_DAY,  cal.get(Calendar.HOUR_OF_DAY));
        obj.addProperty(MINUTE,       cal.get(Calendar.MINUTE));
        obj.addProperty(SECOND,       cal.get(Calendar.SECOND));
        obj.addProperty(MILLISECONDS, cal.get(Calendar.MILLISECOND));
        //TODO ME TRUNCA LOS 0 A LA IZQ. Si en el json viene 08, entonces en el json resultante queda 8
        //TODO si agregamos milliseconds, en el json resultante estará presente mientras que en el json entrante no definen milliseconds

        //obj.addProperty(MILLISECONDS, cal.get(Calendar.MILLISECOND));
        return obj;
        // this alternative implementation is not working
        //return new JsonPrimitive(cal.toXMLFormat());
        //TODO cambiar fractional por milliseconds?
    }

    @Override
    public Calendar deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            JsonObject obj = jsonElement.getAsJsonObject();
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, obj.get(YEAR).getAsInt());
            calendar.set(Calendar.MONTH, obj.get(MONTH).getAsInt());
            calendar.set(Calendar.DAY_OF_MONTH, obj.get(DAY).getAsInt());
            calendar.setTimeZone(TimeZone.getTimeZone(obj.get(TIMEZONE_ID).getAsString()));
            calendar.set(Calendar.HOUR_OF_DAY, obj.get(HOUR_OF_DAY).getAsInt());
            calendar.set(Calendar.MINUTE, obj.get(MINUTE).getAsInt());
            calendar.set(Calendar.SECOND, obj.get(SECOND).getAsInt());

            JsonElement fractional = obj.get(MILLISECONDS);
            if (fractional != null) {
                calendar.set(Calendar.MILLISECOND, obj.get(MILLISECONDS).getAsInt());
            } else {
                calendar.set(Calendar.MILLISECOND, 0);
            }
            // obj.get(TIMEZONE).getAsInt()

            return calendar;
            // use the line below as implementation in Java 8
            //return DatatypeFactory.newInstance().newCalendar(jsonElement.getAsString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}