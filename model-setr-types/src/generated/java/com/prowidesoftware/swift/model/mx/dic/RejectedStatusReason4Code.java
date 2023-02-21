
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectedStatusReason4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUTO"/&gt;
 *     &lt;enumeration value="NALC"/&gt;
 *     &lt;enumeration value="NSLA"/&gt;
 *     &lt;enumeration value="LEGL"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
