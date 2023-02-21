
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionActivity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionActivity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOLE"/&gt;
 *     &lt;enumeration value="CLAI"/&gt;
 *     &lt;enumeration value="COLL"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="SETT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionActivity1Code")
@XmlEnum
public enum TransactionActivity1Code {


    /**
     * Transaction relates to lending/borrowing.
     * 
     */
    BOLE,

    /**
     * Transaction relates to a market claim following a corporate action.
     * 
     */
    CLAI,

    /**
     * Transaction relates to collateral.
     * 
     */
    COLL,

    /**
     * Transaction relates to corporate action.
     * 
     */
    CORP,

    /**
     * Transaction relates to settlement and clearing.
     * 
     */
    SETT;

    public String value() {
        return name();
    }

    public static TransactionActivity1Code fromValue(String v) {
        return valueOf(v);
    }

}
