
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailingReason3Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailingReason3Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOC"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="INBC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FailingReason3Code__1")
@XmlEnum
public enum FailingReason3Code1 {


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
     * Financial instruments are blocked due to, for example, a corporate action event, realignment.
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
     * Not all the instructions part of a pool have been received.
     * 
     */
    INBC;

    public String value() {
        return name();
    }

    public static FailingReason3Code1 fromValue(String v) {
        return valueOf(v);
    }

}
