
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmissionAllowanceProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EmissionAllowanceProductType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EUAA"/>
 *     <enumeration value="EUAE"/>
 *     <enumeration value="ERUE"/>
 *     <enumeration value="CERE"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EmissionAllowanceProductType1Code")
@XmlEnum
public enum EmissionAllowanceProductType1Code {


    /**
     * Commodity attribute of type emissions allowance EUAA (European Union Aviation Allowance).
     * 
     */
    EUAA,

    /**
     * Commodity attribute of type emissions allowance EUA (European Union Allowance).
     * 
     */
    EUAE,

    /**
     * Commodity attribute of type emissions allowance ERU (European Reduction Unit).
     * 
     */
    ERUE,

    /**
     * Commodity attribute of type emissions allowance CER (Certified Emission Reduction).
     * 
     */
    CERE,

    /**
     * Commodity attribute of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static EmissionAllowanceProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
