
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventConfirmationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventConfirmationStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONF"/>
 *     <enumeration value="UCON"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventConfirmationStatus1Code")
@XmlEnum
public enum EventConfirmationStatus1Code {


    /**
     * Occurrence of the event has been confirmed.
     * 
     */
    CONF,

    /**
     * Occurrence of the event has not been confirmed.
     * 
     */
    UCON;

    public String value() {
        return name();
    }

    public static EventConfirmationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
