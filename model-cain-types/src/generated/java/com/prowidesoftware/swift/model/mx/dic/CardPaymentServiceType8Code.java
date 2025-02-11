
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGGR"/>
 *     <enumeration value="CSHB"/>
 *     <enumeration value="CSWD"/>
 *     <enumeration value="DCCV"/>
 *     <enumeration value="GRTT"/>
 *     <enumeration value="INSA"/>
 *     <enumeration value="INSI"/>
 *     <enumeration value="LOYT"/>
 *     <enumeration value="NRES"/>
 *     <enumeration value="AUWS"/>
 *     <enumeration value="PFWD"/>
 *     <enumeration value="PUCO"/>
 *     <enumeration value="RECP"/>
 *     <enumeration value="SOAF"/>
 *     <enumeration value="SDWD"/>
 *     <enumeration value="VCAU"/>
 *     <enumeration value="NRFD"/>
 *     <enumeration value="INST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType8Code")
@XmlEnum
public enum CardPaymentServiceType8Code {


    /**
     * Aggregation of low payments.
     * 
     */
    AGGR,

    /**
     * Card payment with cash-back.
     * 
     */
    CSHB,

    /**
     * Amount and notes values are chosen by the customer.
     * 
     */
    CSWD,

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
     * Instalment payment transaction performed by the acceptor or the acquirer.
     * 
     */
    INSA,

    /**
     * Instalment payment transaction performed by the card issuer.
     * 
     */
    INSI,

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
     * Withdrawal transaction was pre-authorised by another channel (amount could be absent).
     * 
     */
    AUWS,

    /**
     * Amount and Notes Values are pre-defined by the customer profile.
     * 
     */
    PFWD,

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
     * Customer pressed a button associated with a withdrawal of unique amount and notes mix.
     * 
     */
    SDWD,

    /**
     * Voice authorisation.
     * 
     */
    VCAU,

    /**
     * Payment of goods or services which are not refundable, for instance low cost airline tickets.
     * 
     */
    NRFD,

    /**
     * Instant transaction.
     * 
     */
    INST;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType8Code fromValue(String v) {
        return valueOf(v);
    }

}
