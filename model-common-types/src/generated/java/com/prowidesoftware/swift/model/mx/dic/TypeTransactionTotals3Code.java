
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeTransactionTotals3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeTransactionTotals3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRDT"/>
 *     <enumeration value="CRDR"/>
 *     <enumeration value="DEBT"/>
 *     <enumeration value="DBTR"/>
 *     <enumeration value="DECL"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="RESV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeTransactionTotals3Code")
@XmlEnum
public enum TypeTransactionTotals3Code {


    /**
     * Credit transactions (refund, account, cash service, as defined in the transaction service type).
     * 
     */
    CRDT,

    /**
     * Reversal of credit transactions (cancellation).
     * 
     */
    CRDR,

    /**
     * Debit transactions on the cardholder account.
     * 
     */
    DEBT,

    /**
     * Reversal of debit transactions (cancellation).
     * 
     */
    DBTR,

    /**
     * Declined transactions.
     * 
     */
    DECL,

    /**
     * Failed transactions.
     * 
     */
    FAIL,

    /**
     * Outstanding Reservation transactions.
     * 
     */
    RESV;

    public String value() {
        return name();
    }

    public static TypeTransactionTotals3Code fromValue(String v) {
        return valueOf(v);
    }

}
