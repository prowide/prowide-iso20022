
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingReason13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="BOIS"/&gt;
 *     &lt;enumeration value="MCER"/&gt;
 *     &lt;enumeration value="MONY"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="PENR"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingReason13Code")
@XmlEnum
public enum PendingReason13Code {


    /**
     * Instruction was received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Pending receipt of beneficiary owner details.
     * 
     */
    BOIS,

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
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * The instruction is pending receipt of securities, for example, from a purchase, loan etc.
     * 
     */
    PENR,

    /**
     * Certificate number error.
     * 
     */
    CERT;

    public String value() {
        return name();
    }

    public static PendingReason13Code fromValue(String v) {
        return valueOf(v);
    }

}
