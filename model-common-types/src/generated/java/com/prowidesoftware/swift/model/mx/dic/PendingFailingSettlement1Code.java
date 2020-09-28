
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingFailingSettlement1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingFailingSettlement1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AWMO"/&gt;
 *     &lt;enumeration value="AWSH"/&gt;
 *     &lt;enumeration value="LAAW"/&gt;
 *     &lt;enumeration value="DOCY"/&gt;
 *     &lt;enumeration value="CLAT"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="MINO"/&gt;
 *     &lt;enumeration value="PHSE"/&gt;
 *     &lt;enumeration value="SBLO"/&gt;
 *     &lt;enumeration value="DKNY"/&gt;
 *     &lt;enumeration value="STCD"/&gt;
 *     &lt;enumeration value="BENO"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="CANR"/&gt;
 *     &lt;enumeration value="MLAT"/&gt;
 *     &lt;enumeration value="OBJT"/&gt;
 *     &lt;enumeration value="DOCC"/&gt;
 *     &lt;enumeration value="BLOC"/&gt;
 *     &lt;enumeration value="CHAS"/&gt;
 *     &lt;enumeration value="NEWI"/&gt;
 *     &lt;enumeration value="CLAC"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="CMON"/&gt;
 *     &lt;enumeration value="COLL"/&gt;
 *     &lt;enumeration value="DEPO"/&gt;
 *     &lt;enumeration value="FLIM"/&gt;
 *     &lt;enumeration value="NOFX"/&gt;
 *     &lt;enumeration value="INCA"/&gt;
 *     &lt;enumeration value="LINK"/&gt;
 *     &lt;enumeration value="BYIY"/&gt;
 *     &lt;enumeration value="CAIS"/&gt;
 *     &lt;enumeration value="LALO"/&gt;
 *     &lt;enumeration value="MONY"/&gt;
 *     &lt;enumeration value="NCON"/&gt;
 *     &lt;enumeration value="YCOL"/&gt;
 *     &lt;enumeration value="REFS"/&gt;
 *     &lt;enumeration value="SDUT"/&gt;
 *     &lt;enumeration value="CYCL"/&gt;
 *     &lt;enumeration value="BATC"/&gt;
 *     &lt;enumeration value="GUAD"/&gt;
 *     &lt;enumeration value="PREA"/&gt;
 *     &lt;enumeration value="GLOB"/&gt;
 *     &lt;enumeration value="CPEC"/&gt;
 *     &lt;enumeration value="MUNO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Counterparty's instruction was too late for settlement, (ie, received too late, matching, or settlement problems were solved too late).
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
     * Securities are blocked, eg, because of a corporate action event or re-alignment.
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
     * Settlement instruction was too late for settlement, ie, received too late, matching, or settlement problems were solved too late.
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
     * Securities require income adjustment, ie, dividend or interest.
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
     * Awaiting securities from a corporate action issue or other procedure(s), eg, conversion, dematerialisation, exchange, registration, stamping, and splitting.
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
     * Processing batch differs in the counterparty's instruction, eg, day time/real time vs overnight.
     * 
     */
    BATC,

    /**
     * Guaranteed delivery indicator differs in the counterparty's instruction.
     * 
     */
    GUAD,

    /**
     * Instruction is a preadvice, ie, matching only.
     * 
     */
    PREA,

    /**
     * Securities are in global form.
     * 
     */
    GLOB,

    /**
     * Counterparty is in receivership, ie, a  form of bankruptcy.
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
