
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CalculationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SIMP"/>
 *     <enumeration value="COMP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CalculationMethod1Code")
@XmlEnum
public enum CalculationMethod1Code {


    /**
     * Calculation method by which interest is calculated on the original principal only. Accumulated interest from prior periods is not used in calculations for the following periods.
     * 
     */
    SIMP,

    /**
     * Calculation method by which interest is calculated each period on the original principal and all interest accumulated during past periods.
     * 
     */
    COMP;

    public String value() {
        return name();
    }

    public static CalculationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
