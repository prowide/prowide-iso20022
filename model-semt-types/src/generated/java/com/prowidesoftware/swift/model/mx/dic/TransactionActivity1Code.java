
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionActivity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionActivity1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOLE"/>
 *     <enumeration value="CLAI"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="SETT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
