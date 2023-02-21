
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason63Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason63Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="CCIX"/&gt;
 *     &lt;enumeration value="CCTI"/&gt;
 *     &lt;enumeration value="IIND"/&gt;
 *     &lt;enumeration value="PTYA"/&gt;
 *     &lt;enumeration value="PTYB"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="ITPA"/&gt;
 *     &lt;enumeration value="SAFA"/&gt;
 *     &lt;enumeration value="SAFB"/&gt;
 *     &lt;enumeration value="REDT"/&gt;
 *     &lt;enumeration value="DCAN"/&gt;
 *     &lt;enumeration value="DPRG"/&gt;
 *     &lt;enumeration value="RSET"/&gt;
 *     &lt;enumeration value="RREP"/&gt;
 *     &lt;enumeration value="NRJN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason63Code")
@XmlEnum
public enum RejectionReason63Code {


    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Unrecognised or invalid client collateral instruction identification.
     * 
     */
    CCIX,

    /**
     * Unrecognised or invalid Client Collateral Transaction Identification.
     * 
     */
    CCTI,

    /**
     * Unrecognised, invalid or missing common reference.
     * 
     */
    IIND,

    /**
     * Unrecognised or Invalid Party A.
     * 
     */
    PTYA,

    /**
     * Unrecognised or Invalid Party B
     * 
     */
    PTYB,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Unrecognised or Invalid Triparty Agent
     * 
     */
    ITPA,

    /**
     * Unrecognised or invalid Party A Safekeeping Account
     * 
     */
    SAFA,

    /**
     * Unrecognised or Invalid Party B Safekeeping Account.
     * 
     */
    SAFB,

    /**
     * Invalid execution date/time
     * 
     */
    REDT,

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
     * Cancellation request was rejected because the instruction was already settled.
     * 
     */
    RSET,

    /**
     * Cancellation request was rejected because the repurchase was cancelled.
     * 
     */
    RREP,

    /**
     * Cancellation, modification or termination request has been rejected since the instruction could not be found.
     * 
     */
    NRJN;

    public String value() {
        return name();
    }

    public static RejectionReason63Code fromValue(String v) {
        return valueOf(v);
    }

}
