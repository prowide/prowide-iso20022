
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationBasis2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CalculationBasis2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVER"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="YEAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CalculationBasis2Code")
@XmlEnum
public enum CalculationBasis2Code {


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
     * Monthly basis.
     * 
     */
    MNTH,

    /**
     * Yearly basis.
     * 
     */
    YEAR;

    public String value() {
        return name();
    }

    public static CalculationBasis2Code fromValue(String v) {
        return valueOf(v);
    }

}
