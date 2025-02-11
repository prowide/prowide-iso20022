
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRate1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InterestRate1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GSRT"/>
 *     <enumeration value="NTRT"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InterestRate1Code")
@XmlEnum
public enum InterestRate1Code {


    /**
     * Gross interest rate of the instalment
     * 
     */
    GSRT,

    /**
     * Net interest rate of the instalment
     * 
     */
    NTRT,

    /**
     * Other interest rate of the instalment
     * 
     */
    OTHN,

    /**
     * Other interest rate of the instalment
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static InterestRate1Code fromValue(String v) {
        return valueOf(v);
    }

}
