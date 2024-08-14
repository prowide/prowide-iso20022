
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedReason14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnmatchedReason14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="CPCA"/>
 *     <enumeration value="CLAT"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="EXEC"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="LEOG"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="MCAN"/>
 *     <enumeration value="MIME"/>
 *     <enumeration value="CMIS"/>
 *     <enumeration value="NMAS"/>
 *     <enumeration value="DTRA"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="FRAP"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLIS"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="PODU"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="REGD"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="DEAL"/>
 *     <enumeration value="DELN"/>
 *     <enumeration value="UNBR"/>
 *     <enumeration value="VASU"/>
 *     <enumeration value="DCMX"/>
 *     <enumeration value="DMCT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnmatchedReason14Code")
@XmlEnum
public enum UnmatchedReason14Code {


    /**
     * Received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Accrued interest amount does not match.
     * 
     */
    ACRU,

    /**
     * Charges amount does not match.
     * 
     */
    CHAR,

    /**
     * Closing date/time does not match.
     * 
     */
    TERM,

    /**
     * Common reference does not match.
     * 
     */
    IIND,

    /**
     * Counterparty cancelled their instruction.
     * 
     */
    CPCA,

    /**
     * Counterparty's instruction was too late for matching.
     * 
     */
    CLAT,

    /**
     * Settlement amount currency does not match.
     * 
     */
    NCRR,

    /**
     * Deal price does not match.
     * 
     */
    DDEA,

    /**
     * Executing broker's commission does not match.
     * 
     */
    EXEC,

    /**
     * Financial instrument identification does not match, for example, ISIN, financial instrument attributes differs.
     * 
     */
    DSEC,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * Forfeit amount does not match.
     * 
     */
    FORF,

    /**
     * Counterparty is for settlement through letter of guarantee, your instruction is not, or vice versa.
     * 
     */
    LEOG,

    /**
     * Investor party does not match.
     * 
     */
    INVE,

    /**
     * Your instruction was too late for matching.
     * 
     */
    LATE,

    /**
     * Corresponding matching record has been cancelled.
     * 
     */
    MCAN,

    /**
     * Missing market execution details.
     * 
     */
    MIME,

    /**
     * A matching instruction from your counterparty could not be found.
     * 
     */
    CMIS,

    /**
     * Matching process has not yet started.
     * 
     */
    NMAS,

    /**
     * Counterparty has been contacted or contacted us, and does not recognise the transaction.
     * 
     */
    DTRA,

    /**
     * Proprietary unmatched reason code described in a narrative field.
     * 
     */
    OTHR,

    /**
     * Payment type does not match: your instruction is free of payment, your counterparty's instruction is against payment or vice versa.
     * 
     */
    FRAP,

    /**
     * Counterparty's instruction is physical settlement, your instruction is not, or vice versa.
     * 
     */
    PHYS,

    /**
     * Place of listing does not match.
     * 
     */
    PLIS,

    /**
     * Place of safekeeping information does not allow matching to take place.
     * 
     */
    INPS,

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
     * Depository does not match.
     * 
     */
    DEPT,

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
     * Transaction call delay does not match.
     * 
     */
    CADE,

    /**
     * Premium amount does not match.
     * 
     */
    REPP,

    /**
     * Repurchase rate does not match.
     * 
     */
    REPO,

    /**
     * Repurchase rate type does not match.
     * 
     */
    RERT,

    /**
     * Spread rate does not match.
     * 
     */
    RSPR,

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
     * Settlement amount does not match.
     * 
     */
    DMON,

    /**
     * Settlement date/time does not match.
     * 
     */
    DDAT,

    /**
     * Settlement system/method does not match (for example, instruction is to settle using settlement system/method A. Counterparty expects settlement to occur using settlement system/method B).
     * 
     */
    SETS,

    /**
     * Settlement transaction type does not match (relates to the settlement transaction type codes available for field: 22F:: SETR.).
     * 
     */
    SETR,

    /**
     * Disagreement on the tax status of the financial instruments to be settled.
     * 
     */
    TXST,

    /**
     * Trade date does not match.
     * 
     */
    DTRD,

    /**
     * Deal amount does not match.
     * 
     */
    DEAL,

    /**
     * Direction of the trade does not match. Counterparty expects a delivery from you, not a receipt or vice versa.
     * 
     */
    DELN,

    /**
     * Market side trade is unmatched.
     * 
     */
    UNBR,

    /**
     * Variable rate support does not match (repo).
     * 
     */
    VASU,

    /**
     * Disagreement if trade was executed cum or ex.
     * 
     */
    DCMX,

    /**
     * Disagreement on automatic generation of market claim or transformation.
     * 
     */
    DMCT;

    public String value() {
        return name();
    }

    public static UnmatchedReason14Code fromValue(String v) {
        return valueOf(v);
    }

}
