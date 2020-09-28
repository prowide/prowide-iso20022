
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="IPOS"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="RBIS"/&gt;
 *     &lt;enumeration value="EVNM"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="PRXY"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="SPLT"/&gt;
 *     &lt;enumeration value="IPOA"/&gt;
 *     &lt;enumeration value="IREG"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason1Code")
@XmlEnum
public enum RejectionReason1Code {


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
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Position is less than required threshold.
     * 
     */
    IPOS,

    /**
     * Instructed position exceeds the eligible balance.
     * 
     */
    LACK,

    /**
     * Instruction contains an invalid or unrecognised safekeeping account.
     * 
     */
    SAFE,

    /**
     * Issuer or Registrar has rejected the instruction.
     * 
     */
    RBIS,

    /**
     * Unrecognised event number or identification (eg corporate action event number, a meeting identification)
     * 
     */
    EVNM,

    /**
     * Instruction contains an invalid message reference, reference is unknown.
     * 
     */
    ULNK,

    /**
     * Invalid proxy information.
     * 
     */
    PRXY,

    /**
     * Partial voting is not allowed.
     * 
     */
    PART,

    /**
     * Split voting is not allowed.
     * 
     */
    SPLT,

    /**
     * Missing or invalid power of attorney.
     * 
     */
    IPOA,

    /**
     * Invalid registration information.
     * 
     */
    IREG,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC;

    public String value() {
        return name();
    }

    public static RejectionReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
