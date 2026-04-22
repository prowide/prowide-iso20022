
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason88Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason88Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ULNK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="ECMD"/>
 *     <enumeration value="ECRD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason88Code")
@XmlEnum
public enum RejectionReason88Code {


    /**
     * Linked reference is unknown.
     * 
     */
    ULNK,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Cancellation request was rejected since the instruction has already been cancelled.
     * 
     */
    DCAN,

    /**
     * Cancellation request has been rejected because the instruction process is in progress or has been processed.
     * 
     */
    DPRG,

    /**
     * Instruction is rejected due to duplicate business message identifier.
     * 
     */
    DUPL,

    /**
     * Received after the election to counterparty market deadline.
     * 
     */
    ECMD,

    /**
     * Received after the election to counterparty response market deadline.
     * 
     */
    ECRD;

    public String value() {
        return name();
    }

    public static RejectionReason88Code fromValue(String v) {
        return valueOf(v);
    }

}
