
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SustainabilityPreferences1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SustainabilityPreferences1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CESG"/>
 *     <enumeration value="NEUT"/>
 *     <enumeration value="OSUS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SustainabilityPreferences1Code")
@XmlEnum
public enum SustainabilityPreferences1Code {


    /**
     * Preference for products having environmental, social and corporate governance (ESG) characteristics.
     * 
     */
    CESG,

    /**
     * Neutral or has no impact.
     * 
     */
    NEUT,

    /**
     * Preference for products having sustainable objectives.
     * 
     */
    OSUS;

    public String value() {
        return name();
    }

    public static SustainabilityPreferences1Code fromValue(String v) {
        return valueOf(v);
    }

}
