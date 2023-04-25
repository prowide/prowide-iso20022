
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Status9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="ATTC"/>
 *     <enumeration value="CAND"/>
 *     <enumeration value="CSUB"/>
 *     <enumeration value="FRWD"/>
 *     <enumeration value="RCIS"/>
 *     <enumeration value="REGM"/>
 *     <enumeration value="STIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
