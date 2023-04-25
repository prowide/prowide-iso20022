
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityScheme1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMSecurityScheme1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APPK"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="FRAN"/>
 *     <enumeration value="DTCH"/>
 *     <enumeration value="LUXG"/>
 *     <enumeration value="MANU"/>
 *     <enumeration value="PKIP"/>
 *     <enumeration value="SIGN"/>
 *     <enumeration value="NONE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMSecurityScheme1Code")
@XmlEnum
public enum ATMSecurityScheme1Code {


    /**
     * Application key download protected by a share symmetric key.
     * 
     */
    APPK,

    /**
     * Key download protected by asymmetric keys authenticated by a certificate.
     * 
     */
    CERT,

    /**
     * Key download conform to the French ATM key download security scheme.
     * 
     */
    FRAN,

    /**
     * Key download conform to the German ATM key download security scheme.
     * 
     */
    DTCH,

    /**
     * Key download conform to the Luxemburg ATM key download security scheme.
     * 
     */
    LUXG,

    /**
     * Manual key entry on the ATM.
     * 
     */
    MANU,

    /**
     * Key download protected by asymmetric keys authenticated by a PKI (Public Key Infrastructure).
     * 
     */
    PKIP,

    /**
     * Key download protected by asymmetric keys authenticated by a digital signature.
     * 
     */
    SIGN,

    /**
     * No key exchange performed, no security scheme defined.
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static ATMSecurityScheme1Code fromValue(String v) {
        return valueOf(v);
    }

}
