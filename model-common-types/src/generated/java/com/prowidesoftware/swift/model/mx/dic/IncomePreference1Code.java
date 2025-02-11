
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomePreference1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IncomePreference1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="DRIP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IncomePreference1Code")
@XmlEnum
public enum IncomePreference1Code {


    /**
     * Distribution in cash.
     * 
     */
    CASH,

    /**
     * Reinvestment of proceeds into securities.
     * 
     */
    DRIP;

    public String value() {
        return name();
    }

    public static IncomePreference1Code fromValue(String v) {
        return valueOf(v);
    }

}
