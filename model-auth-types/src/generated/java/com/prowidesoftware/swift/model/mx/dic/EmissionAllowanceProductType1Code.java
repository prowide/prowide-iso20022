
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmissionAllowanceProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmissionAllowanceProductType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EUAA"/&gt;
 *     &lt;enumeration value="EUAE"/&gt;
 *     &lt;enumeration value="ERUE"/&gt;
 *     &lt;enumeration value="CERE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
