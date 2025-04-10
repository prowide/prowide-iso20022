
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason35Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason35Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="INVM"/>
 *     <enumeration value="INVL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason35Code")
@XmlEnum
public enum RejectionReason35Code {


    /**
     * Unrecognised or invalid cash account.
     * 
     */
    CASH,

    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

    /**
     * Instruction has a reference identical to another previously received instruction.
     * 
     */
    REFE,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Unrecognised or invalid settlement date.
     * 
     */
    DDAT,

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

    public static RejectionReason35Code fromValue(String v) {
        return valueOf(v);
    }

}
