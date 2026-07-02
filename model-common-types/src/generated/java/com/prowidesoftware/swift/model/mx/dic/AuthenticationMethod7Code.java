
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationMethod7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TOKA"/&gt;
 *     &lt;enumeration value="BIOM"/&gt;
 *     &lt;enumeration value="MOBL"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="FPIN"/&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="PSWD"/&gt;
 *     &lt;enumeration value="SCRT"/&gt;
 *     &lt;enumeration value="SCNL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
