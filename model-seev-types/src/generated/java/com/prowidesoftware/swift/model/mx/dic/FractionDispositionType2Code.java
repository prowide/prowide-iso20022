
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FractionDispositionType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIST"/>
 *     <enumeration value="RDDN"/>
 *     <enumeration value="RDUP"/>
 *     <enumeration value="STAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FractionDispositionType2Code")
@XmlEnum
public enum FractionDispositionType2Code {


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

    public static FractionDispositionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
