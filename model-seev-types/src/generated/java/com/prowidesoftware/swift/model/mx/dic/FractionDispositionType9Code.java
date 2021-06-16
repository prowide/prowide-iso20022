
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FractionDispositionType9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="RDDN"/&gt;
 *     &lt;enumeration value="STAN"/&gt;
 *     &lt;enumeration value="RDUP"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FractionDispositionType9Code")
@XmlEnum
public enum FractionDispositionType9Code {


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

    public static FractionDispositionType9Code fromValue(String v) {
        return valueOf(v);
    }

}
