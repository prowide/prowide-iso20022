
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FleetPurchaseType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FleetPurchaseType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FUEL"/&gt;
 *     &lt;enumeration value="NONF"/&gt;
 *     &lt;enumeration value="FANF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
