
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventGroup3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventGroup3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventGroup3Code")
@XmlEnum
public enum EventGroup3Code {


    /**
     * Distribution domain events.
     * 
     */
    DISN;

    public String value() {
        return name();
    }

    public static EventGroup3Code fromValue(String v) {
        return valueOf(v);
    }

}
