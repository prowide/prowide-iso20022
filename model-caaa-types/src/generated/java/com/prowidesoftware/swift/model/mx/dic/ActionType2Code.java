
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUSY"/>
 *     <enumeration value="CPTR"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="NOVR"/>
 *     <enumeration value="RQID"/>
 *     <enumeration value="PINL"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="PRNT"/>
 *     <enumeration value="RFRL"/>
 *     <enumeration value="RQDT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionType2Code")
@XmlEnum
public enum ActionType2Code {


    /**
     * Server busy, try later.
     * 
     */
    BUSY,

    /**
     * Capture the card.
     * 
     */
    CPTR,

    /**
     * Message to display, print or log.
     * 
     */
    DISP,

    /**
     * Payment application cannot propose to the merchant an override of the payment transaction.
     * 
     */
    NOVR,

    /**
     * Additional identification required (passport, ID card, etc.).
     * 
     */
    RQID,

    /**
     * Last PIN (Personal Identification Number) try.
     * 
     */
    PINL,

    /**
     * PIN (Personal Identification Number) is wrong, retry a PIN verification.
     * 
     */
    PINR,

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
     * Request additional data through a displayed text and request confirmation by an attendant.
     * 
     */
    RQDT;

    public String value() {
        return name();
    }

    public static ActionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
