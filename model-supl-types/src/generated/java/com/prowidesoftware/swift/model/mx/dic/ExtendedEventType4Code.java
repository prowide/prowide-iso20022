
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedEventType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExtendedEventType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TMTN"/>
 *     <enumeration value="FPAY"/>
 *     <enumeration value="CDRD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExtendedEventType4Code")
@XmlEnum
public enum ExtendedEventType4Code {


    /**
     * Security, usually a form of a derivative, for which the agent or issuer has decided to terminate the derivative based on a change to the underlying security(ies) or a change in strategy. Distinguishes from Mandatory Exchange, Exchange Offer event types mapped to the same ISO event type code.
     * 
     */
    TMTN,

    /**
     * Final distribution of principal due on a security, typically Collateralised Mortgage Obligations.
     * 
     */
    FPAY,

    /**
     * Feature of a security that allows an issuer to make a payment to the security holder. This event will be used for securities subject to redemptions other than those categorised as full and partial calls (for example early Certificate of Deposit redemptions).
     * 
     */
    CDRD;

    public String value() {
        return name();
    }

    public static ExtendedEventType4Code fromValue(String v) {
        return valueOf(v);
    }

}
