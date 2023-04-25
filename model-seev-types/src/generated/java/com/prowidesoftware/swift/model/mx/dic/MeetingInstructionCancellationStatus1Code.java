
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingInstructionCancellationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MeetingInstructionCancellationStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAND"/>
 *     <enumeration value="CANP"/>
 *     <enumeration value="DEND"/>
 *     <enumeration value="REJT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MeetingInstructionCancellationStatus1Code")
@XmlEnum
public enum MeetingInstructionCancellationStatus1Code {


    /**
     * Cancellation has been completed.
     * 
     */
    CAND,

    /**
     * Cancellation is pending. It is not known at this time whether cancellation can be executed.
     * 
     */
    CANP,

    /**
     * Cancellation will not be executed due to business reasons.
     * 
     */
    DEND,

    /**
     * Cancellation request has been rejected for further processing due to system (data) reasons.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static MeetingInstructionCancellationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
