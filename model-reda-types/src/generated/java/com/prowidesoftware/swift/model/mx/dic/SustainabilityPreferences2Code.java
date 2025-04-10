
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SustainabilityPreferences2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SustainabilityPreferences2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEUT"/>
 *     <enumeration value="YSCO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SustainabilityPreferences2Code")
@XmlEnum
public enum SustainabilityPreferences2Code {


    /**
     * Neutral or has no impact.
     * 
     */
    NEUT,

    /**
     * Yes, is applicable.
     * 
     */
    YSCO;

    public String value() {
        return name();
    }

    public static SustainabilityPreferences2Code fromValue(String v) {
        return valueOf(v);
    }

}
