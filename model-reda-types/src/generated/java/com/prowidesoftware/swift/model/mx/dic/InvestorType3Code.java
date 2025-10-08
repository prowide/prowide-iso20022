
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestorType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RETL"/&gt;
 *     &lt;enumeration value="PRF2"/&gt;
 *     &lt;enumeration value="NEI1"/&gt;
 *     &lt;enumeration value="BOT2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
