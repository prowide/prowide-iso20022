
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BytePadding1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BytePadding1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LNGT"/>
 *     <enumeration value="NUL8"/>
 *     <enumeration value="NULG"/>
 *     <enumeration value="NULL"/>
 *     <enumeration value="RAND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
