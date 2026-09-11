
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason87Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason87Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPTY"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="NMTY"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="INTV"/>
 *     <enumeration value="OPNM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="DQCC"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="DSET"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="TRTY"/>
 *     <enumeration value="BUMM"/>
 *     <enumeration value="ECMD"/>
 *     <enumeration value="ECRD"/>
 *     <enumeration value="DUCK"/>
 *     <enumeration value="DUST"/>
 *     <enumeration value="DSNA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason87Code")
@XmlEnum
public enum RejectionReason87Code {


    /**
     * Invalid option type.
     * 
     */
    OPTY,

    /**
     * Linked reference is unknown.
     * 
     */
    ULNK,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Mismatch between option number and option type.
     * 
     */
    NMTY,

    /**
     * Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required.
     * 
     */
    CANC,

    /**
     * Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, for example, expired option.
     * 
     */
    INTV,

    /**
     * Unrecognised option number.
     * 
     */
    OPNM,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Unrecognised event number.
     * 
     */
    EVNM,

    /**
     * Invalid instructed currency.
     * 
     */
    DQCC,

    /**
     * Instruction is rejected due to duplicate business message identifier.
     * 
     */
    DUPL,

    /**
     * Cancellation request was denied because the instruction was already settled.
     * 
     */
    DSET,

    /**
     * Cancellation request was rejected since the instruction has already been cancelled.
     * 
     */
    DCAN,

    /**
     * Transaction type is incorrect.
     * 
     */
    TRTY,

    /**
     * Counterparty disagreement on the chosen corporate action outturn.
     * 
     */
    BUMM,

    /**
     * Received after the election to counterparty market deadline.
     * 
     */
    ECMD,

    /**
     * Received after the election to counterparty response market deadline.
     * 
     */
    ECRD,

    /**
     * Buyer Protection instruction rejected since underlying settlement transaction has been cancelled.
     * 
     */
    DUCK,

    /**
     * Buyer Protection instruction was rejected, because the underlying settlement transaction has already been settled.
     * 
     */
    DUST,

    /**
     * Underlying transaction type/status does not allow for a buyer protection.
     * 
     */
    DSNA;

    public String value() {
        return name();
    }

    public static RejectionReason87Code fromValue(String v) {
        return valueOf(v);
    }

}
