
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason17Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="INIR"/>
 *     <enumeration value="INTV"/>
 *     <enumeration value="INVA"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="NMTY"/>
 *     <enumeration value="OPNM"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="REFT"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="CERT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason17Code")
@XmlEnum
public enum RejectionReason17Code {


    /**
     * Instruction received after the account servicers specified deadline.
     * 
     */
    ADEA,

    /**
     * Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required.
     * 
     */
    CANC,

    /**
     * Cancellation request was rejected since the instruction has already been cancelled.
     * 
     */
    DCAN,

    /**
     * Cancellation request has been rejected because the instruction process is in progress or has been processed.
     * 
     */
    DPRG,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Unrecognised event number or identification (eg corporate action event number, a meeting identification).
     * 
     */
    EVNM,

    /**
     * The instruction is irrevocable.
     * 
     */
    INIR,

    /**
     * Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option.
     * 
     */
    INTV,

    /**
     * For tax reclaim, the reclaim is invalid for the tax authorities.
     * 
     */
    INVA,

    /**
     * Instructed position exceeds the eligible balance.
     * 
     */
    LACK,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Other reason.
     * 
     */
    OTHR,

    /**
     * Mismatch between option number and option type.
     * 
     */
    NMTY,

    /**
     * Unrecognised option number.
     * 
     */
    OPNM,

    /**
     * Invalid option type.
     * 
     */
    OPTY,

    /**
     * Reclaim is refused by the tax authorities.
     * 
     */
    REFT,

    /**
     * Instruction contains an invalid or unrecognised safekeeping account.
     * 
     */
    SAFE,

    /**
     * Instruction contains an invalid message reference, reference is unknown.
     * 
     */
    ULNK,

    /**
     * Instruction is rejected since the provided certification is incorrect or incomplete.
     * 
     */
    CERT;

    public String value() {
        return name();
    }

    public static RejectionReason17Code fromValue(String v) {
        return valueOf(v);
    }

}
