
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MEET"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="NARR"/&gt;
 *     &lt;enumeration value="RDTE"/&gt;
 *     &lt;enumeration value="PPYD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
