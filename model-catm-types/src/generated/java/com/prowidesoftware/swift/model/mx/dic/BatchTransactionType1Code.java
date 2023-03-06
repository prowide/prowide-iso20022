
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchTransactionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DTCT"/&gt;
 *     &lt;enumeration value="CNCL"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="DCLN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BatchTransactionType1Code")
@XmlEnum
public enum BatchTransactionType1Code {


    /**
     * Debit and credit transactions.
     * 
     */
    DTCT,

    /**
     * Cancellation of a previous transaction.
     * 
     */
    CNCL,

    /**
     * Failed transactions.
     * 
     */
    FAIL,

    /**
     * Declined transactions.
     * 
     */
    DCLN;

    public String value() {
        return name();
    }

    public static BatchTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
