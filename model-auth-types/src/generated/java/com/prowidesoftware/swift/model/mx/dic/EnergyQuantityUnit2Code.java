
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyQuantityUnit2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EnergyQuantityUnit2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BTUD"/>
 *     <enumeration value="CMPD"/>
 *     <enumeration value="GJDD"/>
 *     <enumeration value="GWAT"/>
 *     <enumeration value="GWHD"/>
 *     <enumeration value="GWHH"/>
 *     <enumeration value="HMJD"/>
 *     <enumeration value="KTMD"/>
 *     <enumeration value="KWAT"/>
 *     <enumeration value="KWHD"/>
 *     <enumeration value="KWHH"/>
 *     <enumeration value="MCMD"/>
 *     <enumeration value="MJDD"/>
 *     <enumeration value="MBTD"/>
 *     <enumeration value="MMJD"/>
 *     <enumeration value="MTMD"/>
 *     <enumeration value="MWAT"/>
 *     <enumeration value="MWHD"/>
 *     <enumeration value="MWHH"/>
 *     <enumeration value="THMD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EnergyQuantityUnit2Code")
@XmlEnum
public enum EnergyQuantityUnit2Code {


    /**
     * British Thermal Unit Per Day
     * 
     */
    BTUD,

    /**
     * Cm per day.
     * 
     */
    CMPD,

    /**
     * GigaJoule Per Day.
     * 
     */
    GJDD,

    /**
     * Giga Watt.
     * 
     */
    GWAT,

    /**
     * Giga Watt hour per day.
     * 
     */
    GWHD,

    /**
     * Giga Watt hour per hour.
     * 
     */
    GWHH,

    /**
     * Hundred MegaJoule Per Day.
     * 
     */
    HMJD,

    /**
     * KTherm per day.
     * 
     */
    KTMD,

    /**
     * Kilo Watt.
     * 
     */
    KWAT,

    /**
     * Kilo Watt hour per day.
     * 
     */
    KWHD,

    /**
     * Kilo Watt hour per hour.
     * 
     */
    KWHH,

    /**
     * Mcm per day.
     * 
     */
    MCMD,

    /**
     * MegaJoule Per Day.
     * 
     */
    MJDD,

    /**
     * Million British Thermal Unit Per Day.
     * 
     */
    MBTD,

    /**
     * Million MegaJoule Per Day.
     * 
     */
    MMJD,

    /**
     * MTherm per day.
     * 
     */
    MTMD,

    /**
     * Mega Watt.
     * 
     */
    MWAT,

    /**
     * Mega Watt hour per day.
     * 
     */
    MWHD,

    /**
     * Mega Watt hour per hour.
     * 
     */
    MWHH,

    /**
     * Therm per day.
     * 
     */
    THMD;

    public String value() {
        return name();
    }

    public static EnergyQuantityUnit2Code fromValue(String v) {
        return valueOf(v);
    }

}
