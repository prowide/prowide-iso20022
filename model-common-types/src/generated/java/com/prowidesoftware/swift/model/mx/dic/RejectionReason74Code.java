
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason74Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason74Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SAFE"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason74Code")
@XmlEnum
public enum RejectionReason74Code {


    /**
     * Unrecognised or invalid message sender's safekeeping account.
     * 
     */
    SAFE,

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
     * Instruction could not be found.
     * 
     */
    NRGN,

    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * More than one instruction match the criteria.
     * 
     */
    NRGM,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static RejectionReason74Code fromValue(String v) {
        return valueOf(v);
    }

}
