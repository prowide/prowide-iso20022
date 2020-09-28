
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquityReturnParameter1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EquityReturnParameter1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRDV"/&gt;
 *     &lt;enumeration value="PRVA"/&gt;
 *     &lt;enumeration value="PRVO"/&gt;
 *     &lt;enumeration value="PRBP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
