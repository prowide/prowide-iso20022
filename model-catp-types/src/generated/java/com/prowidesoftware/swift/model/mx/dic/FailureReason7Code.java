
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailureReason7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDCP"/&gt;
 *     &lt;enumeration value="CDCL"/&gt;
 *     &lt;enumeration value="CDER"/&gt;
 *     &lt;enumeration value="CUCL"/&gt;
 *     &lt;enumeration value="CUDC"/&gt;
 *     &lt;enumeration value="CDFG"/&gt;
 *     &lt;enumeration value="FILL"/&gt;
 *     &lt;enumeration value="MALF"/&gt;
 *     &lt;enumeration value="NDCL"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="SFRD"/&gt;
 *     &lt;enumeration value="TIMO"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="UCPT"/&gt;
 *     &lt;enumeration value="UCMP"/&gt;
 *     &lt;enumeration value="USND"/&gt;
 *     &lt;enumeration value="CSRV"/&gt;
 *     &lt;enumeration value="CDRT"/&gt;
 *     &lt;enumeration value="CUTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FailureReason7Code")
@XmlEnum
public enum FailureReason7Code {


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
    CSRV,

    /**
     * Card has been retained by the ATM or the terminal.
     * 
     */
    CDRT,

    /**
     * Customer has not been performed in time an action.
     * 
     */
    CUTO;

    public String value() {
        return name();
    }

    public static FailureReason7Code fromValue(String v) {
        return valueOf(v);
    }

}
