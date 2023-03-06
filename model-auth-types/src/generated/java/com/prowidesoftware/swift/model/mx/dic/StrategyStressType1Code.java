
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyStressType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StrategyStressType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLEX"/&gt;
 *     &lt;enumeration value="PRLL"/&gt;
 *     &lt;enumeration value="SPRD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StrategyStressType1Code")
@XmlEnum
public enum StrategyStressType1Code {


    /**
     * Scenario, either by design or otherwise, that primarily tests the sensitivity of a portfolio of derivatives with a common underlying to differences in the valuation of such derivatives caused by differences in the maturity of such contracts. Typically, flex scenarios are aimed at stressing the valuation of portfolios that are insensitive to small movements in an underlying but sensitive to differences in the reaction of such portfolios in time space. For instance, calendar spreads or flattening or steeping positions in interest rate space.
     * 
     */
    FLEX,

    /**
     * Scenario, either by design or otherwise, that primarily tests the sensitivity of a portfolio of derivatives to changes in the value of a common underlying. For example as parallel shift of an interest rate curve.
     * 
     */
    PRLL,

    /**
     * Scenario, either by design or otherwise, that primarily tests the sensitivity of a portfolio of derivatives with differing, but correlated underlyings. Typically, spread scenarios are aimed at stressing the valuation of portfolios that are insensitive to small co-movements in a set of underlyings but sensitive to differences in the reaction of such portfolios to breakdowns in historical correlations or covariance.
     * 
     */
    SPRD;

    public String value() {
        return name();
    }

    public static StrategyStressType1Code fromValue(String v) {
        return valueOf(v);
    }

}
