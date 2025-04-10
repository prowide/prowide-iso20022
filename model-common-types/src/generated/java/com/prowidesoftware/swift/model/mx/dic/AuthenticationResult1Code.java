
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuthenticationResult1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DENY"/>
 *     <enumeration value="MRCH"/>
 *     <enumeration value="CARD"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="CRPT"/>
 *     <enumeration value="UCRP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
