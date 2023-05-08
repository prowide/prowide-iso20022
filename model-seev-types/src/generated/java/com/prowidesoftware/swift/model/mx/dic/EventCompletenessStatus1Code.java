
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventCompletenessStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventCompletenessStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMP"/>
 *     <enumeration value="INCO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventCompletenessStatus1Code")
@XmlEnum
public enum EventCompletenessStatus1Code {


    /**
     * Event details are complete.
     * 
     */
    COMP,

    /**
     * Event details are not complete.
     * 
     */
    INCO;

    public String value() {
        return name();
    }

    public static EventCompletenessStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
