
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedPaymentOption2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportedPaymentOption2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="MSRV"/&gt;
 *     &lt;enumeration value="INSI"/&gt;
 *     &lt;enumeration value="PINQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupportedPaymentOption2Code")
@XmlEnum
public enum SupportedPaymentOption2Code {


    /**
     * The entity supports a partial approval of the payment transaction.
     * 
     */
    PART,

    /**
     * The entity supports the approval of the payment service along with the decline of additional requested services (as cash-back).
     * 
     */
    MSRV,

    /**
     * The sender support IssuerInstalment proposals to the Cardholder.
     * 
     */
    INSI,

    /**
     * The sender is able to support Single Tap transaction.
     * 
     */
    PINQ;

    public String value() {
        return name();
    }

    public static SupportedPaymentOption2Code fromValue(String v) {
        return valueOf(v);
    }

}
