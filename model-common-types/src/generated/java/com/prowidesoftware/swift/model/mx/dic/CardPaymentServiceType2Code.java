
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGGR"/>
 *     <enumeration value="DCCV"/>
 *     <enumeration value="GRTT"/>
 *     <enumeration value="INSP"/>
 *     <enumeration value="LOYT"/>
 *     <enumeration value="NRES"/>
 *     <enumeration value="PUCO"/>
 *     <enumeration value="RECP"/>
 *     <enumeration value="SOAF"/>
 *     <enumeration value="UNAF"/>
 *     <enumeration value="VCAU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType2Code")
@XmlEnum
public enum CardPaymentServiceType2Code {


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
     * Instalment payment.
     * 
     */
    INSP,

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
     * Unsolicited available funds.
     * 
     */
    UNAF,

    /**
     * Voice authorisation.
     * 
     */
    VCAU;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
