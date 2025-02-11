
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWMO"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="REFU"/>
 *     <enumeration value="AWSH"/>
 *     <enumeration value="PHSE"/>
 *     <enumeration value="TAMM"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="CHAS"/>
 *     <enumeration value="NEWI"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="GLOB"/>
 *     <enumeration value="PREA"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="NMAS"/>
 *     <enumeration value="CMON"/>
 *     <enumeration value="YCOL"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="DEPO"/>
 *     <enumeration value="FLIM"/>
 *     <enumeration value="NOFX"/>
 *     <enumeration value="INCA"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LALO"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="NCON"/>
 *     <enumeration value="REFS"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="CPEC"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="IAAD"/>
 *     <enumeration value="PHCK"/>
 *     <enumeration value="BENO"/>
 *     <enumeration value="BOTH"/>
 *     <enumeration value="CLHT"/>
 *     <enumeration value="DENO"/>
 *     <enumeration value="DISA"/>
 *     <enumeration value="DKNY"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="FROZ"/>
 *     <enumeration value="LAAW"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="NPAY"/>
 *     <enumeration value="NSEC"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="PRCY"/>
 *     <enumeration value="REGT"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="VLDA"/>
 *     <enumeration value="PRSY"/>
 *     <enumeration value="CDCY"/>
 *     <enumeration value="CDRG"/>
 *     <enumeration value="CONF"/>
 *     <enumeration value="CDRE"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason3Code")
@XmlEnum
public enum PendingReason3Code {


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
     * Tax reclaim has been sent to the tax authorities.
     * 
     */
    AUTH,

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
     * A foreign exchange instruction from you is missing.
     * 
     */
    NOFX,

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
     * Financial instruments are blocked due to, for example, a corporate action event, realignment.
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
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

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
     * Awaiting receipt of adequate certification.
     * 
     */
    MCER,

    /**
     * Payment has not been made by issuer.
     * 
     */
    NPAY,

    /**
     * Financial instruments have not been delivered by the issuer.
     * 
     */
    NSEC,

    /**
     * The instruction is pending receipt of securities, for example, from a purchase, loan etc.
     * 
     */
    PENR,

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
     * For tax reclaim, the event is pending, the tax reclaim is valid for the tax authorities.
     * 
     */
    VLDA,

    /**
     * Transaction was put on hold/frozen by the system.
     * 
     */
    PRSY,

    /**
     * Execution is conditional to the execution of a process linked to the currency of the transaction.
     * 
     */
    CDCY,

    /**
     * Execution is conditional to the execution of a process at the registrar.
     * 
     */
    CDRG,

    /**
     * Awaiting confirmation from the counterparty.
     * 
     */
    CONF,

    /**
     * Execution is conditional to the execution of a process of realignment at the issuer CSD.
     * 
     */
    CDRE,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static PendingReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
