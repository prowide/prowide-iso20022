
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomePreference2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncomePreference2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
