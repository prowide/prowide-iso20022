
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingCancellationReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingCancellationReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QORM"/&gt;
 *     &lt;enumeration value="PROC"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetingCancellationReason2Code")
@XmlEnum
public enum MeetingCancellationReason2Code {


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
     * Cancellation due to the meeting being cancelled by the issuer.
     * 
     */
    WITH;

    public String value() {
        return name();
    }

    public static MeetingCancellationReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
