
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttendanceAdmissionConditions1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttendanceAdmissionConditions1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MASH"/&gt;
 *     &lt;enumeration value="MAPO"/&gt;
 *     &lt;enumeration value="MAAL"/&gt;
 *     &lt;enumeration value="MALR"/&gt;
 *     &lt;enumeration value="MAHI"/&gt;
 *     &lt;enumeration value="MATK"/&gt;
 *     &lt;enumeration value="MANP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
