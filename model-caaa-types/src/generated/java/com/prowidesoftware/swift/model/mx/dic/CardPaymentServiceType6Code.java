
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGGR"/>
 *     <enumeration value="DCCV"/>
 *     <enumeration value="GRTT"/>
 *     <enumeration value="LOYT"/>
 *     <enumeration value="NRES"/>
 *     <enumeration value="PUCO"/>
 *     <enumeration value="RECP"/>
 *     <enumeration value="SOAF"/>
 *     <enumeration value="VCAU"/>
 *     <enumeration value="INSI"/>
 *     <enumeration value="INSA"/>
 *     <enumeration value="CSHB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType6Code")
@XmlEnum
public enum CardPaymentServiceType6Code {


    /**
     * Aggregation of low payments.
     * 
     */
    AGGR,

    /**
     * Dynamic currency conversion (DCC).
     * 
     */
    DCCV,

    /**
     * Card payment with gratuity.
     * 
     */
    GRTT,

    /**
     * Loyalty services.
     * 
     */
    LOYT,

    /**
     * No show after reservation.
     * 
     */
    NRES,

    /**
     * Purchase and corporate data.
     * 
     */
    PUCO,

    /**
     * Recurring payment.
     * 
     */
    RECP,

    /**
     * Solicited available funds.
     * 
     */
    SOAF,

    /**
     * Voice authorisation.
     * 
     */
    VCAU,

    /**
     * Instalment payment transaction performed by the card issuer.
     * 
     */
    INSI,

    /**
     * Instalment payment transaction performed by the acceptor or the acquirer.
     * 
     */
    INSA,

    /**
     * Card payment with cash-back.
     * 
     */
    CSHB;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType6Code fromValue(String v) {
        return valueOf(v);
    }

}
