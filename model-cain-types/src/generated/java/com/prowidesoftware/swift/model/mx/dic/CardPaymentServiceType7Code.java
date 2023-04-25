
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BALC"/>
 *     <enumeration value="CACT"/>
 *     <enumeration value="CRDP"/>
 *     <enumeration value="CAFT"/>
 *     <enumeration value="CAFL"/>
 *     <enumeration value="CAFH"/>
 *     <enumeration value="CAVR"/>
 *     <enumeration value="CSHW"/>
 *     <enumeration value="CSHD"/>
 *     <enumeration value="CHWD"/>
 *     <enumeration value="DEFR"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="ORCR"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="PINU"/>
 *     <enumeration value="QUCH"/>
 *     <enumeration value="RFND"/>
 *     <enumeration value="RESA"/>
 *     <enumeration value="UNLD"/>
 *     <enumeration value="VALC"/>
 *     <enumeration value="DADJ"/>
 *     <enumeration value="CADJ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType7Code")
@XmlEnum
public enum CardPaymentServiceType7Code {


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
     * Withdrawal of cash on an ATM.
     * 
     */
    CHWD,

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
     * Unblock the cardholder PIN.
     * 
     */
    PINU,

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
     * Unloading non-financial account.
     * 
     */
    UNLD,

    /**
     * Card validity check.
     * 
     */
    VALC,

    /**
     * Debit adjustment to a previous transaction.
     * 
     */
    DADJ,

    /**
     * Credit adjustment to a previous transaction.
     * 
     */
    CADJ;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType7Code fromValue(String v) {
        return valueOf(v);
    }

}
