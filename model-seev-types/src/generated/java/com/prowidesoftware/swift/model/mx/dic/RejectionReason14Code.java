
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="LATT"/>
 *     <enumeration value="INET"/>
 *     <enumeration value="INUS"/>
 *     <enumeration value="INPT"/>
 *     <enumeration value="INMV"/>
 *     <enumeration value="INDE"/>
 *     <enumeration value="AGIN"/>
 *     <enumeration value="INMO"/>
 *     <enumeration value="SAID"/>
 *     <enumeration value="INID"/>
 *     <enumeration value="MOSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason14Code")
@XmlEnum
public enum RejectionReason14Code {


    /**
     * The validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

    /**
     * Instruction/Request arrives too late.
     * 
     */
    LATT,

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
     * Invalid agent identification supplied.
     * 
     */
    AGIN,

    /**
     * Details specified in the MOVEMENT GENERAL INFORMATION block are inconsistent with those that were specified in the relating original message.
     * 
     */
    INMO,

    /**
     * Several message with the same identification.
     * 
     */
    SAID,

    /**
     * Instruction contains an invalid message identification, identification is unknown.
     * 
     */
    INID,

    /**
     * One or more of the underlying movements have already settled.
     * 
     */
    MOSE;

    public String value() {
        return name();
    }

    public static RejectionReason14Code fromValue(String v) {
        return valueOf(v);
    }

}
