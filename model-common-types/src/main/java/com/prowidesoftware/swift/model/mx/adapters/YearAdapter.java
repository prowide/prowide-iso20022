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
<<<<<<<< HEAD:model-common-types/src/main/java/com/prowidesoftware/swift/model/mx/adapters/MonthAdapter.java
========
import java.time.Year;
>>>>>>>> 3cf47f850 (Merge pull request #81 from prowide/CU-2np2uh3_GH-56--JAXB-Upgrade-Plan-OffsetDateTime-OffsetTime-LocalDate):model-common-types/src/main/java/com/prowidesoftware/swift/model/mx/adapters/YearAdapter.java
import java.time.format.DateTimeFormatter;

/**
 * Default generic adapter to use when non is provided via the configuration API.
<<<<<<<< HEAD:model-common-types/src/main/java/com/prowidesoftware/swift/model/mx/adapters/MonthAdapter.java
 * Used as default implementation for the {@link IsoMonthAdapter}.
 *
 * @since 10.0.0
 */
public class MonthAdapter extends XmlAdapter<String, Month> {
    private static String MONT_FORMAT = "MM";
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern(MONT_FORMAT);

    public MonthAdapter(DateTimeFormatter ofPattern) {
        this.dtf = ofPattern;
    }

    public MonthAdapter() {
    }

    @Override
    public Month unmarshal(String value) throws Exception {
        return Month.of(Integer.valueOf(value));
    }

    @Override
    public String marshal(Month value) throws Exception {
========
 * Used as default implementation for the {@link IsoYearAdapter}.
 *
 * @since 10.0.0
 */
public class YearAdapter extends XmlAdapter<String, Year> {
    private String YEAR_FORMAT = "YYYY";
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern(YEAR_FORMAT);

    public YearAdapter() {
    }
    public YearAdapter(DateTimeFormatter ofPattern) {
        this.dtf = ofPattern;
    }

    @Override
    public Year unmarshal(String value) throws Exception {
        return Year.parse(value, dtf);
    }

    @Override
    public String marshal(Year value) throws Exception {
>>>>>>>> 3cf47f850 (Merge pull request #81 from prowide/CU-2np2uh3_GH-56--JAXB-Upgrade-Plan-OffsetDateTime-OffsetTime-LocalDate):model-common-types/src/main/java/com/prowidesoftware/swift/model/mx/adapters/YearAdapter.java
        if (value != null) {
            return dtf.format(value);
        }
        return null;
    }

    @Override
    public String toString() {
<<<<<<<< HEAD:model-common-types/src/main/java/com/prowidesoftware/swift/model/mx/adapters/MonthAdapter.java
        return "MonthAdapter{ " + MONT_FORMAT + " }";
========
        return "YearAdapter{ " + YEAR_FORMAT + " }";
>>>>>>>> 3cf47f850 (Merge pull request #81 from prowide/CU-2np2uh3_GH-56--JAXB-Upgrade-Plan-OffsetDateTime-OffsetTime-LocalDate):model-common-types/src/main/java/com/prowidesoftware/swift/model/mx/adapters/YearAdapter.java
    }
}
