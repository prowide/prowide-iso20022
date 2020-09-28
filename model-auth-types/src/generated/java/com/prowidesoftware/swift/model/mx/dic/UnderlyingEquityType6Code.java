
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingEquityType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingEquityType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BSKT"/&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="ETFS"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="SHRS"/&gt;
 *     &lt;enumeration value="DVSE"/&gt;
 *     &lt;enumeration value="STIX"/&gt;
 *     &lt;enumeration value="VOLI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
