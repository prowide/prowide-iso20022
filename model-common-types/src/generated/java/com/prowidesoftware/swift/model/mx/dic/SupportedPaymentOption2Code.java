
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedPaymentOption2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SupportedPaymentOption2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PART"/>
 *     <enumeration value="MSRV"/>
 *     <enumeration value="INSI"/>
 *     <enumeration value="PINQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
