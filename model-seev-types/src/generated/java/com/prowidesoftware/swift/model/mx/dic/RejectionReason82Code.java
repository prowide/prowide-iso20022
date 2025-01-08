
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason82Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason82Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ADDM"/>
 *     <enumeration value="MCAN"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DREM"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="IPOA"/>
 *     <enumeration value="IPOS"/>
 *     <enumeration value="IREG"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="NPOS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PRXY"/>
 *     <enumeration value="RBIS"/>
 *     <enumeration value="RESN"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SPLT"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LIST"/>
 *     <enumeration value="NOSL"/>
 *     <enumeration value="PMNS"/>
 *     <enumeration value="IPED"/>
 *     <enumeration value="DUPL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason82Code")
@XmlEnum
public enum RejectionReason82Code {


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
    LACK,

    /**
     * Instruction is invalid due to multiple resolutions instructed as vote "For” and belonging to the same listing group resolution label number.
     * 
     */
    LIST,

    /**
     * Invalid instruction as the shareholder or its delegate is not registered in the company stock ledger book.
     * 
     */
    NOSL,

    /**
     * Instruction rejected due to the method of participation not supported by the account servicer.
     * 
     */
    PMNS,

    /**
     * Instruction was received prior to entitlement date.
     * 
     */
    IPED,

    /**
     * Instruction is rejected due to duplicate business message identifier.
     * 
     */
    DUPL;

    public String value() {
        return name();
    }

    public static RejectionReason82Code fromValue(String v) {
        return valueOf(v);
    }

}
