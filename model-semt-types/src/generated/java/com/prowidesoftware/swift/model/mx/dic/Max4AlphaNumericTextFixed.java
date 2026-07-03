
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Max4AlphaNumericText_fixed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Max4AlphaNumericText_fixed">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="T2S"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Max4AlphaNumericText_fixed")
@XmlEnum
public enum Max4AlphaNumericTextFixed {


    /**
     * T2S
     * 
     */
    @XmlEnumValue("T2S")
    T_2_S("T2S");
    private final String value;

    Max4AlphaNumericTextFixed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Max4AlphaNumericTextFixed fromValue(String v) {
        for (Max4AlphaNumericTextFixed c: Max4AlphaNumericTextFixed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
