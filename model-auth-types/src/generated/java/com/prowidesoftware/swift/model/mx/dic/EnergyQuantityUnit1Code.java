
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyQuantityUnit1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyQuantityUnit1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="THMD"/&gt;
 *     &lt;enumeration value="MWHH"/&gt;
 *     &lt;enumeration value="MWHD"/&gt;
 *     &lt;enumeration value="MWAT"/&gt;
 *     &lt;enumeration value="MTMD"/&gt;
 *     &lt;enumeration value="MCMD"/&gt;
 *     &lt;enumeration value="KWHH"/&gt;
 *     &lt;enumeration value="KWHD"/&gt;
 *     &lt;enumeration value="KWAT"/&gt;
 *     &lt;enumeration value="KTMD"/&gt;
 *     &lt;enumeration value="GWHH"/&gt;
 *     &lt;enumeration value="GWHD"/&gt;
 *     &lt;enumeration value="GWAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
