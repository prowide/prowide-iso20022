
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType14Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IRES"/&gt;
 *     &lt;enumeration value="URES"/&gt;
 *     &lt;enumeration value="PRES"/&gt;
 *     &lt;enumeration value="ARES"/&gt;
 *     &lt;enumeration value="FREC"/&gt;
 *     &lt;enumeration value="RREC"/&gt;
 *     &lt;enumeration value="GOPT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType14Code")
@XmlEnum
public enum CardPaymentServiceType14Code {


    /**
     * Initial reservation.
     * 
     */
    IRES,

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
     * Additional payment after reservation.
     * 
     */
    ARES,

    /**
     * Initial recurring payment.
     * 
     */
    FREC,

    /**
     * Repeat recurring payment.
     * 
     */
    RREC,

    /**
     * Acceptor claims for guarantee of payment.
     * 
     */
    GOPT;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType14Code fromValue(String v) {
        return valueOf(v);
    }

}
