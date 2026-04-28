
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventSequenceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventSequenceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
