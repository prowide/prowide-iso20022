
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ModelType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXPS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="ORIA"/>
 *     <enumeration value="SPAN"/>
 *     <enumeration value="VARI"/>
 *     <enumeration value="SAMO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ModelType1Code")
@XmlEnum
public enum ModelType1Code {


    /**
     * Margin model used to calculate collateral requirements to cover potential future exposures whereby the model estimates the expected loss of a portfolio over a given holding period, or margin period of risk, to a set confidence interval.
     * 
     */
    EXPS,

    /**
     * Margin model used to calculate collateral requirements to cover potential future exposures that is not classified by any other the model type code.
     * 
     */
    OTHR,

    /**
     * Margin model used to calculate collateral requirements where the total collateral requirement to cover potential future exposures for a portfolio is an aggregation of the estimated potential future exposure on each financial instrument of that portfolio. Such the methodology for such aggregation is defined explicitly by the model itself.
     * 
     */
    ORIA,

    /**
     * Margin model used to calculate collateral requirements to cover potential future exposure developed by CME in the 1980s, or other derivatives thereof.
     * 
     */
    SPAN,

    /**
     * Margin model used to calculate collateral requirements to cover potential future exposure whereby the model estimates the potential loss of a portfolio over a given holding period, or margin period of risk, to a given confidence interval.
     * 
     */
    VARI,

    /**
     * Scenario analysis model other than SPAN.
     * 
     */
    SAMO;

    public String value() {
        return name();
    }

    public static ModelType1Code fromValue(String v) {
        return valueOf(v);
    }

}
