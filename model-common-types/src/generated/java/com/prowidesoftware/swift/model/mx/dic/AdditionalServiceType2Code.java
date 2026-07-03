
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServiceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalServiceType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CACT"/&gt;
 *     &lt;enumeration value="CSHB"/&gt;
 *     &lt;enumeration value="DCCV"/&gt;
 *     &lt;enumeration value="INTP"/&gt;
 *     &lt;enumeration value="INTT"/&gt;
 *     &lt;enumeration value="LOYT"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PRST"/&gt;
 *     &lt;enumeration value="BALC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalServiceType2Code")
@XmlEnum
public enum AdditionalServiceType2Code {


    /**
     * Card activation
     * 
     */
    CACT,

    /**
     * Purchase of goods or services with cashback
     * 
     */
    CSHB,

    /**
     * Dynamic Currency Conversion (DCC)
     * 
     */
    DCCV,

    /**
     * Instant payment from a cardholder's account to an acceptor's account
     * 
     */
    INTP,

    /**
     * Instant transfer of funds from a payer's account to a payee's account.
     * 
     */
    INTT,

    /**
     * Loyalty services
     * 
     */
    LOYT,

    /**
     * Other type of additional service at national level
     * 
     */
    OTHN,

    /**
     * Other type of additional service at private level
     * 
     */
    OTHP,

    /**
     * Withdrawal transaction was pre-authorised by another channel (amount could be absent).
     * 
     */
    PRST,

    /**
     * Return the account balance with the transaction.
     * 
     */
    BALC;

    public String value() {
        return name();
    }

    public static AdditionalServiceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
