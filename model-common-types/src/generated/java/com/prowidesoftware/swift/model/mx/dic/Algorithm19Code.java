
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm19Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Algorithm19Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERS2"/&gt;
 *     &lt;enumeration value="ERS1"/&gt;
 *     &lt;enumeration value="RPSS"/&gt;
 *     &lt;enumeration value="ECC5"/&gt;
 *     &lt;enumeration value="ECC1"/&gt;
 *     &lt;enumeration value="ECC4"/&gt;
 *     &lt;enumeration value="ECC2"/&gt;
 *     &lt;enumeration value="ECC3"/&gt;
 *     &lt;enumeration value="ERS3"/&gt;
 *     &lt;enumeration value="ECP2"/&gt;
 *     &lt;enumeration value="ECP3"/&gt;
 *     &lt;enumeration value="ECP5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm19Code")
@XmlEnum
public enum Algorithm19Code {


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
    RPSS("RPSS"),

    /**
     * Fifth Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.
     * 
     */
    @XmlEnumValue("ECC5")
    ECC_5("ECC5"),

    /**
     * First Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.
     * 
     */
    @XmlEnumValue("ECC1")
    ECC_1("ECC1"),

    /**
     * Fourth Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.
     * 
     */
    @XmlEnumValue("ECC4")
    ECC_4("ECC4"),

    /**
     * Second Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.
     * 
     */
    @XmlEnumValue("ECC2")
    ECC_2("ECC2"),

    /**
     * Third Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.
     * 
     */
    @XmlEnumValue("ECC3")
    ECC_3("ECC3"),

    /**
     * Signature algorithms with RSA, using SHA3-256 digest algorithm. (ASN.1 Object Identifier: id-rsassa-pkcs1-v1-5-with-sha3-256).
     * 
     */
    @XmlEnumValue("ERS3")
    ERS_3("ERS3"),

    /**
     * Elliptic Curve Signature with the Curve P-256 as defined by the Federal Information Processing Standards (FIPS 186-4 - July, 2013 - Digital Signature Standard).
     * 
     */
    @XmlEnumValue("ECP2")
    ECP_2("ECP2"),

    /**
     * Elliptic Curve Signature with the Curve P-384 as defined by the Federal Information Processing Standards (FIPS 186-4 - July, 2013 - Digital Signature Standard).
     * 
     */
    @XmlEnumValue("ECP3")
    ECP_3("ECP3"),

    /**
     * Elliptic Curve Signature with the Curve P-512 as defined by the Federal Information Processing Standards (FIPS 186-4 - July, 2013 - Digital Signature Standard).
     * 
     */
    @XmlEnumValue("ECP5")
    ECP_5("ECP5");
    private final String value;

    Algorithm19Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm19Code fromValue(String v) {
        for (Algorithm19Code c: Algorithm19Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
