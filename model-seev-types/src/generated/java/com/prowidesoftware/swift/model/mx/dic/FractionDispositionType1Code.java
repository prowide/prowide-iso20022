
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FractionDispositionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUYU"/>
 *     <enumeration value="CINL"/>
 *     <enumeration value="DIST"/>
 *     <enumeration value="RDDN"/>
 *     <enumeration value="RDUP"/>
 *     <enumeration value="STAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FractionDispositionType1Code")
@XmlEnum
public enum FractionDispositionType1Code {


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
     * Round down to the nearest whole number.
     * 
     */
    RDDN,

    /**
     * Round up to the nearest whole number.
     * 
     */
    RDUP,

    /**
     * If the fraction is greater than or equal to 0.5 of the resulting security then round up, else round down.
     * 
     */
    STAN;

    public String value() {
        return name();
    }

    public static FractionDispositionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
