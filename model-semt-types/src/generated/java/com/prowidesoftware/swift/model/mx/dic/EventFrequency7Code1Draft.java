
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency7Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventFrequency7Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADHO"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="INDA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventFrequency7Code__1")
@XmlEnum
public enum EventFrequency7Code1Draft {


    /**
     * Event takes place as necessary.
     * 
     */
    ADHO,

    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place several times a day.
     * 
     */
    INDA;

    public String value() {
        return name();
    }

    public static EventFrequency7Code1Draft fromValue(String v) {
        return valueOf(v);
    }

}
