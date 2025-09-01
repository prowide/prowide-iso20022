
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectedStatusReason8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUTO"/&gt;
 *     &lt;enumeration value="NALC"/&gt;
 *     &lt;enumeration value="NSLA"/&gt;
 *     &lt;enumeration value="LEGL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectedStatusReason8Code")
@XmlEnum
public enum RejectedStatusReason8Code {


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
    LEGL;

    public String value() {
        return name();
    }

    public static RejectedStatusReason8Code fromValue(String v) {
        return valueOf(v);
    }

}
