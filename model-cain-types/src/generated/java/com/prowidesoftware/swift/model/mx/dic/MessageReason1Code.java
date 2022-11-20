
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASTD"/&gt;
 *     &lt;enumeration value="AMNT"/&gt;
 *     &lt;enumeration value="ASPC"/&gt;
 *     &lt;enumeration value="CDCL"/&gt;
 *     &lt;enumeration value="COFF"/&gt;
 *     &lt;enumeration value="CRND"/&gt;
 *     &lt;enumeration value="CRTN"/&gt;
 *     &lt;enumeration value="CUNB"/&gt;
 *     &lt;enumeration value="CCAN"/&gt;
 *     &lt;enumeration value="KDAC"/&gt;
 *     &lt;enumeration value="ERRP"/&gt;
 *     &lt;enumeration value="FLRL"/&gt;
 *     &lt;enumeration value="KINV"/&gt;
 *     &lt;enumeration value="ISGN"/&gt;
 *     &lt;enumeration value="ISTD"/&gt;
 *     &lt;enumeration value="ITIM"/&gt;
 *     &lt;enumeration value="IUNV"/&gt;
 *     &lt;enumeration value="ENDK"/&gt;
 *     &lt;enumeration value="MLFC"/&gt;
 *     &lt;enumeration value="FDCL"/&gt;
 *     &lt;enumeration value="NDCL"/&gt;
 *     &lt;enumeration value="FORC"/&gt;
 *     &lt;enumeration value="KSYN"/&gt;
 *     &lt;enumeration value="UDSP"/&gt;
 *     &lt;enumeration value="USND"/&gt;
 *     &lt;enumeration value="UCMP"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="TIMO"/&gt;
 *     &lt;enumeration value="TUNB"/&gt;
 *     &lt;enumeration value="TRND"/&gt;
 *     &lt;enumeration value="TOFF"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *     &lt;enumeration value="KSEC"/&gt;
 *     &lt;enumeration value="RUNV"/&gt;
 *     &lt;enumeration value="RTIM"/&gt;
 *     &lt;enumeration value="RSTD"/&gt;
 *     &lt;enumeration value="RSGN"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="IDPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageReason1Code")
@XmlEnum
public enum MessageReason1Code {


    /**
     * Stand-in processing at the acquirer's option.
     * 
     */
    ASTD,

    /**
     * Amount inconsistent between request and response.
     * 
     */
    AMNT,

    /**
     * Card acceptor forced to be online.
     * 
     */
    ASPC,

    /**
     * Integrated circuit card declines the transaction after the authorisation.
     * 
     */
    CDCL,

    /**
     * Transaction performed offline by the card.
     * 
     */
    COFF,

    /**
     * Random online decided by the card.
     * 
     */
    CRND,

    /**
     * Card left by the cardholder.
     * 
     */
    CRTN,

    /**
     * Card cannot process offline the transaction.
     * 
     */
    CUNB,

    /**
     * Customer cancellation, for example removing the chip card after sending the authorisation, but before the end of the transaction.
     * 
     */
    CCAN,

    /**
     * Deactivated key must be replaced.
     * 
     */
    KDAC,

    /**
     * Response message was invalid (for example a problem of format or security).
     * 
     */
    ERRP,

    /**
     * Transaction above or under the floor limit.
     * 
     */
    FLRL,

    /**
     * Verification of the key has failed.
     * 
     */
    KINV,

    /**
     * Issuer signed off.
     * 
     */
    ISGN,

    /**
     * Stand-in processing at the issuer's option.
     * 
     */
    ISTD,

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
     * End of key life cycle.
     * 
     */
    ENDK,

    /**
     * Suspected malfunction (for example card reader defect, or printer out of order).
     * 
     */
    MLFC,

    /**
     * Offline authorisation declined the transaction.
     * 
     */
    FDCL,

    /**
     * Online authorisation declined the transaction.
     * 
     */
    NDCL,

    /**
     * Forced online by card acceptor, terminal, card, or the issuer.
     * 
     */
    FORC,

    /**
     * Keys not synchronised.
     * 
     */
    KSYN,

    /**
     * Cardholder did not take the presented items.
     * 
     */
    UDSP,

    /**
     * Unable to send the message.
     * 
     */
    USND,

    /**
     * Card acceptor device unable to complete transaction after the authorisation response (for example, the written signature invalid).
     * 
     */
    UCMP,

    /**
     * Response to the authorisation received too late.
     * 
     */
    LATE,

    /**
     * Waiting for response from the receiver, or no response was received (for example connection release before receiving the response).
     * 
     */
    TIMO,

    /**
     * Terminal cannot process offline the transaction.
     * 
     */
    TUNB,

    /**
     * Random online decided by the terminal.
     * 
     */
    TRND,

    /**
     * Transaction performed offline by the terminal.
     * 
     */
    TOFF,

    /**
     * Card transaction failed because the merchant suspected a fraud.
     * 
     */
    SUSP,

    /**
     * Security reasons.
     * 
     */
    KSEC,

    /**
     * Receiver unavailable.
     * 
     */
    RUNV,

    /**
     * Receiver timed out on request.
     * 
     */
    RTIM,

    /**
     * Stand-in processing at the receiver's option.
     * 
     */
    RSTD,

    /**
     * Receiver signed off.
     * 
     */
    RSGN,

    /**
     * Partial reversal.
     * 
     */
    PART,

    /**
     * Inconsistency between the items deposited and their declared value.
     * 
     */
    IDPS;

    public String value() {
        return name();
    }

    public static MessageReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
