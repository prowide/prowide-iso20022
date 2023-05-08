
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventSequenceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventSequenceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FINL"/>
 *     <enumeration value="INTE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventSequenceType1Code")
@XmlEnum
public enum EventSequenceType1Code {


    /**
     * Final event in a series of successive events.
     * 
     */
    FINL,

    /**
     * Interim event in a series of successive events.
     * 
     */
    INTE;

    public String value() {
        return name();
    }

    public static EventSequenceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
