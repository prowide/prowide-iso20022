
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquityReturnParameter1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EquityReturnParameter1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRDV"/>
 *     <enumeration value="PRVA"/>
 *     <enumeration value="PRVO"/>
 *     <enumeration value="PRBP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EquityReturnParameter1Code")
@XmlEnum
public enum EquityReturnParameter1Code {


    /**
     * Equity derivative parameter Return Dividend.
     * 
     */
    PRDV,

    /**
     * Equity derivative parameter Return Variance.
     * 
     */
    PRVA,

    /**
     * Equity derivative parameter Return Volatility.
     * 
     */
    PRVO,

    /**
     * Equity derivative parameter Price Return Basis Performance.
     * 
     */
    PRBP;

    public String value() {
        return name();
    }

    public static EquityReturnParameter1Code fromValue(String v) {
        return valueOf(v);
    }

}
