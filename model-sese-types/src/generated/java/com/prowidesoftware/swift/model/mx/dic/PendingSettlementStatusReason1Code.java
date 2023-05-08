
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingSettlementStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingSettlementStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWSH"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="IAAD"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PHCK"/>
 *     <enumeration value="PHSE"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="MINF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingSettlementStatusReason1Code")
@XmlEnum
public enum PendingSettlementStatusReason1Code {


    /**
     * Securities have not yet been received from the counterparty.
     * 
     */
    AWSH,

    /**
     * Your account is blocked, no instruction can settle over the account.
     * 
     */
    BLOC,

    /**
     * Awaiting securities from corporate action issue or other procedures, for example, conversion, dematerialisation, exchange, registration, stamping, splitting, etc.
     * 
     */
    CAIS,

    /**
     * Insufficient deliverable securities in the counterparty's account, or counterparty does not hold the securities.
     * 
     */
    CLAC,

    /**
     * Awaiting documents or endorsements from the counterparty.
     * 
     */
    DOCC,

    /**
     * Awaiting documents or endorsements from you.
     * 
     */
    DOCY,

    /**
     * Pending reason is being investigated.
     * 
     */
    IAAD,

    /**
     * Insufficient deliverable securities in your account.
     * 
     */
    LACK,

    /**
     * Your instruction is pending settlement because the instruction linked to it is pending.
     * 
     */
    LINK,

    /**
     * Another settlement pending reason.
     * 
     */
    OTHR,

    /**
     * Physical shares have been received and are being checked for authenticity.
     * 
     */
    PHCK,

    /**
     * Settlement is physical and securities are being delivered.
     * 
     */
    PHSE,

    /**
     * Settlement is pending. The securities are blocked due to, for example, a corporate action event, re-alignment.
     * 
     */
    SBLO,

    /**
     * Information, for example, telephone number, contact person, is missing.
     * 
     */
    MINF;

    public String value() {
        return name();
    }

    public static PendingSettlementStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
