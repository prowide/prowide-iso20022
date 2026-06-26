
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailingReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailingReason6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOC"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="PRSY"/>
 *     <enumeration value="INBC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FailingReason6Code")
@XmlEnum
public enum FailingReason6Code {


    /**
     * Your account is blocked, no instruction can settle over the account.
     * 
     */
    BLOC,

    /**
     * Trade will settle in partials.
     * 
     */
    PART,

    /**
     * Your instruction is pending settlement because the instruction linked to it is pending.
     * 
     */
    LINK,

    /**
     * Insufficient financial instruments in your account.
     * 
     */
    LACK,

    /**
     * Your instruction is confirmed in the local market or is ready for settlement, awaiting next settlement cycle.
     * 
     */
    CYCL,

    /**
     * Financial instruments are blocked due to a corporate action event, realignment, etc.
     * 
     */
    SBLO,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Instruction was received after market deadline.
     * 
     */
    LATE,

    /**
     * Certificate number error.
     * 
     */
    CERT,

    /**
     * Transaction was put on hold/frozen by the system.
     * 
     */
    PRSY,

    /**
     * Not all the instructions part of a pool have been received.
     * 
     */
    INBC;

    public String value() {
        return name();
    }

    public static FailingReason6Code fromValue(String v) {
        return valueOf(v);
    }

}
