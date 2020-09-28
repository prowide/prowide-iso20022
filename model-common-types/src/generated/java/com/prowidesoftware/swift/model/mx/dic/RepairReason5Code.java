
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepairReason5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepairReason5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BATC"/&gt;
 *     &lt;enumeration value="CAEV"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CASY"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="IIND"/&gt;
 *     &lt;enumeration value="MINO"/&gt;
 *     &lt;enumeration value="MUNO"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *     &lt;enumeration value="RTGS"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="SETS"/&gt;
 *     &lt;enumeration value="TXST"/&gt;
 *     &lt;enumeration value="INPS"/&gt;
 *     &lt;enumeration value="SDUT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="IEXE"/&gt;
 *     &lt;enumeration value="ICAG"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="ICUS"/&gt;
 *     &lt;enumeration value="REPA"/&gt;
 *     &lt;enumeration value="CADE"/&gt;
 *     &lt;enumeration value="RERT"/&gt;
 *     &lt;enumeration value="RSPR"/&gt;
 *     &lt;enumeration value="VASU"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="REPP"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="FORF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepairReason5Code")
@XmlEnum
public enum RepairReason5Code {


    /**
     * Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.
     * 
     */
    BATC,

    /**
     * Corporate action pending on the financial instrument instructed.
     * 
     */
    CAEV,

    /**
     * Unrecognised or invalid cash account.
     * 
     */
    CASH,

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
     * Unrecognised or invalid deal price.
     * 
     */
    DDEA,

    /**
     * Unrecognised or invalid settlement amount.
     * 
     */
    DMON,

    /**
     * Unrecognised or invalid settlement quantity.
     * 
     */
    DQUA,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Unrecognised or invalid trade date.
     * 
     */
    DTRD,

    /**
     * Unrecognised, invalid or missing common reference.
     * 
     */
    IIND,

    /**
     * Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.
     * 
     */
    MINO,

    /**
     * Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.
     * 
     */
    MUNO,

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
     * Unrecognised or invalid place of trade.
     * 
     */
    PLCE,

    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * Impossible to use the RTGS system instructed (NRTG or YRTG).
     * 
     */
    RTGS,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * Unrecognised or invalid settlement transaction type.
     * 
     */
    SETR,

    /**
     * Unrecognised or invalid settlement system/method instructed.
     * 
     */
    SETS,

    /**
     * Unrecognised or invalid tax status of the securities instructed.
     * 
     */
    TXST,

    /**
     * Unrecognised, invalid or missing Place of Safekeeping.
     * 
     */
    INPS,

    /**
     * Required stamp duty information is missing.
     * 
     */
    SDUT,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Client of delivering or receiving party 2 mismatch.
     * 
     */
    IEXE,

    /**
     * Participant of delivering or receiving depository mismatch.
     * 
     */
    ICAG,

    /**
     * Depository mismatch.
     * 
     */
    DEPT,

    /**
     * Client of delivering or receiving party 1 mismatch.
     * 
     */
    ICUS,

    /**
     * Unrecognised or invalid termination transaction amount.
     * 
     */
    REPA,

    /**
     * Unrecognised or invalid transaction call delay.
     * 
     */
    CADE,

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
     * Unrecognised or invalid variable rate support (repurchase agreement).
     * 
     */
    VASU,

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
     * Unrecognised or invalid closing date/time.
     * 
     */
    TERM,

    /**
     * Unrecognised or invalid forfeit amount.
     * 
     */
    FORF;

    public String value() {
        return name();
    }

    public static RepairReason5Code fromValue(String v) {
        return valueOf(v);
    }

}
