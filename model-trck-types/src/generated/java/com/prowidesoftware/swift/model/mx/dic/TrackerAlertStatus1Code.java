
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackerAlertStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackerAlertStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *     &lt;enumeration value="RJCR"/&gt;
 *     &lt;enumeration value="RJIN"/&gt;
 *     &lt;enumeration value="WARN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
