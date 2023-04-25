
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason70Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason70Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SAFE"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="CAEV"/>
 *     <enumeration value="CASY"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="VASU"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="ICUS"/>
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
@XmlType(name = "RejectionReason70Code")
@XmlEnum
public enum RejectionReason70Code {


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
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

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
     * Unrecognised or invalid trade date or requested trade date or future trade date.
     * 
     */
    DTRD,

    /**
     * Unrecognised or invalid place of trade.
     * 
     */
    PLCE,

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
     * Unrecognised or invalid settlement amount.
     * 
     */
    DMON,

    /**
     * Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.
     * 
     */
    MINO,

    /**
     * Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.
     * 
     */
    BATC,

    /**
     * Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.
     * 
     */
    MUNO,

    /**
     * Unrecognised or invalid tax status of the securities instructed.
     * 
     */
    TXST,

    /**
     * Unrecognised or invalid settlement system/method instructed.
     * 
     */
    SETS,

    /**
     * Unrecognised, invalid or missing common reference.
     * 
     */
    IIND,

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
     * Unrecognised or invalid settlement date.
     * 
     */
    DDAT,

    /**
     * Unrecognised or invalid settlement transaction type.
     * 
     */
    SETR,

    /**
     * Required stamp duty information is missing.
     * 
     */
    SDUT,

    /**
     * Unrecognised or invalid transaction call delay.
     * 
     */
    CADE,

    /**
     * Unrecognised or invalid forfeit amount.
     * 
     */
    FORF,

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
     * Unrecognised or invalid participant of delivering or receiving depository.
     * 
     */
    ICAG,

    /**
     * Unrecognised, invalid or missing place of safekeeping.
     * 
     */
    INPS,

    /**
     * Unrecognised or invalid client of delivering or receiving party 1.
     * 
     */
    ICUS,

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

    public static RejectionReason70Code fromValue(String v) {
        return valueOf(v);
    }

}
