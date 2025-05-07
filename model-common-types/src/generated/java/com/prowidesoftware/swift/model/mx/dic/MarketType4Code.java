
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FUND"/&gt;
 *     &lt;enumeration value="LMAR"/&gt;
 *     &lt;enumeration value="THEO"/&gt;
 *     &lt;enumeration value="VEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketType4Code")
@XmlEnum
public enum MarketType4Code {


    /**
     * The place is a fund (transfer agent, fund itself, etc.).
     * 
     */
    FUND,

    /**
     * The place is a local market.
     * 
     */
    LMAR,

    /**
     * The place is theoretical.
     * 
     */
    THEO,

    /**
     * The place is a vendor.
     * 
     */
    VEND;

    public String value() {
        return name();
    }

    public static MarketType4Code fromValue(String v) {
        return valueOf(v);
    }

}
