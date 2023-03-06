
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReinvestmentIncomeClassification2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReinvestmentIncomeClassification2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAPG"/&gt;
 *     &lt;enumeration value="DVCA"/&gt;
 *     &lt;enumeration value="CDPS"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="LTCG"/&gt;
 *     &lt;enumeration value="PRPL"/&gt;
 *     &lt;enumeration value="ROCA"/&gt;
 *     &lt;enumeration value="STCG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReinvestmentIncomeClassification2Code")
@XmlEnum
public enum ReinvestmentIncomeClassification2Code {


    /**
     * Cash proceeds being reinvested is classified as capital gains.
     * 
     */
    CAPG,

    /**
     * Cash proceeds being reinvested is classified as cash dividend.
     * 
     */
    DVCA,

    /**
     * Cash proceeds being reinvested is classified as special cash dividend.
     * 
     */
    CDPS,

    /**
     * Cash proceeds being reinvested is classified as interest.
     * 
     */
    INTR,

    /**
     * Cash proceeds being reinvested is classified as long term capital gains.
     * 
     */
    LTCG,

    /**
     * Cash proceeds being reinvested is classified as principal.
     * 
     */
    PRPL,

    /**
     * Cash proceeds being reinvested is classified as return of capital.
     * 
     */
    ROCA,

    /**
     * Cash proceeds being reinvested is classified as short term capital gains.
     * 
     */
    STCG;

    public String value() {
        return name();
    }

    public static ReinvestmentIncomeClassification2Code fromValue(String v) {
        return valueOf(v);
    }

}
