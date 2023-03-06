
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CCPV"/&gt;
 *     &lt;enumeration value="MTMA"/&gt;
 *     &lt;enumeration value="MTMO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValuationType1Code")
@XmlEnum
public enum ValuationType1Code {


    /**
     * Central counterparty (CCP) valuation.
     * 
     */
    CCPV,

    /**
     * Mark to market valuation.
     * 
     * 
     * 
     */
    MTMA,

    /**
     * Mark to model valuation.
     * 
     * 
     */
    MTMO;

    public String value() {
        return name();
    }

    public static ValuationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
