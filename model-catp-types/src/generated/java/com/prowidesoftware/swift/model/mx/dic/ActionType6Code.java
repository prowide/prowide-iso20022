
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCCQ"/>
 *     <enumeration value="FEES"/>
 *     <enumeration value="HAMT"/>
 *     <enumeration value="LAMT"/>
 *     <enumeration value="BUSY"/>
 *     <enumeration value="CPTR"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="CPNS"/>
 *     <enumeration value="RQST"/>
 *     <enumeration value="PINL"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="TRCK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionType6Code")
@XmlEnum
public enum ActionType6Code {


    /**
     * Ask the cardholder to accept the currency conversion.
     * 
     */
    DCCQ,

    /**
     * Fees must be accepted.
     * 
     */
    FEES,

    /**
     * MinimumAmount must be accepted.
     * 
     */
    HAMT,

    /**
     * MaximumAuthorisedAmount must be accepted.
     * 
     */
    LAMT,

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
     * Distribute a coupon from the cassette of coupon.
     * 
     */
    CPNS,

    /**
     * Request to be performed by the ATM.
     * 
     */
    RQST,

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
     * Track provided in the response must be updated on the card.
     * 
     */
    TRCK;

    public String value() {
        return name();
    }

    public static ActionType6Code fromValue(String v) {
        return valueOf(v);
    }

}
