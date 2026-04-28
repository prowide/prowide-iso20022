
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransparencyMethodology2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransparencyMethodology2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="SINT"/&gt;
 *     &lt;enumeration value="FFWK"/&gt;
 *     &lt;enumeration value="ESTM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransparencyMethodology2Code")
@XmlEnum
public enum TransparencyMethodology2Code {


    /**
     * Calculation based on yearly cycle.
     * 
     */
    YEAR,

    /**
     * Results of calculations supporting Systematic Internaliser regime.
     * 
     */
    SINT,

    /**
     * Calculation based on first Four Weeks of Trading for Equity Instruments.
     * 
     */
    FFWK,

    /**
     * Estimation for New Equity Instruments.
     * 
     */
    ESTM;

    public String value() {
        return name();
    }

    public static TransparencyMethodology2Code fromValue(String v) {
        return valueOf(v);
    }

}
