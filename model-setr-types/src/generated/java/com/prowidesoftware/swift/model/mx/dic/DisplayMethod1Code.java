
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DisplayMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INIT"/>
 *     <enumeration value="NEW1"/>
 *     <enumeration value="RAND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DisplayMethod1Code")
@XmlEnum
public enum DisplayMethod1Code {


    /**
     * Indicates that original quantity must be used.
     * 
     */
    INIT("INIT"),

    /**
     * Indicates that Quantity must be refreshed.
     * 
     */
    @XmlEnumValue("NEW1")
    NEW_1("NEW1"),

    /**
     * Randomize value.
     * 
     */
    RAND("RAND");
    private final String value;

    DisplayMethod1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisplayMethod1Code fromValue(String v) {
        for (DisplayMethod1Code c: DisplayMethod1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
