
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason62Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason62Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REFE"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CCIX"/>
 *     <enumeration value="CCTI"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="PTYA"/>
 *     <enumeration value="PTYB"/>
 *     <enumeration value="ITPA"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="SAFA"/>
 *     <enumeration value="SAFB"/>
 *     <enumeration value="REDT"/>
 *     <enumeration value="SEPR"/>
 *     <enumeration value="LBDR"/>
 *     <enumeration value="DCBR"/>
 *     <enumeration value="CSAC"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="IESP"/>
 *     <enumeration value="IEXT"/>
 *     <enumeration value="IPBI"/>
 *     <enumeration value="IRIT"/>
 *     <enumeration value="TMAC"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="TXAC"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="TABC"/>
 *     <enumeration value="ICTT"/>
 *     <enumeration value="NRJN"/>
 *     <enumeration value="NFCA"/>
 *     <enumeration value="CTRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason62Code")
@XmlEnum
public enum RejectionReason62Code {


    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Unrecognised or invalid client collateral instruction identification.
     * 
     */
    CCIX,

    /**
     * Unrecognised or invalid Client Collateral Transaction Identification.
     * 
     */
    CCTI,

    /**
     * Unrecognised, invalid or missing common reference.
     * 
     */
    IIND,

    /**
     * Unrecognised or Invalid Party A.
     * 
     */
    PTYA,

    /**
     * Unrecognised or Invalid Party B
     * 
     */
    PTYB,

    /**
     * Unrecognised or Invalid Triparty Agent
     * 
     */
    ITPA,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Unrecognised or invalid Party A Safekeeping Account
     * 
     */
    SAFA,

    /**
     * Unrecognised or Invalid Party B Safekeeping Account.
     * 
     */
    SAFB,

    /**
     * Invalid execution date/time
     * 
     */
    REDT,

    /**
     * Unrecognised or invalid settlement process instructed.
     * 
     * 
     */
    SEPR,

    /**
     * Number of lookback days not supported.
     * 
     * 
     */
    LBDR,

    /**
     * Day count basis not supported.
     * 
     * 
     */
    DCBR,

    /**
     * Compound simple accrual calculation is not supported.
     * 
     * 
     * 
     */
    CSAC,

    /**
     * Unrecognised or invalid closing date/time.
     * 
     */
    TERM,

    /**
     * Unrecognised or invalid trade date or requested trade date or future trade date.
     * 
     */
    DTRD,

    /**
     * Unrecognised or invalid settlement date.
     * 
     */
    DDAT,

    /**
     * Unrecognised or invalid settlement amount currency.
     * 
     */
    NCRR,

    /**
     * This is an unrecognised or invalid Eligibility Set Profile.
     * 
     */
    IESP,

    /**
     * This is an unrecognised or invalid Exposure Type (used when a proprietary code is sent).
     * 
     */
    IEXT,

    /**
     * Unrecognised or invalid Preferential Basket identification.
     * 
     */
    IPBI,

    /**
     * Unrecognised or invalid Rate Index Type (used when a proprietary code is sent).
     * 
     */
    IRIT,

    /**
     * Termination amount currency not supported.
     * 
     */
    TMAC,

    /**
     * Unrecognised or invalid termination transaction amount.
     * 
     */
    REPA,

    /**
     * Transaction amount currency not supported.
     * 
     */
    TXAC,

    /**
     * More than one instruction match the criteria.
     * 
     */
    NRGM,

    /**
     * Transaction amount breakdown currency differs from transaction amount currency.
     * 
     */
    TABC,

    /**
     * This is an unrecognised or invalid Collateral Transaction Type.
     * 
     */
    ICTT,

    /**
     * Cancellation, modification or termination request has been rejected since the instruction could not be found.
     * 
     */
    NRJN,

    /**
     * Instruction has been rejected as the corresponding allegement was cancelled.
     * 
     */
    NFCA,

    /**
     * Unrecognised or invalid closing closing amount.
     * 
     */
    CTRA;

    public String value() {
        return name();
    }

    public static RejectionReason62Code fromValue(String v) {
        return valueOf(v);
    }

}
