
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttendanceContext1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AttendanceContext1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATTD"/>
 *     <enumeration value="SATT"/>
 *     <enumeration value="UATT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
