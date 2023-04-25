
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ERS2"/>
 *     <enumeration value="ERS1"/>
 *     <enumeration value="RPSS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm14Code")
@XmlEnum
public enum Algorithm14Code {


    /**
     * Signature algorithms with RSA, using SHA-256 digest algorithm - (ASN.1 Object Identifier: sha256WithRSAEncryption).
     * 
     */
    @XmlEnumValue("ERS2")
    ERS_2("ERS2"),

    /**
     * The DEPRECATED Signature algorithms with RSA (PKCS #1 version 2.1), using SHA-1 digest algorithm - (ASN.1 Object Identifier: sha1WithRSAEncryption).
     * 
     */
    @XmlEnumValue("ERS1")
    ERS_1("ERS1"),

    /**
     * Signature algorithm with Appendix, Probabilistic Signature Scheme (PKCS #1 version 2.1), - (ASN.1 Object Identifier: id-RSASSA-PSS).
     * 
     */
    RPSS("RPSS");
    private final String value;

    Algorithm14Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm14Code fromValue(String v) {
        for (Algorithm14Code c: Algorithm14Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
