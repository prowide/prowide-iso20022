
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason25Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingReason25Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="ADDM"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="DREM"/&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="IPOA"/&gt;
 *     &lt;enumeration value="IPOS"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="NPOS"/&gt;
 *     &lt;enumeration value="IREG"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PRXY"/&gt;
 *     &lt;enumeration value="PENR"/&gt;
 *     &lt;enumeration value="IPED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingReason25Code")
@XmlEnum
public enum PendingReason25Code {


    /**
     * Instruction was received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Additional documents requested missing.
     * 
     */
    ADDM,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * Deadline to register is missed.
     * 
     */
    DREM,

    /**
     * Pending receipt of beneficiary owner details.
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
     * Insufficient financial instruments in your account.
     * 
     */
    LACK,

    /**
     * Instruction was received after market deadline.
     * 
     */
    LATE,

    /**
     * Insufficient or no registered position.
     * 
     */
    NPOS,

    /**
     * Invalid registration discrepancy.
     * 
     */
    IREG,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Invalid Proxy Information.
     * 
     */
    PRXY,

    /**
     * The instruction is pending receipt of securities, for example, from a purchase or loan.
     * 
     */
    PENR,

    /**
     * Instruction was received prior to entitlement date.
     * 
     */
    IPED;

    public String value() {
        return name();
    }

    public static PendingReason25Code fromValue(String v) {
        return valueOf(v);
    }

}
