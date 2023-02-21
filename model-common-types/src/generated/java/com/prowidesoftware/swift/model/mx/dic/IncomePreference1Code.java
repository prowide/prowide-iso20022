
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomePreference1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncomePreference1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="DRIP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
