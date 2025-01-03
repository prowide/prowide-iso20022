
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyQuantityUnit1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EnergyQuantityUnit1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="THMD"/>
 *     <enumeration value="MWHH"/>
 *     <enumeration value="MWHD"/>
 *     <enumeration value="MWAT"/>
 *     <enumeration value="MTMD"/>
 *     <enumeration value="MCMD"/>
 *     <enumeration value="KWHH"/>
 *     <enumeration value="KWHD"/>
 *     <enumeration value="KWAT"/>
 *     <enumeration value="KTMD"/>
 *     <enumeration value="GWHH"/>
 *     <enumeration value="GWHD"/>
 *     <enumeration value="GWAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EnergyQuantityUnit1Code")
@XmlEnum
public enum EnergyQuantityUnit1Code {


    /**
     * Therm per day.
     * 
     */
    THMD,

    /**
     * Mega Watt hour per hour.
     * 
     */
    MWHH,

    /**
     * Mega Watt hour per day.
     * 
     */
    MWHD,

    /**
     * Mega Watt.
     * 
     */
    MWAT,

    /**
     * MTherm per day.
     * 
     */
    MTMD,

    /**
     * Mcm per day.
     * 
     */
    MCMD,

    /**
     * Kilo Watt hour per hour.
     * 
     */
    KWHH,

    /**
     * Kilo Watt hour per day.
     * 
     */
    KWHD,

    /**
     * Kilo Watt.
     * 
     */
    KWAT,

    /**
     * KTherm per day.
     * 
     */
    KTMD,

    /**
     * Giga Watt hour per hour.
     * 
     */
    GWHH,

    /**
     * Giga Watt hour per day.
     * 
     */
    GWHD,

    /**
     * Giga Watt.
     * 
     */
    GWAT;

    public String value() {
        return name();
    }

    public static EnergyQuantityUnit1Code fromValue(String v) {
        return valueOf(v);
    }

}
