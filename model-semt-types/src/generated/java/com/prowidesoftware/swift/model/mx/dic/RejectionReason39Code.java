
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason39Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason39Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ULNK"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DADR"/>
 *     <enumeration value="INIR"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="INTV"/>
 *     <enumeration value="INVA"/>
 *     <enumeration value="REFT"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="NMTY"/>
 *     <enumeration value="OPNM"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="STAT"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="SIGN"/>
 *     <enumeration value="SHAR"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="MLEG"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="OWNT"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="REQW"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="RREA"/>
 *     <enumeration value="REQM"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="ICOL"/>
 *     <enumeration value="BPAR"/>
 *     <enumeration value="BREF"/>
 *     <enumeration value="BUSE"/>
 *     <enumeration value="CAEV"/>
 *     <enumeration value="CASY"/>
 *     <enumeration value="COMC"/>
 *     <enumeration value="CONL"/>
 *     <enumeration value="CPTY"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="DISE"/>
 *     <enumeration value="DORD"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="VASU"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="PLIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason39Code")
@XmlEnum
public enum RejectionReason39Code {


    /**
     * Linked reference is unknown.
     * 
     */
    ULNK,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Not possible to use the RTGS system instructed (NRTG or YRTG).
     * 
     */
    RTGS,

    /**
     * Unrecognised or invalid settlement amount currency.
     * 
     */
    NCRR,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Address details are incorrect or cannot be recognised.
     * 
     */
    DADR,

    /**
     * Instruction is irrevocable.
     * 
     */
    INIR,

    /**
     * Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required.
     * 
     */
    CANC,

    /**
     * Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, for example, expired option.
     * 
     */
    INTV,

    /**
     * For tax reclaim, the reclaim is invalid for the tax authorities.
     * 
     */
    INVA,

    /**
     * Reclaim is refused by the tax authorities.
     * 
     */
    REFT,

    /**
     * Physical settlement is impossible for the instructed financial instrument.
     * 
     */
    PHYS,

    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * Instructed position exceeds the eligible balance.
     * 
     */
    LACK,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Mismatch between option number and option type.
     * 
     */
    NMTY,

    /**
     * Unrecognised option number.
     * 
     */
    OPNM,

    /**
     * Unrecognised or invalid settlement amount.
     * 
     */
    DMON,

    /**
     * Invalid option type.
     * 
     */
    OPTY,

    /**
     * Cancellation request was rejected since the instruction has already been cancelled.
     * 
     */
    DCAN,

    /**
     * Cancellation request has been rejected because the instruction process is in progress or has been processed.
     * 
     */
    DPRG,

    /**
     * Unrecognised event number.
     * 
     */
    EVNM,

    /**
     * Missing statutes or commercial register or other legal documents.
     * 
     */
    STAT,

    /**
     * Financial instrument has not been stamped and/or duly signed.
     * 
     */
    STAM,

    /**
     * Registration request does not have a valid signature of the owner of the financial instrument.
     * 
     */
    SIGN,

    /**
     * Unrecognised or invalid shareholder number.
     * 
     */
    SHAR,

    /**
     * Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.
     * 
     */
    MINO,

    /**
     * More than one instruction match the criteria.
     * 
     */
    NRGM,

    /**
     * Missing legal power for transfer.
     * 
     */
    MLEG,

    /**
     * Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.
     * 
     */
    BATC,

    /**
     * Unrecognised or invalid transaction call delay.
     * 
     */
    CADE,

    /**
     * Unrecognised or invalid cash account.
     * 
     */
    CASH,

    /**
     * Unrecognised or invalid deal price.
     * 
     */
    DDEA,

    /**
     * Type of ownership indicated is not correct.
     * 
     */
    OWNT,

    /**
     * Instruction could not be found.
     * 
     */
    NRGN,

    /**
     * Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.
     * 
     */
    MUNO,

    /**
     * Registration request to be completed by the buyer and to be forwarded to the issuer is wrong. You have used the registration request of a different issuer/registrar.
     * 
     */
    REQW,

    /**
     * Unrecognised or invalid tax status of the securities instructed.
     * 
     */
    TXST,

    /**
     * Unrecognised or invalid termination transaction amount.
     * 
     */
    REPA,

    /**
     * Unrecognised or invalid repurchase rate.
     * 
     */
    REPO,

    /**
     * Unrecognised or invalid premium amount.
     * 
     */
    REPP,

    /**
     * Registration reason indicated is not correct.
     * 
     */
    RREA,

    /**
     * Registration request to be completed by the buyer and to be forwarded to the issuer is missing.
     * 
     */
    REQM,

    /**
     * Unrecognised or invalid repurchase rate type.
     * 
     */
    RERT,

    /**
     * Unrecognised or invalid spread rate.
     * 
     */
    RSPR,

    /**
     * Unrecognised or invalid settlement system/method instructed.
     * 
     */
    SETS,

    /**
     * Unrecognised or invalid trade date or requested trade date or future trade date.
     * 
     */
    DTRD,

    /**
     * Unrecognised, invalid or missing common reference.
     * 
     */
    IIND,

    /**
     * Unrecognised or invalid place of trade.
     * 
     */
    PLCE,

    /**
     * Unrecognised or invalid service level agreement pre-agreed narrative information.
     * 
     */
    INNA,

    /**
     * Insufficient collateral proposed.
     * 
     */
    ICOL,

    /**
     * Unrecognised or invalid business partner number.
     * 
     */
    BPAR,

    /**
     * Unrecognised or invalid bank reference number.
     * 
     */
    BREF,

    /**
     * Unrecognised or invalid type of order.
     * 
     */
    BUSE,

    /**
     * Corporate action pending on the financial instrument instructed.
     * 
     */
    CAEV,

    /**
     * Impossible standing arrangements override instruction for the cash settlement system.
     * 
     */
    CASY,

    /**
     * Unrecognised or invalid commercialisation contract.
     * 
     */
    COMC,

    /**
     * Concentration limit was exceeded.
     * 
     */
    CONL,

    /**
     * Deal or exposure is unknown.
     * 
     */
    CPTY,

    /**
     * Unrecognised or invalid settlement date.
     * 
     */
    DDAT,

    /**
     * Party does not agree with the call amount.
     * 
     */
    DISC,

    /**
     * Party does not agree with the exposure amount.
     * 
     */
    DISE,

    /**
     * Disagreement between the data on the registration request and the order.
     * 
     */
    DORD,

    /**
     * Unrecognised or invalid fee or commission.
     * 
     */
    FEEE,

    /**
     * Unrecognised or invalid settlement transaction type.
     * 
     */
    SETR,

    /**
     * Unrecognised or invalid closing date/time.
     * 
     */
    TERM,

    /**
     * Unrecognised or invalid variable rate support (repurchase agreement).
     * 
     */
    VASU,

    /**
     * Unrecognised, invalid or missing place of safekeeping.
     * 
     */
    INPS,

    /**
     * Required stamp duty information is missing.
     * 
     */
    SDUT,

    /**
     * Unrecognised or invalid forfeit amount.
     * 
     */
    FORF,

    /**
     * Unrecognised or invalid client of delivering or receiving party 1.
     * 
     */
    ICUS,

    /**
     * Unrecognised or invalid participant of delivering or receiving depository.
     * 
     */
    ICAG,

    /**
     * Unrecognised or invalid depository.
     * 
     */
    DEPT,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Unrecognised or invalid client of delivering or receiving party 2.
     * 
     */
    IEXE,

    /**
     * Unrecognised or invalid investor party. May be used by an executing party to reject an instruction for an investor (or portfolio) for which it is not authorised to act.
     * 
     */
    INVE,

    /**
     * Unrecognised or invalid place of listing. Used when the security identified is not listed on the market supplied.
     * 
     */
    PLIS;

    public String value() {
        return name();
    }

    public static RejectionReason39Code fromValue(String v) {
        return valueOf(v);
    }

}
