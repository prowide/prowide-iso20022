
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasisPriceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BasisPriceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MSCP"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="SPQO"/>
 *     <enumeration value="VWPD"/>
 *     <enumeration value="VWPM"/>
 *     <enumeration value="VWPA"/>
 *     <enumeration value="STIK"/>
 *     <enumeration value="OPEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BasisPriceType1Code")
@XmlEnum
public enum BasisPriceType1Code {


    /**
     * Closing price at morning session.
     * 
     */
    MSCP,

    /**
     * Closing price.
     * 
     */
    CLOS,

    /**
     * Current price.
     * 
     */
    CURR,

    /**
     * Price computed after a trading halt.
     * 
     */
    SPQO,

    /**
     * Value weighted average price through the day.
     * 
     */
    VWPD,

    /**
     * Value weighted average price through a morning session.
     * 
     */
    VWPM,

    /**
     * Value weighted average price through an afternoon session.
     * 
     */
    VWPA,

    /**
     * Exercise price defined on a derivative product.
     * 
     */
    STIK,

    /**
     * Price of a trade opening session.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static BasisPriceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
