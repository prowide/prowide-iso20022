
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedPaymentOption1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportedPaymentOption1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="MSRV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupportedPaymentOption1Code")
@XmlEnum
public enum SupportedPaymentOption1Code {


    /**
     * The entity supports a partial approval of the payment transaction.
     * 
     */
    PART,

    /**
     * The entity supports the approval of the payment service along with the decline of additional requested services (as cash-back).
     * 
     */
    MSRV;

    public String value() {
        return name();
    }

    public static SupportedPaymentOption1Code fromValue(String v) {
        return valueOf(v);
    }

}
