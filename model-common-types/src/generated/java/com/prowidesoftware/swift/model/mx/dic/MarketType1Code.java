
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIM"/&gt;
 *     &lt;enumeration value="SECM"/&gt;
 *     &lt;enumeration value="THIM"/&gt;
 *     &lt;enumeration value="FOUM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketType1Code")
@XmlEnum
public enum MarketType1Code {


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
     * The place is a third market.
     * 
     */
    THIM,

    /**
     * The place is a fourth market.
     * 
     */
    FOUM;

    public String value() {
        return name();
    }

    public static MarketType1Code fromValue(String v) {
        return valueOf(v);
    }

}
