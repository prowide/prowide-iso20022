
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesFinancingTransactionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesFinancingTransactionType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REPU"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="SECB"/>
 *     <enumeration value="SECL"/>
 *     <enumeration value="BSBK"/>
 *     <enumeration value="SBBK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesFinancingTransactionType2Code")
@XmlEnum
public enum SecuritiesFinancingTransactionType2Code {


    /**
     * Relates to a repurchase agreement transaction.
     * 
     */
    REPU,

    /**
     * Relates to a reverse repurchase agreement transaction.
     * 
     */
    RVPO,

    /**
     * Relates to a securities borrowing operation.
     * 
     */
    SECB,

    /**
     * Relates to a securities lending operation.
     * 
     */
    SECL,

    /**
     * Relates to a buy sell back transaction.
     * 
     */
    BSBK,

    /**
     * Relates to a sell buy back transaction.
     * 
     */
    SBBK;

    public String value() {
        return name();
    }

    public static SecuritiesFinancingTransactionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
