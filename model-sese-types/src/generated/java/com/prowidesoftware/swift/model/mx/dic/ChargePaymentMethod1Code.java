
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargePaymentMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargePaymentMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="UNIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
