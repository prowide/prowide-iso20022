
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargePaymentMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChargePaymentMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="UNIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChargePaymentMethod1Code")
@XmlEnum
public enum ChargePaymentMethod1Code {


    /**
     * Payment is with cash.
     * 
     */
    CASH,

    /**
     * Units are redeemed to cover payment.
     * 
     */
    UNIT;

    public String value() {
        return name();
    }

    public static ChargePaymentMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
