
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundPlanType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundPlanType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVP"/>
 *     <enumeration value="SWIP"/>
 *     <enumeration value="WTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundPlanType1Code")
@XmlEnum
public enum InvestmentFundPlanType1Code {


    /**
     * Savings investment plan.
     * 
     */
    INVP,

    /**
     * Switch plan.
     * 
     */
    SWIP,

    /**
     * Withdrawal plan.
     * 
     */
    WTHP;

    public String value() {
        return name();
    }

    public static InvestmentFundPlanType1Code fromValue(String v) {
        return valueOf(v);
    }

}
