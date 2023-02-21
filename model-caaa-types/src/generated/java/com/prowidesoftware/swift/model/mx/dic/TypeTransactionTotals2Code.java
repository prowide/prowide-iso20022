
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeTransactionTotals2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeTransactionTotals2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRDT"/&gt;
 *     &lt;enumeration value="CRDR"/&gt;
 *     &lt;enumeration value="DEBT"/&gt;
 *     &lt;enumeration value="DBTR"/&gt;
 *     &lt;enumeration value="DECL"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeTransactionTotals2Code")
@XmlEnum
public enum TypeTransactionTotals2Code {


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
    FAIL;

    public String value() {
        return name();
    }

    public static TypeTransactionTotals2Code fromValue(String v) {
        return valueOf(v);
    }

}
