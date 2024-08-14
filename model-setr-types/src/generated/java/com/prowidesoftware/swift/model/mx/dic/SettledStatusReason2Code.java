
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettledStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettledStatusReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CPST"/>
 *     <enumeration value="GATM"/>
 *     <enumeration value="GAT1"/>
 *     <enumeration value="UCPS"/>
 *     <enumeration value="UPST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettledStatusReason2Code")
@XmlEnum
public enum SettledStatusReason2Code {


    /**
     * Cash is partially settled.
     * 
     */
    CPST("CPST"),

    /**
     * Redemption has been gated. Multiple redemptions and multiple prices will be required.
     * 
     */
    GATM("GATM"),

    /**
     * Redemption has been gated, all settlement will be done at the same price.
     * 
     */
    @XmlEnumValue("GAT1")
    GAT_1("GAT1"),

    /**
     * Units and cash are both partially settled.
     * 
     */
    UCPS("UCPS"),

    /**
     * Units are partially settled.
     * 
     */
    UPST("UPST");
    private final String value;

    SettledStatusReason2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettledStatusReason2Code fromValue(String v) {
        for (SettledStatusReason2Code c: SettledStatusReason2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
