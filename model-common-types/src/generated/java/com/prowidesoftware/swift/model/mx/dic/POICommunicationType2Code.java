
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POICommunicationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="POICommunicationType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLTH"/>
 *     <enumeration value="ETHR"/>
 *     <enumeration value="GPRS"/>
 *     <enumeration value="GSMF"/>
 *     <enumeration value="PSTN"/>
 *     <enumeration value="RS23"/>
 *     <enumeration value="USBD"/>
 *     <enumeration value="USBH"/>
 *     <enumeration value="WIFI"/>
 *     <enumeration value="WT2G"/>
 *     <enumeration value="WT3G"/>
 *     <enumeration value="WT4G"/>
 *     <enumeration value="WT5G"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "POICommunicationType2Code")
@XmlEnum
public enum POICommunicationType2Code {


    /**
     * Communication with a host using Bluetooth.
     * 
     */
    BLTH("BLTH"),

    /**
     * Ethernet port to communicate.
     * 
     */
    ETHR("ETHR"),

    /**
     * Communication with a host using GPRS.
     * 
     */
    GPRS("GPRS"),

    /**
     * Communication with a host using GSM.
     * 
     */
    GSMF("GSMF"),

    /**
     * Communication with a host using Public Switching Telephone Network.
     * 
     */
    PSTN("PSTN"),

    /**
     * Serial port to communicate.
     * 
     */
    @XmlEnumValue("RS23")
    RS_23("RS23"),

    /**
     * Communication with a USB stick or any USB device.
     * 
     */
    USBD("USBD"),

    /**
     * Communication with a host from an USB port.
     * 
     */
    USBH("USBH"),

    /**
     * Wifi communication with another component.
     * 
     */
    WIFI("WIFI"),

    /**
     * Includes all communication technologies which can be qualified as being part of the 2G technology (e.g EDGE or PDC).
     * 
     */
    @XmlEnumValue("WT2G")
    WT_2_G("WT2G"),

    /**
     * Includes all communication technologies which can be qualified as being part of the 3G technology.
     * 
     */
    @XmlEnumValue("WT3G")
    WT_3_G("WT3G"),

    /**
     * Includes all communication technologies which can be qualified as being part of the 4G technology.
     * 
     */
    @XmlEnumValue("WT4G")
    WT_4_G("WT4G"),

    /**
     * Includes all communication technologies which can be qualified as being part of the 5G technology.
     * 
     */
    @XmlEnumValue("WT5G")
    WT_5_G("WT5G");
    private final String value;

    POICommunicationType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static POICommunicationType2Code fromValue(String v) {
        for (POICommunicationType2Code c: POICommunicationType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
