
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason33Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason33Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOC"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CONF"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="AWMO"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="LAAW"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="AWSH"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="BENO"/>
 *     <enumeration value="BOTH"/>
 *     <enumeration value="IPNC"/>
 *     <enumeration value="CDCY"/>
 *     <enumeration value="YCOL"/>
 *     <enumeration value="CLHT"/>
 *     <enumeration value="REGT"/>
 *     <enumeration value="CDRE"/>
 *     <enumeration value="CDRG"/>
 *     <enumeration value="NCON"/>
 *     <enumeration value="CPEC"/>
 *     <enumeration value="PRCY"/>
 *     <enumeration value="CMON"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="DKNY"/>
 *     <enumeration value="CHAS"/>
 *     <enumeration value="GLOB"/>
 *     <enumeration value="INCA"/>
 *     <enumeration value="REFU"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="FLIM"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="DISA"/>
 *     <enumeration value="NEWI"/>
 *     <enumeration value="NOFX"/>
 *     <enumeration value="NMAS"/>
 *     <enumeration value="NPAY"/>
 *     <enumeration value="NSEC"/>
 *     <enumeration value="REFS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="PHSE"/>
 *     <enumeration value="PHCK"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DEPO"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="FROZ"/>
 *     <enumeration value="LALO"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="IAAD"/>
 *     <enumeration value="PRSY"/>
 *     <enumeration value="TAMM"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="DENO"/>
 *     <enumeration value="VLDA"/>
 *     <enumeration value="PREA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason33Code")
@XmlEnum
public enum PendingReason33Code {


    /**
     * Your account is blocked, no instruction can settle over the account.
     * 
     */
    BLOC,

    /**
     * Instruction was received after the account servicer's deadline. It will be managed as per the bilateral service agreement between the account servicer and account owner.
     * 
     */
    ADEA,

    /**
     * Awaiting confirmation from the counterparty.
     * 
     */
    CONF,

    /**
     * Awaiting documents or endorsements from counterparty.
     * 
     */
    DOCC,

    /**
     * Awaiting documents or endorsements from you.
     * 
     */
    DOCY,

    /**
     * Financial instruments are delivered, but still awaiting money from counterparty.
     * 
     */
    AWMO,

    /**
     * Your instruction is confirmed in the local market or is ready for settlement, awaiting next settlement cycle.
     * 
     */
    CYCL,

    /**
     * Awaiting settlement of a purchase to cover failing positions.
     * 
     */
    LAAW,

    /**
     * Awaiting financial instruments from a corporate action or other procedure, for example, conversion, dematerialisation, exchange, registration, stamping, splitting.
     * 
     */
    CAIS,

    /**
     * Financial instruments have not yet been received from the counterparty (if receive against payment trade), the money has been delivered.
     * 
     */
    AWSH,

    /**
     * Awaiting settlement date. No settlement problems to be reported.
     * 
     */
    FUTU,

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
     * Instruction has been processed and cannot be cancelled.
     * 
     */
    IPNC,

    /**
     * Execution is conditional to the execution of a process linked to the currency of the transaction.
     * 
     */
    CDCY,

    /**
     * Insufficient collateral in your account to execute the instruction.
     * 
     */
    YCOL,

    /**
     * Instructed settlement date does not agree with the settlement date on the clearing house trade, that is, a specific type of trade in India.
     * 
     */
    CLHT,

    /**
     * Certificates have been lodged with the registrar but rejected due to incomplete documentation or foreign ownership limitation reached.
     * 
     */
    REGT,

    /**
     * Execution is conditional to the execution of a process of realignment at the issuer CSD.
     * 
     */
    CDRE,

    /**
     * Execution is conditional to the execution of a process at the registrar.
     * 
     */
    CDRG,

    /**
     * Confirmation of settlement has not yet been received.
     * 
     */
    NCON,

    /**
     * Counterparty is in receivership (form of bankruptcy where a court appointed person - the receiver - manages the affairs of the business).
     * 
     */
    CPEC,

    /**
     * Counterparty's instruction is a preadvice, that is, for matching only.
     * 
     */
    PRCY,

    /**
     * Insufficient money in counterparty's account.
     * 
     */
    CMON,

    /**
     * Insufficient deliverable financial instruments in counterparty's account or counterparty does not hold financial instruments.
     * 
     */
    CLAC,

    /**
     * Counterparty has returned or refuses the securities.
     * 
     */
    DKNY,

    /**
     * A chaser/enquiry has been sent.
     * 
     */
    CHAS,

    /**
     * Settlement cannot be executed; financial instruments are in global form.
     * 
     */
    GLOB,

    /**
     * Financial instruments require income adjustment, for example, dividend or interest.
     * 
     */
    INCA,

    /**
     * Instruction has been refused or not recognised and is represented automatically.
     * 
     */
    REFU,

    /**
     * Central bank liquidity is insufficient.
     * 
     */
    LIQU,

    /**
     * Insufficient money in your account.
     * 
     */
    MONY,

    /**
     * Insufficient financial instruments in your account.
     * 
     */
    LACK,

    /**
     * Stamp duty information is missing.
     * 
     */
    SDUT,

    /**
     * Instruction was received after market deadline.
     * 
     */
    LATE,

    /**
     * Insufficient deliverable financial instruments in your account as maximum foreign limit has been reached.
     * 
     */
    FLIM,

    /**
     * Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.
     * 
     */
    MINO,

    /**
     * Awaiting receipt of adequate certification.
     * 
     */
    MCER,

    /**
     * Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.
     * 
     */
    MUNO,

    /**
     * Exceptional closing of all financial institutions due to natural disaster, for example, earthquake.
     * 
     */
    DISA,

    /**
     * Financial instrument is a new issue and not yet available/tradable.
     * 
     */
    NEWI,

    /**
     * A foreign exchange instruction from you is missing.
     * 
     */
    NOFX,

    /**
     * Instruction has not been matched; matching process is not required.
     * 
     */
    NMAS,

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
     * Delivery/receipt was refused because physical financial instruments are not in good order.
     * 
     */
    REFS,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Your instruction is pending settlement because the instruction linked to it is pending.
     * 
     */
    LINK,

    /**
     * The instruction is pending receipt of securities, for example, from a purchase, loan etc.
     * 
     */
    PENR,

    /**
     * Settlement is physical. Financial instruments are being delivered.
     * 
     */
    PHSE,

    /**
     * Physical financial instruments have been received and are being checked for authenticity.
     * 
     */
    PHCK,

    /**
     * Processing batch differs in the counterparty's instruction, for example, daytime/real-time versus overnight.
     * 
     */
    BATC,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * Deposit of shares for the issuing of depositary receipts has been refused. The allotment granted by the issuer is exceeded by your transaction.
     * 
     */
    DEPO,

    /**
     * Financial instruments are blocked due to, for example, a corporate action event, realignment.
     * 
     */
    SBLO,

    /**
     * Financial instruments are blocked at the Central Security Depository (CSD) following a corporate event.
     * 
     */
    FROZ,

    /**
     * Financial instruments are out on loan.
     * 
     */
    LALO,

    /**
     * Financial instruments are not deliverable as they are pledged as collateral.
     * 
     */
    COLL,

    /**
     * Tax reclaim has been sent to the tax authorities.
     * 
     */
    AUTH,

    /**
     * Settlement system/method has been modified at central securities depository to allow settlement.
     * 
     */
    SETS,

    /**
     * Pending reason being investigated.
     * 
     */
    IAAD,

    /**
     * Transaction was put on hold/frozen by the system.
     * 
     */
    PRSY,

    /**
     * Trade is being amended in the market.
     * 
     */
    TAMM,

    /**
     * Trade will settle in partials.
     * 
     */
    PART,

    /**
     * Quantity instructed does not match the denomination available/deliverable. Physical securities need to be obtained in deliverable denominated quantities.
     * 
     */
    DENO,

    /**
     * For tax reclaim, the event is pending, the tax reclaim is valid for the tax authorities.
     * 
     */
    VLDA,

    /**
     * Your instruction is a preadvice, that is, for matching only.
     * 
     */
    PREA;

    public String value() {
        return name();
    }

    public static PendingReason33Code fromValue(String v) {
        return valueOf(v);
    }

}
