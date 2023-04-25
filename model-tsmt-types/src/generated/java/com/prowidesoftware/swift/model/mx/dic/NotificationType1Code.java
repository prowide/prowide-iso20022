
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NotificationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MWFT"/>
 *     <enumeration value="CSDS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NotificationType1Code")
@XmlEnum
public enum NotificationType1Code {


    /**
     * User must withdraw from transaction because of Force Majeure.
     * 
     */
    MWFT,

    /**
     * User is unable to submit data set(s).
     * 
     */
    CSDS;

    public String value() {
        return name();
    }

    public static NotificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
