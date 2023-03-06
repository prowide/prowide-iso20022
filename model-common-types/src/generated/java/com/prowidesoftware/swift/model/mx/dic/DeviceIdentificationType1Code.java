
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceIdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceIdentificationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IMEI"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SEID"/&gt;
 *     &lt;enumeration value="SENU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceIdentificationType1Code")
@XmlEnum
public enum DeviceIdentificationType1Code {


    /**
     * International Mobile Equipment Identity.
     * 
     */
    IMEI,

    /**
     * Other nationally assigned code.
     * 
     */
    OTHN,

    /**
     * Other privately assigned code.
     * 
     */
    OTHP,

    /**
     * Secure element ID.
     * 
     */
    SEID,

    /**
     * Device serial number.
     * 
     */
    SENU;

    public String value() {
        return name();
    }

    public static DeviceIdentificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
