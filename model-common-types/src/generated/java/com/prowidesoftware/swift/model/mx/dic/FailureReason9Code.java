
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailureReason9Code"&gt;
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
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="FMTE"/&gt;
 *     &lt;enumeration value="VLTE"/&gt;
 *     &lt;enumeration value="CHFG"/&gt;
 *     &lt;enumeration value="DCFG"/&gt;
 *     &lt;enumeration value="CQFG"/&gt;
 *     &lt;enumeration value="DFGC"/&gt;
 *     &lt;enumeration value="CFGC"/&gt;
 *     &lt;enumeration value="QFGC"/&gt;
 *     &lt;enumeration value="CQRT"/&gt;
 *     &lt;enumeration value="DCRT"/&gt;
 *     &lt;enumeration value="RSTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FailureReason9Code")
@XmlEnum
public enum FailureReason9Code {


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
    CUTO,

    /**
     * The ATM Manager has sent an ATMReject message in response to an authorisation request.
     * 
     */
    RJCT,

    /**
     * The ATM Manager has sent a response message in response to an authorisation request where some of its required elements were badly formatted (for example an integer value where a dateTime value was expected).
     * 
     */
    FMTE,

    /**
     * The ATM Manager has sent a response message in response to an authorisation request where some of its required elements were invalid (for example an incorrect ExchangeIdentifier).
     * 
     */
    VLTE,

    /**
     * Following a cash dispense operation the consumer forgot to take the notes, which have subsequently been retracted following a Present time-out. The number of notes retracted is unknown.
     * 
     */
    CHFG,

    /**
     * Following a cash return, on a deposit operation, the consumer forgot to take the returned notes, causing them to be retracted. The number of notes retracted is unknown.
     * 
     */
    DCFG,

    /**
     * Following cheques being returned, on a cheque deposit operation, the consumer forgot to take the returned cheques, causing them to be retracted. The number of cheques retracted is unknown.
     * 
     */
    CQFG,

    /**
     * Following a cash return, on a deposit operation, the consumer forgot to take the returned notes, causing them to be retracted. The number of notes retracted is known as the device was able to count the notes retracted.
     * 
     */
    DFGC,

    /**
     * Following a cash dispense operation the consumer forgot to take the returned notes, which have subsequently been retracted following a Present time-out. The number of notes retracted is known as the device was able to count the notes retracted.
     * 
     */
    CFGC,

    /**
     * Following cheques being returned, on a cheque deposit operation, the consumer forgot to take the returned cheques, causing them to be retracted. The number of cheques retracted is known as the device was able to count the cheques retracted.
     * 
     */
    QFGC,

    /**
     * Cheques have been retained by the terminal since it has been unable to return them.
     * 
     */
    CQRT,

    /**
     * Cash has been retained by the terminal since it has been unable to return it.
     * 
     */
    DCRT,

    /**
     * The ATM has restarted.
     * 
     */
    RSTR;

    public String value() {
        return name();
    }

    public static FailureReason9Code fromValue(String v) {
        return valueOf(v);
    }

}
