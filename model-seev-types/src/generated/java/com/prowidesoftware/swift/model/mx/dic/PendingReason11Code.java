
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingReason11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="BOIS"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="MCER"/&gt;
 *     &lt;enumeration value="MONY"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="NPAY"/&gt;
 *     &lt;enumeration value="NSEC"/&gt;
 *     &lt;enumeration value="PENR"/&gt;
 *     &lt;enumeration value="VLDA"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingReason11Code")
@XmlEnum
public enum PendingReason11Code {


    /**
     * Instruction was received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Tax reclaim has been sent to the tax authorities.
     * 
     */
    AUTH,

    /**
     * Pending receipt of beneficiary owner details.
     * 
     */
    BOIS,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * Insufficient financial instruments in your account.
     * 
     */
    LACK,

    /**
     * Instruction was received after market deadline.
     * 
     */
    LATE,

    /**
     * Awaiting receipt of adequate certification.
     * 
     */
    MCER,

    /**
     * Insufficient money in your account.
     * 
     */
    MONY,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Payment has not been made by issuer.
     * 
     */
    NPAY,

    /**
     * Financial instruments have not been delivered by the issuer.
     * 
     */
    NSEC,

    /**
     * The instruction is pending receipt of securities, for example, from a purchase, loan etc.
     * 
     */
    PENR,

    /**
     * For tax reclaim, the event is pending, the tax reclaim is valid for the tax authorities.
     * 
     */
    VLDA,

    /**
     * Certificate number error.
     * 
     */
    CERT;

    public String value() {
        return name();
    }

    public static PendingReason11Code fromValue(String v) {
        return valueOf(v);
    }

}
