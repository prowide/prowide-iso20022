
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACPD"/&gt;
 *     &lt;enumeration value="VALD"/&gt;
 *     &lt;enumeration value="MATD"/&gt;
 *     &lt;enumeration value="AUTD"/&gt;
 *     &lt;enumeration value="INVD"/&gt;
 *     &lt;enumeration value="UMAC"/&gt;
 *     &lt;enumeration value="STLE"/&gt;
 *     &lt;enumeration value="STLM"/&gt;
 *     &lt;enumeration value="SSPD"/&gt;
 *     &lt;enumeration value="PCAN"/&gt;
 *     &lt;enumeration value="PSTL"/&gt;
 *     &lt;enumeration value="PFST"/&gt;
 *     &lt;enumeration value="SMLR"/&gt;
 *     &lt;enumeration value="RMLR"/&gt;
 *     &lt;enumeration value="SRBL"/&gt;
 *     &lt;enumeration value="AVLB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingStatus3Code")
@XmlEnum
public enum PendingStatus3Code {


    /**
     * Transaction has been accepted by the clearing agent.
     * 
     */
    ACPD,

    /**
     * Transaction has been validated by the clearing agent.
     * 
     */
    VALD,

    /**
     * Transaction has been matched with a corresponding transaction by the clearing agent.
     * 
     */
    MATD,

    /**
     * Transaction has been authorised by the transaction administrator or authorised party.
     * 
     */
    AUTD,

    /**
     * Transaction is invalid.
     * 
     */
    INVD,

    /**
     * Clearing agent attempted to match the transaction with a corresponding transaction but failed.
     * 
     */
    UMAC,

    /**
     * Transaction is eligible for future settlement.
     * 
     */
    STLE,

    /**
     * Transaction is eligible for immediate settlement.
     * 
     */
    STLM,

    /**
     * Transaction has been suspended by the clearing agent.
     * 
     */
    SSPD,

    /**
     * Clearing agent has received a cancellation request for the transaction, and needs either a matching request for cancellation from the counterparty or a confirmation from an authorised party.
     * 
     */
    PCAN,

    /**
     * Transaction is eligible for settlement, but is pending.
     * 
     */
    PSTL,

    /**
     * Transaction eligible for immediate settlement, has failed to settle.
     * 
     */
    PFST,

    /**
     * Transaction causes the 'Sender multilateral limit' to be exceeded and cannot currently be processed.
     * 
     */
    SMLR,

    /**
     * Transaction causes the 'Receiver multilateral limit' to be exceeded and cannot currently be processed.
     * 
     */
    RMLR,

    /**
     * Transaction causes the bilateral limit fixed between Sender and Receiver to be exceeded and cannot currently be processed.
     * 
     */
    SRBL,

    /**
     * Specifies that the message is queued to the receiving payment system and is awaiting processing because the receiving payment system is not operational (open) at that point in time.
     * 
     */
    AVLB;

    public String value() {
        return name();
    }

    public static PendingStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
