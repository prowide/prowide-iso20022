
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicKeyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CryptographicKeyType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DESC"/&gt;
 *     &lt;enumeration value="AESC"/&gt;
 *     &lt;enumeration value="RSAC"/&gt;
 *     &lt;enumeration value="ECCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CryptographicKeyType1Code")
@XmlEnum
public enum CryptographicKeyType1Code {


    /**
     * Data encryption standard.
     * 
     */
    DESC,

    /**
     * Advanced encryption standard.
     * 
     */
    AESC,

    /**
     * Rivest, Shamir and Adleman.
     * 
     */
    RSAC,

    /**
     * Elliptic-curve cryptography.
     * 
     */
    ECCC;

    public String value() {
        return name();
    }

    public static CryptographicKeyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
