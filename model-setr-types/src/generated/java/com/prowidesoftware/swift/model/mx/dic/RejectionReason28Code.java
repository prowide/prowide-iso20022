
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason28Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason28Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASTM"/>
 *     <enumeration value="BUSE"/>
 *     <enumeration value="CADE"/>
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
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason28Code")
@XmlEnum
public enum RejectionReason28Code {


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
     * Unrecognised or invalid place of settlement.
     * 
     */
    DEPT,

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
     * Unrecognized or invalid fee or commission.
     * 
     */
    FEEE,

    /**
     * Unrecognised or invalid forfeit amount.
     * 
     */
    FORF,

    /**
     * Delivering agent is not recognised or is invalid.
     * 
     */
    ICAG,

    /**
     * Unrecognised or invalid receiving or delivering custodian.
     * 
     */
    ICUS,

    /**
     * Unrecognised or invalid buyer or seller.
     * 
     */
    IEXE,

    /**
     * Unrecognised, invalid or missing common reference.
     * 
     */
    IIND,

    /**
     * Unrecognised or invalid service level agreement preagreed narrative information.
     * 
     */
    INNA,

    /**
     * A narrative reason is provided.
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
     * Instruction contains an invalid or unrecognised safekeeping account.
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
     * Instruction contains an invalid message reference, reference is unknown.
     * 
     */
    ULNK,

    /**
     * Unrecognised or invalid variable rate support (repurchase agreement).
     * 
     */
    VASU,

    /**
     * The instruction is irrevocable.
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
     * This is primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations. Buy-side may reject the trade if they feel that the difference in calculations is too high.
     * 
     */
    CADI,

    /**
     * Deal or exposure is unknown.
     * 
     */
    CPTY,

    /**
     * Party A does not agree with the call amount.
     * 
     */
    DISC,

    /**
     * Party A does not agree with the exposure amount.
     * 
     */
    DISE,

    /**
     * Resulting amount must be filled in as Exchange rate is present.
     * 
     */
    RESU,

    /**
     * There cannot be a resulting amount without an exchange rate.
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
     * The validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

    /**
     * Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message.
     * 
     */
    INDT,

    /**
     * Other reason.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static RejectionReason28Code fromValue(String v) {
        return valueOf(v);
    }

}
