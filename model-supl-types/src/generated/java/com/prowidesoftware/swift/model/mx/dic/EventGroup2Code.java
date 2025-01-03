
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventGroup2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventGroup2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISN"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="REOR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventGroup2Code")
@XmlEnum
public enum EventGroup2Code {


    /**
     * Distribution domain events.
     * 
     */
    DISN,

    /**
     * Redemption domain events.
     * 
     */
    REDM,

    /**
     * Reorganization domain events.
     * 
     */
    REOR;

    public String value() {
        return name();
    }

    public static EventGroup2Code fromValue(String v) {
        return valueOf(v);
    }

}
