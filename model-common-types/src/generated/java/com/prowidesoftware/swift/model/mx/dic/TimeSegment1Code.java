
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSegment1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TimeSegment1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMBN"/>
 *     <enumeration value="PMAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
