
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRDP"/>
 *     <enumeration value="CSHW"/>
 *     <enumeration value="CSHD"/>
 *     <enumeration value="IRES"/>
 *     <enumeration value="DEFR"/>
 *     <enumeration value="URES"/>
 *     <enumeration value="PRES"/>
 *     <enumeration value="RECP"/>
 *     <enumeration value="INSP"/>
 *     <enumeration value="INSI"/>
 *     <enumeration value="RFND"/>
 *     <enumeration value="VCAU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType13Code")
@XmlEnum
public enum CardPaymentServiceType13Code {


    /**
     * Card payment.
     * 
     */
    CRDP,

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
     * Initial reservation.
     * 
     */
    IRES,

    /**
     * Deferred payment.
     * 
     */
    DEFR,

    /**
     * Update reservation.
     * 
     */
    URES,

    /**
     * Payment after reservation.
     * 
     */
    PRES,

    /**
     * Recurring payment.
     * 
     */
    RECP,

    /**
     * Instalment payment.
     * 
     */
    INSP,

    /**
     * Instalment payment transaction performed by the card issuer.
     * 
     */
    INSI,

    /**
     * Refund transaction.
     * 
     */
    RFND,

    /**
     * Voice authorisation.
     * 
     */
    VCAU;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType13Code fromValue(String v) {
        return valueOf(v);
    }

}
