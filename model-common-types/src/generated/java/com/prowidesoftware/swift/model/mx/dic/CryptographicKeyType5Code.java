
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicKeyType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CryptographicKeyType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AES2"/>
 *     <enumeration value="EDE3"/>
 *     <enumeration value="DKP9"/>
 *     <enumeration value="AES9"/>
 *     <enumeration value="AES5"/>
 *     <enumeration value="EDE4"/>
 *     <enumeration value="UKA2"/>
 *     <enumeration value="UKA6"/>
 *     <enumeration value="RSAC"/>
 *     <enumeration value="ECCC"/>
 *     <enumeration value="DKAE"/>
 *     <enumeration value="UKA8"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CryptographicKeyType5Code")
@XmlEnum
public enum CryptographicKeyType5Code {


    /**
     * AES (Advanced Encryption Standard) 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("AES2")
    AES_2("AES2"),

    /**
     * Data encryption standard key of 112 bits (without the parity bits).
     * 
     */
    @XmlEnumValue("EDE3")
    EDE_3("EDE3"),

    /**
     * DUKPT (Derived Unique Key Per Transaction) key, as specified in ANSI X9.24-2009 Annex A.
     * 
     */
    @XmlEnumValue("DKP9")
    DKP_9("DKP9"),

    /**
     * AES (Advanced Encryption Standard) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("AES9")
    AES_9("AES9"),

    /**
     * AES (Advanced Encryption Standard) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("AES5")
    AES_5("AES5"),

    /**
     * Data encryption standard key of 168 bits (without the parity bits).
     * 
     */
    @XmlEnumValue("EDE4")
    EDE_4("EDE4"),

    /**
     * UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("UKA2")
    UKA_2("UKA2"),

    /**
     * UKPT (Unique Key Per Transaction). Encryption key using AES (Advanced Encryption Standard) with a  256 bits length key. 
     * FIPS 197 - 6 November 2001).
     * 
     */
    @XmlEnumValue("UKA6")
    UKA_6("UKA6"),

    /**
     * Rivest, Shamir and Adleman.
     * 
     */
    RSAC("RSAC"),

    /**
     * Elliptic-curve cryptography.
     * 
     */
    ECCC("ECCC"),

    /**
     * DUKPT AES (Derived Unique Key Per Transaction) algorithm.
     * 
     */
    DKAE("DKAE"),

    /**
     * UKPT (Unique Key Per Transaction). Encryption key using AES (Advanced Encryption Standard) with a 128 bits length key. 
     * FIPS 197 - 6 November 2001).
     * 
     */
    @XmlEnumValue("UKA8")
    UKA_8("UKA8");
    private final String value;

    CryptographicKeyType5Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CryptographicKeyType5Code fromValue(String v) {
        for (CryptographicKeyType5Code c: CryptographicKeyType5Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
