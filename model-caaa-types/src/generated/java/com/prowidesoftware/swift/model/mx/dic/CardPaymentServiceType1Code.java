
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAFT"/>
 *     <enumeration value="ORCR"/>
 *     <enumeration value="CRDP"/>
 *     <enumeration value="CSHB"/>
 *     <enumeration value="CSHW"/>
 *     <enumeration value="CSHD"/>
 *     <enumeration value="DEFR"/>
 *     <enumeration value="RESA"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="RFND"/>
 *     <enumeration value="QUCH"/>
 *     <enumeration value="BALC"/>
 *     <enumeration value="CACT"/>
 *     <enumeration value="CAVR"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="VALC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
