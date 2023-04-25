
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionType9Code">
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
 *     <enumeration value="DCCQ"/>
 *     <enumeration value="FLFW"/>
 *     <enumeration value="PINQ"/>
 *     <enumeration value="CDCV"/>
 *     <enumeration value="CHDA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionType9Code")
@XmlEnum
public enum ActionType9Code {


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
    RQDT,

    /**
     * Ask the cardholder to accept the currency conversion.
     * 
     */
    DCCQ,

    /**
     * Fall-forward from contactless to chip card transaction required.
     * 
     */
    FLFW,

    /**
     * Request Cardholder Authentification through PIN insertion.
     * 
     */
    PINQ,

    /**
     * Request Cardholder Authentification according to the ConsumerDeviceCardholderVerificationMethod.
     * 
     */
    CDCV,

    /**
     * Additional authentication of cardholder required.
     * 
     */
    CHDA;

    public String value() {
        return name();
    }

    public static ActionType9Code fromValue(String v) {
        return valueOf(v);
    }

}
