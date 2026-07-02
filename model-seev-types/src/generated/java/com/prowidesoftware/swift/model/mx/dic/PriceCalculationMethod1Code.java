
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceCalculationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceCalculationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VWAP"/&gt;
 *     &lt;enumeration value="NAVF"/&gt;
 *     &lt;enumeration value="MIMP"/&gt;
 *     &lt;enumeration value="NAVA"/&gt;
 *     &lt;enumeration value="AVCL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceCalculationMethod1Code")
@XmlEnum
public enum PriceCalculationMethod1Code {


    /**
     * The price is based on a volume-weighted average price which is a ratio of the cumulative share price to the cumulative volume traded over a given time period.
     * 
     */
    VWAP,

    /**
     * Final asset value at the liquidation of the fund.
     * 
     */
    NAVF,

    /**
     * Price at a certain amount of time prior to the date it is announced.
     * 
     */
    MIMP,

    /**
     * Net value of an investment fund's assets less its liabilities, divided by the number of shares outstanding.
     * 
     */
    NAVA,

    /**
     * Price of the asset at close of a given day.
     * 
     */
    AVCL;

    public String value() {
        return name();
    }

    public static PriceCalculationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
