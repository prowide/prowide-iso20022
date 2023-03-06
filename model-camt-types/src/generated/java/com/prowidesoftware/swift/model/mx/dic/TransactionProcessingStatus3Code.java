
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionProcessingStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionProcessingStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="REPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionProcessingStatus3Code")
@XmlEnum
public enum TransactionProcessingStatus3Code {


    /**
     * Instruction has been cancelled.
     * 
     */
    CAND,

    /**
     * Instruction has been acknowledged/accepted for further processing by the account servicer.
     * 
     */
    PACK,

    /**
     * Instruction has been rejected for further processing.
     * 
     */
    REJT,

    /**
     * Instruction is accepted but in repair.
     * 
     */
    REPR;

    public String value() {
        return name();
    }

    public static TransactionProcessingStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
