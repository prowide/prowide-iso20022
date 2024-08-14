
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CalculationBasis1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVER"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CalculationBasis1Code")
@XmlEnum
public enum CalculationBasis1Code {


    /**
     * Average basis.
     * 
     */
    AVER,

    /**
     * Daily basis.
     * 
     */
    DAIL,

    /**
     * Another type of calculation basis.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CalculationBasis1Code fromValue(String v) {
        return valueOf(v);
    }

}
