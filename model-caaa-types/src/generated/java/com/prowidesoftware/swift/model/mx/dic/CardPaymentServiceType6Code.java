
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGGR"/&gt;
 *     &lt;enumeration value="DCCV"/&gt;
 *     &lt;enumeration value="GRTT"/&gt;
 *     &lt;enumeration value="LOYT"/&gt;
 *     &lt;enumeration value="NRES"/&gt;
 *     &lt;enumeration value="PUCO"/&gt;
 *     &lt;enumeration value="RECP"/&gt;
 *     &lt;enumeration value="SOAF"/&gt;
 *     &lt;enumeration value="VCAU"/&gt;
 *     &lt;enumeration value="INSI"/&gt;
 *     &lt;enumeration value="INSA"/&gt;
 *     &lt;enumeration value="CSHB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
