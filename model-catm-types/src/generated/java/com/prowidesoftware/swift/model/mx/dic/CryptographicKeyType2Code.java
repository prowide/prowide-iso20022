
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicKeyType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CryptographicKeyType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AES2"/&gt;
 *     &lt;enumeration value="EDE3"/&gt;
 *     &lt;enumeration value="DKP9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CryptographicKeyType2Code")
@XmlEnum
public enum CryptographicKeyType2Code {


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
    DKP_9("DKP9");
    private final String value;

    CryptographicKeyType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CryptographicKeyType2Code fromValue(String v) {
        for (CryptographicKeyType2Code c: CryptographicKeyType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
