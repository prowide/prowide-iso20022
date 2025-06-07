
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason16Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="RTGS"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="DADR"/&gt;
 *     &lt;enumeration value="INIR"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="INTV"/&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *     &lt;enumeration value="REFT"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="NMTY"/&gt;
 *     &lt;enumeration value="OPNM"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="OPTY"/&gt;
 *     &lt;enumeration value="DCAN"/&gt;
 *     &lt;enumeration value="DPRG"/&gt;
 *     &lt;enumeration value="EVNM"/&gt;
 *     &lt;enumeration value="STAT"/&gt;
 *     &lt;enumeration value="STAM"/&gt;
 *     &lt;enumeration value="SIGN"/&gt;
 *     &lt;enumeration value="SHAR"/&gt;
 *     &lt;enumeration value="MINO"/&gt;
 *     &lt;enumeration value="NRGM"/&gt;
 *     &lt;enumeration value="MLEG"/&gt;
 *     &lt;enumeration value="BATC"/&gt;
 *     &lt;enumeration value="CADE"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="OWNT"/&gt;
 *     &lt;enumeration value="NRGN"/&gt;
 *     &lt;enumeration value="MUNO"/&gt;
 *     &lt;enumeration value="REQW"/&gt;
 *     &lt;enumeration value="TXST"/&gt;
 *     &lt;enumeration value="REPA"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="REPP"/&gt;
 *     &lt;enumeration value="RREA"/&gt;
 *     &lt;enumeration value="REQM"/&gt;
 *     &lt;enumeration value="RERT"/&gt;
 *     &lt;enumeration value="RSPR"/&gt;
 *     &lt;enumeration value="SETS"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="IIND"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="INNA"/&gt;
 *     &lt;enumeration value="ICOL"/&gt;
 *     &lt;enumeration value="BPAR"/&gt;
 *     &lt;enumeration value="BREF"/&gt;
 *     &lt;enumeration value="BUSE"/&gt;
 *     &lt;enumeration value="CAEV"/&gt;
 *     &lt;enumeration value="CASY"/&gt;
 *     &lt;enumeration value="COMC"/&gt;
 *     &lt;enumeration value="CONL"/&gt;
 *     &lt;enumeration value="CPTY"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="DISE"/&gt;
 *     &lt;enumeration value="DORD"/&gt;
 *     &lt;enumeration value="FEEE"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="VASU"/&gt;
 *     &lt;enumeration value="INPS"/&gt;
 *     &lt;enumeration value="SDUT"/&gt;
 *     &lt;enumeration value="FORF"/&gt;
 *     &lt;enumeration value="ICUS"/&gt;
 *     &lt;enumeration value="ICAG"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="IEXE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason16Code")
@XmlEnum
public enum RejectionReason16Code {


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
    IEXE;

    public String value() {
        return name();
    }

    public static RejectionReason16Code fromValue(String v) {
        return valueOf(v);
    }

}
