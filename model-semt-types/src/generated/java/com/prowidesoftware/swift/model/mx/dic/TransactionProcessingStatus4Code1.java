
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionProcessingStatus4Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionProcessingStatus4Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="CAND"/>
 *     <enumeration value="CANP"/>
 *     <enumeration value="CPRC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionProcessingStatus4Code__1")
@XmlEnum
public enum TransactionProcessingStatus4Code1 {


    /**
     * Instruction has been acknowledged/accepted for further processing by the account servicer.
     * 
     */
    PACK,

    /**
     * Instruction has been cancelled.
     * 
     */
    CAND,

    /**
     * Cancellation request from yourself for this instruction is pending waiting for further processing.
     * 
     */
    CANP,

    /**
     * Cancellation request from the counterparty is awaiting for your cancellation request or your consent.
     * 
     */
    CPRC;

    public String value() {
        return name();
    }

    public static TransactionProcessingStatus4Code1 fromValue(String v) {
        return valueOf(v);
    }

}
