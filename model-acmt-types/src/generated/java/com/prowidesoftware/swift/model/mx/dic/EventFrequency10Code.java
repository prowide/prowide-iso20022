
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventFrequency10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DAIL"/>
 *     <enumeration value="ADHO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventFrequency10Code")
@XmlEnum
public enum EventFrequency10Code {


    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place as necessary.
     * 
     */
    ADHO;

    public String value() {
        return name();
    }

    public static EventFrequency10Code fromValue(String v) {
        return valueOf(v);
    }

}
