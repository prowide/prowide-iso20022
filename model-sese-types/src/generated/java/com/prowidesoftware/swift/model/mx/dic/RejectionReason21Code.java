
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason21Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason21Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="REFE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason21Code")
@XmlEnum
public enum RejectionReason21Code {


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
    REFE;

    public String value() {
        return name();
    }

    public static RejectionReason21Code fromValue(String v) {
        return valueOf(v);
    }

}
