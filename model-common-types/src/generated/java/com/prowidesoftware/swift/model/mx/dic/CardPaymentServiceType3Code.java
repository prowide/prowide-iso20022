
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IRES"/>
 *     <enumeration value="URES"/>
 *     <enumeration value="PRES"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="FREC"/>
 *     <enumeration value="RREC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
