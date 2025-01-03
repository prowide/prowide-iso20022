
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingCancellationReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MeetingCancellationReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="QORM"/>
 *     <enumeration value="PROC"/>
 *     <enumeration value="WITH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
