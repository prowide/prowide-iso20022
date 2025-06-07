
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POICommunicationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="POICommunicationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLTH"/&gt;
 *     &lt;enumeration value="ETHR"/&gt;
 *     &lt;enumeration value="GPRS"/&gt;
 *     &lt;enumeration value="GSMF"/&gt;
 *     &lt;enumeration value="PSTN"/&gt;
 *     &lt;enumeration value="RS23"/&gt;
 *     &lt;enumeration value="USBD"/&gt;
 *     &lt;enumeration value="USBH"/&gt;
 *     &lt;enumeration value="WIFI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
