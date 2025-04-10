
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttendanceAdmissionConditions1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AttendanceAdmissionConditions1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MASH"/>
 *     <enumeration value="MAPO"/>
 *     <enumeration value="MAAL"/>
 *     <enumeration value="MALR"/>
 *     <enumeration value="MAHI"/>
 *     <enumeration value="MATK"/>
 *     <enumeration value="MANP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AttendanceAdmissionConditions1Code")
@XmlEnum
public enum AttendanceAdmissionConditions1Code {


    /**
     * Any attendee must be a shareholder themselves.
     * 
     */
    MASH,

    /**
     * Attendees acting on behalf of registered holder must have a valid power of attorney (POA) and/or proof of holding.
     * 
     */
    MAPO,

    /**
     * Attendees will be placed on a attendee list and must bring photographic identification with them.
     * 
     */
    MAAL,

    /**
     * Attendees will be placed on a attendee list or issued with a letter of representation, and must bring photographic identification with them.
     * 
     */
    MALR,

    /**
     * Attendees must request proof of holding and register for attendance directly with Issuer.
     * 
     */
    MAHI,

    /**
     * Attendees will be issued an admission ticket and must bring photographic identification with them.
     * 
     */
    MATK,

    /**
     * Meeting attendance is not possible.
     * 
     */
    MANP;

    public String value() {
        return name();
    }

    public static AttendanceAdmissionConditions1Code fromValue(String v) {
        return valueOf(v);
    }

}
