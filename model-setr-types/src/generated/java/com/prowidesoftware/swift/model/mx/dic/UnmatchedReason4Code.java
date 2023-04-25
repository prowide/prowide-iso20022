
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnmatchedReason4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="CMIS"/>
 *     <enumeration value="CPCA"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DEAL"/>
 *     <enumeration value="DELN"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="EXEC"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="LEOG"/>
 *     <enumeration value="MCAN"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="PODU"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="VASU"/>
 *     <enumeration value="POSE"/>
 *     <enumeration value="BORT"/>
 *     <enumeration value="COAX"/>
 *     <enumeration value="OTHI"/>
 *     <enumeration value="BOFE"/>
 *     <enumeration value="TACR"/>
 *     <enumeration value="SDAT"/>
 *     <enumeration value="COID"/>
 *     <enumeration value="SCRA"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="SHAI"/>
 *     <enumeration value="ACRS"/>
 *     <enumeration value="DEAS"/>
 *     <enumeration value="CATI"/>
 *     <enumeration value="TACS"/>
 *     <enumeration value="DBNM"/>
 *     <enumeration value="MADA"/>
 *     <enumeration value="OLID"/>
 *     <enumeration value="TRSA"/>
 *     <enumeration value="TRTE"/>
 *     <enumeration value="BOIA"/>
 *     <enumeration value="OPLI"/>
 *     <enumeration value="TRTR"/>
 *     <enumeration value="LWCO"/>
 *     <enumeration value="INTT"/>
 *     <enumeration value="CUFC"/>
 *     <enumeration value="LTME"/>
 *     <enumeration value="ENFC"/>
 *     <enumeration value="CLSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnmatchedReason4Code")
@XmlEnum
public enum UnmatchedReason4Code {


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
     * Charges amount does not match.
     * 
     */
    CHAR,

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
     * Trade date does not match.
     * 
     */
    DTRD,

    /**
     * Executing broker's commission does not match.
     * 
     */
    EXEC,

    /**
     * Forfeit amount does not match.
     * 
     */
    FORF,

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
     * Corresponding matching record has been cancelled.
     * 
     */
    MCAN,

    /**
     * See narrative field for the reason.
     * 
     */
    NARR,

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
     * Position effect does not match.
     * 
     */
    POSE,

    /**
     * Borrowing rate does not match.
     * 
     */
    BORT,

    /**
     * Consumption tax amount does not match.
     * 
     */
    COAX,

    /**
     * OtherIdentification of financial instrument identification does not match.
     * 
     */
    OTHI,

    /**
     * Borrowing fee does not match.
     * 
     */
    BOFE,

    /**
     * Accrued interest tax indicator does not match.
     * 
     */
    TACR,

    /**
     * Settlement date in the second leg does not match.
     * 
     */
    SDAT,

    /**
     * CommonIdentification does not match.
     * 
     */
    COID,

    /**
     * Standard collateral ratio does not match.
     * 
     */
    SCRA,

    /**
     * Accrued interest amount does not match.
     * 
     */
    ACRU,

    /**
     * Securities haircut rate does not match.
     * 
     */
    SHAI,

    /**
     * Accrued interest amount in the second leg does not match.
     * 
     */
    ACRS,

    /**
     * Deal amount in the second leg does not match.
     * 
     */
    DEAS,

    /**
     * CallableTradeIndicator does not match.
     * 
     */
    CATI,

    /**
     * Accrued interest tax indicator in the second leg does not match.
     * 
     */
    TACS,

    /**
     * Counterparty's instruction is for settlement through standing settlement instruction, your instruction is not, or vice versa.
     * 
     */
    DBNM,

    /**
     * Maturity date does not match.
     * 
     */
    MADA,

    /**
     * ClientOrderLinkIdentification does not match.
     * 
     */
    OLID,

    /**
     * Closing settlement amount does not match.
     * 
     */
    TRSA,

    /**
     * Type of financing closing does not match.
     * 
     */
    TRTE,

    /**
     * Borrowing interest amount does not match.
     * 
     */
    BOIA,

    /**
     * OpeningLegIdentification does not match.
     * 
     */
    OPLI,

    /**
     * Trade transaction type does not match.
     * 
     */
    TRTR,

    /**
     * LendingWithCollateral does not match.
     * 
     */
    LWCO,

    /**
     * Interest type does not match.
     * 
     */
    INTT,

    /**
     * Current factor does not match.
     * 
     */
    CUFC,

    /**
     * Lending transaction method does not match.
     * 
     */
    LTME,

    /**
     * End factor does not match.
     * 
     */
    ENFC,

    /**
     * Counterparty's instruction is for settlement through clearing segment, your instruction is not, or vice versa.
     * 
     */
    CLSE;

    public String value() {
        return name();
    }

    public static UnmatchedReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
