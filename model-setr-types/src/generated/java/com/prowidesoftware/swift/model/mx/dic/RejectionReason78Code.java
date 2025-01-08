
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason78Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason78Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASTM"/>
 *     <enumeration value="BUSE"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="COMC"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="ODNP"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="QUNP"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="CTRA"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="TNAR"/>
 *     <enumeration value="TNIU"/>
 *     <enumeration value="TQHI"/>
 *     <enumeration value="TQNP"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="VASU"/>
 *     <enumeration value="INIR"/>
 *     <enumeration value="OPNM"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="UKWN"/>
 *     <enumeration value="EXLI"/>
 *     <enumeration value="INPR"/>
 *     <enumeration value="PRIC"/>
 *     <enumeration value="EQTY"/>
 *     <enumeration value="SIDE"/>
 *     <enumeration value="CADI"/>
 *     <enumeration value="CPTY"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="DISE"/>
 *     <enumeration value="RESU"/>
 *     <enumeration value="XRAT"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="GAMN"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="INDT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="ICAG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason78Code")
@XmlEnum
public enum RejectionReason78Code {


    /**
     * Agreement start date is missing or invalid.
     * 
     */
    ASTM,

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
     * Unrecognised or invalid commercialisation contract.
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
     * Unrecognised or invalid settlement amount.
     * 
     */
    DMON,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Unrecognised or invalid trade date or requested trade date or future trade date.
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
     * Unrecognised or invalid client of delivering or receiving party 2.
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
     * Order entry date is missing.
     * 
     */
    ODNP,

    /**
     * Unrecognised or invalid place of trade.
     * 
     */
    PLCE,

    /**
     * Quantity unit type is not provided.
     * 
     */
    QUNP,

    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * Unrecognised or invalid closing closing amount.
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
     * A message with the same Transaction Notice Reference, Market Member, and Intermediary has already been processed.
     * 
     */
    TNAR,

    /**
     * The combination of the Transaction Notice Reference, Market Member, and Intermediary is unknown.
     * 
     */
    TNIU,

    /**
     * Market member executed the order exceeding the requested quantity.
     * 
     */
    TQHI,

    /**
     * Traded securities quantity not provided.
     * 
     */
    TQNP,

    /**
     * Unrecognised or invalid tax status of the securities instructed.
     * 
     */
    TXST,

    /**
     * Linked reference is unknown.
     * 
     */
    ULNK,

    /**
     * Unrecognised or invalid variable rate support (repurchase agreement).
     * 
     */
    VASU,

    /**
     * Instruction is irrevocable.
     * 
     */
    INIR,

    /**
     * Unrecognised option number.
     * 
     */
    OPNM,

    /**
     * Invalid option type.
     * 
     */
    OPTY,

    /**
     * Financial instrument's symbol has not been recognized.
     * 
     */
    UKWN,

    /**
     * Countervalue of the order exceeds the allowed trading limit or quote exceeds limit.
     * 
     */
    EXLI,

    /**
     * Price does not comply with the financial instrument's characteristics.
     * 
     */
    INPR,

    /**
     * Price in the execution exceeds the order price.
     * 
     */
    PRIC,

    /**
     * Quantity in the execution exceeds the ordered quantity.
     * 
     */
    EQTY,

    /**
     * Order is for the wrong side.
     * 
     */
    SIDE,

    /**
     * Primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations. Buy-side may reject the trade if they feel that the difference in calculations is too high.
     * 
     */
    CADI,

    /**
     * Deal or exposure is unknown.
     * 
     */
    CPTY,

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
     * Resulting amount must be filled in as exchange rate is present.
     * 
     */
    RESU,

    /**
     * Resulting amount is not allowed without an exchange rate.
     * 
     */
    XRAT,

    /**
     * Accrued interest is not applicable for this type of security.
     * 
     */
    ACRU,

    /**
     * Gross amount is less than net amount.
     * 
     */
    GAMN,

    /**
     * One option must be marked as the default.
     * 
     */
    DFLT,

    /**
     * Validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

    /**
     * Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message.
     * 
     */
    INDT,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Unrecognised or invalid depository.
     * 
     */
    DEPT,

    /**
     * Unrecognised or invalid client of delivering or receiving party 1.
     * 
     */
    ICUS,

    /**
     * Unrecognised or invalid participant of delivering or receiving depository.
     * 
     */
    ICAG;

    public String value() {
        return name();
    }

    public static RejectionReason78Code fromValue(String v) {
        return valueOf(v);
    }

}
