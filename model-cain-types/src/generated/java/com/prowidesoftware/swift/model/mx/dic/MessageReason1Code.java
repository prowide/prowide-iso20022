
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASTD"/>
 *     <enumeration value="AMNT"/>
 *     <enumeration value="ASPC"/>
 *     <enumeration value="CDCL"/>
 *     <enumeration value="COFF"/>
 *     <enumeration value="CRND"/>
 *     <enumeration value="CRTN"/>
 *     <enumeration value="CUNB"/>
 *     <enumeration value="CCAN"/>
 *     <enumeration value="KDAC"/>
 *     <enumeration value="ERRP"/>
 *     <enumeration value="FLRL"/>
 *     <enumeration value="KINV"/>
 *     <enumeration value="ISGN"/>
 *     <enumeration value="ISTD"/>
 *     <enumeration value="ITIM"/>
 *     <enumeration value="IUNV"/>
 *     <enumeration value="ENDK"/>
 *     <enumeration value="MLFC"/>
 *     <enumeration value="FDCL"/>
 *     <enumeration value="NDCL"/>
 *     <enumeration value="FORC"/>
 *     <enumeration value="KSYN"/>
 *     <enumeration value="UDSP"/>
 *     <enumeration value="USND"/>
 *     <enumeration value="UCMP"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="TIMO"/>
 *     <enumeration value="TUNB"/>
 *     <enumeration value="TRND"/>
 *     <enumeration value="TOFF"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="KSEC"/>
 *     <enumeration value="RUNV"/>
 *     <enumeration value="RTIM"/>
 *     <enumeration value="RSTD"/>
 *     <enumeration value="RSGN"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="IDPS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
