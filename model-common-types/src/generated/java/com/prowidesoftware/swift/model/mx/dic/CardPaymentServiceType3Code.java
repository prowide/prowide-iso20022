
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IRES"/&gt;
 *     &lt;enumeration value="URES"/&gt;
 *     &lt;enumeration value="PRES"/&gt;
 *     &lt;enumeration value="ARES"/&gt;
 *     &lt;enumeration value="FREC"/&gt;
 *     &lt;enumeration value="RREC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType3Code")
@XmlEnum
public enum CardPaymentServiceType3Code {


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
    RREC;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
