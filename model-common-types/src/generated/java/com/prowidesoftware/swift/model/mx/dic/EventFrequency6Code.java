
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventFrequency6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DAIL"/>
 *     <enumeration value="INDA"/>
 *     <enumeration value="ONDE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventFrequency6Code")
@XmlEnum
public enum EventFrequency6Code {


    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place several times a day.
     * 
     */
    INDA,

    /**
     * Event takes place on demand.
     * 
     */
    ONDE;

    public String value() {
        return name();
    }

    public static EventFrequency6Code fromValue(String v) {
        return valueOf(v);
    }

}
