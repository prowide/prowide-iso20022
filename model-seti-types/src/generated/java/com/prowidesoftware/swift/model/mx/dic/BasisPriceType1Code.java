
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasisPriceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BasisPriceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MSCP"/&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *     &lt;enumeration value="SPQO"/&gt;
 *     &lt;enumeration value="VWPD"/&gt;
 *     &lt;enumeration value="VWPM"/&gt;
 *     &lt;enumeration value="VWPA"/&gt;
 *     &lt;enumeration value="STIK"/&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
