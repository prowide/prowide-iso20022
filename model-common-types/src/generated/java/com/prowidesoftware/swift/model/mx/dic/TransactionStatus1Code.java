
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RVSL"/&gt;
 *     &lt;enumeration value="REBO"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionStatus1Code")
@XmlEnum
public enum TransactionStatus1Code {


    /**
     * Transaction has been reversed.
     * 
     */
    RVSL,

    /**
     * Transaction has been rebooked.
     * 
     */
    REBO,

    /**
     * Transaction has been cancelled.
     * 
     */
    CANC;

    public String value() {
        return name();
    }

    public static TransactionStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
