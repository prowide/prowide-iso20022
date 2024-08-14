
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttendanceAdmissionConditions2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AttendanceAdmissionConditions2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MASH"/>
 *     <enumeration value="MASL"/>
 *     <enumeration value="MAPO"/>
 *     <enumeration value="MAAL"/>
 *     <enumeration value="MALR"/>
 *     <enumeration value="MAHI"/>
 *     <enumeration value="MATK"/>
 *     <enumeration value="MADS"/>
 *     <enumeration value="MANP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AttendanceAdmissionConditions2Code")
@XmlEnum
public enum AttendanceAdmissionConditions2Code {


    /**
     * Any attendee must be a shareholder themselves.
     * 
     */
    MASH,

    /**
     * Attendee must be a shareholder registered in company stock ledger book.
     * 
     */
    MASL,

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
     * Attendee must be a delegate of the shareholder registered in the company stock ledger book.
     * 
     */
    MADS,

    /**
     * Meeting attendance is not possible.
     * 
     */
    MANP;

    public String value() {
        return name();
    }

    public static AttendanceAdmissionConditions2Code fromValue(String v) {
        return valueOf(v);
    }

}
