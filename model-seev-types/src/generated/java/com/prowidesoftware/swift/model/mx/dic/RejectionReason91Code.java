
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason91Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason91Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ULNK"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="IPOS"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="SPLT"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="IPOA"/>
 *     <enumeration value="PRXY"/>
 *     <enumeration value="IREG"/>
 *     <enumeration value="RBIS"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="ADDM"/>
 *     <enumeration value="MCAN"/>
 *     <enumeration value="DREM"/>
 *     <enumeration value="NPOS"/>
 *     <enumeration value="RESN"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="LIST"/>
 *     <enumeration value="NOSL"/>
 *     <enumeration value="PMNS"/>
 *     <enumeration value="IPED"/>
 *     <enumeration value="NACD"/>
 *     <enumeration value="EFDM"/>
 *     <enumeration value="ADIM"/>
 *     <enumeration value="MINC"/>
 *     <enumeration value="DSEC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason91Code")
@XmlEnum
public enum RejectionReason91Code {


    /**
     * Linked reference is unknown.
     * 
     */
    ULNK,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * Position is less than required threshold.
     * 
     */
    IPOS,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Split voting is not allowed.
     * 
     */
    SPLT,

    /**
     * Partial voting is not allowed.
     * 
     */
    PART,

    /**
     * Missing or invalid power of attorney.
     * 
     */
    IPOA,

    /**
     * Invalid proxy information.
     * 
     */
    PRXY,

    /**
     * Invalid registration information.
     * 
     */
    IREG,

    /**
     * Issuer or registrar has rejected the instruction.
     * 
     */
    RBIS,

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
     * Invalid option type.
     * 
     */
    OPTY,

    /**
     * Unrecognised event number.
     * 
     */
    EVNM,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Rejected due to missing beneficiary owner details.
     * 
     */
    FULL,

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
     * Deadline to register is missed.
     * 
     */
    DREM,

    /**
     * Insufficient or no registered position.
     * 
     */
    NPOS,

    /**
     * Resolution number provided discrepancy.
     * 
     */
    RESN,

    /**
     * Instruction is rejected due to duplicate business message identifier.
     * 
     */
    DUPL,

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
     * Instruction to virtually attend meeting is rejected due to missing attendee email address.
     * 
     */
    NACD,

    /**
     * Entitlement fixing date is missing or incorrect. 
     * 
     */
    EFDM,

    /**
     * (I)CSD failed to receive (from underlying) or provide (to the issuer agent) the disclosure information required.
     * 
     */
    ADIM,

    /**
     * Classification submitted in the instruction does not match the investor classification in the notification.
     * 
     */
    MINC,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC;

    public String value() {
        return name();
    }

    public static RejectionReason91Code fromValue(String v) {
        return valueOf(v);
    }

}
