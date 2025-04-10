
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="BOIS"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="CERT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
