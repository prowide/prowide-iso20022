
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventCompletenessStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventCompletenessStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="INCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
