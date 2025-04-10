
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationAmenity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LocationAmenity1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AADA"/>
 *     <enumeration value="AFLA"/>
 *     <enumeration value="AVLA"/>
 *     <enumeration value="CRWA"/>
 *     <enumeration value="CVSA"/>
 *     <enumeration value="DISA"/>
 *     <enumeration value="EWAA"/>
 *     <enumeration value="MRLA"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PAPA"/>
 *     <enumeration value="TSHA"/>
 *     <enumeration value="TSRA"/>
 *     <enumeration value="TSSA"/>
 *     <enumeration value="TFHA"/>
 *     <enumeration value="VSWA"/>
 *     <enumeration value="VHPA"/>
 *     <enumeration value="VMRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LocationAmenity1Code")
@XmlEnum
public enum LocationAmenity1Code {


    /**
     * Interstate Access and Exit Number information with directions Available
     * 
     */
    AADA,

    /**
     * Alternative fuel locations available
     * 
     */
    AFLA,

    /**
     * Aviation locations available
     * 
     */
    AVLA,

    /**
     * Car wash available
     * 
     */
    CRWA,

    /**
     * Convenience Store Available
     * 
     */
    CVSA,

    /**
     * Diesel Sites Available
     * 
     */
    DISA,

    /**
     *  18-wheeler access availability
     * 
     */
    EWAA,

    /**
     * Marina locations available
     * 
     */
    MRLA,

    /**
     * Other amenities defined at the national level.
     * 
     */
    OTHN,

    /**
     * Other amenities defined at the private level.
     * 
     */
    OTHP,

    /**
     * Pay-at-pump available
     * 
     */
    PAPA,

    /**
     * Truck Stop Hotel Available
     * 
     */
    TSHA,

    /**
     * Truck Stop Restaurant Available
     * 
     */
    TSRA,

    /**
     * Truck stop with showers available
     * 
     */
    TSSA,

    /**
     *  24 hour availability
     * 
     */
    TFHA,

    /**
     * Vehicle scales and weigh services available
     * 
     */
    VSWA,

    /**
     * Vehicle parking available
     * 
     */
    VHPA,

    /**
     * Vehicle maintenance/repair bays available
     * 
     */
    VMRA;

    public String value() {
        return name();
    }

    public static LocationAmenity1Code fromValue(String v) {
        return valueOf(v);
    }

}
