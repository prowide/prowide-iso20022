
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationMethod2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BYPS"/&gt;
 *     &lt;enumeration value="MANU"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="FPIN"/&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="PPSG"/&gt;
 *     &lt;enumeration value="PSWD"/&gt;
 *     &lt;enumeration value="SCRT"/&gt;
 *     &lt;enumeration value="SCNL"/&gt;
 *     &lt;enumeration value="SNCT"/&gt;
 *     &lt;enumeration value="CPSG"/&gt;
 *     &lt;enumeration value="UKNW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
