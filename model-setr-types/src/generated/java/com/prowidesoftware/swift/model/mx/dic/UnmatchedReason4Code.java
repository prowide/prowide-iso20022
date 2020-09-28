
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnmatchedReason4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="CADE"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="CMIS"/&gt;
 *     &lt;enumeration value="CPCA"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="DEAL"/&gt;
 *     &lt;enumeration value="DELN"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="EXEC"/&gt;
 *     &lt;enumeration value="FORF"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="LEOG"/&gt;
 *     &lt;enumeration value="MCAN"/&gt;
 *     &lt;enumeration value="NARR"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="PODU"/&gt;
 *     &lt;enumeration value="REPA"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="REPP"/&gt;
 *     &lt;enumeration value="RERT"/&gt;
 *     &lt;enumeration value="RSPR"/&gt;
 *     &lt;enumeration value="RTGS"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="SETS"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="TXST"/&gt;
 *     &lt;enumeration value="VASU"/&gt;
 *     &lt;enumeration value="POSE"/&gt;
 *     &lt;enumeration value="BORT"/&gt;
 *     &lt;enumeration value="COAX"/&gt;
 *     &lt;enumeration value="OTHI"/&gt;
 *     &lt;enumeration value="BOFE"/&gt;
 *     &lt;enumeration value="TACR"/&gt;
 *     &lt;enumeration value="SDAT"/&gt;
 *     &lt;enumeration value="COID"/&gt;
 *     &lt;enumeration value="SCRA"/&gt;
 *     &lt;enumeration value="ACRU"/&gt;
 *     &lt;enumeration value="SHAI"/&gt;
 *     &lt;enumeration value="ACRS"/&gt;
 *     &lt;enumeration value="DEAS"/&gt;
 *     &lt;enumeration value="CATI"/&gt;
 *     &lt;enumeration value="TACS"/&gt;
 *     &lt;enumeration value="DBNM"/&gt;
 *     &lt;enumeration value="MADA"/&gt;
 *     &lt;enumeration value="OLID"/&gt;
 *     &lt;enumeration value="TRSA"/&gt;
 *     &lt;enumeration value="TRTE"/&gt;
 *     &lt;enumeration value="BOIA"/&gt;
 *     &lt;enumeration value="OPLI"/&gt;
 *     &lt;enumeration value="TRTR"/&gt;
 *     &lt;enumeration value="LWCO"/&gt;
 *     &lt;enumeration value="INTT"/&gt;
 *     &lt;enumeration value="CUFC"/&gt;
 *     &lt;enumeration value="LTME"/&gt;
 *     &lt;enumeration value="ENFC"/&gt;
 *     &lt;enumeration value="CLSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Settlement amount does not match
     * 
     */
    DMON,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * Financial instrument identification does not match, for example, ISIN, financial instrument attributes differs...
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
     * Settlement transaction type does not match (relates to the settlement transaction type codes available for field :22F::SETR.)
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
