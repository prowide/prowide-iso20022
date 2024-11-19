
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesFinancingTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesFinancingTransactionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REPU"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="SECB"/>
 *     <enumeration value="SECL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesFinancingTransactionType1Code")
@XmlEnum
public enum SecuritiesFinancingTransactionType1Code {


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
    SECL;

    public String value() {
        return name();
    }

    public static SecuritiesFinancingTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
