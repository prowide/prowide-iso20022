
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UKWN"/>
 *     <enumeration value="EXCL"/>
 *     <enumeration value="EXLI"/>
 *     <enumeration value="TOLA"/>
 *     <enumeration value="INPR"/>
 *     <enumeration value="NAUT"/>
 *     <enumeration value="NMAT"/>
 *     <enumeration value="NINS"/>
 *     <enumeration value="NINV"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="INCR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
