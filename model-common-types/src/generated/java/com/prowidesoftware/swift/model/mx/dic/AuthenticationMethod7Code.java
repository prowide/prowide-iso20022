
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuthenticationMethod7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TOKA"/>
 *     <enumeration value="BIOM"/>
 *     <enumeration value="MOBL"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="FPIN"/>
 *     <enumeration value="NPIN"/>
 *     <enumeration value="PSWD"/>
 *     <enumeration value="SCRT"/>
 *     <enumeration value="SCNL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AuthenticationMethod7Code")
@XmlEnum
public enum AuthenticationMethod7Code {


    /**
     * A token is used to verify an already performed authentication.
     * 
     */
    TOKA,

    /**
     * Biometric authentication of the cardholder.
     * 
     */
    BIOM,

    /**
     * Customer mobile device.
     * 
     */
    MOBL,

    /**
     * Other customer authentication.
     * 
     */
    OTHR,

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
    SCNL;

    public String value() {
        return name();
    }

    public static AuthenticationMethod7Code fromValue(String v) {
        return valueOf(v);
    }

}
