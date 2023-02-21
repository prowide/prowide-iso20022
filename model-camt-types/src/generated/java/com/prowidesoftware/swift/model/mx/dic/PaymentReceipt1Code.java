
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentReceipt1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentReceipt1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAYM"/&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentReceipt1Code")
@XmlEnum
public enum PaymentReceipt1Code {


    /**
     * Operation is a payment.
     * 
     */
    PAYM,

    /**
     * Operation is a receipt.
     * 
     */
    RECE,

    /**
     * Operation is null.
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static PaymentReceipt1Code fromValue(String v) {
        return valueOf(v);
    }

}
