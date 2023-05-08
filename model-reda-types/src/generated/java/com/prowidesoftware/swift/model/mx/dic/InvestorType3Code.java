
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestorType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RETL"/>
 *     <enumeration value="PRF2"/>
 *     <enumeration value="NEI1"/>
 *     <enumeration value="BOT2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestorType3Code")
@XmlEnum
public enum InvestorType3Code {


    /**
     * Investor is a retail investor.
     * 
     */
    RETL("RETL"),

    /**
     * Investor is professional or professional per se.
     * 
     */
    @XmlEnumValue("PRF2")
    PRF_2("PRF2"),

    /**
     * Investor is neither professional or retail.
     * 
     */
    @XmlEnumValue("NEI1")
    NEI_1("NEI1"),

    /**
     * Investor is both professional and retail.
     * 
     */
    @XmlEnumValue("BOT2")
    BOT_2("BOT2");
    private final String value;

    InvestorType3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestorType3Code fromValue(String v) {
        for (InvestorType3Code c: InvestorType3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
