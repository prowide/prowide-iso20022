
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIM"/&gt;
 *     &lt;enumeration value="SECM"/&gt;
 *     &lt;enumeration value="OTCO"/&gt;
 *     &lt;enumeration value="VARI"/&gt;
 *     &lt;enumeration value="EXCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
