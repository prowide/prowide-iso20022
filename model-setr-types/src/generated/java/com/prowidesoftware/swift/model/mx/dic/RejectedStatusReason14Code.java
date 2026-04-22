
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedStatusReason14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ULNK"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="CUTO"/>
 *     <enumeration value="NALC"/>
 *     <enumeration value="LEGL"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="NRGM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectedStatusReason14Code")
@XmlEnum
public enum RejectedStatusReason14Code {


    /**
     * Linked reference is not known.
     * 
     */
    ULNK,

    /**
     * Instruction is not compliant with the service level agreement.
     * 
     */
    NSLA,

    /**
     * Instruction has been received after the cut-off time.
     * 
     */
    CUTO,

    /**
     * Instructing party is not allowed to request a cancellation.
     * 
     */
    NALC,

    /**
     * Legally impossible to cancel.
     * 
     */
    LEGL,

    /**
     * Instruction was received after the Receiver's deadline.
     * 
     */
    ADEA,

    /**
     * The cancellation request has been rejected since more than one instruction match to the cancellation criteria.
     * 
     */
    NRGM;

    public String value() {
        return name();
    }

    public static RejectedStatusReason14Code fromValue(String v) {
        return valueOf(v);
    }

}
