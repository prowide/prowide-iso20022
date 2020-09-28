
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferenceToIncome1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferenceToIncome1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORDN"/&gt;
 *     &lt;enumeration value="PFRD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PreferenceToIncome1Code")
@XmlEnum
public enum PreferenceToIncome1Code {


    /**
     * Indicates an ordinary/common preference to income.
     * 
     */
    ORDN,

    /**
     * Indicates a preferred claim upon income and assets.
     * 
     */
    PFRD;

    public String value() {
        return name();
    }

    public static PreferenceToIncome1Code fromValue(String v) {
        return valueOf(v);
    }

}
