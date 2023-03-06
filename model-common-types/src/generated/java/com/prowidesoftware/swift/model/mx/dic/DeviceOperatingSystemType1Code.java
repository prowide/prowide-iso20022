
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceOperatingSystemType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceOperatingSystemType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DROI"/&gt;
 *     &lt;enumeration value="BLCK"/&gt;
 *     &lt;enumeration value="IOSS"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="TIZN"/&gt;
 *     &lt;enumeration value="WIND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceOperatingSystemType1Code")
@XmlEnum
public enum DeviceOperatingSystemType1Code {


    /**
     * Android operating system.
     * 
     */
    DROI,

    /**
     * Blackberry operating system.
     * 
     */
    BLCK,

    /**
     * iOS operating system.
     * 
     */
    IOSS,

    /**
     * Other nationally defined code.
     * 
     */
    OTHN,

    /**
     * Other privately defined code.
     * 
     */
    OTHP,

    /**
     * Tizen operating system.
     * 
     */
    TIZN,

    /**
     * Windows operating system.
     * 
     */
    WIND;

    public String value() {
        return name();
    }

    public static DeviceOperatingSystemType1Code fromValue(String v) {
        return valueOf(v);
    }

}
