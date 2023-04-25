
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiquidityIndicatorType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LiquidityIndicatorType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIVE"/>
 *     <enumeration value="TWEN"/>
 *     <enumeration value="NORM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LiquidityIndicatorType1Code")
@XmlEnum
public enum LiquidityIndicatorType1Code {


    /**
     * Computation is on the average value of the price of a security over a period of five days.
     * 
     */
    FIVE,

    /**
     * Computation is on the average value of the price of a security over a period of 20 days.
     * 
     */
    TWEN,

    /**
     * Computation is on the standard market conditions and volume.
     * 
     */
    NORM;

    public String value() {
        return name();
    }

    public static LiquidityIndicatorType1Code fromValue(String v) {
        return valueOf(v);
    }

}
