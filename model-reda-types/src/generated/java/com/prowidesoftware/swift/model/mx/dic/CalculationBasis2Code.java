
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationBasis2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculationBasis2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVER"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
