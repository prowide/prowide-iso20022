
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DateType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MEET"/>
 *     <enumeration value="UKWN"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="RDTE"/>
 *     <enumeration value="PPYD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DateType10Code")
@XmlEnum
public enum DateType10Code {


    /**
     * Blocking occurs until and inclusive of the meeting date.
     * 
     */
    MEET,

    /**
     * Date is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Refer to additional information element for the date until when the securities are blocked.
     * 
     */
    NARR,

    /**
     * Blocking occurs until and inclusive of the record date of the event.
     * 
     */
    RDTE,

    /**
     * Unblocking will occur on payment date of the premium.
     * 
     */
    PPYD;

    public String value() {
        return name();
    }

    public static DateType10Code fromValue(String v) {
        return valueOf(v);
    }

}
