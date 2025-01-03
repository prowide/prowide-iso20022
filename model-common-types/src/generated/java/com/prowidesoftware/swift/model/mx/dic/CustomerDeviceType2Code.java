
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDeviceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustomerDeviceType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MOBL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PECR"/>
 *     <enumeration value="TBLT"/>
 *     <enumeration value="NSCR"/>
 *     <enumeration value="SECR"/>
 *     <enumeration value="EMBD"/>
 *     <enumeration value="VHCL"/>
 *     <enumeration value="WRBL"/>
 *     <enumeration value="WATC"/>
 *     <enumeration value="GAMB"/>
 *     <enumeration value="JEWL"/>
 *     <enumeration value="KFOB"/>
 *     <enumeration value="STIC"/>
 *     <enumeration value="UNKW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustomerDeviceType2Code")
@XmlEnum
public enum CustomerDeviceType2Code {


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
    SECR,

    /**
     * Embedded in a device.
     * 
     */
    EMBD,

    /**
     * Vehicle.
     * 
     */
    VHCL,

    /**
     * Wearable device.
     * 
     */
    WRBL,

    /**
     * Watch
     * 
     */
    WATC,

    /**
     * Gaming Device
     * 
     */
    GAMB,

    /**
     * Jewellery
     * 
     */
    JEWL,

    /**
     * Key Fob
     * 
     */
    KFOB,

    /**
     * Sticker
     * 
     */
    STIC,

    /**
     * Device type unknown
     * 
     */
    UNKW;

    public String value() {
        return name();
    }

    public static CustomerDeviceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
