
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyQuantityUnit2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyQuantityUnit2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BTUD"/&gt;
 *     &lt;enumeration value="CMPD"/&gt;
 *     &lt;enumeration value="GJDD"/&gt;
 *     &lt;enumeration value="GWAT"/&gt;
 *     &lt;enumeration value="GWHD"/&gt;
 *     &lt;enumeration value="GWHH"/&gt;
 *     &lt;enumeration value="HMJD"/&gt;
 *     &lt;enumeration value="KTMD"/&gt;
 *     &lt;enumeration value="KWAT"/&gt;
 *     &lt;enumeration value="KWHD"/&gt;
 *     &lt;enumeration value="KWHH"/&gt;
 *     &lt;enumeration value="MCMD"/&gt;
 *     &lt;enumeration value="MJDD"/&gt;
 *     &lt;enumeration value="MBTD"/&gt;
 *     &lt;enumeration value="MMJD"/&gt;
 *     &lt;enumeration value="MTMD"/&gt;
 *     &lt;enumeration value="MWAT"/&gt;
 *     &lt;enumeration value="MWHD"/&gt;
 *     &lt;enumeration value="MWHH"/&gt;
 *     &lt;enumeration value="THMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
