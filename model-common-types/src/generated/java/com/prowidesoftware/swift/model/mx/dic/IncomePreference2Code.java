
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomePreference2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IncomePreference2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="SECU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IncomePreference2Code")
@XmlEnum
public enum IncomePreference2Code {


    /**
     * Distribution in cash.
     * 
     */
    CASH,

    /**
     * Distribution in securities.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static IncomePreference2Code fromValue(String v) {
        return valueOf(v);
    }

}
