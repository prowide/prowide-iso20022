
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventGroup1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventGroup1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REDM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventGroup1Code")
@XmlEnum
public enum EventGroup1Code {


    /**
     * Redemption domain events.
     * 
     */
    REDM;

    public String value() {
        return name();
    }

    public static EventGroup1Code fromValue(String v) {
        return valueOf(v);
    }

}
