
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason71Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason71Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="INVM"/>
 *     <enumeration value="INVL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason71Code")
@XmlEnum
public enum RejectionReason71Code {


    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

    /**
     * More than one instruction match the criteria.
     * 
     */
    NRGM,

    /**
     * Instruction could not be found.
     * 
     */
    NRGN,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * Invalid or unrecognized modification request.
     * 
     */
    INVM,

    /**
     * Invalid or unrecognized link.
     * 
     */
    INVL;

    public String value() {
        return name();
    }

    public static RejectionReason71Code fromValue(String v) {
        return valueOf(v);
    }

}
