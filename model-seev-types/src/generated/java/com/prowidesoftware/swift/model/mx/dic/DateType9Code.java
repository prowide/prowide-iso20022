
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DateType9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PWAL"/>
 *     <enumeration value="MKDT"/>
 *     <enumeration value="MEET"/>
 *     <enumeration value="PAYD"/>
 *     <enumeration value="RDTE"/>
 *     <enumeration value="RDDT"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DateType9Code")
@XmlEnum
public enum DateType9Code {


    /**
     * Blocking occurs until and inclusive of the end of the election period of the option.
     * 
     */
    PWAL,

    /**
     * Blocking occurs until and inclusive of the market deadline of the option.
     * 
     */
    MKDT,

    /**
     * Blocking occurs until and inclusive of the meeting date.
     * 
     */
    MEET,

    /**
     * Unblocking will occur on payment date of the option.
     * 
     */
    PAYD,

    /**
     * Blocking occurs until and inclusive of the record date of the event.
     * 
     */
    RDTE,

    /**
     * Blocking occurs until and inclusive of the account servicer deadline for the option.
     * 
     */
    RDDT,

    /**
     * Refer to additional information element for the date until when the securities are blocked.
     * 
     */
    NARR,

    /**
     * Date is unknown by the sender or has not been established.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static DateType9Code fromValue(String v) {
        return valueOf(v);
    }

}
