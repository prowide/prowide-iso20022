
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceRateType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceRateType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISC"/>
 *     <enumeration value="PREM"/>
 *     <enumeration value="PRCT"/>
 *     <enumeration value="YIEL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceRateType3Code")
@XmlEnum
public enum PriceRateType3Code {


    /**
     * Price expressed as a number of percentage points below par, for example, a discount price of 2.0% equals a price of 98 when par is 100.
     * 
     */
    DISC,

    /**
     * Price expressed as a number of percentage points above par, for example, a premium price of 2.0% equals a price of 102 when par is 100.
     * 
     */
    PREM,

    /**
     * Price expressed as a percentage of par.
     * 
     */
    PRCT,

    /**
     * Price expressed as a yield.
     * 
     */
    YIEL;

    public String value() {
        return name();
    }

    public static PriceRateType3Code fromValue(String v) {
        return valueOf(v);
    }

}
