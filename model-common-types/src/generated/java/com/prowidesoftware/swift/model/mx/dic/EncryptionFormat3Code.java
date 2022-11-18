
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionFormat3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncryptionFormat3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TR34"/&gt;
 *     &lt;enumeration value="TR31"/&gt;
 *     &lt;enumeration value="CTCE"/&gt;
 *     &lt;enumeration value="CBCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncryptionFormat3Code")
@XmlEnum
public enum EncryptionFormat3Code {


    /**
     * Format of a cryptographic key specified by the ANSI X9 TR-34 standard.
     * 
     */
    @XmlEnumValue("TR34")
    TR_34("TR34"),

    /**
     * Format of a cryptographic key specified by the ANSI X9 TR-31 standard.
     * 
     */
    @XmlEnumValue("TR31")
    TR_31("TR31"),

    /**
     * CTC encryption mode.
     * 
     */
    CTCE("CTCE"),

    /**
     * Cipher Block Chaining mode of encryption
     * 
     */
    CBCE("CBCE");
    private final String value;

    EncryptionFormat3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptionFormat3Code fromValue(String v) {
        for (EncryptionFormat3Code c: EncryptionFormat3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
