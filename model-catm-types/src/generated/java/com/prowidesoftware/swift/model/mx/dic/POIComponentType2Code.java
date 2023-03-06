
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIComponentType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="POIComponentType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SOFT"/&gt;
 *     &lt;enumeration value="EMVK"/&gt;
 *     &lt;enumeration value="EMVO"/&gt;
 *     &lt;enumeration value="MRIT"/&gt;
 *     &lt;enumeration value="CHIT"/&gt;
 *     &lt;enumeration value="SECM"/&gt;
 *     &lt;enumeration value="PEDV"/&gt;
 *     &lt;enumeration value="AQPR"/&gt;
 *     &lt;enumeration value="MRPR"/&gt;
 *     &lt;enumeration value="VDPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "POIComponentType2Code")
@XmlEnum
public enum POIComponentType2Code {


    /**
     * Payment or other software application.
     * 
     */
    SOFT,

    /**
     * EMV application kernel (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).
     * 
     */
    EMVK,

    /**
     * EMV physical interface (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).
     * 
     */
    EMVO,

    /**
     * Merchant interface.
     * 
     */
    MRIT,

    /**
     * Cardholder Interface.
     * 
     */
    CHIT,

    /**
     * Security module.
     * 
     */
    SECM,

    /**
     * Personal identification number (or PIN) entry device (PED).
     * 
     */
    PEDV,

    /**
     * Acquirer specific configuration parameters for the point of interaction (POI) system.
     * 
     */
    AQPR,

    /**
     * Merchant configuration parameters for the point of interaction (POI).
     * 
     */
    MRPR,

    /**
     * Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities.
     * 
     */
    VDPR;

    public String value() {
        return name();
    }

    public static POIComponentType2Code fromValue(String v) {
        return valueOf(v);
    }

}
