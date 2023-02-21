
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityScheme1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMSecurityScheme1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPK"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="FRAN"/&gt;
 *     &lt;enumeration value="DTCH"/&gt;
 *     &lt;enumeration value="LUXG"/&gt;
 *     &lt;enumeration value="MANU"/&gt;
 *     &lt;enumeration value="PKIP"/&gt;
 *     &lt;enumeration value="SIGN"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
