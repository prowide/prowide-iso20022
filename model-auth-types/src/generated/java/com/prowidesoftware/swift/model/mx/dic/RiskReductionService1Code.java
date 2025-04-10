
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskReductionService1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RiskReductionService1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NORR"/>
 *     <enumeration value="PWOS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PRBM"/>
 *     <enumeration value="PWAS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RiskReductionService1Code")
@XmlEnum
public enum RiskReductionService1Code {


    /**
     * There is no portfolio compression.
     * 
     */
    NORR,

    /**
     * Portfolio Compression without a third-party service provider.
     * 
     */
    PWOS,

    /**
     * Other portfolio compression.
     * 
     */
    OTHR,

    /**
     * Portfolio rebalancing or margin management.
     * 
     */
    PRBM,

    /**
     * Portfolio Compression with a third-party service provider or CCP.
     * 
     */
    PWAS;

    public String value() {
        return name();
    }

    public static RiskReductionService1Code fromValue(String v) {
        return valueOf(v);
    }

}
