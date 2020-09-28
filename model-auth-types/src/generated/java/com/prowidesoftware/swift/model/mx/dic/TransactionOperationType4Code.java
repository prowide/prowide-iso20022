
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionOperationType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionOperationType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEWT"/&gt;
 *     &lt;enumeration value="AMND"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
