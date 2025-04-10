
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason86Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason86Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="INVA"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="NMTY"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="INTV"/>
 *     <enumeration value="OPNM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="REFT"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="DQCS"/>
 *     <enumeration value="DQCC"/>
 *     <enumeration value="DQAM"/>
 *     <enumeration value="IRDQ"/>
 *     <enumeration value="DQBV"/>
 *     <enumeration value="DQBI"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="INIR"/>
 *     <enumeration value="SHAR"/>
 *     <enumeration value="BSTR"/>
 *     <enumeration value="CTCT"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="PROI"/>
 *     <enumeration value="PROT"/>
 *     <enumeration value="PRON"/>
 *     <enumeration value="TRTI"/>
 *     <enumeration value="REJA"/>
 *     <enumeration value="IPAW"/>
 *     <enumeration value="IPED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason86Code")
@XmlEnum
public enum RejectionReason86Code {


    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Instruction is rejected since the provided certification is incorrect or incomplete.
     * 
     */
    CERT,

    /**
     * For tax reclaim, the reclaim is invalid for the tax authorities.
     * 
     */
    INVA,

    /**
     * Invalid option type.
     * 
     */
    OPTY,

    /**
     * Linked reference is unknown.
     * 
     */
    ULNK,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

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
     * Mismatch between option number and option type.
     * 
     */
    NMTY,

    /**
     * Rejected due to missing beneficiary owner details.
     * 
     */
    FULL,

    /**
     * Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required.
     * 
     */
    CANC,

    /**
     * Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, for example, expired option.
     * 
     */
    INTV,

    /**
     * Unrecognised option number.
     * 
     */
    OPNM,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Reclaim is refused by the tax authorities.
     * 
     */
    REFT,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * Unrecognised event number.
     * 
     */
    EVNM,

    /**
     * Unrecognised or invalid instructed cash amount.
     * 
     */
    DQCS,

    /**
     * Invalid instructed currency.
     * 
     */
    DQCC,

    /**
     * Invalid use of instructed amount (QCAS) or of instructed quantity (QINS) qualifiers.
     * 
     */
    DQAM,

    /**
     * Instruction is rejected due to invalid use of the additional round up quantity.
     * 
     */
    IRDQ,

    /**
     * Bid price / basis points / percentage falls outside of bid range for the event (generally used in Dutch Auctions or Bid Tenders).
     * 
     */
    DQBV,

    /**
     * Bid price / basis points / percentage increments rejected due to invalid bid increment for the event (generally used in Dutch Auctions or Bid Tenders).
     * 
     */
    DQBI,

    /**
     * Cancellation request was rejected since the instruction has already been cancelled.
     * 
     */
    DCAN,

    /**
     * Cancellation request has been rejected because the instruction process is in progress or has been processed.
     * 
     */
    DPRG,

    /**
     * Instruction is irrevocable.
     * 
     */
    INIR,

    /**
     * Unrecognised, missing or invalid shareholder number.
     * 
     */
    SHAR,

    /**
     * Instruction is submitted before instruction start date.
     * 
     */
    BSTR,

    /**
     * Contact information is missing.
     * 
     */
    CTCT,

    /**
     * Instruction is rejected due to duplicate business message identifier.
     * 
     */
    DUPL,

    /**
     * Protect identification is required for cover protect instructions.
     * 
     */
    PROI,

    /**
     * Protect date is required for cover protect instructions.
     * 
     */
    PROT,

    /**
     * No protect privilege for this event.
     * 
     */
    PRON,

    /**
     * Transaction type is missing or invalid for protect or cover protect instructions.
     * 
     */
    TRTI,

    /**
     * Instruction rejected by the issuer agent.
     * 
     */
    REJA,

    /**
     * Required paperwork is invalid, incomplete or missing.
     * 
     */
    IPAW,

    /**
     * Instruction was received prior to entitlement date.
     * 
     */
    IPED;

    public String value() {
        return name();
    }

    public static RejectionReason86Code fromValue(String v) {
        return valueOf(v);
    }

}
