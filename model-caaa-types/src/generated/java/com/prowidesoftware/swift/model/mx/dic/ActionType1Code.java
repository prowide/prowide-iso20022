
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISP"/>
 *     <enumeration value="PRNT"/>
 *     <enumeration value="RFRL"/>
 *     <enumeration value="CPTR"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="PINL"/>
 *     <enumeration value="RQDT"/>
 *     <enumeration value="BUSY"/>
 *     <enumeration value="RQID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionType1Code")
@XmlEnum
public enum ActionType1Code {


    /**
     * Message to display, print or log.
     * 
     */
    DISP,

    /**
     * Print a message.
     * 
     */
    PRNT,

    /**
     * Referral has to be performed.
     * 
     */
    RFRL,

    /**
     * Capture the card.
     * 
     */
    CPTR,

    /**
     * PIN (Personal Identification Number) is wrong, retry a PIN verification.
     * 
     */
    PINR,

    /**
     * Last PIN (Personal Identification Number) try.
     * 
     */
    PINL,

    /**
     * Request additional data through a displayed text and request confirmation by an attendant.
     * 
     */
    RQDT,

    /**
     * Server busy, try later.
     * 
     */
    BUSY,

    /**
     * Additional identification required (passport, ID card, etc.).
     * 
     */
    RQID;

    public String value() {
        return name();
    }

    public static ActionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
