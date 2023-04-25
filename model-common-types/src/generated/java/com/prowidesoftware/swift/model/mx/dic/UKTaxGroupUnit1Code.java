
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UKTaxGroupUnit1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UKTaxGroupUnit1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GRP1"/>
 *     <enumeration value="GRP2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UKTaxGroupUnit1Code")
@XmlEnum
public enum UKTaxGroupUnit1Code {


    /**
     * The units that were purchased prior to the last ex-div date.
     * 
     */
    @XmlEnumValue("GRP1")
    GRP_1("GRP1"),

    /**
     * The units that were purchased since the ex-div date, and that benefit from the tax exemption.
     * 
     */
    @XmlEnumValue("GRP2")
    GRP_2("GRP2");
    private final String value;

    UKTaxGroupUnit1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UKTaxGroupUnit1Code fromValue(String v) {
        for (UKTaxGroupUnit1Code c: UKTaxGroupUnit1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
