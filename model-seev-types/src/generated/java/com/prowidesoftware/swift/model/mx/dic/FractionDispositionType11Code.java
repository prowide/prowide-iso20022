
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FractionDispositionType11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUYU"/>
 *     <enumeration value="CINL"/>
 *     <enumeration value="DIST"/>
 *     <enumeration value="RDDN"/>
 *     <enumeration value="STAN"/>
 *     <enumeration value="RDUP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FractionDispositionType11Code")
@XmlEnum
public enum FractionDispositionType11Code {


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
    RDUP;

    public String value() {
        return name();
    }

    public static FractionDispositionType11Code fromValue(String v) {
        return valueOf(v);
    }

}
