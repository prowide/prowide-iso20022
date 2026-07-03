
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BytePadding1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BytePadding1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LNGT"/&gt;
 *     &lt;enumeration value="NUL8"/&gt;
 *     &lt;enumeration value="NULG"/&gt;
 *     &lt;enumeration value="NULL"/&gt;
 *     &lt;enumeration value="RAND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BytePadding1Code")
@XmlEnum
public enum BytePadding1Code {


    /**
     * Message to encrypt is completed by a byte value containing the total number of added bytes.
     * 
     */
    LNGT("LNGT"),

    /**
     * Message to encrypt is completed by one bit of value 1, followed by null bits until the encryption block length is reached.
     * 
     */
    @XmlEnumValue("NUL8")
    NUL_8("NUL8"),

    /**
     * Message to encrypt is completed by null byte values, the last byte containing the total number of added bytes.
     * 
     */
    NULG("NULG"),

    /**
     * Message to encrypt is completed by null bytes.
     * 
     */
    NULL("NULL"),

    /**
     * Message to encrypt is completed by random value, the last byte containing the total number of added bytes.
     * 
     */
    RAND("RAND");
    private final String value;

    BytePadding1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BytePadding1Code fromValue(String v) {
        for (BytePadding1Code c: BytePadding1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
