
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCounterType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMCounterType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INQU"/>
 *     <enumeration value="CTXN"/>
 *     <enumeration value="CTOF"/>
 *     <enumeration value="BDAY"/>
 *     <enumeration value="PRTN"/>
 *     <enumeration value="OPER"/>
 *     <enumeration value="SLRP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
