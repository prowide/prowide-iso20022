
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayBookingInstruction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DayBookingInstruction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTO"/>
 *     <enumeration value="TALK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DayBookingInstruction1Code")
@XmlEnum
public enum DayBookingInstruction1Code {


    /**
     * Can trigger booking without reference to the order initiator.
     * 
     */
    AUTO,

    /**
     * Speak with order initiator before booking.
     * 
     */
    TALK;

    public String value() {
        return name();
    }

    public static DayBookingInstruction1Code fromValue(String v) {
        return valueOf(v);
    }

}
