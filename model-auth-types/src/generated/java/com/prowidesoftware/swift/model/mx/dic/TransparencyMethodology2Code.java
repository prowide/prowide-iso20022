
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransparencyMethodology2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransparencyMethodology2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YEAR"/>
 *     <enumeration value="SINT"/>
 *     <enumeration value="FFWK"/>
 *     <enumeration value="ESTM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
