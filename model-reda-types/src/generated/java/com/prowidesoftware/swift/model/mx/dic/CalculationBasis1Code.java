
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculationBasis1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVER"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
