
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTCO"/&gt;
 *     &lt;enumeration value="VARI"/&gt;
 *     &lt;enumeration value="EXCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketType6Code")
@XmlEnum
public enum MarketType6Code {


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

    public static MarketType6Code fromValue(String v) {
        return valueOf(v);
    }

}
