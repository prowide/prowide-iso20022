
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MACC"/>
 *     <enumeration value="MCCS"/>
 *     <enumeration value="UKPT"/>
 *     <enumeration value="DKPT"/>
 *     <enumeration value="E3DC"/>
 *     <enumeration value="HS25"/>
 *     <enumeration value="ERS2"/>
 *     <enumeration value="ERSA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm1Code")
@XmlEnum
public enum Algorithm1Code {


    /**
     * Retail CBC (Chaining Block Cypher) MAC (Message Authentication Code) (cf. ISO 9807, ANSI X9.19) - (ASN.1 Object Identifier: id-retail-cbc-mac).
     * 
     */
    MACC("MACC"),

    /**
     * Retail-CBC-MAC with SHA-256 (Secure HAsh standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-256).
     * 
     */
    MCCS("MCCS"),

    /**
     * UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap).
     * 
     */
    UKPT("UKPT"),

    /**
     * DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2004, Annex A, and ISO/DIS 13492-2006. - (ASN.1 Object Identifier: id-dukpt-wrap).
     * 
     */
    DKPT("DKPT"),

    /**
     * Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).
     * 
     */
    @XmlEnumValue("E3DC")
    E_3_DC("E3DC"),

    /**
     * Message digest algorithm SHA-256 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha256).
     * 
     */
    @XmlEnumValue("HS25")
    HS_25("HS25"),

    /**
     * Signature algorithms with RSA, using SHA-256 digest algorithm - (ASN.1 Object Identifier: sha256WithRSAEncryption).
     * 
     */
    @XmlEnumValue("ERS2")
    ERS_2("ERS2"),

    /**
     * RSA encryption algorithm - (ASN.1 Object Identifier: rsaEncryption).
     * 
     */
    ERSA("ERSA");
    private final String value;

    Algorithm1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm1Code fromValue(String v) {
        for (Algorithm1Code c: Algorithm1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
