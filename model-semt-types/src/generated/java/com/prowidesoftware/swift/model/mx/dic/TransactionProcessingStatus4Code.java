
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionProcessingStatus4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionProcessingStatus4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="PPRC"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="REPR"/>
 *     <enumeration value="CAND"/>
 *     <enumeration value="CANP"/>
 *     <enumeration value="CPRC"/>
 *     <enumeration value="MPRC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionProcessingStatus4Code")
@XmlEnum
public enum TransactionProcessingStatus4Code {


    /**
     * Instruction has been acknowledged/accepted for further processing by the account servicer.
     * 
     */
    PACK,

    /**
     * Processing of the instruction is pending.
     * 
     */
    PPRC,

    /**
     * Instruction has been rejected for further processing.
     * 
     */
    REJT,

    /**
     * Instruction is accepted but in repair.
     * 
     */
    REPR,

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
    CPRC,

    /**
     * Modification request from the counterparty is awaiting for your modification request or your consent.
     * 
     */
    MPRC;

    public String value() {
        return name();
    }

    public static TransactionProcessingStatus4Code fromValue(String v) {
        return valueOf(v);
    }

}
