
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDeviceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustomerDeviceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MOBL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PECR"/>
 *     <enumeration value="TBLT"/>
 *     <enumeration value="NSCR"/>
 *     <enumeration value="SECR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustomerDeviceType1Code")
@XmlEnum
public enum CustomerDeviceType1Code {


    /**
     * Mobile phone
     * 
     */
    MOBL,

    /**
     * Other device defined at national level
     * 
     */
    OTHN,

    /**
     * Other device defined in a private way.
     * 
     */
    OTHP,

    /**
     * Personal computer
     * 
     */
    PECR,

    /**
     * Tablet
     * 
     */
    TBLT,

    /**
     * Non-secure card reader attached to the customer device.
     * 
     */
    NSCR,

    /**
     * Secure card reader attached to the customer device
     * 
     */
    SECR;

    public String value() {
        return name();
    }

    public static CustomerDeviceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
