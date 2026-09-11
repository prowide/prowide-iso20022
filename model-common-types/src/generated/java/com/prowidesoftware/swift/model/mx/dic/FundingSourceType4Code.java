
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundingSourceType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundingSourceType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
 *     <enumeration value="CARD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundingSourceType4Code")
@XmlEnum
public enum FundingSourceType4Code {


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
    LOYT,

    /**
     * Card.
     * 
     */
    CARD;

    public String value() {
        return name();
    }

    public static FundingSourceType4Code fromValue(String v) {
        return valueOf(v);
    }

}
