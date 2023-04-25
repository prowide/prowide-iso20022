
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionOperationType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEWT"/>
 *     <enumeration value="AMND"/>
 *     <enumeration value="CANC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionOperationType4Code")
@XmlEnum
public enum TransactionOperationType4Code {


    /**
     * Transaction is a new transaction.
     * 
     */
    NEWT,

    /**
     * Transaction amends a previously sent transaction.
     * 
     */
    AMND,

    /**
     * Transaction requests the deletion/cancellation of a previously sent transaction.
     * 
     */
    CANC;

    public String value() {
        return name();
    }

    public static TransactionOperationType4Code fromValue(String v) {
        return valueOf(v);
    }

}
