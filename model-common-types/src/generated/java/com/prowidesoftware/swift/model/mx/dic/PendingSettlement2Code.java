
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingSettlement2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingSettlement2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AWMO"/&gt;
 *     &lt;enumeration value="CAIS"/&gt;
 *     &lt;enumeration value="REFU"/&gt;
 *     &lt;enumeration value="AWSH"/&gt;
 *     &lt;enumeration value="PHSE"/&gt;
 *     &lt;enumeration value="TAMM"/&gt;
 *     &lt;enumeration value="DOCY"/&gt;
 *     &lt;enumeration value="DOCC"/&gt;
 *     &lt;enumeration value="BLOC"/&gt;
 *     &lt;enumeration value="CHAS"/&gt;
 *     &lt;enumeration value="NEWI"/&gt;
 *     &lt;enumeration value="CLAC"/&gt;
 *     &lt;enumeration value="MUNO"/&gt;
 *     &lt;enumeration value="GLOB"/&gt;
 *     &lt;enumeration value="PREA"/&gt;
 *     &lt;enumeration value="GUAD"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="NMAS"/&gt;
 *     &lt;enumeration value="CMON"/&gt;
 *     &lt;enumeration value="YCOL"/&gt;
 *     &lt;enumeration value="COLL"/&gt;
 *     &lt;enumeration value="DEPO"/&gt;
 *     &lt;enumeration value="FLIM"/&gt;
 *     &lt;enumeration value="NOFX"/&gt;
 *     &lt;enumeration value="INCA"/&gt;
 *     &lt;enumeration value="LINK"/&gt;
 *     &lt;enumeration value="FUTU"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="LALO"/&gt;
 *     &lt;enumeration value="MONY"/&gt;
 *     &lt;enumeration value="NCON"/&gt;
 *     &lt;enumeration value="REFS"/&gt;
 *     &lt;enumeration value="SDUT"/&gt;
 *     &lt;enumeration value="BATC"/&gt;
 *     &lt;enumeration value="CYCL"/&gt;
 *     &lt;enumeration value="SBLO"/&gt;
 *     &lt;enumeration value="CPEC"/&gt;
 *     &lt;enumeration value="MINO"/&gt;
 *     &lt;enumeration value="PCAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingSettlement2Code")
@XmlEnum
public enum PendingSettlement2Code {


    /**
     * Securities have been delivered, but the settlement amount has not been received from the counterparty.
     * 
     */
    AWMO,

    /**
     * Awaiting securities from corporate action issue or other procedures, for example, conversion, dematerialisation, exchange, registration, stamping, splitting, etc.
     * 
     */
    CAIS,

    /**
     * Instruction that has been refused or not recognised, and is represented automatically.
     * 
     */
    REFU,

    /**
     * Securities have not yet been received from the counterparty.
     * 
     */
    AWSH,

    /**
     * Settlement is physical and securities are being delivered.
     * 
     */
    PHSE,

    /**
     * Trade is being amended in the market.
     * 
     */
    TAMM,

    /**
     * Awaiting documents or endorsements from you.
     * 
     */
    DOCY,

    /**
     * Awaiting documents or endorsements from the counterparty.
     * 
     */
    DOCC,

    /**
     * Your account is blocked, no instruction can settle over the account.
     * 
     */
    BLOC,

    /**
     * Chaser/enquiry sent to the agent or depository.
     * 
     */
    CHAS,

    /**
     * Securities are new issues and are not yet available/tradable.
     * 
     */
    NEWI,

    /**
     * Insufficient deliverable securities in the counterparty's account, or counterparty does not hold the securities.
     * 
     */
    CLAC,

    /**
     * Securities quantity is not a multiple of an existing settlement amount lot for the instructed financial instrument.
     * 
     */
    MUNO,

    /**
     * Settlement cannot be executed as securities are in global form.
     * 
     */
    GLOB,

    /**
     * Your instruction is a preadvice, that is, matching only.
     * 
     */
    PREA,

    /**
     * Guaranteed delivery indicator differs in the counterparty's instruction.
     * 
     */
    GUAD,

    /**
     * Trade will settle in partials.
     * 
     */
    PART,

    /**
     * Instruction has not been matched because the matching process is not required.
     * 
     */
    NMAS,

    /**
     * Insufficient money in the counterparty's account.
     * 
     */
    CMON,

    /**
     * Not enough collateral in your account to execute the transaction.
     * 
     */
    YCOL,

    /**
     * Securities are not deliverable as they are pledged as collateral.
     * 
     */
    COLL,

    /**
     * Deposit of shares for the issuing of depositary receipts has been refused. The allotment for depositary receipts granted by the issuer is exceeded by the transaction.
     * 
     */
    DEPO,

    /**
     * Insufficient deliverable securities in your account because the maximum foreign limit has been reached.
     * 
     */
    FLIM,

    /**
     * Foreign exchange instruction is missing.
     * 
     */
    NOFX,

    /**
     * Securities require income adjustment, for example, dividend or interest.
     * 
     */
    INCA,

    /**
     * Your instruction is pending settlement because the instruction linked to it is pending.
     * 
     */
    LINK,

    /**
     * Instruction is awaiting the settlement date, and no settlement problems have been reported.
     * 
     */
    FUTU,

    /**
     * Insufficient deliverable securities in your account.
     * 
     */
    LACK,

    /**
     * Insufficient deliverable securities in your account because securities are loaned out.
     * 
     */
    LALO,

    /**
     * Insufficient money in your account.
     * 
     */
    MONY,

    /**
     * Settlement confirmation has not been received.
     * 
     */
    NCON,

    /**
     * Delivery/receipt has been refused because the physical securities are not in good order.
     * 
     */
    REFS,

    /**
     * Instruction is pending as stamp duty information is missing.
     * 
     */
    SDUT,

    /**
     * Processing batch differs in the counterparty's instruction, for example, day time/real time versus overnight.
     * 
     */
    BATC,

    /**
     * Instruction is confirmed in the local market or is ready for settlement, awaiting the next settlement cycle.
     * 
     */
    CYCL,

    /**
     * Settlement is pending. The securities are blocked due to, for example, a corporate action event, re-alignment.
     * 
     */
    SBLO,

    /**
     * Counterparty is in receivership, that is, the form of bankruptcy where a court appointed person, the receiver, manages the affairs of the business.
     * 
     */
    CPEC,

    /**
     * Securities amount is lower than the minimum existing settlement amount for the instructed financial instrument.
     * 
     */
    MINO,

    /**
     * Payment is pending, and does not settle because the actual use of the risk management limit on the counterpart (bilateral limit) prevents settlement.
     * 
     */
    PCAP;

    public String value() {
        return name();
    }

    public static PendingSettlement2Code fromValue(String v) {
        return valueOf(v);
    }

}
