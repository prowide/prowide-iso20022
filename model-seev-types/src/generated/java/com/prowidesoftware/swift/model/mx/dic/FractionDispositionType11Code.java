
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FractionDispositionType11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYU"/&gt;
 *     &lt;enumeration value="CINL"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="RDDN"/&gt;
 *     &lt;enumeration value="STAN"/&gt;
 *     &lt;enumeration value="RDUP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
