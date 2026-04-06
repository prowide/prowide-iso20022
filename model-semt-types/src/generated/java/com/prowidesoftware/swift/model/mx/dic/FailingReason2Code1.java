
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailingReason2Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailingReason2Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOC"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="PREA"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="CMON"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="PRCY"/>
 *     <enumeration value="PRSY"/>
 *     <enumeration value="CDLR"/>
 *     <enumeration value="CSDH"/>
 *     <enumeration value="CVAL"/>
 *     <enumeration value="INBC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FailingReason2Code__1")
@XmlEnum
public enum FailingReason2Code1 {


    /**
     * Your account is blocked, no instruction can settle over the account.
     * 
     */
    BLOC,

    /**
     * Insufficient deliverable financial instruments in counterparty's account or counterparty does not hold financial instruments.
     * 
     */
    CLAC,

    /**
     * Your instruction is a preadvice, that is, for matching only.
     * 
     */
    PREA,

    /**
     * Trade will settle in partials.
     * 
     */
    PART,

    /**
     * Insufficient money in counterparty's account.
     * 
     */
    CMON,

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
     * Insufficient money in your account.
     * 
     */
    MONY,

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
     * Counterparty's instruction is a preadvice, that is, for matching only.
     * 
     */
    PRCY,

    /**
     * Transaction was put on hold/frozen by the system.
     * 
     */
    PRSY,

    /**
     * Instruction is in a hold/frozen/preadvice mode. Market infrastructure platform is awaiting release.
     * 
     */
    CDLR,

    /**
     * Central securities depository sets the instruction in a hold/frozen/preadvice mode.
     * 
     */
    CSDH,

    /**
     * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.
     * 
     */
    CVAL,

    /**
     * Not all the instructions part of a pool have been received.
     * 
     */
    INBC;

    public String value() {
        return name();
    }

    public static FailingReason2Code1 fromValue(String v) {
        return valueOf(v);
    }

}
