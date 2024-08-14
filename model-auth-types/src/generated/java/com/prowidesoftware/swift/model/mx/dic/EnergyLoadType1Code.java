
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyLoadType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EnergyLoadType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSLD"/>
 *     <enumeration value="GASD"/>
 *     <enumeration value="HABH"/>
 *     <enumeration value="OFFP"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PKLD"/>
 *     <enumeration value="SHPD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EnergyLoadType1Code")
@XmlEnum
public enum EnergyLoadType1Code {


    /**
     * Base load.
     * 
     */
    BSLD,

    /**
     * Gas day.
     * 
     */
    GASD,

    /**
     * Hour and block hours.
     * 
     */
    HABH,

    /**
     * Off-Peak.
     * 
     * 
     */
    OFFP,

    /**
     * Other.
     * 
     */
    OTHR,

    /**
     * Peak load.
     * 
     */
    PKLD,

    /**
     * Shaped.
     * 
     */
    SHPD;

    public String value() {
        return name();
    }

    public static EnergyLoadType1Code fromValue(String v) {
        return valueOf(v);
    }

}
