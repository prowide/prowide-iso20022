
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventGroup4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventGroup4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISN"/>
 *     <enumeration value="GENL"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="REOR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventGroup4Code")
@XmlEnum
public enum EventGroup4Code {


    /**
     * Distribution domain events.
     * 
     */
    DISN,

    /**
     * General domain events.
     * 
     */
    GENL,

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

    public static EventGroup4Code fromValue(String v) {
        return valueOf(v);
    }

}
