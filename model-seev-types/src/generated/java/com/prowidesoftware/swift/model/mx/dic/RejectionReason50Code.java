
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason50Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason50Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="ADDM"/&gt;
 *     &lt;enumeration value="MCAN"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="DREM"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="EVNM"/&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="IPOA"/&gt;
 *     &lt;enumeration value="IPOS"/&gt;
 *     &lt;enumeration value="IREG"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="NPOS"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="PRXY"/&gt;
 *     &lt;enumeration value="RBIS"/&gt;
 *     &lt;enumeration value="RESN"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="SPLT"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="OPTY"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason50Code")
@XmlEnum
public enum RejectionReason50Code {


    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Requested additional documentation is missing. 
     * 
     */
    ADDM,

    /**
     * Event has been cancelled.
     * 
     */
    MCAN,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Deadline to register is missed.
     * 
     */
    DREM,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Unrecognised event number.
     * 
     */
    EVNM,

    /**
     * Rejected due to missing beneficiary owner details.
     * 
     */
    FULL,

    /**
     * Missing or invalid power of attorney.
     * 
     */
    IPOA,

    /**
     * Position is less than required threshold.
     * 
     */
    IPOS,

    /**
     * Invalid registration information.
     * 
     */
    IREG,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Insufficient or no registered position.
     * 
     */
    NPOS,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Partial voting is not allowed.
     * 
     */
    PART,

    /**
     * Invalid proxy information.
     * 
     */
    PRXY,

    /**
     * Issuer or registrar has rejected the instruction.
     * 
     */
    RBIS,

    /**
     * Resolution number provided discrepancy.
     * 
     */
    RESN,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * Split voting is not allowed.
     * 
     */
    SPLT,

    /**
     * Linked reference is unknown.
     * 
     */
    ULNK,

    /**
     * Invalid option type.
     * 
     */
    OPTY,

    /**
     * Instructed position exceeds the eligible balance.
     * 
     */
    LACK;

    public String value() {
        return name();
    }

    public static RejectionReason50Code fromValue(String v) {
        return valueOf(v);
    }

}
