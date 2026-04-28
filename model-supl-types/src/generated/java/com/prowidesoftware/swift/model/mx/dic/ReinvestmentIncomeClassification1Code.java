
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReinvestmentIncomeClassification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReinvestmentIncomeClassification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DVCA"/&gt;
 *     &lt;enumeration value="CDIS"/&gt;
 *     &lt;enumeration value="CDUN"/&gt;
 *     &lt;enumeration value="CDFV"/&gt;
 *     &lt;enumeration value="CDEX"/&gt;
 *     &lt;enumeration value="CDPS"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="PRPL"/&gt;
 *     &lt;enumeration value="CAPG"/&gt;
 *     &lt;enumeration value="LTCG"/&gt;
 *     &lt;enumeration value="STCG"/&gt;
 *     &lt;enumeration value="ROCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReinvestmentIncomeClassification1Code")
@XmlEnum
public enum ReinvestmentIncomeClassification1Code {


    /**
     * Cash proceeds being reinvested is classified as cash dividend.
     * 
     */
    DVCA,

    /**
     * Cash proceeds being reinvested is classified as cash dividend on increased shares.
     * 
     */
    CDIS,

    /**
     * Cash proceeds being reinvested is classified as cash dividend at the unfavourable rate elected through the DTC (the Depository Trust Company) Foreign Tax Payment service.
     * 
     */
    CDUN,

    /**
     * Cash proceeds being reinvested is classified as cash dividend at the favourable rate elected through the DTC (the Depository Trust Company) Foreign Tax Payment service.
     * 
     */
    CDFV,

    /**
     * Cash proceeds being reinvested is classified as cash dividend at the exempt rate elected through the DTC (the Depository Trust Company) Foreign Tax Payment service.
     * 
     */
    CDEX,

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
     * Cash proceeds being reinvested is classified as principal.
     * 
     */
    PRPL,

    /**
     * Cash proceeds being reinvested is classified as capital gains.
     * 
     */
    CAPG,

    /**
     * Cash proceeds being reinvested is classified as long term capital gains.
     * 
     */
    LTCG,

    /**
     * Cash proceeds being reinvested is classified as short term capital gains.
     * 
     */
    STCG,

    /**
     * Cash proceeds being reinvested is classified as return of capital.
     * 
     */
    ROCA;

    public String value() {
        return name();
    }

    public static ReinvestmentIncomeClassification1Code fromValue(String v) {
        return valueOf(v);
    }

}
