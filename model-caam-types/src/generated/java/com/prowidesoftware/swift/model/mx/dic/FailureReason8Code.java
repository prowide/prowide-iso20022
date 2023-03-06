
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailureReason8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDRT"/&gt;
 *     &lt;enumeration value="CDCP"/&gt;
 *     &lt;enumeration value="CUCL"/&gt;
 *     &lt;enumeration value="CDFG"/&gt;
 *     &lt;enumeration value="MALF"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="SFRD"/&gt;
 *     &lt;enumeration value="UCPT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FailureReason8Code")
@XmlEnum
public enum FailureReason8Code {


    /**
     * Card has been retained by the ATM or the terminal.
     * 
     */
    CDRT,

    /**
     * ATM manager has requested to capture the card.
     * 
     */
    CDCP,

    /**
     * Customer cancellation, for example removing the card before the end of the transaction.
     * 
     */
    CUCL,

    /**
     * Customer has left the card in the ATM or a motorised card reader.
     * 
     */
    CDFG,

    /**
     * Suspected malfunction.
     * 
     */
    MALF,

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
     * Unable to capture the card as requested.
     * 
     */
    UCPT;

    public String value() {
        return name();
    }

    public static FailureReason8Code fromValue(String v) {
        return valueOf(v);
    }

}
