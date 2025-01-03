
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason25Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason25Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ADDM"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DREM"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="IPOA"/>
 *     <enumeration value="IPOS"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="NPOS"/>
 *     <enumeration value="IREG"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PRXY"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="IPED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
