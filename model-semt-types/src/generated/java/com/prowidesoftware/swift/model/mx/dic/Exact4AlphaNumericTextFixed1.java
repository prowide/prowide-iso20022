
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exact4AlphaNumericText_fixed__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Exact4AlphaNumericText_fixed__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="T2S"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Exact4AlphaNumericText_fixed__1")
@XmlEnum
public enum Exact4AlphaNumericTextFixed1 {


    /**
     * T2S
     * 
     */
    @XmlEnumValue("T2S")
    T_2_S("T2S");
    private final String value;

    Exact4AlphaNumericTextFixed1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Exact4AlphaNumericTextFixed1 fromValue(String v) {
        for (Exact4AlphaNumericTextFixed1 c: Exact4AlphaNumericTextFixed1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
