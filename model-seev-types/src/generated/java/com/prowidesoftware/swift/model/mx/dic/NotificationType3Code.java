
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEWM"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *     &lt;enumeration value="RMDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationType3Code")
@XmlEnum
public enum NotificationType3Code {


    /**
     * New notification.
     * 
     */
    NEWM,

    /**
     * Notification replacing a previously sent notification.
     * 
     */
    REPL,

    /**
     * Notification sent as a reminder of an event taking place.
     * 
     */
    RMDR;

    public String value() {
        return name();
    }

    public static NotificationType3Code fromValue(String v) {
        return valueOf(v);
    }

}
