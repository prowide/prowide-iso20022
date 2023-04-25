
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POICommunicationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="POICommunicationType1Code">
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
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "POICommunicationType1Code")
@XmlEnum
public enum POICommunicationType1Code {


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
    WIFI("WIFI");
    private final String value;

    POICommunicationType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static POICommunicationType1Code fromValue(String v) {
        for (POICommunicationType1Code c: POICommunicationType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
