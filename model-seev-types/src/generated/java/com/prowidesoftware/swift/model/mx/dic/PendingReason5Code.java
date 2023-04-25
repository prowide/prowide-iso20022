
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="NPAY"/>
 *     <enumeration value="NSEC"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="VLDA"/>
 *     <enumeration value="CERT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason5Code")
@XmlEnum
public enum PendingReason5Code {


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

    public static PendingReason5Code fromValue(String v) {
        return valueOf(v);
    }

}
