
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingFailingSettlement1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingFailingSettlement1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWMO"/>
 *     <enumeration value="AWSH"/>
 *     <enumeration value="LAAW"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="CLAT"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="PHSE"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="DKNY"/>
 *     <enumeration value="STCD"/>
 *     <enumeration value="BENO"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="CANR"/>
 *     <enumeration value="MLAT"/>
 *     <enumeration value="OBJT"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="CHAS"/>
 *     <enumeration value="NEWI"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="CMON"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="DEPO"/>
 *     <enumeration value="FLIM"/>
 *     <enumeration value="NOFX"/>
 *     <enumeration value="INCA"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="BYIY"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="LALO"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="NCON"/>
 *     <enumeration value="YCOL"/>
 *     <enumeration value="REFS"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="GUAD"/>
 *     <enumeration value="PREA"/>
 *     <enumeration value="GLOB"/>
 *     <enumeration value="CPEC"/>
 *     <enumeration value="MUNO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingFailingSettlement1Code")
@XmlEnum
public enum PendingFailingSettlement1Code {


    /**
     * Securities have been delivered, but the money is still expected from the counterparty.
     * 
     */
    AWMO,

    /**
     * Securities have not yet been received from the counterparty. If the settlement instruction was a received against payment, the cash has been delivered.
     * 
     */
    AWSH,

    /**
     * Awaiting settlement of a linked 'buy'.
     * 
     */
    LAAW,

    /**
     * Awaiting documents or endorsements from you.
     * 
     */
    DOCY,

    /**
     * Counterparty's instruction was too late for settlement, (that is, received too late, matching, or settlement problems were solved too late).
     * 
     */
    CLAT,

    /**
     * Certificate number error.
     * 
     */
    CERT,

    /**
     * Securities quantity is lower than the minimum existing settlement quantity for the instructed financial instrument.
     * 
     */
    MINO,

    /**
     * Settlement is physical, and there is a delay in the delivery of the securities.
     * 
     */
    PHSE,

    /**
     * Securities are blocked, for example, because of a corporate action event or re-alignment.
     * 
     */
    SBLO,

    /**
     * Counterparty has returned, refused, or does not recognize the securities.
     * 
     */
    DKNY,

    /**
     * Discrepancy in the settlement confirmation.
     * 
     */
    STCD,

    /**
     * Disagreement over beneficial ownership.
     * 
     */
    BENO,

    /**
     * Insufficient deliverable securities in your account.
     * 
     */
    LACK,

    /**
     * Settlement instruction was too late for settlement, that is, received too late, matching, or settlement problems were solved too late.
     * 
     */
    LATE,

    /**
     * Transaction suspended. Because the suspension period is finished, the cancellation or confirmation of instructions is required.
     * 
     */
    CANR,

    /**
     * Payment for a buy of securities was received after the cut-off time for completing the settlement on a same day basis.
     * 
     */
    MLAT,

    /**
     * Securities are stolen, in dispute, and under objection.
     * 
     */
    OBJT,

    /**
     * Awaiting documents or endorsements from the counterparty.
     * 
     */
    DOCC,

    /**
     * Account is blocked, so no instruction can settle.
     * 
     */
    BLOC,

    /**
     * Enquiry/chaser sent to the agent or depository.
     * 
     */
    CHAS,

    /**
     * Securities are new issues, and not yet available/tradeable.
     * 
     */
    NEWI,

    /**
     * Insufficient deliverable securities in the counterparty's account, or counterparty does not hold the securities.
     * 
     */
    CLAC,

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
     * Securities are not deliverable as they are pledged as collateral.
     * 
     */
    COLL,

    /**
     * Deposit of shares for the issuance of a depositary receipt has been refused. The allotment for depositary receipts granted by the issuer would be exceeded by the transaction.
     * 
     */
    DEPO,

    /**
     * Insufficient deliverable securities in your account, as maximum foreign limit has been reached.
     * 
     */
    FLIM,

    /**
     * A foreign exchange instruction from you is missing.
     * 
     */
    NOFX,

    /**
     * Securities require income adjustment, that is, dividend or interest.
     * 
     */
    INCA,

    /**
     * Linked instruction is pending/failing.
     * 
     */
    LINK,

    /**
     * A buy-in procedure has started on the market, on your behalf, if your instruction is a receipt, or on behalf of the counterparty if the instruction is a delivery.
     * 
     */
    BYIY,

    /**
     * Awaiting securities from a corporate action issue or other procedure(s), for example, conversion, dematerialisation, exchange, registration, stamping, and splitting.
     * 
     */
    CAIS,

    /**
     * Insufficient deliverable securities in your account as securities are loaned out.
     * 
     */
    LALO,

    /**
     * Insufficient money in your account.
     * 
     */
    MONY,

    /**
     * Settlement confirmation has not yet been received.
     * 
     */
    NCON,

    /**
     * Not enough collateral in your account to execute the instruction.
     * 
     */
    YCOL,

    /**
     * Delivery/receipt is refused because the physical securities are not in good order.
     * 
     */
    REFS,

    /**
     * Instruction is failing since stamp duty information is missing.
     * 
     */
    SDUT,

    /**
     * Your instruction is confirmed in the local market, but is ready for settlement at the next settlement cycle.
     * 
     */
    CYCL,

    /**
     * Processing batch differs in the counterparty's instruction, for example, day time/real time vs overnight.
     * 
     */
    BATC,

    /**
     * Guaranteed delivery indicator differs in the counterparty's instruction.
     * 
     */
    GUAD,

    /**
     * Instruction is a preadvice, that is, matching only.
     * 
     */
    PREA,

    /**
     * Securities are in global form.
     * 
     */
    GLOB,

    /**
     * Counterparty is in receivership, that is, a form of bankruptcy.
     * 
     */
    CPEC,

    /**
     * Amount is not a multiple of an existing settlement amount lot for the instructed financial instrument.
     * 
     */
    MUNO;

    public String value() {
        return name();
    }

    public static PendingFailingSettlement1Code fromValue(String v) {
        return valueOf(v);
    }

}
