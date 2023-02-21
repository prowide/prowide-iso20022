
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashPaymentStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashPaymentStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PDNG"/&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashPaymentStatus2Code")
@XmlEnum
public enum CashPaymentStatus2Code {


    /**
     * The payment is awaiting settlement.
     * 
     */
    PDNG,

    /**
     * The payment has been settled or stopped.
     * 
     */
    FINL;

    public String value() {
        return name();
    }

    public static CashPaymentStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
