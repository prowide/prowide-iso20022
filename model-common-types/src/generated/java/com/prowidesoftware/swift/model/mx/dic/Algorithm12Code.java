
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Algorithm12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MACC"/&gt;
 *     &lt;enumeration value="MCCS"/&gt;
 *     &lt;enumeration value="CMA1"/&gt;
 *     &lt;enumeration value="MCC1"/&gt;
 *     &lt;enumeration value="CMA9"/&gt;
 *     &lt;enumeration value="CMA5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm12Code")
@XmlEnum
public enum Algorithm12Code {


    /**
     * Retail CBC (Chaining Block Cypher) MAC (Message Authentication Code) (cf. ISO 9807, ANSI X9.19) - (ASN.1 Object Identifier: id-retail-cbc-mac).
     * 
     */
    MACC("MACC"),

    /**
     * Retail-CBC-MAC with SHA-256 (Secure HAsh standard)  - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-256).
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
     * Retail-CBC-MAC with SHA-1 (Secure Hash standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-1).
     * 
     */
    @XmlEnumValue("MCC1")
    MCC_1("MCC1"),

    /**
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-384 digest of the message.
     * 
     */
    @XmlEnumValue("CMA9")
    CMA_9("CMA9"),

    /**
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-512 digest of the message.
     * 
     */
    @XmlEnumValue("CMA5")
    CMA_5("CMA5");
    private final String value;

    Algorithm12Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm12Code fromValue(String v) {
        for (Algorithm12Code c: Algorithm12Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
