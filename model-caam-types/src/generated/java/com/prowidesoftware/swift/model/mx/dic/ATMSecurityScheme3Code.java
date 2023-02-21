
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityScheme3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMSecurityScheme3Code"&gt;
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
 *     &lt;enumeration value="TR34"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMSecurityScheme3Code")
@XmlEnum
public enum ATMSecurityScheme3Code {


    /**
     * Application key download protected by a share symmetric key.
     * 
     */
    APPK("APPK"),

    /**
     * Key download protected by asymmetric keys authenticated by a certificate.
     * 
     */
    CERT("CERT"),

    /**
     * Key download conform to the French ATM key download security scheme.
     * 
     */
    FRAN("FRAN"),

    /**
     * Key download conform to the German ATM key download security scheme.
     * 
     */
    DTCH("DTCH"),

    /**
     * Key download conform to the Luxemburg ATM key download security scheme.
     * 
     */
    LUXG("LUXG"),

    /**
     * Manual key entry on the ATM.
     * 
     */
    MANU("MANU"),

    /**
     * Key download protected by asymmetric keys authenticated by a PKI (Public Key Infrastructure).
     * 
     */
    PKIP("PKIP"),

    /**
     * Key download protected by asymmetric keys authenticated by a digital signature.
     * 
     */
    SIGN("SIGN"),

    /**
     * No key exchange performed, no security scheme defined.
     * 
     */
    NONE("NONE"),

    /**
     * ANSI X9 TR34 2012 scheme for the distribution of the symmetric public keys and the initial master key.
     * 
     */
    @XmlEnumValue("TR34")
    TR_34("TR34");
    private final String value;

    ATMSecurityScheme3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ATMSecurityScheme3Code fromValue(String v) {
        for (ATMSecurityScheme3Code c: ATMSecurityScheme3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
