
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason31Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason31Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOC"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PRSY"/>
 *     <enumeration value="INBC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason31Code")
@XmlEnum
public enum PendingReason31Code {


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
     * Financial instruments are not deliverable as they are pledged as collateral.
     * 
     */
    COLL,

    /**
     * Your instruction is pending settlement because the instruction linked to it is pending.
     * 
     */
    LINK,

    /**
     * Awaiting settlement date. No settlement problems to be reported.
     * 
     */
    FUTU,

    /**
     * Insufficient financial instruments in your account.
     * 
     */
    LACK,

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

    public static PendingReason31Code fromValue(String v) {
        return valueOf(v);
    }

}
