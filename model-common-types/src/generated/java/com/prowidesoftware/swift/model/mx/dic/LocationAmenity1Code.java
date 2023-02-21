
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationAmenity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationAmenity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AADA"/&gt;
 *     &lt;enumeration value="AFLA"/&gt;
 *     &lt;enumeration value="AVLA"/&gt;
 *     &lt;enumeration value="CRWA"/&gt;
 *     &lt;enumeration value="CVSA"/&gt;
 *     &lt;enumeration value="DISA"/&gt;
 *     &lt;enumeration value="EWAA"/&gt;
 *     &lt;enumeration value="MRLA"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PAPA"/&gt;
 *     &lt;enumeration value="TSHA"/&gt;
 *     &lt;enumeration value="TSRA"/&gt;
 *     &lt;enumeration value="TSSA"/&gt;
 *     &lt;enumeration value="TFHA"/&gt;
 *     &lt;enumeration value="VSWA"/&gt;
 *     &lt;enumeration value="VHPA"/&gt;
 *     &lt;enumeration value="VMRA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
