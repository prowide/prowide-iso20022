
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingCancellationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingCancellationReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QORM"/&gt;
 *     &lt;enumeration value="PROC"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetingCancellationReason1Code")
@XmlEnum
public enum MeetingCancellationReason1Code {


    /**
     * Cancellation due to insufficient participation to the vote.
     * 
     */
    QORM,

    /**
     * Cancellation due to a processing error.
     * 
     */
    PROC,

    /**
     * Cancellation due to another reason.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static MeetingCancellationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
