
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailureReason4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CDCP"/>
 *     <enumeration value="CDCL"/>
 *     <enumeration value="CDER"/>
 *     <enumeration value="CUCL"/>
 *     <enumeration value="CUDC"/>
 *     <enumeration value="CDFG"/>
 *     <enumeration value="FILL"/>
 *     <enumeration value="MALF"/>
 *     <enumeration value="NDCL"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="SFRD"/>
 *     <enumeration value="TIMO"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="UCPT"/>
 *     <enumeration value="UCMP"/>
 *     <enumeration value="USND"/>
 *     <enumeration value="CSRV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FailureReason4Code")
@XmlEnum
public enum FailureReason4Code {


    /**
     * ATM manager has requested to capture the card.
     * 
     */
    CDCP,

    /**
     * Integrated circuit card declines the transaction before or after the authorisation.
     * 
     */
    CDCL,

    /**
     * Unable to complete transaction with the card.
     * 
     */
    CDER,

    /**
     * Customer cancellation, for example removing the card before the end of the transaction.
     * 
     */
    CUCL,

    /**
     * Customer has declined additional fees or a lower amount, transaction fails.
     * 
     */
    CUDC,

    /**
     * Customer has left the card in the ATM or a motorised card reader.
     * 
     */
    CDFG,

    /**
     * Unable to fulfil, for instance dispensing the cash.
     * 
     */
    FILL,

    /**
     * Suspected malfunction.
     * 
     */
    MALF,

    /**
     * Online authorisation declined the transaction.
     * 
     */
    NDCL,

    /**
     * Security error has occurred in the authorisation response message sent by the acquirer.
     * 
     */
    SECU,

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
     * Unable to capture the card as requested.
     * 
     */
    UCPT,

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
     * ATM manager has requested to the ATM to stop customer services.
     * 
     */
    CSRV;

    public String value() {
        return name();
    }

    public static FailureReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
