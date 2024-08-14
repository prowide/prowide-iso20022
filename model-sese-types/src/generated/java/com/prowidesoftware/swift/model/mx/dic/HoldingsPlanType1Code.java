
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingsPlanType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HoldingsPlanType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVP"/>
 *     <enumeration value="SWIP"/>
 *     <enumeration value="PLAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HoldingsPlanType1Code")
@XmlEnum
public enum HoldingsPlanType1Code {


    /**
     * Holding to be transferred belongs to an investment plan.
     * 
     */
    INVP,

    /**
     * Holding to be transferred belongs to a switch plan.
     * 
     */
    SWIP,

    /**
     * Holding to be transferred belongs to a withdrawal plan.
     * 
     */
    PLAR;

    public String value() {
        return name();
    }

    public static HoldingsPlanType1Code fromValue(String v) {
        return valueOf(v);
    }

}
