
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationResult1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DENY"/&gt;
 *     &lt;enumeration value="MRCH"/&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="CRPT"/&gt;
 *     &lt;enumeration value="UCRP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationResult1Code")
@XmlEnum
public enum AuthenticationResult1Code {


    /**
     * The authentication didn’t succeed.
     * 
     */
    DENY,

    /**
     * Merchant not enrolled in the authentication programme.
     * 
     */
    MRCH,

    /**
     * The card does not participate in the authentication programme.
     * 
     */
    CARD,

    /**
     * The authentication couldn’t be carried out.
     * 
     */
    AUTH,

    /**
     * Authentication succeeded with a cryptogram.
     * 
     */
    CRPT,

    /**
     * Authentication succeeded without a cryptogram.
     * 
     */
    UCRP;

    public String value() {
        return name();
    }

    public static AuthenticationResult1Code fromValue(String v) {
        return valueOf(v);
    }

}
