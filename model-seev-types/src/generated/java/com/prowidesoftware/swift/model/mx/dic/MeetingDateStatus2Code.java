
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingDateStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingDateStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNFR"/&gt;
 *     &lt;enumeration value="TNTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetingDateStatus2Code")
@XmlEnum
public enum MeetingDateStatus2Code {


    /**
     * Meeting date is confirmed.
     * 
     */
    CNFR,

    /**
     * Meeting date is tentative.
     * 
     */
    TNTA;

    public String value() {
        return name();
    }

    public static MeetingDateStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
