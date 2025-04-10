
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BatchTransactionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DTCT"/>
 *     <enumeration value="CNCL"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="DCLN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
