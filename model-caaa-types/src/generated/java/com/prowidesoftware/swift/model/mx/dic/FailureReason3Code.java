
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailureReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CDCL"/>
 *     <enumeration value="CUCL"/>
 *     <enumeration value="MALF"/>
 *     <enumeration value="FDCL"/>
 *     <enumeration value="NDCL"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="SFRD"/>
 *     <enumeration value="TIMO"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="UCMP"/>
 *     <enumeration value="USND"/>
 *     <enumeration value="SECU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
