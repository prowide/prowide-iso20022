
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionFormat1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EncryptionFormat1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TR31"/>
 *     <enumeration value="TR34"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EncryptionFormat1Code")
@XmlEnum
public enum EncryptionFormat1Code {


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
    TR_34("TR34");
    private final String value;

    EncryptionFormat1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptionFormat1Code fromValue(String v) {
        for (EncryptionFormat1Code c: EncryptionFormat1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
