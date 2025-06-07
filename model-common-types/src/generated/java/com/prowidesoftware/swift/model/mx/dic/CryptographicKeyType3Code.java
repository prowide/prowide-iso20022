
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicKeyType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CryptographicKeyType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AES2"/&gt;
 *     &lt;enumeration value="EDE3"/&gt;
 *     &lt;enumeration value="DKP9"/&gt;
 *     &lt;enumeration value="AES9"/&gt;
 *     &lt;enumeration value="AES5"/&gt;
 *     &lt;enumeration value="EDE4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CryptographicKeyType3Code")
@XmlEnum
public enum CryptographicKeyType3Code {


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
    EDE_4("EDE4");
    private final String value;

    CryptographicKeyType3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CryptographicKeyType3Code fromValue(String v) {
        for (CryptographicKeyType3Code c: CryptographicKeyType3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
