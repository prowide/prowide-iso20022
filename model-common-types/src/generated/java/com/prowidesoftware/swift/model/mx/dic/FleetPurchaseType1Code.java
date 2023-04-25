
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FleetPurchaseType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FleetPurchaseType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FUEL"/>
 *     <enumeration value="NONF"/>
 *     <enumeration value="FANF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FleetPurchaseType1Code")
@XmlEnum
public enum FleetPurchaseType1Code {


    /**
     * Fuel
     * 
     */
    FUEL,

    /**
     * Non fuel
     * 
     */
    NONF,

    /**
     * Fuel and non fuel
     * 
     */
    FANF;

    public String value() {
        return name();
    }

    public static FleetPurchaseType1Code fromValue(String v) {
        return valueOf(v);
    }

}
