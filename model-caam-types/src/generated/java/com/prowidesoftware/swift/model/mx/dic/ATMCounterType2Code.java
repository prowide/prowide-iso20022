
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCounterType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMCounterType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BDAY"/>
 *     <enumeration value="INQU"/>
 *     <enumeration value="CTOF"/>
 *     <enumeration value="OPER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMCounterType2Code")
@XmlEnum
public enum ATMCounterType2Code {


    /**
     * Counters since the beginning of the business day.
     * 
     */
    BDAY,

    /**
     * Counters since the last counters inquiry.
     * 
     */
    INQU,

    /**
     * Counters since the last cut-off.
     * 
     */
    CTOF,

    /**
     * Counters since the last update by an operator on the ATM.
     * 
     */
    OPER;

    public String value() {
        return name();
    }

    public static ATMCounterType2Code fromValue(String v) {
        return valueOf(v);
    }

}
