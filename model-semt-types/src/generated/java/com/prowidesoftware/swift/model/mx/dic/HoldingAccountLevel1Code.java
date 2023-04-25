
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingAccountLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HoldingAccountLevel1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SAFE"/>
 *     <enumeration value="LVL1"/>
 *     <enumeration value="LVL2"/>
 *     <enumeration value="LVL3"/>
 *     <enumeration value="LVL4"/>
 *     <enumeration value="LVL5"/>
 *     <enumeration value="LVL6"/>
 *     <enumeration value="LVL7"/>
 *     <enumeration value="LVL8"/>
 *     <enumeration value="LVL9"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HoldingAccountLevel1Code")
@XmlEnum
public enum HoldingAccountLevel1Code {


    /**
     * Holding account is defined as the safekeeping account (Level 0).
     * 
     */
    SAFE("SAFE"),

    /**
     * Holding account is defined as the sub-level 1 account.
     * 
     */
    @XmlEnumValue("LVL1")
    LVL_1("LVL1"),

    /**
     * Holding account is defined as the sub-level 2 account.
     * 
     */
    @XmlEnumValue("LVL2")
    LVL_2("LVL2"),

    /**
     * Holding account is defined as the sub-level 3 account.
     * 
     */
    @XmlEnumValue("LVL3")
    LVL_3("LVL3"),

    /**
     * Holding account is defined as the sub-level 4 account.
     * 
     */
    @XmlEnumValue("LVL4")
    LVL_4("LVL4"),

    /**
     * Holding account is defined as the sub-level 5 account.
     * 
     */
    @XmlEnumValue("LVL5")
    LVL_5("LVL5"),

    /**
     * Holding account is defined as the sub-level 6 account.
     * 
     */
    @XmlEnumValue("LVL6")
    LVL_6("LVL6"),

    /**
     * Holding account is defined as the sub-level 7 account.
     * 
     */
    @XmlEnumValue("LVL7")
    LVL_7("LVL7"),

    /**
     * Holding account is defined as the sub-level 8 account.
     * 
     */
    @XmlEnumValue("LVL8")
    LVL_8("LVL8"),

    /**
     * Holding account is defined as the sub-level 9 account.
     * 
     */
    @XmlEnumValue("LVL9")
    LVL_9("LVL9");
    private final String value;

    HoldingAccountLevel1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoldingAccountLevel1Code fromValue(String v) {
        for (HoldingAccountLevel1Code c: HoldingAccountLevel1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
