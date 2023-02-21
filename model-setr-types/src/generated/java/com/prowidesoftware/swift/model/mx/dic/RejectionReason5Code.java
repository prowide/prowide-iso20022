
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXCL"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="EXLI"/&gt;
 *     &lt;enumeration value="TOLA"/&gt;
 *     &lt;enumeration value="INPR"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="ASTM"/&gt;
 *     &lt;enumeration value="CADE"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="FORF"/&gt;
 *     &lt;enumeration value="DCUS"/&gt;
 *     &lt;enumeration value="RCUS"/&gt;
 *     &lt;enumeration value="NRGN"/&gt;
 *     &lt;enumeration value="QUNP"/&gt;
 *     &lt;enumeration value="REPA"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="REPP"/&gt;
 *     &lt;enumeration value="RERT"/&gt;
 *     &lt;enumeration value="RSPR"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="IVAG"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="ICAG"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="INUK"/&gt;
 *     &lt;enumeration value="DCAN"/&gt;
 *     &lt;enumeration value="DPRG"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason5Code")
@XmlEnum
public enum RejectionReason5Code {


    /**
     * Exchange on which the financial instrument is traded is closed.
     * 
     */
    EXCL,

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
     * Request has exceeded the allowed time frame.
     * 
     */
    TOLA,

    /**
     * Price does not comply with the financial instrument's characteristics.
     * 
     */
    INPR,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Agreement start date is missing or invalid.
     * 
     */
    ASTM,

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
     * Unrecognised or invalid forfeit amount.
     * 
     */
    FORF,

    /**
     * Unrecognised or invalid delivering custodian.
     * 
     */
    DCUS,

    /**
     * Unrecognised or invalid receiving agent.
     * 
     */
    RCUS,

    /**
     * Cancellation request has been rejected since the instruction could not be found.
     * 
     */
    NRGN,

    /**
     * Quantity unit type is not provided.
     * 
     */
    QUNP,

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
     * Unrecognised or invalid trade date or requested trade date or future trade date.
     * 
     */
    DTRD,

    /**
     * Receiving agent is not recognised or is invalid.
     * 
     */
    IVAG,

    /**
     * Intermediary is not recognised or is invalid.
     * 
     */
    INTE,

    /**
     * Delivering agent is not recognised or is invalid.
     * 
     */
    ICAG,

    /**
     * Unrecognised or invalid place of trade.
     * 
     */
    PLCE,

    /**
     * Investor name and address is not recognised.
     * 
     */
    INUK,

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
     * Instruction contains an invalid message reference, reference is unknown.
     * 
     */
    ULNK;

    public String value() {
        return name();
    }

    public static RejectionReason5Code fromValue(String v) {
        return valueOf(v);
    }

}
