
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason79Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason79Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="INIR"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="DCAN"/&gt;
 *     &lt;enumeration value="DPRG"/&gt;
 *     &lt;enumeration value="REJA"/&gt;
 *     &lt;enumeration value="CTCT"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="PROT"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="PROI"/&gt;
 *     &lt;enumeration value="TRTI"/&gt;
 *     &lt;enumeration value="DUPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason79Code")
@XmlEnum
public enum RejectionReason79Code {


    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Instruction is irrevocable.
     * 
     */
    INIR,

    /**
     * Linked reference is unknown.
     * 
     */
    ULNK,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

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
     * Instruction rejected by the issuer agent.
     * 
     */
    REJA,

    /**
     * Contact information is missing.
     * 
     */
    CTCT,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Protect date is required for cover protect instructions.
     * 
     */
    PROT,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * Protect identification is required for cover protect instructions.
     * 
     */
    PROI,

    /**
     * Transaction type is missing or invalid for protect or cover protect instructions.
     * 
     */
    TRTI,

    /**
     * Instruction is rejected due to duplicate business message identifier.
     * 
     */
    DUPL;

    public String value() {
        return name();
    }

    public static RejectionReason79Code fromValue(String v) {
        return valueOf(v);
    }

}
