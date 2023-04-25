
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingEquityType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnderlyingEquityType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSKT"/>
 *     <enumeration value="DIVI"/>
 *     <enumeration value="ETFS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="SHRS"/>
 *     <enumeration value="DVSE"/>
 *     <enumeration value="STIX"/>
 *     <enumeration value="VOLI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnderlyingEquityType6Code")
@XmlEnum
public enum UnderlyingEquityType6Code {


    /**
     * Underlying is a basket.
     * 
     */
    BSKT,

    /**
     * Underlying is a dividend index.
     * 
     */
    DIVI,

    /**
     * Underlying is an exchange traded fund.
     * 
     */
    ETFS,

    /**
     * Underlying is of other type.
     * 
     */
    OTHR,

    /**
     * Underlying is a share.
     * 
     */
    SHRS,

    /**
     * Underlying is a stock dividend.
     * 
     */
    DVSE,

    /**
     * Underlying is a stock index.
     * 
     */
    STIX,

    /**
     * Underlying is a volatility index.
     * 
     */
    VOLI;

    public String value() {
        return name();
    }

    public static UnderlyingEquityType6Code fromValue(String v) {
        return valueOf(v);
    }

}
