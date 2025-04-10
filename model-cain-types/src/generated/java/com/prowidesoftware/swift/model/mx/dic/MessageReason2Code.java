
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASTD"/>
 *     <enumeration value="FLRL"/>
 *     <enumeration value="COFF"/>
 *     <enumeration value="ASPC"/>
 *     <enumeration value="CUNB"/>
 *     <enumeration value="CRND"/>
 *     <enumeration value="FORC"/>
 *     <enumeration value="ISGN"/>
 *     <enumeration value="ITIM"/>
 *     <enumeration value="IUNV"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="TRND"/>
 *     <enumeration value="TUNB"/>
 *     <enumeration value="RSTD"/>
 *     <enumeration value="RTIM"/>
 *     <enumeration value="RSGN"/>
 *     <enumeration value="RUNV"/>
 *     <enumeration value="TOFF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageReason2Code")
@XmlEnum
public enum MessageReason2Code {


    /**
     * Stand-in processing at the acquirer's option.
     * 
     */
    ASTD,

    /**
     * Transaction above or under the floor limit.
     * 
     */
    FLRL,

    /**
     * Transaction performed offline by the card.
     * 
     */
    COFF,

    /**
     * Card acceptor forced to be online.
     * 
     */
    ASPC,

    /**
     * Card cannot process offline the transaction.
     * 
     */
    CUNB,

    /**
     * Random online decided by the card.
     * 
     */
    CRND,

    /**
     * Forced online by card acceptor, terminal, card, or the issuer.
     * 
     */
    FORC,

    /**
     * Issuer signed off.
     * 
     */
    ISGN,

    /**
     * Issuer timed out on request.
     * 
     */
    ITIM,

    /**
     * Issuer unavailable.
     * 
     */
    IUNV,

    /**
     * Other national type of reason.
     * 
     */
    OTHN,

    /**
     * Other private type of reason.
     * 
     */
    OTHP,

    /**
     * Random online decided by the terminal.
     * 
     */
    TRND,

    /**
     * Terminal cannot process offline the transaction.
     * 
     */
    TUNB,

    /**
     * Stand-in processing at the receiver's option.
     * 
     */
    RSTD,

    /**
     * Receiver timed out on request.
     * 
     */
    RTIM,

    /**
     * Receiver signed off.
     * 
     */
    RSGN,

    /**
     * Receiver unavailable.
     * 
     */
    RUNV,

    /**
     * Transaction performed offline by the terminal.
     * 
     */
    TOFF;

    public String value() {
        return name();
    }

    public static MessageReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
