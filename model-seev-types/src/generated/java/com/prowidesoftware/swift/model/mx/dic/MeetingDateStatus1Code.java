
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingDateStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingDateStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TNTA"/&gt;
 *     &lt;enumeration value="CNFR"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="NOQO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetingDateStatus1Code")
@XmlEnum
public enum MeetingDateStatus1Code {


    /**
     * Meeting date is tentative.
     * 
     */
    TNTA,

    /**
     * Meeting date is confirmed.
     * 
     */
    CNFR,

    /**
     * Meeting date has been cancelled.
     * 
     */
    CANC,

    /**
     * Meeting could not take place as the quorum was not reached.
     * 
     */
    NOQO;

    public String value() {
        return name();
    }

    public static MeetingDateStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
