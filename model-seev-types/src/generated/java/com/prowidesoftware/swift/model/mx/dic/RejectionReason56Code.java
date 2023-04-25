
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason56Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason56Code">
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
 *     <enumeration value="SHAR"/>
 *     <enumeration value="ITAX"/>
 *     <enumeration value="NTAX"/>
 *     <enumeration value="MTAX"/>
 *     <enumeration value="ISOL"/>
 *     <enumeration value="BSTR"/>
 *     <enumeration value="CTCT"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="PROI"/>
 *     <enumeration value="PRON"/>
 *     <enumeration value="PROT"/>
 *     <enumeration value="TRTI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason56Code")
@XmlEnum
public enum RejectionReason56Code {


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
     * Unrecognised, missing or invalid shareholder number.
     * 
     */
    SHAR,

    /**
     * Tax rate provided is incorrect. It falls outside the acceptable values for that investment country.
     * 
     */
    ITAX,

    /**
     * Tax rate is not consistent with the documentation in place.
     * 
     */
    NTAX,

    /**
     * Tax rate is missing.
     * 
     */
    MTAX,

    /**
     * Invalid use of solicitation dealer fee indicator.
     * 
     */
    ISOL,

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
     * No protect privilege for this event.
     * 
     */
    PRON,

    /**
     * Protect date is required for cover protect instructions.
     * 
     */
    PROT,

    /**
     * Transaction type is missing or invalid for protect or cover protect instructions.
     * 
     */
    TRTI;

    public String value() {
        return name();
    }

    public static RejectionReason56Code fromValue(String v) {
        return valueOf(v);
    }

}
