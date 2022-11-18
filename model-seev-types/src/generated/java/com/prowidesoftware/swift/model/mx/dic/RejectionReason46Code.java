
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason46Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason46Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *     &lt;enumeration value="OPTY"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="NMTY"/&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="INTV"/&gt;
 *     &lt;enumeration value="OPNM"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="REFT"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="EVNM"/&gt;
 *     &lt;enumeration value="DQCS"/&gt;
 *     &lt;enumeration value="DQCC"/&gt;
 *     &lt;enumeration value="DQAM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason46Code")
@XmlEnum
public enum RejectionReason46Code {


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
    DQAM;

    public String value() {
        return name();
    }

    public static RejectionReason46Code fromValue(String v) {
        return valueOf(v);
    }

}
