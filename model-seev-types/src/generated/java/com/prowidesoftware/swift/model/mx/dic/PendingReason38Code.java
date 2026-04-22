
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason38Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason38Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="BSTR"/>
 *     <enumeration value="DQCS"/>
 *     <enumeration value="NTAX"/>
 *     <enumeration value="ITAX"/>
 *     <enumeration value="IPED"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="IPAW"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="MTAX"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="SNAV"/>
 *     <enumeration value="CERT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason38Code")
@XmlEnum
public enum PendingReason38Code {


    /**
     * Instruction was received after the account servicer's deadline. It will be managed as per the bilateral service agreement between the account servicer and account owner.
     * 
     */
    ADEA,

    /**
     * Instruction is submitted before instruction start date.
     * 
     */
    BSTR,

    /**
     * Unrecognised or invalid instructed cash amount.
     * 
     */
    DQCS,

    /**
     * Tax rate is not consistent with the documentation in place.
     * 
     */
    NTAX,

    /**
     * Tax rate provided is incorrect. It falls outside the acceptable values for that investment country.
     * 
     */
    ITAX,

    /**
     * Instruction was received prior to entitlement date.
     * 
     */
    IPED,

    /**
     * Insufficient money in your account.
     * 
     */
    MONY,

    /**
     * Required paperwork is invalid, incomplete or missing.
     * 
     */
    IPAW,

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
     * Tax rate is missing.
     * 
     */
    MTAX,

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
     * Instruction is pending receipt of securities, for example, from a purchase or loan.
     * 
     */
    PENR,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * System is not available. Instruction is sent outside of business hours.
     * 
     */
    SNAV,

    /**
     * Certificate number error.
     * 
     */
    CERT;

    public String value() {
        return name();
    }

    public static PendingReason38Code fromValue(String v) {
        return valueOf(v);
    }

}
