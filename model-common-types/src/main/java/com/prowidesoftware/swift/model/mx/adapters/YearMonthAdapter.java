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

import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

/**
 * Default generic adapter to use when non is provided via the configuration API
 *
 * @since 9.2.6
 */
public class YearMonthAdapter extends XmlAdapter<String, YearMonth> {
    private static String YEAR_MONTH_FORMAT = "yyyy-MM";
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern(YEAR_MONTH_FORMAT);

    public YearMonthAdapter(DateTimeFormatter ofPattern) {
        this.dtf = ofPattern;
    }

    public YearMonthAdapter() {
    }

    @Override
    public YearMonth unmarshal(String value) throws Exception {
        return YearMonth.parse(value, dtf);
    }

    @Override
    public String marshal(YearMonth value) throws Exception {
        if (value != null) {
            return dtf.format(value);
        }
        return null;
    }

}