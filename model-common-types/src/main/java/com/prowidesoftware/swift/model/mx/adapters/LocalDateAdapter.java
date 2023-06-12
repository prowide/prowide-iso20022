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

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Default generic adapter to use when non is provided via the configuration API.
 * Used as default implementation for the {@link IsoDateAdapter}.
 *
 * @since 10.0.0
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
    private static String DATE_FORMAT = "yyyy-MM-dd";
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_FORMAT);

    public LocalDateAdapter(DateTimeFormatter ofPattern) {
        this.dtf = ofPattern;
    }

    public LocalDateAdapter() {
    }

    @Override
    public LocalDate unmarshal(String value) throws Exception {
        return LocalDate.parse(StringUtils.substring(value, 0, 10), dtf);
    }

    @Override
    public String marshal(LocalDate value) throws Exception {
        if (value != null) {
            return dtf.format(value);
        }
        return null;
    }

    @Override
    public String toString() {
        return "LocalDateAdapter{ " + DATE_FORMAT + " }";
    }
}
