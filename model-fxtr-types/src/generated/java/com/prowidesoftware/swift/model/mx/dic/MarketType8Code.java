
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketType8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COUN"/&gt;
 *     &lt;enumeration value="INBA"/&gt;
 *     &lt;enumeration value="OTCO"/&gt;
 *     &lt;enumeration value="PRIM"/&gt;
 *     &lt;enumeration value="SECM"/&gt;
 *     &lt;enumeration value="EXCH"/&gt;
 *     &lt;enumeration value="VARI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketType8Code")
@XmlEnum
public enum MarketType8Code {


    /**
     * Specified type of market is counter market.
     * 
     */
    COUN,

    /**
     * Specified type of market is inter bank market.
     * 
     */
    INBA,

    /**
     * The place is over the counter.
     * 
     */
    OTCO,

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
     * The place is a stock exchange.
     * 
     */
    EXCH,

    /**
     * Various places.
     * 
     */
    VARI;

    public String value() {
        return name();
    }

    public static MarketType8Code fromValue(String v) {
        return valueOf(v);
    }

}
