
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="DCAN"/&gt;
 *     &lt;enumeration value="DPRG"/&gt;
 *     &lt;enumeration value="REFI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason11Code")
@XmlEnum
public enum RejectionReason11Code {


    /**
     * The validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

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
     * Invalid corporate action identification supplied.
     * 
     */
    REFI;

    public String value() {
        return name();
    }

    public static RejectionReason11Code fromValue(String v) {
        return valueOf(v);
    }

}
