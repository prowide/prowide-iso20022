
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NotificationStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ECON"/>
 *     <enumeration value="EUNC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NotificationStatus2Code")
@XmlEnum
public enum NotificationStatus2Code {


    /**
     * Notification may not contain complete details, however, the occurrence of the event has been confirmed by the issuer or other official source.
     * 
     */
    ECON,

    /**
     * The occurrence of the event has not been confirmed by the issuer or other official source at the time the notification was sent.
     * 
     */
    EUNC;

    public String value() {
        return name();
    }

    public static NotificationStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
