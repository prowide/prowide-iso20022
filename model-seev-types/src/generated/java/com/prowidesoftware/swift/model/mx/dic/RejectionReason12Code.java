
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEAC"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="SAME"/>
 *     <enumeration value="REFI"/>
 *     <enumeration value="AGIN"/>
 *     <enumeration value="MAIN"/>
 *     <enumeration value="OPTI"/>
 *     <enumeration value="PEDA"/>
 *     <enumeration value="NORO"/>
 *     <enumeration value="INET"/>
 *     <enumeration value="INUS"/>
 *     <enumeration value="INPT"/>
 *     <enumeration value="INMV"/>
 *     <enumeration value="SAID"/>
 *     <enumeration value="MICA"/>
 *     <enumeration value="NOAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason12Code")
@XmlEnum
public enum RejectionReason12Code {


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
     * An Agent Corporate Action Deactivation Instruction with the same identification already exists.
     * 
     */
    SAME,

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
     * Agent Identification specified does not correspond to the main Agent of the relating event.
     * 
     */
    MAIN,

    /**
     * Invalid combination of CA option code and CA option number.
     * 
     */
    OPTI,

    /**
     * The specified Corporate Action option already has a pending deactivation instruction.
     * 
     */
    PEDA,

    /**
     * Specified Corporate Action has no remaining options to disable.
     * 
     */
    NORO,

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
     * Several message with the same identification.
     * 
     */
    SAID,

    /**
     * Issuer CA Identification does not correspond with the Corporate Action Identification supplied.
     * 
     */
    MICA,

    /**
     * This instruction type is not applicable for mandatory events.
     * 
     */
    NOAP;

    public String value() {
        return name();
    }

    public static RejectionReason12Code fromValue(String v) {
        return valueOf(v);
    }

}
