
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSegment1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeSegment1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMBN"/&gt;
 *     &lt;enumeration value="PMAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeSegment1Code")
@XmlEnum
public enum TimeSegment1Code {


    /**
     * Ante meridiem or before noon time period.
     * 
     */
    AMBN,

    /**
     * Post meridiem or after noon time period.
     * 
     */
    PMAN;

    public String value() {
        return name();
    }

    public static TimeSegment1Code fromValue(String v) {
        return valueOf(v);
    }

}
