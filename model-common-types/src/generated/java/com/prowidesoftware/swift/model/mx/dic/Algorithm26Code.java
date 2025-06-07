
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm26Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Algorithm26Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HS25"/&gt;
 *     &lt;enumeration value="HS38"/&gt;
 *     &lt;enumeration value="HS51"/&gt;
 *     &lt;enumeration value="HS01"/&gt;
 *     &lt;enumeration value="SH31"/&gt;
 *     &lt;enumeration value="SH32"/&gt;
 *     &lt;enumeration value="SH33"/&gt;
 *     &lt;enumeration value="SH35"/&gt;
 *     &lt;enumeration value="SHK1"/&gt;
 *     &lt;enumeration value="SHK2"/&gt;
 *     &lt;enumeration value="SMS3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm26Code")
@XmlEnum
public enum Algorithm26Code {


    /**
     * Message digest algorithm SHA-256 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha256).
     * 
     */
    @XmlEnumValue("HS25")
    HS_25("HS25"),

    /**
     * Message digest algorithm SHA-384 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha384).
     * 
     */
    @XmlEnumValue("HS38")
    HS_38("HS38"),

    /**
     * Message digest algorithm SHA-512 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha512).
     * 
     */
    @XmlEnumValue("HS51")
    HS_51("HS51"),

    /**
     * The DEPRECATED Message digest algorithm SHA-1 as defined in FIPS 180-1 - (ASN.1 Object Identifier: id-sha1).
     * 
     */
    @XmlEnumValue("HS01")
    HS_01("HS01"),

    /**
     * Message digest algorithm SHA3-224 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-224).
     * 
     */
    @XmlEnumValue("SH31")
    SH_31("SH31"),

    /**
     * Message digest algorithm SHA3-256 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-256).
     * 
     */
    @XmlEnumValue("SH32")
    SH_32("SH32"),

    /**
     * Message digest algorithm SHA3-384 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-384).
     * 
     */
    @XmlEnumValue("SH33")
    SH_33("SH33"),

    /**
     * Message digest algorithm SHA3-512 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-512).
     * 
     */
    @XmlEnumValue("SH35")
    SH_35("SH35"),

    /**
     * Message digest algorithm SHAKE-128 as defined in FIPS 202 - (ASN.1 Object Identifier: id-shake128).
     * 
     */
    @XmlEnumValue("SHK1")
    SHK_1("SHK1"),

    /**
     * Message digest algorithm SHAKE-256 as defined in FIPS 202 - (ASN.1 Object Identifier: id-shake256).
     * 
     */
    @XmlEnumValue("SHK2")
    SHK_2("SHK2"),

    /**
     * ShangMi 3 hash function as defined by ISO/IEC 10118-3:2018.
     * 
     */
    @XmlEnumValue("SMS3")
    SMS_3("SMS3");
    private final String value;

    Algorithm26Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm26Code fromValue(String v) {
        for (Algorithm26Code c: Algorithm26Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
