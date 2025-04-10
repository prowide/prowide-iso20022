
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCodeLine1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CheckCodeLine1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CMC7"/>
 *     <enumeration value="E13B"/>
 *     <enumeration value="OCRA"/>
 *     <enumeration value="OCRB"/>
 *     <enumeration value="OCRF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CheckCodeLine1Code")
@XmlEnum
public enum CheckCodeLine1Code {


    /**
     * Magnetic ink character digitally encoded with 7 sticks.
     * 
     */
    @XmlEnumValue("CMC7")
    CMC_7("CMC7"),

    /**
     * Magnetic ink character recognition., conform to ISO 1004.
     * 
     */
    @XmlEnumValue("E13B")
    E_13_B("E13B"),

    /**
     * Optical character recognition font A, conform to ANSI X3.17: 1981.
     * 
     */
    OCRA("OCRA"),

    /**
     * Optical character recognition font B, conform to ANSI X3.49: 1975.
     * 
     */
    OCRB("OCRB"),

    /**
     * Default optical character recognition used.
     * 
     */
    OCRF("OCRF");
    private final String value;

    CheckCodeLine1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckCodeLine1Code fromValue(String v) {
        for (CheckCodeLine1Code c: CheckCodeLine1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
