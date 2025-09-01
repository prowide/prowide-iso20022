
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundCashAccount1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundCashAccount1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CPFO"/&gt;
 *     &lt;enumeration value="CPFS"/&gt;
 *     &lt;enumeration value="SRSA"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundCashAccount1Code")
@XmlEnum
public enum FundCashAccount1Code {


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
     * Another type cash account.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static FundCashAccount1Code fromValue(String v) {
        return valueOf(v);
    }

}
