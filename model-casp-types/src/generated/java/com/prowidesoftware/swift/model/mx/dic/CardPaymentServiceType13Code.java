
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRDP"/&gt;
 *     &lt;enumeration value="CSHW"/&gt;
 *     &lt;enumeration value="CSHD"/&gt;
 *     &lt;enumeration value="IRES"/&gt;
 *     &lt;enumeration value="DEFR"/&gt;
 *     &lt;enumeration value="URES"/&gt;
 *     &lt;enumeration value="PRES"/&gt;
 *     &lt;enumeration value="RECP"/&gt;
 *     &lt;enumeration value="INSP"/&gt;
 *     &lt;enumeration value="INSI"/&gt;
 *     &lt;enumeration value="RFND"/&gt;
 *     &lt;enumeration value="VCAU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
