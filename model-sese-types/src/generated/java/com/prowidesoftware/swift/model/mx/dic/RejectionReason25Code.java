
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason25Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason25Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="RTGS"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="MINO"/&gt;
 *     &lt;enumeration value="BATC"/&gt;
 *     &lt;enumeration value="MUNO"/&gt;
 *     &lt;enumeration value="TXST"/&gt;
 *     &lt;enumeration value="SETS"/&gt;
 *     &lt;enumeration value="IIND"/&gt;
 *     &lt;enumeration value="CAEV"/&gt;
 *     &lt;enumeration value="CASY"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="SDUT"/&gt;
 *     &lt;enumeration value="INPS"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="ICUS"/&gt;
 *     &lt;enumeration value="ICAG"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="IEXE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason25Code")
@XmlEnum
public enum RejectionReason25Code {


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
     * Unrecognised, invalid or missing place of safekeeping.
     * 
     */
    INPS,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

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
     * Unrecognised or invalid client of delivering or receiving party 2.
     * 
     */
    IEXE;

    public String value() {
        return name();
    }

    public static RejectionReason25Code fromValue(String v) {
        return valueOf(v);
    }

}
