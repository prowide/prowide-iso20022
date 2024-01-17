
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IRES"/>
 *     <enumeration value="URES"/>
 *     <enumeration value="PRES"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="FREC"/>
 *     <enumeration value="RREC"/>
 *     <enumeration value="GOPT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
