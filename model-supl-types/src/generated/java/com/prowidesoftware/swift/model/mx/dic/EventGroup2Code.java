
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventGroup2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventGroup2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISN"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="REOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventGroup2Code")
@XmlEnum
public enum EventGroup2Code {


    /**
     * Distribution domain events.
     * 
     */
    DISN,

    /**
     * Redemption domain events.
     * 
     */
    REDM,

    /**
     * Reorganization domain events.
     * 
     */
    REOR;

    public String value() {
        return name();
    }

    public static EventGroup2Code fromValue(String v) {
        return valueOf(v);
    }

}
