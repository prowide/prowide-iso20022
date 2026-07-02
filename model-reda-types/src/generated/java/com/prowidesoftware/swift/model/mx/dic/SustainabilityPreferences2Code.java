
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SustainabilityPreferences2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SustainabilityPreferences2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEUT"/&gt;
 *     &lt;enumeration value="YSCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
