
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedStatusReason4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CUTO"/>
 *     <enumeration value="NALC"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="LEGL"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectedStatusReason4Code")
@XmlEnum
public enum RejectedStatusReason4Code {


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
     * Instruction is not compliant with the service level agreement.
     * 
     */
    NSLA,

    /**
     * Legally impossible to cancel.
     * 
     */
    LEGL,

    /**
     * Another reason for the status rejected.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static RejectedStatusReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
