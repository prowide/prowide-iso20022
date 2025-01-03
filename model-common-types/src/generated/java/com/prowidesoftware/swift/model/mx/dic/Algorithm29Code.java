
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm29Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm29Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ERS2"/>
 *     <enumeration value="ERS1"/>
 *     <enumeration value="RPSS"/>
 *     <enumeration value="ERS3"/>
 *     <enumeration value="ED32"/>
 *     <enumeration value="ED33"/>
 *     <enumeration value="ED35"/>
 *     <enumeration value="ED23"/>
 *     <enumeration value="ED25"/>
 *     <enumeration value="ES22"/>
 *     <enumeration value="ES32"/>
 *     <enumeration value="ES33"/>
 *     <enumeration value="ES35"/>
 *     <enumeration value="ES23"/>
 *     <enumeration value="ES25"/>
 *     <enumeration value="ED22"/>
 *     <enumeration value="EF32"/>
 *     <enumeration value="EF22"/>
 *     <enumeration value="EF33"/>
 *     <enumeration value="EF35"/>
 *     <enumeration value="EF23"/>
 *     <enumeration value="EO33"/>
 *     <enumeration value="EF25"/>
 *     <enumeration value="EO32"/>
 *     <enumeration value="EO22"/>
 *     <enumeration value="EO35"/>
 *     <enumeration value="EO23"/>
 *     <enumeration value="EO25"/>
 *     <enumeration value="DD22"/>
 *     <enumeration value="DD32"/>
 *     <enumeration value="DD33"/>
 *     <enumeration value="DD35"/>
 *     <enumeration value="DD23"/>
 *     <enumeration value="DD25"/>
 *     <enumeration value="SM22"/>
 *     <enumeration value="SM33"/>
 *     <enumeration value="SM32"/>
 *     <enumeration value="SM35"/>
 *     <enumeration value="SM23"/>
 *     <enumeration value="SM25"/>
 *     <enumeration value="S2S3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm29Code")
@XmlEnum
public enum Algorithm29Code {


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
    ED_22("ED22"),

    /**
     * Elliptic Curve Full Schnorr Digital Signature Algorithm coupled with SHA3-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EF32")
    EF_32("EF32"),

    /**
     * Elliptic Curve Full Schnorr Digital Signature Algorithm coupled with SHA2-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EF22")
    EF_22("EF22"),

    /**
     * Elliptic Curve Full Schnorr Digital Signature Algorithm coupled with SHA3-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EF33")
    EF_33("EF33"),

    /**
     * Elliptic Curve Full Schnorr Digital Signature Algorithm coupled with SHA3-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EF35")
    EF_35("EF35"),

    /**
     * Elliptic Curve Full Schnorr Digital Signature Algorithm coupled with SHA2-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EF23")
    EF_23("EF23"),

    /**
     * Elliptic Curve Optimised Schnorr Digital Signature Algorithm coupled with SHA3-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EO33")
    EO_33("EO33"),

    /**
     * Elliptic Curve Full Schnorr Digital Signature Algorithm coupled with SHA2-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EF25")
    EF_25("EF25"),

    /**
     * Elliptic Curve Optimised Schnorr Digital Signature Algorithm coupled with SHA3-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EO32")
    EO_32("EO32"),

    /**
     * Elliptic Curve Optimised Schnorr Digital Signature Algorithm coupled with SHA2-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EO22")
    EO_22("EO22"),

    /**
     * Elliptic Curve Optimised Schnorr Digital Signature Algorithm coupled with SHA3-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EO35")
    EO_35("EO35"),

    /**
     * Elliptic Curve Optimised Schnorr Digital Signature Algorithm coupled with SHA2-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EO23")
    EO_23("EO23"),

    /**
     * Elliptic Curve Optimised Schnorr Digital Signature Algorithm coupled with SHA2-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("EO25")
    EO_25("EO25"),

    /**
     * Edward Curve Digital Signature Algorithm coupled with SHA2-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("DD22")
    DD_22("DD22"),

    /**
     * Edward Curve Digital Signature Algorithm coupled with SHA3-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("DD32")
    DD_32("DD32"),

    /**
     * Edward Curve Digital Signature Algorithm coupled with SHA3-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("DD33")
    DD_33("DD33"),

    /**
     * Edward Curve Digital Signature Algorithm coupled with SHA3-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("DD35")
    DD_35("DD35"),

    /**
     * Edward Curve Digital Signature Algorithm coupled with SHA2-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("DD23")
    DD_23("DD23"),

    /**
     * Edward Curve Digital Signature Algorithm coupled with SHA2-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("DD25")
    DD_25("DD25"),

    /**
     * ShangMi2 Elliptic Curve Digital Signature Algorithm coupled with SHA2-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("SM22")
    SM_22("SM22"),

    /**
     * ShangMi2 Elliptic Curve Digital Signature Algorithm coupled with SHA3-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("SM33")
    SM_33("SM33"),

    /**
     * ShangMi2 Elliptic Curve Digital Signature Algorithm coupled with SHA3-256 Digest Algorithm.
     * 
     */
    @XmlEnumValue("SM32")
    SM_32("SM32"),

    /**
     * ShangMi2 Elliptic Curve Digital Signature Algorithm coupled with SHA3-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("SM35")
    SM_35("SM35"),

    /**
     * ShangMi2 Elliptic Curve Digital Signature Algorithm coupled with SHA2-384 Digest Algorithm.
     * 
     */
    @XmlEnumValue("SM23")
    SM_23("SM23"),

    /**
     * ShangMi2 Elliptic Curve Digital Signature Algorithm coupled with SHA2-512 Digest Algorithm.
     * 
     */
    @XmlEnumValue("SM25")
    SM_25("SM25"),

    /**
     * ShangMi2 Elliptic Curve Digital Signature Algorithm coupled with ShangMi3 Digest Algorithm.
     * 
     */
    @XmlEnumValue("S2S3")
    S_2_S_3("S2S3");
    private final String value;

    Algorithm29Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm29Code fromValue(String v) {
        for (Algorithm29Code c: Algorithm29Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
