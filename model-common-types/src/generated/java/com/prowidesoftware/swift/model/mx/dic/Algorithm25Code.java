
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm25Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Algorithm25Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERS2"/&gt;
 *     &lt;enumeration value="ERS1"/&gt;
 *     &lt;enumeration value="RPSS"/&gt;
 *     &lt;enumeration value="ERS3"/&gt;
 *     &lt;enumeration value="ED32"/&gt;
 *     &lt;enumeration value="ED33"/&gt;
 *     &lt;enumeration value="ED35"/&gt;
 *     &lt;enumeration value="ED23"/&gt;
 *     &lt;enumeration value="ED25"/&gt;
 *     &lt;enumeration value="ES22"/&gt;
 *     &lt;enumeration value="ES32"/&gt;
 *     &lt;enumeration value="ES33"/&gt;
 *     &lt;enumeration value="ES35"/&gt;
 *     &lt;enumeration value="ES23"/&gt;
 *     &lt;enumeration value="ES25"/&gt;
 *     &lt;enumeration value="ED22"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm25Code")
@XmlEnum
public enum Algorithm25Code {


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
     * Signature algorithms with RSA, using SHA3-256 digest algorithm. (ASN.1 Object Identifier: id-rsassa-pkcs1-v1-5-with-sha3-256).
     * 
     */
    @XmlEnumValue("ERS3")
    ERS_3("ERS3"),

    /**
     * Elliptic Curve Digital Signature Algorithm coupled with SHA3-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ED32")
    ED_32("ED32"),

    /**
     * Elliptic Curve Digital Signature Algorithm coupled with SHA3-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ED33")
    ED_33("ED33"),

    /**
     * Elliptic Curve Digital Signature Algorithm coupled with SHA2-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ED35")
    ED_35("ED35"),

    /**
     * Elliptic Curve Digital Signature Algorithm coupled with SHA2-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ED23")
    ED_23("ED23"),

    /**
     * Elliptic Curve Digital Signature Algorithm coupled with SHA2-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ED25")
    ED_25("ED25"),

    /**
     * Elliptic Curve Schnorr Digital Signature Algorithm coupled with SHA2-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ES22")
    ES_22("ES22"),

    /**
     * Elliptic Curve Schnorr Digital Signature Algorithm coupled with SHA3-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ES32")
    ES_32("ES32"),

    /**
     * Elliptic Curve Schnorr Digital Signature Algorithm coupled with SHA3-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ES33")
    ES_33("ES33"),

    /**
     * Elliptic Curve Schnorr Digital Signature Algorithm coupled with SHA2-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ES35")
    ES_35("ES35"),

    /**
     * Elliptic Curve Schnorr Digital Signature Algorithm coupled with SHA2-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ES23")
    ES_23("ES23"),

    /**
     * Elliptic Curve Schnorr Digital Signature Algorithm coupled with SHA2-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ES25")
    ES_25("ES25"),

    /**
     * Elliptic Curve Digital Signature Algorithm coupled with SHA2-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("ED22")
    ED_22("ED22");
    private final String value;

    Algorithm25Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm25Code fromValue(String v) {
        for (Algorithm25Code c: Algorithm25Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
