
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceCalculationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceCalculationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VWAP"/>
 *     <enumeration value="NAVF"/>
 *     <enumeration value="MIMP"/>
 *     <enumeration value="NAVA"/>
 *     <enumeration value="AVCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
