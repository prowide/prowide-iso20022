
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExPostCostCalculationBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExPostCostCalculationBasis1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIXB"/>
 *     <enumeration value="ROLL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExPostCostCalculationBasis1Code")
@XmlEnum
public enum ExPostCostCalculationBasis1Code {


    /**
     * Basic for cost calculation is fixed, that is calendar year.
     * 
     */
    FIXB,

    /**
     * Basis for cost calculation is rolling, that is, the last twelve months.
     * 
     */
    ROLL;

    public String value() {
        return name();
    }

    public static ExPostCostCalculationBasis1Code fromValue(String v) {
        return valueOf(v);
    }

}
