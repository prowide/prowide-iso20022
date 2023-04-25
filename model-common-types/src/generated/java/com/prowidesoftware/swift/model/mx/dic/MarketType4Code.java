
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MarketType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FUND"/>
 *     <enumeration value="LMAR"/>
 *     <enumeration value="THEO"/>
 *     <enumeration value="VEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
