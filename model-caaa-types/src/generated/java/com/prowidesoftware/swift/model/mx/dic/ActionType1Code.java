
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="PRNT"/&gt;
 *     &lt;enumeration value="RFRL"/&gt;
 *     &lt;enumeration value="CPTR"/&gt;
 *     &lt;enumeration value="PINR"/&gt;
 *     &lt;enumeration value="PINL"/&gt;
 *     &lt;enumeration value="RQDT"/&gt;
 *     &lt;enumeration value="BUSY"/&gt;
 *     &lt;enumeration value="RQID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
