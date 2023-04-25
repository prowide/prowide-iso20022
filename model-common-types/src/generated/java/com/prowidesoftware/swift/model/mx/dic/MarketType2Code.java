
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MarketType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIM"/>
 *     <enumeration value="SECM"/>
 *     <enumeration value="OTCO"/>
 *     <enumeration value="VARI"/>
 *     <enumeration value="EXCH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarketType2Code")
@XmlEnum
public enum MarketType2Code {


    /**
     * The place is a primary market.
     * 
     */
    PRIM,

    /**
     * The place is a secondary market.
     * 
     */
    SECM,

    /**
     * The place is over the counter.
     * 
     */
    OTCO,

    /**
     * Various places.
     * 
     */
    VARI,

    /**
     * The place is a stock exchange.
     * 
     */
    EXCH;

    public String value() {
        return name();
    }

    public static MarketType2Code fromValue(String v) {
        return valueOf(v);
    }

}
