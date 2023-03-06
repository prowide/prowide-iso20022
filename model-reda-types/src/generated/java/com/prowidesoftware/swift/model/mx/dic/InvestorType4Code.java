
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestorType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOT3"/&gt;
 *     &lt;enumeration value="NPRF"/&gt;
 *     &lt;enumeration value="PRF3"/&gt;
 *     &lt;enumeration value="PRF4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestorType4Code")
@XmlEnum
public enum InvestorType4Code {


    /**
     * Investor is both professional per se and elective professional.
     * 
     */
    @XmlEnumValue("BOT3")
    BOT_3("BOT3"),

    /**
     * Investor is neither professional per se or elective professional.
     * 
     */
    NPRF("NPRF"),

    /**
     * Investor is professional per se but not elective professional.
     * 
     */
    @XmlEnumValue("PRF3")
    PRF_3("PRF3"),

    /**
     * Investor is an elective professional but not professional per se.
     * 
     */
    @XmlEnumValue("PRF4")
    PRF_4("PRF4");
    private final String value;

    InvestorType4Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestorType4Code fromValue(String v) {
        for (InvestorType4Code c: InvestorType4Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
