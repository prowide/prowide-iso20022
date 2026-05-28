
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceIdentificationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeviceIdentificationType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IMEI"/>
 *     <enumeration value="SEID"/>
 *     <enumeration value="SENU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeviceIdentificationType2Code")
@XmlEnum
public enum DeviceIdentificationType2Code {


    /**
     * International Mobile Equipment Identity.
     * 
     */
    IMEI,

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

    public static DeviceIdentificationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
