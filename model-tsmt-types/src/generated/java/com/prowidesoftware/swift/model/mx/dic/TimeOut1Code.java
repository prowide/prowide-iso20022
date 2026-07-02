
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeOut1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeOut1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LSDD"/&gt;
 *     &lt;enumeration value="NACT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeOut1Code")
@XmlEnum
public enum TimeOut1Code {


    /**
     * Reason for time-out is the reaching of latest shipment date.
     * 
     */
    LSDD,

    /**
     * Reason for time-out is the lack of action from the user side.
     * 
     */
    NACT;

    public String value() {
        return name();
    }

    public static TimeOut1Code fromValue(String v) {
        return valueOf(v);
    }

}
