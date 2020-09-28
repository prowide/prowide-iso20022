
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="RBIS"/&gt;
 *     &lt;enumeration value="INIR"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="DCAN"/&gt;
 *     &lt;enumeration value="DPRG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason2Code")
@XmlEnum
public enum RejectionReason2Code {


    /**
     * Instruction contains an invalid message reference, reference is unknown.
     * 
     */
    ULNK,

    /**
     * Issuer or Registrar has rejected the instruction.
     * 
     */
    RBIS,

    /**
     * The instruction is irrevocable
     * 
     */
    INIR,

    /**
     * Instruction received after the account servicers specified deadline.
     * 
     */
    ADEA,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Cancellation request was rejected since the instruction has already been cancelled.
     * 
     */
    DCAN,

    /**
     * Cancellation request has been rejected because the instruction process is in progress or has been processed.
     * 
     */
    DPRG;

    public String value() {
        return name();
    }

    public static RejectionReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
