
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FleetServiceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FleetServiceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SLSV"/&gt;
 *     &lt;enumeration value="HSDI"/&gt;
 *     &lt;enumeration value="FLSV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FleetServiceType1Code")
@XmlEnum
public enum FleetServiceType1Code {


    /**
     * Self service
     * 
     */
    SLSV,

    /**
     * High speed dispenser that may or may not support varying flow rates. 
     * 
     */
    HSDI,

    /**
     * Full service
     * 
     */
    FLSV;

    public String value() {
        return name();
    }

    public static FleetServiceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
