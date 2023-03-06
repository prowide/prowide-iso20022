
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BALC"/&gt;
 *     &lt;enumeration value="CACT"/&gt;
 *     &lt;enumeration value="CRDP"/&gt;
 *     &lt;enumeration value="CAFH"/&gt;
 *     &lt;enumeration value="CAVR"/&gt;
 *     &lt;enumeration value="CSHW"/&gt;
 *     &lt;enumeration value="CSHD"/&gt;
 *     &lt;enumeration value="DEFR"/&gt;
 *     &lt;enumeration value="LOAD"/&gt;
 *     &lt;enumeration value="ORCR"/&gt;
 *     &lt;enumeration value="PINC"/&gt;
 *     &lt;enumeration value="QUCH"/&gt;
 *     &lt;enumeration value="RFND"/&gt;
 *     &lt;enumeration value="RESA"/&gt;
 *     &lt;enumeration value="VALC"/&gt;
 *     &lt;enumeration value="UNLD"/&gt;
 *     &lt;enumeration value="CAFT"/&gt;
 *     &lt;enumeration value="CAFL"/&gt;
 *     &lt;enumeration value="CIDD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType12Code")
@XmlEnum
public enum CardPaymentServiceType12Code {


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
     * Card payment.
     * 
     */
    CRDP,

    /**
     * Transfer of funds to a card or an account.
     * 
     */
    CAFH,

    /**
     * Card verification.
     * 
     */
    CAVR,

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
     * Loading or reloading non-financial account.
     * 
     */
    LOAD,

    /**
     * Original credit.
     * 
     */
    ORCR,

    /**
     * PIN (Personal Identification Number) change.
     * 
     */
    PINC,

    /**
     * Quasi-cash.
     * 
     */
    QUCH,

    /**
     * Refund transaction.
     * 
     */
    RFND,

    /**
     * Reservation (pre-authorisation).
     * 
     */
    RESA,

    /**
     * Card validity check.
     * 
     */
    VALC,

    /**
     * Unloading non-financial account.
     * 
     */
    UNLD,

    /**
     * Transfer of funds to and/or from a card account.
     * 
     */
    CAFT,

    /**
     * Transfer of funds from a card or an account.
     * 
     */
    CAFL,

    /**
     * Direct Debit initiated by Card.
     * 
     */
    CIDD;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType12Code fromValue(String v) {
        return valueOf(v);
    }

}
