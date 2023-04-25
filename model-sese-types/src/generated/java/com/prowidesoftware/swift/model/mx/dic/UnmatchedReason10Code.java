
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedReason10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnmatchedReason10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="CLAT"/>
 *     <enumeration value="CMIS"/>
 *     <enumeration value="CPCA"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DELN"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DTRA"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="FRAP"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="LEOG"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="NMAS"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="PODU"/>
 *     <enumeration value="REGD"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="VASU"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="PLIS"/>
 *     <enumeration value="INVE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnmatchedReason10Code")
@XmlEnum
public enum UnmatchedReason10Code {


    /**
     * Received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Transaction call delay does not match.
     * 
     */
    CADE,

    /**
     * Counterparty's instruction was too late for matching.
     * 
     */
    CLAT,

    /**
     * A matching instruction from your counterparty could not be found.
     * 
     */
    CMIS,

    /**
     * Counterparty cancelled their instruction.
     * 
     */
    CPCA,

    /**
     * Settlement date/time does not match.
     * 
     */
    DDAT,

    /**
     * Deal price does not match.
     * 
     */
    DDEA,

    /**
     * Direction of the trade does not match. Counterparty expects a delivery from you, not a receipt or vice versa.
     * 
     */
    DELN,

    /**
     * Depository does not match.
     * 
     */
    DEPT,

    /**
     * Settlement amount does not match.
     * 
     */
    DMON,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * Financial instrument identification does not match, for example, ISIN, financial instrument attributes differs.
     * 
     */
    DSEC,

    /**
     * Counterparty has been contacted or contacted us, and does not recognise the transaction.
     * 
     */
    DTRA,

    /**
     * Trade date does not match.
     * 
     */
    DTRD,

    /**
     * Forfeit amount does not match.
     * 
     */
    FORF,

    /**
     * Payment type does not match: your instruction is free of payment, your counterparty's instruction is against payment or vice versa.
     * 
     */
    FRAP,

    /**
     * Participant of delivering or receiving depository does not match.
     * 
     */
    ICAG,

    /**
     * Client of delivering or receiving party 1 does not match.
     * 
     */
    ICUS,

    /**
     * Client of delivering or receiving party 2 does not match.
     * 
     */
    IEXE,

    /**
     * Common reference does not match.
     * 
     */
    IIND,

    /**
     * Your instruction was too late for matching.
     * 
     */
    LATE,

    /**
     * Counterparty is for settlement through letter of guarantee, your instruction is not, or vice versa.
     * 
     */
    LEOG,

    /**
     * Settlement amount currency does not match.
     * 
     */
    NCRR,

    /**
     * Matching process has not yet started.
     * 
     */
    NMAS,

    /**
     * Counterparty's instruction is physical settlement, your instruction is not, or vice versa.
     * 
     */
    PHYS,

    /**
     * Place of trade does not match.
     * 
     */
    PLCE,

    /**
     * Instruction has not been matched. It is a possible duplicate instruction.
     * 
     */
    PODU,

    /**
     * Registration details linked to the transaction are incorrect.
     * 
     */
    REGD,

    /**
     * Termination transaction amount does not match.
     * 
     */
    REPA,

    /**
     * Repurchase rate does not match.
     * 
     */
    REPO,

    /**
     * Premium amount does not match.
     * 
     */
    REPP,

    /**
     * Repurchase rate type does not match.
     * 
     */
    RERT,

    /**
     * Counterparty is for Real Time Gross Settlement (RTGS) system, you are for non-RTGS or vice versa.
     * 
     */
    RTGS,

    /**
     * Safekeeping account used as matching criteria on the market concerned does not match. This includes Buyer/seller's account, direct client's account at the receiving/delivering agent, or receiving/delivering agent's account at the CSD.
     * 
     */
    SAFE,

    /**
     * Settlement transaction type does not match (relates to the settlement transaction type codes available for field: 22F:: SETR.).
     * 
     */
    SETR,

    /**
     * Settlement system/method does not match (for example, instruction is to settle using settlement system/method A. Counterparty expects settlement to occur using settlement system/method B).
     * 
     */
    SETS,

    /**
     * Closing date/time does not match.
     * 
     */
    TERM,

    /**
     * Disagreement on the tax status of the financial instruments to be settled.
     * 
     */
    TXST,

    /**
     * Variable rate support does not match (repo).
     * 
     */
    VASU,

    /**
     * Place of safekeeping information does not allow matching to take place.
     * 
     */
    INPS,

    /**
     * Proprietary unmatched reason code described in a narrative field.
     * 
     */
    OTHR,

    /**
     * Accrued interest amount does not match.
     * 
     */
    ACRU,

    /**
     * Place of listing does not match.
     * 
     */
    PLIS,

    /**
     * Investor party does not match.
     * 
     */
    INVE;

    public String value() {
        return name();
    }

    public static UnmatchedReason10Code fromValue(String v) {
        return valueOf(v);
    }

}
