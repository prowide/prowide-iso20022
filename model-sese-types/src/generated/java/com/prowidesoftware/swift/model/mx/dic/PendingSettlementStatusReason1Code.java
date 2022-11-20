
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingSettlementStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingSettlementStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AWSH"/&gt;
 *     &lt;enumeration value="BLOC"/&gt;
 *     &lt;enumeration value="CAIS"/&gt;
 *     &lt;enumeration value="CLAC"/&gt;
 *     &lt;enumeration value="DOCC"/&gt;
 *     &lt;enumeration value="DOCY"/&gt;
 *     &lt;enumeration value="IAAD"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="LINK"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PHCK"/&gt;
 *     &lt;enumeration value="PHSE"/&gt;
 *     &lt;enumeration value="SBLO"/&gt;
 *     &lt;enumeration value="MINF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
