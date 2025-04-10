
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExPostCostCalculationBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExPostCostCalculationBasis1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIXB"/&gt;
 *     &lt;enumeration value="ROLL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
