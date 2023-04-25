
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MACC"/>
 *     <enumeration value="MCCS"/>
 *     <enumeration value="CMA1"/>
 *     <enumeration value="CMD1"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm3Code")
@XmlEnum
public enum Algorithm3Code {


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
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message.
     * 
     */
    @XmlEnumValue("CMA1")
    CMA_1("CMA1"),

    /**
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Triple DES with a double length key (112 Bit) as defined in FIPS PUB 46-3. The CMAC algorithm is computed on the SHA-256 digest of the message.
     * 
     */
    @XmlEnumValue("CMD1")
    CMD_1("CMD1");
    private final String value;

    Algorithm3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm3Code fromValue(String v) {
        for (Algorithm3Code c: Algorithm3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
