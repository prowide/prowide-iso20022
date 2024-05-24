
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BookingType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REGU"/>
 *     <enumeration value="CFOD"/>
 *     <enumeration value="TRSW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BookingType1Code")
@XmlEnum
public enum BookingType1Code {


    /**
     * Booking type is regular.
     * 
     */
    REGU,

    /**
     * Order is to be booked out as a CFD.
     * 
     */
    CFOD,

    /**
     * Order is to be booked out as an OTC derivative (for example, Swap).
     * 
     */
    TRSW;

    public String value() {
        return name();
    }

    public static BookingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
