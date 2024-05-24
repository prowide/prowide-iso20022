
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason23Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason23Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="DQCS"/>
 *     <enumeration value="ITAX"/>
 *     <enumeration value="NTAX"/>
 *     <enumeration value="MTAX"/>
 *     <enumeration value="SNAV"/>
 *     <enumeration value="BSTR"/>
 *     <enumeration value="IPAW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason23Code")
@XmlEnum
public enum PendingReason23Code {


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
    FULL,

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
     * The instruction is pending receipt of securities, for example, from a purchase or loan.
     * 
     */
    PENR,

    /**
     * Certificate number error.
     * 
     */
    CERT,

    /**
     * Unrecognised or invalid instructed cash amount.
     * 
     */
    DQCS,

    /**
     * Tax rate provided is incorrect. It falls outside the acceptable values for that investment country.
     * 
     */
    ITAX,

    /**
     * Tax rate is not consistent with the documentation in place.
     * 
     */
    NTAX,

    /**
     * Tax rate is missing.
     * 
     */
    MTAX,

    /**
     * System is not available. Instruction is sent outside of business hours.
     * 
     */
    SNAV,

    /**
     * Instruction is submitted before instruction start date.
     * 
     */
    BSTR,

    /**
     * Required paperwork is invalid, incomplete or missing.
     * 
     */
    IPAW;

    public String value() {
        return name();
    }

    public static PendingReason23Code fromValue(String v) {
        return valueOf(v);
    }

}
