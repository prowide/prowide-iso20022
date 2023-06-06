
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingInstructionRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MeetingInstructionRejection1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INMR"/>
 *     <enumeration value="INAC"/>
 *     <enumeration value="IPOS"/>
 *     <enumeration value="INQY"/>
 *     <enumeration value="INDT"/>
 *     <enumeration value="SPLT"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="IPOA"/>
 *     <enumeration value="PRXY"/>
 *     <enumeration value="RBIS"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MeetingInstructionRejection1Code")
@XmlEnum
public enum MeetingInstructionRejection1Code {


    /**
     * Instruction contains an invalid meeting reference.
     * 
     */
    INMR,

    /**
     * Instruction contains an invalid account identification.
     * 
     */
    INAC,

    /**
     * Position is less than required threshold to be allowed to vote.
     * 
     */
    IPOS,

    /**
     * Instruction contains an invalid instructed quantity (eg the instructed quantity is greater than the entitlement).
     * 
     */
    INQY,

    /**
     * Instruction received after the specified deadline.
     * 
     */
    INDT,

    /**
     * Split voting is not allowed.
     * 
     */
    SPLT,

    /**
     * Partial voting is not allowed.
     * 
     */
    PART,

    /**
     * Missing or invalid power of attorney.
     * 
     */
    IPOA,

    /**
     * Invalid proxy information.
     * 
     */
    PRXY,

    /**
     * Issuer has rejected the instruction.
     * 
     */
    RBIS,

    /**
     * Other errors.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static MeetingInstructionRejection1Code fromValue(String v) {
        return valueOf(v);
    }

}
