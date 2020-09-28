
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundCashAccount3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundCashAccount3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CPFO"/&gt;
 *     &lt;enumeration value="CPFS"/&gt;
 *     &lt;enumeration value="SRSA"/&gt;
 *     &lt;enumeration value="HEDG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundCashAccount3Code")
@XmlEnum
public enum FundCashAccount3Code {


    /**
     * Cash account.
     * 
     */
    CASH,

    /**
     * Central Provident Fund (CPF) ordinary account.
     * 
     */
    CPFO,

    /**
     * Central Provident Fund (CPF) special account.
     * 
     */
    CPFS,

    /**
     * Supplementary Retirement Scheme (SRS) account.
     * 
     */
    SRSA,

    /**
     * Hedge fund account.
     * 
     */
    HEDG;

    public String value() {
        return name();
    }

    public static FundCashAccount3Code fromValue(String v) {
        return valueOf(v);
    }

}
