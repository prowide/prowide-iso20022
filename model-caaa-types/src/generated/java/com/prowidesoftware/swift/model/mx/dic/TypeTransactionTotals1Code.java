
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeTransactionTotals1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeTransactionTotals1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEBT"/>
 *     <enumeration value="DBTR"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="CRDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeTransactionTotals1Code")
@XmlEnum
public enum TypeTransactionTotals1Code {


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
     * Credit transactions (refund, account, cash service, as defined in the transaction service type).
     * 
     */
    CRDT,

    /**
     * Reversal of credit transactions (cancellation).
     * 
     */
    CRDR;

    public String value() {
        return name();
    }

    public static TypeTransactionTotals1Code fromValue(String v) {
        return valueOf(v);
    }

}
