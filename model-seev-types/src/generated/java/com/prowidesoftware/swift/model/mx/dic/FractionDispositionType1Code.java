
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FractionDispositionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYU"/&gt;
 *     &lt;enumeration value="CINL"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="RDDN"/&gt;
 *     &lt;enumeration value="RDUP"/&gt;
 *     &lt;enumeration value="STAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
