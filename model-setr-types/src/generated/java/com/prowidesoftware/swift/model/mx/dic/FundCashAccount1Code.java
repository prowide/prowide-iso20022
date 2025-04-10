
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundCashAccount1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundCashAccount1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="CPFO"/>
 *     <enumeration value="CPFS"/>
 *     <enumeration value="SRSA"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
