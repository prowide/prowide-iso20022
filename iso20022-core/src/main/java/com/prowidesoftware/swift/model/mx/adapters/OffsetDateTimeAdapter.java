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

import org.apache.commons.lang3.StringUtils;

import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * A date time adapter that will append the offset to the date time on marshall.
 * For UTC, it uses an explicit '+00:00' instead of the 'Z' code.
 *
 * @since 9.2.6
 */
public class OffsetDateTimeAdapter extends CustomDateTimeAdapter {

    public OffsetDateTimeAdapter() {
        super(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));
    }

    @Override
    public String marshal(XMLGregorianCalendar cal) throws Exception {
        return StringUtils.replace(super.marshal(cal), "Z", "+00:00");
    }

}
