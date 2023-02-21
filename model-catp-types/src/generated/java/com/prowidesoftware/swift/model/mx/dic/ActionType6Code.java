
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DCCQ"/&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="HAMT"/&gt;
 *     &lt;enumeration value="LAMT"/&gt;
 *     &lt;enumeration value="BUSY"/&gt;
 *     &lt;enumeration value="CPTR"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="CPNS"/&gt;
 *     &lt;enumeration value="RQST"/&gt;
 *     &lt;enumeration value="PINL"/&gt;
 *     &lt;enumeration value="PINR"/&gt;
 *     &lt;enumeration value="TRCK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
