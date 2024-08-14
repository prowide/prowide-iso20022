
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskReductionService1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskReductionService1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NORR"/&gt;
 *     &lt;enumeration value="PWOS"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PRBM"/&gt;
 *     &lt;enumeration value="PWAS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
