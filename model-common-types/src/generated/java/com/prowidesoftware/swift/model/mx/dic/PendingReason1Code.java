
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AWMO"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
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
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="NMAS"/&gt;
 *     &lt;enumeration value="NOFX"/&gt;
 *     &lt;enumeration value="CMON"/&gt;
 *     &lt;enumeration value="YCOL"/&gt;
 *     &lt;enumeration value="COLL"/&gt;
 *     &lt;enumeration value="DEPO"/&gt;
 *     &lt;enumeration value="FLIM"/&gt;
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
 *     &lt;enumeration value="IAAD"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PHCK"/&gt;
 *     &lt;enumeration value="BENO"/&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *     &lt;enumeration value="CLHT"/&gt;
 *     &lt;enumeration value="DENO"/&gt;
 *     &lt;enumeration value="DISA"/&gt;
 *     &lt;enumeration value="DKNY"/&gt;
 *     &lt;enumeration value="FROZ"/&gt;
 *     &lt;enumeration value="LAAW"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="PRCY"/&gt;
 *     &lt;enumeration value="REGT"/&gt;
 *     &lt;enumeration value="SETS"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="PRSY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingReason1Code")
@XmlEnum
public enum PendingReason1Code {


    /**
     * Financial instruments are delivered, but still awaiting money from counterparty.
     * 
     */
    AWMO,

    /**
     * Instruction was received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Awaiting financial instruments from a corporate action or other procedure, for example, conversion, dematerialisation, exchange, registration, stamping, splitting.
     * 
     */
    CAIS,

    /**
     * Instruction has been refused or not recognised and is represented automatically.
     * 
     */
    REFU,

    /**
     * Financial instruments have not yet been received from the counterparty (if receive against payment trade), the money has been delivered.
     * 
     */
    AWSH,

    /**
     * Settlement is physical. Financial instruments are being delivered.
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
     * Awaiting documents or endorsements from counterparty.
     * 
     */
    DOCC,

    /**
     * Your account is blocked, no instruction can settle over the account.
     * 
     */
    BLOC,

    /**
     * A chaser/enquiry has been sent.
     * 
     */
    CHAS,

    /**
     * Financial instrument is a new issue and not yet available/tradable.
     * 
     */
    NEWI,

    /**
     * Insufficient deliverable financial instruments in counterparty's account or counterparty does not hold financial instruments.
     * 
     */
    CLAC,

    /**
     * Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.
     * 
     */
    MUNO,

    /**
     * Settlement cannot be executed; financial instruments are in global form.
     * 
     */
    GLOB,

    /**
     * Your instruction is a preadvice, that is, for matching only.
     * 
     */
    PREA,

    /**
     * Trade will settle in partials.
     * 
     */
    PART,

    /**
     * Instruction has not been matched; matching process is not required.
     * 
     */
    NMAS,

    /**
     * A foreign exchange instruction from you is missing.
     * 
     */
    NOFX,

    /**
     * Insufficient money in counterparty's account.
     * 
     */
    CMON,

    /**
     * Insufficient collateral in your account to execute the instruction.
     * 
     */
    YCOL,

    /**
     * Financial instruments are not deliverable as they are pledged as collateral.
     * 
     */
    COLL,

    /**
     * Deposit of shares for the issuing of depositary receipts has been refused. The allotment granted by the issuer is exceeded by your transaction.
     * 
     */
    DEPO,

    /**
     * Insufficient deliverable financial instruments in your account as maximum foreign limit has been reached.
     * 
     */
    FLIM,

    /**
     * Financial instruments require income adjustment, for example, dividend or interest.
     * 
     */
    INCA,

    /**
     * Your instruction is pending settlement because the instruction linked to it is pending.
     * 
     */
    LINK,

    /**
     * Awaiting settlement date. No settlement problems to be reported.
     * 
     */
    FUTU,

    /**
     * Insufficient financial instruments in your account.
     * 
     */
    LACK,

    /**
     * Financial instruments are out on loan.
     * 
     */
    LALO,

    /**
     * Insufficient money in your account.
     * 
     */
    MONY,

    /**
     * Confirmation of settlement has not yet been received.
     * 
     */
    NCON,

    /**
     * Delivery/receipt was refused because physical financial instruments are not in good order.
     * 
     */
    REFS,

    /**
     * Stamp duty information is missing.
     * 
     */
    SDUT,

    /**
     * Processing batch differs in the counterparty's instruction, for example, daytime/real-time versus overnight.
     * 
     */
    BATC,

    /**
     * Your instruction is confirmed in the local market or is ready for settlement, awaiting next settlement cycle.
     * 
     */
    CYCL,

    /**
     * Financial instruments are blocked due to a corporate action event, realignment, etc.
     * 
     */
    SBLO,

    /**
     * Counterparty is in receivership (form of bankruptcy where a court appointed person - the receiver - manages the affairs of the business).
     * 
     */
    CPEC,

    /**
     * Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.
     * 
     */
    MINO,

    /**
     * Pending reason being investigated.
     * 
     */
    IAAD,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Physical financial instruments have been received and are being checked for authenticity.
     * 
     */
    PHCK,

    /**
     * Disagreement in beneficial ownership.
     * 
     */
    BENO,

    /**
     * Counterparty's instruction and your instruction are on hold/frozen/ in a preadvice mode.
     * 
     */
    BOTH,

    /**
     * Instructed settlement date does not agree with the settlement date on the clearing house trade, that is, a specific type of trade in India.
     * 
     */
    CLHT,

    /**
     * Quantity instructed does not match the denomination available/deliverable. Physical securities need to be obtained in deliverable denominated quantities.
     * 
     */
    DENO,

    /**
     * Exceptional closing of all financial institutions due to natural disaster, for example, earthquake.
     * 
     */
    DISA,

    /**
     * Counterparty has returned or refuses the securities.
     * 
     */
    DKNY,

    /**
     * Financial instruments are blocked at the Central Security Depository (CSD) following a corporate event.
     * 
     */
    FROZ,

    /**
     * Awaiting settlement of a purchase to cover failing positions.
     * 
     */
    LAAW,

    /**
     * Instruction was received after market deadline.
     * 
     */
    LATE,

    /**
     * Central bank liquidity is insufficient.
     * 
     */
    LIQU,

    /**
     * Counterparty's instruction is a preadvice, that is, for matching only.
     * 
     */
    PRCY,

    /**
     * Certificates have been lodged with the registrar but rejected due to incomplete documentation or foreign ownership limitation reached.
     * 
     */
    REGT,

    /**
     * Settlement system/method has been modified at central securities depository to allow settlement.
     * 
     */
    SETS,

    /**
     * Certificate number error.
     * 
     */
    CERT,

    /**
     * Transaction was put on hold/frozen by the system.
     * 
     */
    PRSY;

    public String value() {
        return name();
    }

    public static PendingReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
