
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionFormat2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncryptionFormat2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TR31"/&gt;
 *     &lt;enumeration value="TR34"/&gt;
 *     &lt;enumeration value="I238"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncryptionFormat2Code")
@XmlEnum
public enum EncryptionFormat2Code {


    /**
     * Format of a cryptographic key specified by the ANSI X9 TR-31 standard.
     * 
     */
    @XmlEnumValue("TR31")
    TR_31("TR31"),

    /**
     * Format of a cryptographic key specified by the ANSI X9 TR-34 standard.
     * 
     */
    @XmlEnumValue("TR34")
    TR_34("TR34"),

    /**
     * Format of a cryptographic key specified by the ISO20038 standard.
     * 
     */
    @XmlEnumValue("I238")
    I_238("I238");
    private final String value;

    EncryptionFormat2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptionFormat2Code fromValue(String v) {
        for (EncryptionFormat2Code c: EncryptionFormat2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
