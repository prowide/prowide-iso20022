
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundCashAccount2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundCashAccount2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="CPFO"/>
 *     <enumeration value="CPFS"/>
 *     <enumeration value="SRSA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundCashAccount2Code")
@XmlEnum
public enum FundCashAccount2Code {


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
    SRSA;

    public String value() {
        return name();
    }

    public static FundCashAccount2Code fromValue(String v) {
        return valueOf(v);
    }

}
