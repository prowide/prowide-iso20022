
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FractionDispositionType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUYU"/>
 *     <enumeration value="CINL"/>
 *     <enumeration value="DIST"/>
 *     <enumeration value="EXPI"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FractionDispositionType3Code")
@XmlEnum
public enum FractionDispositionType3Code {


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
     * Let fractions expire worthless.
     * 
     */
    EXPI,

    /**
     * Characteristics of the disposition of fractions are unknown.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static FractionDispositionType3Code fromValue(String v) {
        return valueOf(v);
    }

}
