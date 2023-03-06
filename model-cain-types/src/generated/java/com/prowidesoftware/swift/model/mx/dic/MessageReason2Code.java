
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASTD"/&gt;
 *     &lt;enumeration value="FLRL"/&gt;
 *     &lt;enumeration value="COFF"/&gt;
 *     &lt;enumeration value="ASPC"/&gt;
 *     &lt;enumeration value="CUNB"/&gt;
 *     &lt;enumeration value="CRND"/&gt;
 *     &lt;enumeration value="FORC"/&gt;
 *     &lt;enumeration value="ISGN"/&gt;
 *     &lt;enumeration value="ITIM"/&gt;
 *     &lt;enumeration value="IUNV"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="TRND"/&gt;
 *     &lt;enumeration value="TUNB"/&gt;
 *     &lt;enumeration value="RSTD"/&gt;
 *     &lt;enumeration value="RTIM"/&gt;
 *     &lt;enumeration value="RSGN"/&gt;
 *     &lt;enumeration value="RUNV"/&gt;
 *     &lt;enumeration value="TOFF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
