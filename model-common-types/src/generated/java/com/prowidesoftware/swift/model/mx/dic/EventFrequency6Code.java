
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventFrequency6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="INDA"/&gt;
 *     &lt;enumeration value="ONDE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventFrequency6Code")
@XmlEnum
public enum EventFrequency6Code {


    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place several times a day.
     * 
     */
    INDA,

    /**
     * Event takes place on demand.
     * 
     */
    ONDE;

    public String value() {
        return name();
    }

    public static EventFrequency6Code fromValue(String v) {
        return valueOf(v);
    }

}
