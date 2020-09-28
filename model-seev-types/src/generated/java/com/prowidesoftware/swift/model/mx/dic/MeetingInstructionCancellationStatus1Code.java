
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingInstructionCancellationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingInstructionCancellationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *     &lt;enumeration value="CANP"/&gt;
 *     &lt;enumeration value="DEND"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
