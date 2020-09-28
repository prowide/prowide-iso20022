
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventGroup4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventGroup4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISN"/&gt;
 *     &lt;enumeration value="GENL"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="REOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventGroup4Code")
@XmlEnum
public enum EventGroup4Code {


    /**
     * Distribution domain events.
     * 
     */
    DISN,

    /**
     * General domain events.
     * 
     */
    GENL,

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

    public static EventGroup4Code fromValue(String v) {
        return valueOf(v);
    }

}
