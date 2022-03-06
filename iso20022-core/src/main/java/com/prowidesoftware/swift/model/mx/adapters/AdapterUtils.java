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


import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Reusable code for adapters implementations
 */
class AdapterUtils {
    private static final transient Logger log = Logger.getLogger(AdapterUtils.class.getName());

    static String format(SimpleDateFormat dateFormat, XMLGregorianCalendar calendar) {
        GregorianCalendar gregorianCalendar = calendar.toGregorianCalendar();
        Date date = gregorianCalendar.getTime();
        dateFormat.setCalendar(gregorianCalendar);
        return dateFormat.format(date);
    }

    static XMLGregorianCalendar parse(SimpleDateFormat dateFormat, String value) {
        if (value == null) {
            return null;
        }
        try {
            // attempt lexical representation parsing
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(value);
        } catch (IllegalArgumentException|DatatypeConfigurationException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing to XMLGregorianCalendar: " + e.getMessage());
            }
        }
        try {
            Date date = dateFormat.parse(value);
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        } catch (ParseException|DatatypeConfigurationException e) {
            if (log.isLoggable(Level.FINEST)) {
                log.finest("Error parsing XMLGregorianCalendar with " + dateFormat.toPattern() + ": " + e.getMessage());
            }
        }
        return null;
    }

}
