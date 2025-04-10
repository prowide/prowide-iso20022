
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason81Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason81Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="REFI"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason81Code")
@XmlEnum
public enum RejectionReason81Code {


    /**
     * Validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

    /**
     * Invalid corporate action identification supplied.
     * 
     */
    REFI,

    /**
     * Cancellation request was rejected since the instruction has already been cancelled.
     * 
     */
    DCAN,

    /**
     * Cancellation request has been rejected because the instruction process is in progress or has been processed.
     * 
     */
    DPRG;

    public String value() {
        return name();
    }

    public static RejectionReason81Code fromValue(String v) {
        return valueOf(v);
    }

}
