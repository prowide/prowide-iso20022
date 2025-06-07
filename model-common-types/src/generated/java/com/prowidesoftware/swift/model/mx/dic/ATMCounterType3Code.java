
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCounterType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCounterType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INQU"/&gt;
 *     &lt;enumeration value="CTXN"/&gt;
 *     &lt;enumeration value="CTOF"/&gt;
 *     &lt;enumeration value="BDAY"/&gt;
 *     &lt;enumeration value="PRTN"/&gt;
 *     &lt;enumeration value="OPER"/&gt;
 *     &lt;enumeration value="SLRP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCounterType3Code")
@XmlEnum
public enum ATMCounterType3Code {


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
     * Counters as a result of some replenishment operation carried out by an operator (for example adding cash to a cash unit).
     * 
     */
    PRTN,

    /**
     * Counters since the last update by an operator on the ATM.
     * 
     */
    OPER,

    /**
     * Counters since last replenishment point.
     * 
     */
    SLRP;

    public String value() {
        return name();
    }

    public static ATMCounterType3Code fromValue(String v) {
        return valueOf(v);
    }

}
