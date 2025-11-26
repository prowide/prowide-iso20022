
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BALC"/>
 *     <enumeration value="CACT"/>
 *     <enumeration value="CRDP"/>
 *     <enumeration value="CAFH"/>
 *     <enumeration value="CAVR"/>
 *     <enumeration value="CSHW"/>
 *     <enumeration value="CSHD"/>
 *     <enumeration value="DEFR"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="ORCR"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="QUCH"/>
 *     <enumeration value="RFND"/>
 *     <enumeration value="RESA"/>
 *     <enumeration value="VALC"/>
 *     <enumeration value="UNLD"/>
 *     <enumeration value="CAFT"/>
 *     <enumeration value="CAFL"/>
 *     <enumeration value="PPMS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType16Code")
@XmlEnum
public enum CardPaymentServiceType16Code {


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
     * Used to inform the POI that it could select the payment instrument type to use.
     * 
     */
    PPMS;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType16Code fromValue(String v) {
        return valueOf(v);
    }

}
