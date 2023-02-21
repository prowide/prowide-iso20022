
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCounterType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCounterType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INQU"/&gt;
 *     &lt;enumeration value="CTXN"/&gt;
 *     &lt;enumeration value="CTOF"/&gt;
 *     &lt;enumeration value="BDAY"/&gt;
 *     &lt;enumeration value="PRTN"/&gt;
 *     &lt;enumeration value="OPER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCounterType1Code")
@XmlEnum
public enum ATMCounterType1Code {


    /**
     * Counters since the last counters inquiry.
     * 
     */
    INQU,

    /**
     * Counters for a customer transaction.
     * 
     */
    CTXN,

    /**
     * Counters since the last cut-off.
     * 
     */
    CTOF,

    /**
     * Counters since the beginning of the business day.
     * 
     */
    BDAY,

    /**
     * Counters for an operation performed by an operator on the ATM.
     * 
     */
    PRTN,

    /**
     * Counters since the last update by an operator on the ATM.
     * 
     */
    OPER;

    public String value() {
        return name();
    }

    public static ATMCounterType1Code fromValue(String v) {
        return valueOf(v);
    }

}
