
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FractionDispositionType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYU"/&gt;
 *     &lt;enumeration value="CINL"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FractionDispositionType10Code")
@XmlEnum
public enum FractionDispositionType10Code {


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
     * Let fractions expire worthless.
     * 
     */
    EXPI,

    /**
     * Take distribution of fractions in the form of securities.
     * 
     */
    DIST;

    public String value() {
        return name();
    }

    public static FractionDispositionType10Code fromValue(String v) {
        return valueOf(v);
    }

}
