
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NotificationStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RCBD"/>
 *     <enumeration value="RCVD"/>
 *     <enumeration value="NRCD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NotificationStatus3Code")
@XmlEnum
public enum NotificationStatus3Code {


    /**
     * Event(s) as described in the notification to receive occurred but details are different.
     * 
     */
    RCBD,

    /**
     * Event(s) as described in the notification to receive occurred.
     * 
     */
    RCVD,

    /**
     * Event(s) as described in the notification to receive did not occur.
     * 
     */
    NRCD;

    public String value() {
        return name();
    }

    public static NotificationStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
