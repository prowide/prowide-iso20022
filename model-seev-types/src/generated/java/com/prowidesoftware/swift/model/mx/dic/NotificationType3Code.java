
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NotificationType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEWM"/>
 *     <enumeration value="REPL"/>
 *     <enumeration value="RMDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
