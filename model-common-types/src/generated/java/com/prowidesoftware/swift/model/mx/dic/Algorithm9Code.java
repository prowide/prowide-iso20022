
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Algorithm9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EA2C"/&gt;
 *     &lt;enumeration value="E3DC"/&gt;
 *     &lt;enumeration value="DKP9"/&gt;
 *     &lt;enumeration value="UKPT"/&gt;
 *     &lt;enumeration value="UKA1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm9Code")
@XmlEnum
public enum Algorithm9Code {


    /**
     * AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("EA2C")
    EA_2_C("EA2C"),

    /**
     * Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).
     * 
     */
    @XmlEnumValue("E3DC")
    E_3_DC("E3DC"),

    /**
     * DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2009 Annex A.
     * 
     */
    @XmlEnumValue("DKP9")
    DKP_9("DKP9"),

    /**
     * UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap).
     * 
     */
    UKPT("UKPT"),

    /**
     * UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("UKA1")
    UKA_1("UKA1");
    private final String value;

    Algorithm9Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm9Code fromValue(String v) {
        for (Algorithm9Code c: Algorithm9Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
