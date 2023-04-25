
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestorType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOT3"/>
 *     <enumeration value="EPRO"/>
 *     <enumeration value="PRF2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestorType2Code")
@XmlEnum
public enum InvestorType2Code {


    /**
     * Investor is both professional per se and elective professional.
     * 
     */
    @XmlEnumValue("BOT3")
    BOT_3("BOT3"),

    /**
     * Investor is an elective professional.
     * 
     */
    EPRO("EPRO"),

    /**
     * Investor is professional or professional per se.
     * 
     */
    @XmlEnumValue("PRF2")
    PRF_2("PRF2");
    private final String value;

    InvestorType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestorType2Code fromValue(String v) {
        for (InvestorType2Code c: InvestorType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
