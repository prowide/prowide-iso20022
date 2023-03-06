
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicKeyType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CryptographicKeyType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPL"/&gt;
 *     &lt;enumeration value="DATA"/&gt;
 *     &lt;enumeration value="DYNC"/&gt;
 *     &lt;enumeration value="KENC"/&gt;
 *     &lt;enumeration value="MACK"/&gt;
 *     &lt;enumeration value="PINK"/&gt;
 *     &lt;enumeration value="WRKG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CryptographicKeyType4Code")
@XmlEnum
public enum CryptographicKeyType4Code {


    /**
     * Key used to protect application information.
     * 
     */
    APPL,

    /**
     * Key used to protect data in the messages.
     * 
     */
    DATA,

    /**
     * Any cryptographic key that can be downloaded.
     * 
     */
    DYNC,

    /**
     * Key used to encrypt other keys.
     * 
     */
    KENC,

    /**
     * Key used to generate the MAC of a message.
     * 
     */
    MACK,

    /**
     * Key used to encrypt a PIN.
     * 
     */
    PINK,

    /**
     * Temporary key used to download keys.
     * 
     */
    WRKG;

    public String value() {
        return name();
    }

    public static CryptographicKeyType4Code fromValue(String v) {
        return valueOf(v);
    }

}
