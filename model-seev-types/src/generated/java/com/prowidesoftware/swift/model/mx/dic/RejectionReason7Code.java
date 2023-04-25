
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEAC"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="PDEA"/>
 *     <enumeration value="INID"/>
 *     <enumeration value="REFI"/>
 *     <enumeration value="AGIN"/>
 *     <enumeration value="SAID"/>
 *     <enumeration value="DEAO"/>
 *     <enumeration value="INET"/>
 *     <enumeration value="INUS"/>
 *     <enumeration value="INPT"/>
 *     <enumeration value="INMV"/>
 *     <enumeration value="INDE"/>
 *     <enumeration value="INDT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason7Code")
@XmlEnum
public enum RejectionReason7Code {


    /**
     * Rejected as the deactivation of the event is already completed.
     * 
     */
    DEAC,

    /**
     * The validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

    /**
     * The cancellation request is rejected as there is no pending deactivation instruction.
     * 
     */
    PDEA,

    /**
     * Instruction contains an invalid message identification, identification is unknown.
     * 
     */
    INID,

    /**
     * Invalid corporate action identification supplied.
     * 
     */
    REFI,

    /**
     * Invalid agent identification supplied.
     * 
     */
    AGIN,

    /**
     * Several message with the same identification.
     * 
     */
    SAID,

    /**
     * Rejected as the deactivation of the option is already completed.
     * 
     */
    DEAO,

    /**
     * CA Event Type does not correspond with the relating Corporate Action.
     * 
     */
    INET,

    /**
     * Underlying Security Identification does not correspond with the Corporate Action Reference supplied.
     * 
     */
    INUS,

    /**
     * Event Processing Type does not correspond with the relating Corporate Action.
     * 
     */
    INPT,

    /**
     * Mandatory/Voluntary Event Type does not correspond with the relating Corporate Action.
     * 
     */
    INMV,

    /**
     * Details specified in the Corporate Action General Information block are inconsistent with those that were specified in the relating original message.
     * 
     */
    INDE,

    /**
     * Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message.
     * 
     */
    INDT;

    public String value() {
        return name();
    }

    public static RejectionReason7Code fromValue(String v) {
        return valueOf(v);
    }

}
