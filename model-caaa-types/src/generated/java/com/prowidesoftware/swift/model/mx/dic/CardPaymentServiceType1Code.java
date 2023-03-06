
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAFT"/&gt;
 *     &lt;enumeration value="ORCR"/&gt;
 *     &lt;enumeration value="CRDP"/&gt;
 *     &lt;enumeration value="CSHB"/&gt;
 *     &lt;enumeration value="CSHW"/&gt;
 *     &lt;enumeration value="CSHD"/&gt;
 *     &lt;enumeration value="DEFR"/&gt;
 *     &lt;enumeration value="RESA"/&gt;
 *     &lt;enumeration value="LOAD"/&gt;
 *     &lt;enumeration value="RFND"/&gt;
 *     &lt;enumeration value="QUCH"/&gt;
 *     &lt;enumeration value="BALC"/&gt;
 *     &lt;enumeration value="CACT"/&gt;
 *     &lt;enumeration value="CAVR"/&gt;
 *     &lt;enumeration value="PINC"/&gt;
 *     &lt;enumeration value="VALC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType1Code")
@XmlEnum
public enum CardPaymentServiceType1Code {


    /**
     * Transfer of funds to and/or from a card account.
     * 
     */
    CAFT,

    /**
     * Original credit.
     * 
     */
    ORCR,

    /**
     * Card payment.
     * 
     */
    CRDP,

    /**
     * Card payment with cash-back.
     * 
     */
    CSHB,

    /**
     * Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.
     * 
     */
    CSHW,

    /**
     * Cash deposit.
     * 
     */
    CSHD,

    /**
     * Deferred payment.
     * 
     */
    DEFR,

    /**
     * Reservation (pre-authorisation).
     * 
     */
    RESA,

    /**
     * Loading or reloading non-financial account.
     * 
     */
    LOAD,

    /**
     * Refund transaction.
     * 
     */
    RFND,

    /**
     * Quasi-cash.
     * 
     */
    QUCH,

    /**
     * Balance enquiry.
     * 
     */
    BALC,

    /**
     * Card activation.
     * 
     */
    CACT,

    /**
     * Card verification.
     * 
     */
    CAVR,

    /**
     * PIN (Personal Identification Number) change.
     * 
     */
    PINC,

    /**
     * Card validity check.
     * 
     */
    VALC;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
