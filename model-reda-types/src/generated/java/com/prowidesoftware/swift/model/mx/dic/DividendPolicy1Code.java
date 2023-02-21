
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DividendPolicy1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendPolicy1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="UNIT"/&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DividendPolicy1Code")
@XmlEnum
public enum DividendPolicy1Code {


    /**
     * Dividend is paid in cash.
     * 
     */
    CASH,

    /**
     * Dividend is paid in units.
     * 
     */
    UNIT,

    /**
     * Dividend is paid in both Cash and Units.
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static DividendPolicy1Code fromValue(String v) {
        return valueOf(v);
    }

}
