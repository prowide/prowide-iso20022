
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDeviceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerDeviceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MOBL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PECR"/&gt;
 *     &lt;enumeration value="TBLT"/&gt;
 *     &lt;enumeration value="NSCR"/&gt;
 *     &lt;enumeration value="SECR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
