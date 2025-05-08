
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderStatus11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIRM"/>
 *     <enumeration value="IMPL"/>
 *     <enumeration value="INDI"/>
 *     <enumeration value="ROUT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrderStatus11Code")
@XmlEnum
public enum OrderStatus11Code {


    /**
     * Quotes that can be executed.
     * 
     */
    FIRM,

    /**
     * Used for strategy orders that are derived from implied in or implied out functionality.
     * 
     */
    IMPL,

    /**
     * Quotes that are visible but cannot be executed. Includes warrants in some trading venue.
     * 
     */
    INDI,

    /**
     * Orders that are routed by the trading venue to other venues.
     * 
     */
    ROUT;

    public String value() {
        return name();
    }

    public static OrderStatus11Code fromValue(String v) {
        return valueOf(v);
    }

}
