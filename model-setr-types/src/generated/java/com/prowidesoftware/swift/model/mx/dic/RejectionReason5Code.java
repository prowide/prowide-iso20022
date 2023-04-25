
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXCL"/>
 *     <enumeration value="UKWN"/>
 *     <enumeration value="EXLI"/>
 *     <enumeration value="TOLA"/>
 *     <enumeration value="INPR"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="ASTM"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="DCUS"/>
 *     <enumeration value="RCUS"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="QUNP"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="IVAG"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="INUK"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="ULNK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
