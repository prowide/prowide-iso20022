
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FractionDispositionType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUYU"/>
 *     <enumeration value="CINL"/>
 *     <enumeration value="DIST"/>
 *     <enumeration value="RDDN"/>
 *     <enumeration value="STAN"/>
 *     <enumeration value="RDUP"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FractionDispositionType8Code")
@XmlEnum
public enum FractionDispositionType8Code {


    /**
     * Buy securities up to next whole number.
     * 
     */
    BUYU,

    /**
     * Fractional part of cash. Take cash in lieu of fractions.
     * 
     */
    CINL,

    /**
     * Take distribution of fractions in the form of securities.
     * 
     */
    DIST,

    /**
     * Round the entitlement down to the last full unit/minimum nominal quantity, fractions are discarded.
     * 
     */
    RDDN,

    /**
     * If the fraction is greater than or equal to 0.5 of the resulting security then round up, else round down as specified in the respective RDUP and RDDN codes.
     * 
     */
    STAN,

    /**
     * Round up to the next full unit/minimum nominal quantity at no cost.
     * 
     */
    RDUP,

    /**
     * Characteristics of the disposition of fractions are unknown.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static FractionDispositionType8Code fromValue(String v) {
        return valueOf(v);
    }

}
