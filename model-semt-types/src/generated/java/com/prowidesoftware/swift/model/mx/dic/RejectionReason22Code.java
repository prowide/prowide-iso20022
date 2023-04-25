
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason22Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason22Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SAFE"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="CAEV"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason22Code")
@XmlEnum
public enum RejectionReason22Code {


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
     * Corporate action pending on the financial instrument instructed.
     * 
     */
    CAEV,

    /**
     * Unrecognised or invalid settlement date.
     * 
     */
    DDAT,

    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static RejectionReason22Code fromValue(String v) {
        return valueOf(v);
    }

}
