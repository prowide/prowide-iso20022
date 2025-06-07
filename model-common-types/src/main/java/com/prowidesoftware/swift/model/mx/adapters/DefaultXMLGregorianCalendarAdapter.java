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

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Default generic adapter to use when non is provided via the configuration API
 *
 * @since 9.2.6
 */
class DefaultXMLGregorianCalendarAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private final DatatypeFactory factory;

    DefaultXMLGregorianCalendarAdapter() throws DatatypeConfigurationException {
        this.factory = DatatypeFactory.newInstance();
    }

    @Override
    public XMLGregorianCalendar unmarshal(String value) throws Exception {
        return factory.newXMLGregorianCalendar(value);
    }

    @Override
    public String marshal(XMLGregorianCalendar value) throws Exception {
        if (value != null) {
            return value.toXMLFormat();
        }
        return null;
    }

}
