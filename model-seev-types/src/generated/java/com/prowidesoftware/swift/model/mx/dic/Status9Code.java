
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="ATTC"/&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *     &lt;enumeration value="CSUB"/&gt;
 *     &lt;enumeration value="FRWD"/&gt;
 *     &lt;enumeration value="RCIS"/&gt;
 *     &lt;enumeration value="REGM"/&gt;
 *     &lt;enumeration value="STIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status9Code")
@XmlEnum
public enum Status9Code {


    /**
     * Instruction has been accepted and is validated for further processing.
     * 
     */
    PACK,

    /**
     * Attendance is confirmed at the meeting.
     * 
     */
    ATTC,

    /**
     * Instruction has been cancelled.
     * 
     */
    CAND,

    /**
     * Instruction has been cancelled by the agent, for example, due to an event deadline extension.
     * 
     */
    CSUB,

    /**
     * Accepted and sent along the chain.
     * 
     */
    FRWD,

    /**
     * Instruction has been received by Issuer, equivalent to the confirmation of receipt of votes cast electronically.
     * 
     */
    RCIS,

    /**
     * Rights holder has been registered to participate to the meeting.
     * 
     */
    REGM,

    /**
     * Standing instruction is applied.
     * 
     */
    STIN;

    public String value() {
        return name();
    }

    public static Status9Code fromValue(String v) {
        return valueOf(v);
    }

}
