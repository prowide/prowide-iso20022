
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason22Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingReason22Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="MONY"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="CLAC"/&gt;
 *     &lt;enumeration value="CMON"/&gt;
 *     &lt;enumeration value="PREA"/&gt;
 *     &lt;enumeration value="LINK"/&gt;
 *     &lt;enumeration value="CYCL"/&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *     &lt;enumeration value="PRCY"/&gt;
 *     &lt;enumeration value="FUTU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingReason22Code")
@XmlEnum
public enum PendingReason22Code {


    /**
     * Instruction was received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Insufficient money in your account.
     * 
     */
    MONY,

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
     * Insufficient deliverable financial instruments in counterparty's account or counterparty does not hold financial instruments.
     * 
     */
    CLAC,

    /**
     * Insufficient money in counterparty's account.
     * 
     */
    CMON,

    /**
     * Your instruction is a preadvice, that is, for matching only.
     * 
     */
    PREA,

    /**
     * Your instruction is pending settlement because the instruction linked to it is pending.
     * 
     */
    LINK,

    /**
     * Your instruction is confirmed in the local market or is ready for settlement, awaiting next settlement cycle.
     * 
     */
    CYCL,

    /**
     * Counterparty's instruction and your instruction are on hold/frozen/ in a preadvice mode.
     * 
     */
    BOTH,

    /**
     * Counterparty's instruction is a preadvice, that is, for matching only.
     * 
     */
    PRCY,

    /**
     * Awaiting settlement date. No settlement problems to be reported.
     * 
     */
    FUTU;

    public String value() {
        return name();
    }

    public static PendingReason22Code fromValue(String v) {
        return valueOf(v);
    }

}
