
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionOperationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMND"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="CORR"/>
 *     <enumeration value="NEWT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionOperationType1Code")
@XmlEnum
public enum TransactionOperationType1Code {


    /**
     * Transaction amends a previously sent transaction.
     * 
     */
    AMND,

    /**
     * Transaction requests the deletion/cancellation of a previously sent transaction.
     * 
     */
    CANC,

    /**
     * Transaction corrects errors in a previously sent transaction.
     * 
     */
    CORR,

    /**
     * Transaction is a new transaction.
     * 
     */
    NEWT;

    public String value() {
        return name();
    }

    public static TransactionOperationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
