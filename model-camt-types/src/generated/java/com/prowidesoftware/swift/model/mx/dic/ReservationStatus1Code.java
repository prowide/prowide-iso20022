
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReservationStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENAB"/>
 *     <enumeration value="DISA"/>
 *     <enumeration value="DELD"/>
 *     <enumeration value="REQD"/>
 *     <enumeration value="BLKD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReservationStatus1Code")
@XmlEnum
public enum ReservationStatus1Code {


    /**
     * Reservation is currently in effect.
     * 
     */
    ENAB,

    /**
     * Reservation is not currently in effect.
     * .
     * 
     */
    DISA,

    /**
     * Reservation has been deleted or suspended.
     * 
     */
    DELD,

    /**
     * Reservation has been asked for and is not yet enabled.
     * .
     * 
     */
    REQD,

    /**
     * Reservation is blocked or frozen due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.
     * 
     */
    BLKD;

    public String value() {
        return name();
    }

    public static ReservationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
