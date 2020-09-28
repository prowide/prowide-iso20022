
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepairReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepairReason7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="BATC"/&gt;
 *     &lt;enumeration value="BUSE"/&gt;
 *     &lt;enumeration value="CADE"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CASY"/&gt;
 *     &lt;enumeration value="COMC"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="FEEE"/&gt;
 *     &lt;enumeration value="FORF"/&gt;
 *     &lt;enumeration value="ICAG"/&gt;
 *     &lt;enumeration value="ICUS"/&gt;
 *     &lt;enumeration value="IEXE"/&gt;
 *     &lt;enumeration value="IIND"/&gt;
 *     &lt;enumeration value="INNA"/&gt;
 *     &lt;enumeration value="LEOG"/&gt;
 *     &lt;enumeration value="NARR"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="NRGM"/&gt;
 *     &lt;enumeration value="NRGN"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="CTRA"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="REPP"/&gt;
 *     &lt;enumeration value="RERT"/&gt;
 *     &lt;enumeration value="RSPR"/&gt;
 *     &lt;enumeration value="RTGS"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="SETS"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="TXST"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="VASU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepairReason7Code")
@XmlEnum
public enum RepairReason7Code {


    /**
     * Received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.
     * 
     */
    BATC,

    /**
     * Unrecognised or invalid type of order.
     * 
     */
    BUSE,

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
     * Impossible standing arrangements override instruction for the cash settlement system.
     * 
     */
    CASY,

    /**
     * Unrecognized or invalid commercialization contract.
     * 
     */
    COMC,

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
     * Depository mismatch.
     * 
     */
    DEPT,

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
     * Unrecognised or invalid fee or commission.
     * 
     */
    FEEE,

    /**
     * Unrecognised or invalid forfeit amount.
     * 
     */
    FORF,

    /**
     * Participant of delivering or receiving depository mismatch.
     * 
     */
    ICAG,

    /**
     * Client of delivering or receiving party 1 mismatch.
     * 
     */
    ICUS,

    /**
     * Client of delivering or receiving party 2 mismatch.
     * 
     */
    IEXE,

    /**
     * Unrecognised, invalid or missing common reference.
     * 
     */
    IIND,

    /**
     * Unrecognised or invalid service level agreement pre-agreed narrative information.
     * 
     */
    INNA,

    /**
     * Unrecognised or invalid letter of guarantee indicator instructed.
     * 
     */
    LEOG,

    /**
     * See narrative field for reason.
     * 
     */
    NARR,

    /**
     * Unrecognised or invalid settlement amount currency.
     * 
     */
    NCRR,

    /**
     * Cancellation request is in repair since more than one instruction match to the cancellation criteria.
     * 
     */
    NRGM,

    /**
     * Cancellation request is in repair since the instruction could not be found.
     * 
     */
    NRGN,

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
     * Unrecognised or invalid closing transaction amount.
     * 
     */
    CTRA,

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
     * Unrecognised or invalid closing date/time.
     * 
     */
    TERM,

    /**
     * Unrecognised or invalid tax status of the securities instructed.
     * 
     */
    TXST,

    /**
     * Message was not recognised. Unknown linked reference.
     * 
     */
    ULNK,

    /**
     * Unrecognised or invalid variable rate support (repurchase agreement).
     * 
     */
    VASU;

    public String value() {
        return name();
    }

    public static RepairReason7Code fromValue(String v) {
        return valueOf(v);
    }

}
