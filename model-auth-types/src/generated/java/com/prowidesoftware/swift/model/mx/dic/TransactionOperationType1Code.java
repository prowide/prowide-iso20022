
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionOperationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMND"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="CORR"/&gt;
 *     &lt;enumeration value="NEWT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
