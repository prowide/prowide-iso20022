
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason28Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason28Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASTM"/&gt;
 *     &lt;enumeration value="BUSE"/&gt;
 *     &lt;enumeration value="CADE"/&gt;
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
 *     &lt;enumeration value="NARR"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="ODNP"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="QUNP"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *     &lt;enumeration value="CTRA"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="REPP"/&gt;
 *     &lt;enumeration value="RERT"/&gt;
 *     &lt;enumeration value="RSPR"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="SETS"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="TNAR"/&gt;
 *     &lt;enumeration value="TNIU"/&gt;
 *     &lt;enumeration value="TQHI"/&gt;
 *     &lt;enumeration value="TQNP"/&gt;
 *     &lt;enumeration value="TXST"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="VASU"/&gt;
 *     &lt;enumeration value="INIR"/&gt;
 *     &lt;enumeration value="OPNM"/&gt;
 *     &lt;enumeration value="OPTY"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="EXLI"/&gt;
 *     &lt;enumeration value="INPR"/&gt;
 *     &lt;enumeration value="PRIC"/&gt;
 *     &lt;enumeration value="EQTY"/&gt;
 *     &lt;enumeration value="SIDE"/&gt;
 *     &lt;enumeration value="CADI"/&gt;
 *     &lt;enumeration value="CPTY"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="DISE"/&gt;
 *     &lt;enumeration value="RESU"/&gt;
 *     &lt;enumeration value="XRAT"/&gt;
 *     &lt;enumeration value="ACRU"/&gt;
 *     &lt;enumeration value="GAMN"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="INDT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * The instruction is irrevocable
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
     * This is primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations.  Buy-side may reject the trade if they feel that the difference in calculations is too high.
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
