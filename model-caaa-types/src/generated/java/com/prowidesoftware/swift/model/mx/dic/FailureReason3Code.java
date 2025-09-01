
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailureReason3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDCL"/&gt;
 *     &lt;enumeration value="CUCL"/&gt;
 *     &lt;enumeration value="MALF"/&gt;
 *     &lt;enumeration value="FDCL"/&gt;
 *     &lt;enumeration value="NDCL"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="SFRD"/&gt;
 *     &lt;enumeration value="TIMO"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="UCMP"/&gt;
 *     &lt;enumeration value="USND"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FailureReason3Code")
@XmlEnum
public enum FailureReason3Code {


    /**
     * Integrated circuit card declines the transaction before or after the authorisation.
     * 
     */
    CDCL,

    /**
     * Customer cancellation, for example removing the card before the end of the transaction.
     * 
     */
    CUCL,

    /**
     * Suspected malfunction.
     * 
     */
    MALF,

    /**
     * Offline authorisation declined the transaction.
     * 
     */
    FDCL,

    /**
     * Online authorisation declined the transaction.
     * 
     */
    NDCL,

    /**
     * Completed partially.
     * 
     */
    PART,

    /**
     * Card payment transaction fails because the merchant suspect a fraud.
     * 
     */
    SFRD,

    /**
     * Timeout while waiting for a response to a request message, or no response was received (for example connection release before receiving the response).
     * 
     */
    TIMO,

    /**
     * Response to the previous message was received too late.
     * 
     */
    LATE,

    /**
     * Unable to complete the transaction after the authorisation response.
     * 
     */
    UCMP,

    /**
     * Unable to deliver the request message to the recipient party.
     * 
     */
    USND,

    /**
     * Security error has occurred in the authorisation response message sent by the acquirer.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static FailureReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
