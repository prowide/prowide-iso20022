
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason41Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason41Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ADDM"/>
 *     <enumeration value="DREM"/>
 *     <enumeration value="IPED"/>
 *     <enumeration value="IPOS"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="IPOA"/>
 *     <enumeration value="NPOS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="PRXY"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="IREG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason41Code")
@XmlEnum
public enum PendingReason41Code {


    /**
     * Instruction was received after the account servicer's deadline. It will be managed as per the bilateral service agreement between the account servicer and account owner.
     * 
     */
    ADEA,

    /**
     * Additional documents requested missing.
     * 
     */
    ADDM,

    /**
     * Deadline to register is missed.
     * 
     */
    DREM,

    /**
     * Instruction was received prior to entitlement date.
     * 
     */
    IPED,

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
     * Missing or invalid power of attorney.
     * 
     */
    IPOA,

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
     * Pending receipt of beneficiary owner details.
     * 
     */
    FULL,

    /**
     * Instruction is pending receipt of securities, for example, from a purchase or loan.
     * 
     */
    PENR,

    /**
     * Invalid Proxy Information.
     * 
     */
    PRXY,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * Invalid registration discrepancy.
     * 
     */
    IREG;

    public String value() {
        return name();
    }

    public static PendingReason41Code fromValue(String v) {
        return valueOf(v);
    }

}
