
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGGR"/&gt;
 *     &lt;enumeration value="CSHB"/&gt;
 *     &lt;enumeration value="CSWD"/&gt;
 *     &lt;enumeration value="DCCV"/&gt;
 *     &lt;enumeration value="GRTT"/&gt;
 *     &lt;enumeration value="INSA"/&gt;
 *     &lt;enumeration value="INSI"/&gt;
 *     &lt;enumeration value="LOYT"/&gt;
 *     &lt;enumeration value="NRES"/&gt;
 *     &lt;enumeration value="AUWS"/&gt;
 *     &lt;enumeration value="PFWD"/&gt;
 *     &lt;enumeration value="PUCO"/&gt;
 *     &lt;enumeration value="RECP"/&gt;
 *     &lt;enumeration value="SOAF"/&gt;
 *     &lt;enumeration value="SDWD"/&gt;
 *     &lt;enumeration value="VCAU"/&gt;
 *     &lt;enumeration value="NRFD"/&gt;
 *     &lt;enumeration value="INST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
