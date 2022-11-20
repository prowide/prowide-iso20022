
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason17Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="DCAN"/&gt;
 *     &lt;enumeration value="DPRG"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="EVNM"/&gt;
 *     &lt;enumeration value="INIR"/&gt;
 *     &lt;enumeration value="INTV"/&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="NMTY"/&gt;
 *     &lt;enumeration value="OPNM"/&gt;
 *     &lt;enumeration value="OPTY"/&gt;
 *     &lt;enumeration value="REFT"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
