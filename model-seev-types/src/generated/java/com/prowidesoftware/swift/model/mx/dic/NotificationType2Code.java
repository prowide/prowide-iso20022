
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NotificationType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEWM"/>
 *     <enumeration value="REPL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NotificationType2Code")
@XmlEnum
public enum NotificationType2Code {


    /**
     * New notification.
     * 
     */
    NEWM,

    /**
     * Notification replacing a previously sent notification.
     * 
     */
    REPL;

    public String value() {
        return name();
    }

    public static NotificationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
