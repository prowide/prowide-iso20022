
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason61Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason61Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DSET"/>
 *     <enumeration value="DPRG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason61Code")
@XmlEnum
public enum RejectionReason61Code {


    /**
     * Transaction/instruction received after the account servicer's specified deadline.
     * 
     */
    ADEA,

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
     * Cancellation request was denied because the instruction was already settled.
     * 
     */
    DSET,

    /**
     * Cancellation request has been rejected because the instruction process is in progress or has been processed.
     * 
     */
    DPRG;

    public String value() {
        return name();
    }

    public static RejectionReason61Code fromValue(String v) {
        return valueOf(v);
    }

}
