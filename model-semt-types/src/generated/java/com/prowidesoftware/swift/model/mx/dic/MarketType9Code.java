
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MarketType9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FUND"/>
 *     <enumeration value="LMAR"/>
 *     <enumeration value="THEO"/>
 *     <enumeration value="VEND"/>
 *     <enumeration value="SCAS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarketType9Code")
@XmlEnum
public enum MarketType9Code {


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
    VEND,

    /**
     * Source of price quotation is a smart contract automated pricing system.
     * 
     */
    SCAS;

    public String value() {
        return name();
    }

    public static MarketType9Code fromValue(String v) {
        return valueOf(v);
    }

}
