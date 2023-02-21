
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCounterType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCounterType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BDAY"/&gt;
 *     &lt;enumeration value="INQU"/&gt;
 *     &lt;enumeration value="CTOF"/&gt;
 *     &lt;enumeration value="OPER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
