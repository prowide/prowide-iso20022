
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepairReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RepairReason7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="BUSE"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CASY"/>
 *     <enumeration value="COMC"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="LEOG"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="CTRA"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="VASU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
