
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObligationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ObligationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="NEW1"/>
 *     <enumeration value="COEV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ObligationType1Code")
@XmlEnum
public enum ObligationType1Code {


    /**
     * Specifies that the obligation is related to a failed trade.
     * 
     */
    FAIL("FAIL"),

    /**
     * Specifies that the obligation is related to new a trade.
     * 
     */
    @XmlEnumValue("NEW1")
    NEW_1("NEW1"),

    /**
     * Specifies that the obligation is related to a corporate event.
     * 
     */
    COEV("COEV");
    private final String value;

    ObligationType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObligationType1Code fromValue(String v) {
        for (ObligationType1Code c: ObligationType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
