
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FractionDispositionType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="RDDN"/&gt;
 *     &lt;enumeration value="RDUP"/&gt;
 *     &lt;enumeration value="STAN"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FractionDispositionType5Code")
@XmlEnum
public enum FractionDispositionType5Code {


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
    STAN,

    /**
     * Characteristics of the disposition of fractions are unknown.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static FractionDispositionType5Code fromValue(String v) {
        return valueOf(v);
    }

}
