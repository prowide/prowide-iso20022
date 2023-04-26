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
package com.prowidesoftware.swift.model.mx.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Default generic adapter to use when non is provided via the configuration API
 *
 * @since 9.2.6
 */
class DefaultCalendarAdapter extends XmlAdapter<String, Calendar> {
    private static String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

    @Override
    public Calendar unmarshal(String value) throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(value));
        return cal;
    }

    @Override
    public String marshal(Calendar value) throws Exception {
        if (value != null) {
            String formatted = sdf.format(value.getTime());
            return formatted;
        }
        return null;
    }

}
