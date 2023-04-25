
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackerAlertStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TrackerAlertStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVA"/>
 *     <enumeration value="RJCR"/>
 *     <enumeration value="RJIN"/>
 *     <enumeration value="WARN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TrackerAlertStatus1Code")
@XmlEnum
public enum TrackerAlertStatus1Code {


    /**
     * Tracker notification is related to an invalid update.
     * 
     */
    INVA,

    /**
     * Tracker notification is related to a rejected cancellation request.
     * 
     */
    RJCR,

    /**
     * Tracker notification is related to a rejected investigation.
     * 
     */
    RJIN,

    /**
     * Tracker notification is a warning.
     * 
     */
    WARN;

    public String value() {
        return name();
    }

    public static TrackerAlertStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
