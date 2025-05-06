
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundingSourceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundingSourceType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SVNG"/>
 *     <enumeration value="UVRL"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="CDBT"/>
 *     <enumeration value="EPRS"/>
 *     <enumeration value="DBAC"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="CHQE"/>
 *     <enumeration value="PRPD"/>
 *     <enumeration value="LCDT"/>
 *     <enumeration value="LOYT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundingSourceType3Code")
@XmlEnum
public enum FundingSourceType3Code {


    /**
     * Other type of account defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of account defined at private level.
     * 
     */
    OTHP,

    /**
     * Savings account.
     * 
     */
    SVNG,

    /**
     * Universal account.
     * 
     */
    UVRL,

    /**
     * Cash as a source type  to perform the transaction.
     * 
     */
    CASH,

    /**
     * Credit card account.
     * 
     */
    CRDT,

    /**
     * Debit card account.
     * 
     */
    CDBT,

    /**
     * Electronic purse card account.
     * 
     */
    EPRS,

    /**
     * Account for debiting funds.
     * 
     */
    DBAC,

    /**
     * Current account.
     * 
     */
    CURR,

    /**
     * Cheque
     * 
     */
    CHQE,

    /**
     * Pre-paid account.
     * 
     */
    PRPD,

    /**
     * Line of credit account.
     * 
     */
    LCDT,

    /**
     * Loyalty points converted into cash.
     * 
     */
    LOYT;

    public String value() {
        return name();
    }

    public static FundingSourceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
