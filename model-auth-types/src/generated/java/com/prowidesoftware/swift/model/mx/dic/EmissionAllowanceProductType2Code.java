
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmissionAllowanceProductType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EmissionAllowanceProductType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CERE"/>
 *     <enumeration value="ERUE"/>
 *     <enumeration value="EUAE"/>
 *     <enumeration value="EUAA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EmissionAllowanceProductType2Code")
@XmlEnum
public enum EmissionAllowanceProductType2Code {


    /**
     * Commodity attribute of type emissions allowance CER (Certified Emission Reduction).
     * 
     */
    CERE,

    /**
     * Commodity attribute of type emissions allowance ERU (European Reduction Unit).
     * 
     */
    ERUE,

    /**
     * Commodity attribute of type emissions allowance EUA (European Union Allowance).
     * 
     */
    EUAE,

    /**
     * Commodity attribute of type emissions allowance EUAA (European Union Aviation Allowance).
     * 
     */
    EUAA;

    public String value() {
        return name();
    }

    public static EmissionAllowanceProductType2Code fromValue(String v) {
        return valueOf(v);
    }

}
