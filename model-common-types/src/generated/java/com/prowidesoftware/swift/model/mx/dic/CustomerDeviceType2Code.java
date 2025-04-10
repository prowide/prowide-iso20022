
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDeviceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerDeviceType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MOBL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PECR"/&gt;
 *     &lt;enumeration value="TBLT"/&gt;
 *     &lt;enumeration value="NSCR"/&gt;
 *     &lt;enumeration value="SECR"/&gt;
 *     &lt;enumeration value="EMBD"/&gt;
 *     &lt;enumeration value="VHCL"/&gt;
 *     &lt;enumeration value="WRBL"/&gt;
 *     &lt;enumeration value="WATC"/&gt;
 *     &lt;enumeration value="GAMB"/&gt;
 *     &lt;enumeration value="JEWL"/&gt;
 *     &lt;enumeration value="KFOB"/&gt;
 *     &lt;enumeration value="STIC"/&gt;
 *     &lt;enumeration value="UNKW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
