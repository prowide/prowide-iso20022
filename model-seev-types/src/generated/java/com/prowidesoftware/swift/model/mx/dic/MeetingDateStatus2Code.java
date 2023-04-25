
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingDateStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MeetingDateStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNFR"/>
 *     <enumeration value="TNTA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
