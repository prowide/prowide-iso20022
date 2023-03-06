
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UKNW"/&gt;
 *     &lt;enumeration value="BYPS"/&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="FPIN"/&gt;
 *     &lt;enumeration value="CPSG"/&gt;
 *     &lt;enumeration value="PPSG"/&gt;
 *     &lt;enumeration value="MANU"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="SCRT"/&gt;
 *     &lt;enumeration value="SNCT"/&gt;
 *     &lt;enumeration value="SCNL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationMethod1Code")
@XmlEnum
public enum AuthenticationMethod1Code {


    /**
     * Authentication method is performed unknown.
     * 
     */
    UKNW,

    /**
     * Authentication bypassed by the merchant.
     * 
     */
    BYPS,

    /**
     * On-line PIN authentication (Personal Identification Number).
     * 
     */
    NPIN,

    /**
     * Off-line PIN authentication (Personal Identification Number).
     * 
     */
    FPIN,

    /**
     * Electronic signature capture (handwritten signature).
     * 
     */
    CPSG,

    /**
     * Handwritten paper signature.
     * 
     */
    PPSG,

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
     * Electronic commerce transaction secured with the X.509 certificate of a customer.
     * 
     */
    SCRT,

    /**
     * Secure electronic transaction without cardholder certificate.
     * 
     */
    SNCT,

    /**
     * Channel-encrypted transaction.
     * 
     */
    SCNL;

    public String value() {
        return name();
    }

    public static AuthenticationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
