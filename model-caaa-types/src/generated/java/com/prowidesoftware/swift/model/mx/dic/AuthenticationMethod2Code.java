
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuthenticationMethod2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BYPS"/>
 *     <enumeration value="MANU"/>
 *     <enumeration value="MERC"/>
 *     <enumeration value="FPIN"/>
 *     <enumeration value="NPIN"/>
 *     <enumeration value="PPSG"/>
 *     <enumeration value="PSWD"/>
 *     <enumeration value="SCRT"/>
 *     <enumeration value="SCNL"/>
 *     <enumeration value="SNCT"/>
 *     <enumeration value="CPSG"/>
 *     <enumeration value="UKNW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AuthenticationMethod2Code")
@XmlEnum
public enum AuthenticationMethod2Code {


    /**
     * Authentication bypassed by the merchant.
     * 
     */
    BYPS,

    /**
     * Manual verification, for example passport or drivers license.
     * 
     */
    MANU,

    /**
     * Merchant-related authentication.
     * 
     */
    MERC,

    /**
     * Off-line PIN authentication (Personal Identification Number).
     * 
     */
    FPIN,

    /**
     * On-line PIN authentication (Personal Identification Number).
     * 
     */
    NPIN,

    /**
     * Handwritten paper signature.
     * 
     */
    PPSG,

    /**
     * Authentication by a password.
     * 
     */
    PSWD,

    /**
     * Electronic commerce transaction secured with the X.509 certificate of a customer.
     * 
     */
    SCRT,

    /**
     * Channel-encrypted transaction.
     * 
     */
    SCNL,

    /**
     * Secure electronic transaction without cardholder certificate.
     * 
     */
    SNCT,

    /**
     * Electronic signature capture (handwritten signature).
     * 
     */
    CPSG,

    /**
     * Authentication method is performed unknown.
     * 
     */
    UKNW;

    public String value() {
        return name();
    }

    public static AuthenticationMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
