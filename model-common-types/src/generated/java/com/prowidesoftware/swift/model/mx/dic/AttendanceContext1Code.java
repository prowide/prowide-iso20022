
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttendanceContext1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttendanceContext1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATTD"/&gt;
 *     &lt;enumeration value="SATT"/&gt;
 *     &lt;enumeration value="UATT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttendanceContext1Code")
@XmlEnum
public enum AttendanceContext1Code {


    /**
     * Attended payment, with an attendant.
     * 
     */
    ATTD,

    /**
     * Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder.
     * 
     */
    SATT,

    /**
     * Unattended payment, no attendant present.
     * 
     */
    UATT;

    public String value() {
        return name();
    }

    public static AttendanceContext1Code fromValue(String v) {
        return valueOf(v);
    }

}
