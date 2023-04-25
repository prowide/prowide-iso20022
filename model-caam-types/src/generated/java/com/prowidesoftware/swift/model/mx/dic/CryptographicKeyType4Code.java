
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicKeyType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CryptographicKeyType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APPL"/>
 *     <enumeration value="DATA"/>
 *     <enumeration value="DYNC"/>
 *     <enumeration value="KENC"/>
 *     <enumeration value="MACK"/>
 *     <enumeration value="PINK"/>
 *     <enumeration value="WRKG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
