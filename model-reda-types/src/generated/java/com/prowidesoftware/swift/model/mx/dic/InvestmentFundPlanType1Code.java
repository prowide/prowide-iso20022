
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundPlanType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentFundPlanType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVP"/&gt;
 *     &lt;enumeration value="SWIP"/&gt;
 *     &lt;enumeration value="WTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
