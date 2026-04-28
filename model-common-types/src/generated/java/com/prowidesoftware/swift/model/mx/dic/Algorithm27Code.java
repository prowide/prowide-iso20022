
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm27Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Algorithm27Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MACC"/&gt;
 *     &lt;enumeration value="MCCS"/&gt;
 *     &lt;enumeration value="CMA1"/&gt;
 *     &lt;enumeration value="MCC1"/&gt;
 *     &lt;enumeration value="CMA9"/&gt;
 *     &lt;enumeration value="CMA5"/&gt;
 *     &lt;enumeration value="CMA2"/&gt;
 *     &lt;enumeration value="CM31"/&gt;
 *     &lt;enumeration value="CM32"/&gt;
 *     &lt;enumeration value="CM33"/&gt;
 *     &lt;enumeration value="MCS3"/&gt;
 *     &lt;enumeration value="CCA1"/&gt;
 *     &lt;enumeration value="CCA2"/&gt;
 *     &lt;enumeration value="CCA3"/&gt;
 *     &lt;enumeration value="S34C"/&gt;
 *     &lt;enumeration value="S34R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm27Code")
@XmlEnum
public enum Algorithm27Code {


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
     * The DEPRECATED Retail-CBC-MAC with SHA-1 (Secure Hash standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-1).
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
    CMA_5("CMA5"),

    /**
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message.
     * 
     */
    @XmlEnumValue("CMA2")
    CMA_2("CMA2"),

    /**
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-256 digest of the message.
     * 
     */
    @XmlEnumValue("CM31")
    CM_31("CM31"),

    /**
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-384 digest of the message.
     * 
     */
    @XmlEnumValue("CM32")
    CM_32("CM32"),

    /**
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-512 digest of the message.
     * 
     */
    @XmlEnumValue("CM33")
    CM_33("CM33"),

    /**
     *  3DES CBC-MAC with SHA3-256 (SecureHAsh standard) and ISO/IEC9797-1 method 2 padding.
     * 
     */
    @XmlEnumValue("MCS3")
    MCS_3("MCS3"),

    /**
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("CCA1")
    CCA_1("CCA1"),

    /**
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("CCA2")
    CCA_2("CCA2"),

    /**
     * CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("CCA3")
    CCA_3("CCA3"),

    /**
     * ShangMi 4 enciphering method used in CBC mode coupled with ShangMi 3 hash function.
     * 
     */
    @XmlEnumValue("S34C")
    S_34_C("S34C"),

    /**
     * ShangMi 4 enciphering method used in CTR mode coupled with ShangMi 3 hash function.
     * 
     */
    @XmlEnumValue("S34R")
    S_34_R("S34R");
    private final String value;

    Algorithm27Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm27Code fromValue(String v) {
        for (Algorithm27Code c: Algorithm27Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
