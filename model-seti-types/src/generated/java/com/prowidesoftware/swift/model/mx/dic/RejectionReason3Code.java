
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="EXCL"/&gt;
 *     &lt;enumeration value="EXLI"/&gt;
 *     &lt;enumeration value="TOLA"/&gt;
 *     &lt;enumeration value="INPR"/&gt;
 *     &lt;enumeration value="NAUT"/&gt;
 *     &lt;enumeration value="NMAT"/&gt;
 *     &lt;enumeration value="NINS"/&gt;
 *     &lt;enumeration value="NINV"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="INCR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason3Code")
@XmlEnum
public enum RejectionReason3Code {


    /**
     * Financial instrument's symbol has not been recognized.
     * 
     */
    UKWN,

    /**
     * Exchange on which the financial instrument is traded is closed.
     * 
     */
    EXCL,

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
     * Permission to be processed is not granted.
     * 
     */
    NAUT,

    /**
     * No counterparty order has been identified.
     * 
     */
    NMAT,

    /**
     * Referred instrument does not exist in combination with the mentioned market.
     * 
     */
    NINS,

    /**
     * Requested financial instrument is not available.
     * 
     */
    NINV,

    /**
     * Counterparty is not interested in the transaction.
     * 
     */
    PASS,

    /**
     * Requestor has no insufficient credit to make the trade.
     * 
     */
    INCR;

    public String value() {
        return name();
    }

    public static RejectionReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
