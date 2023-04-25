
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIComponentType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="POIComponentType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SOFT"/>
 *     <enumeration value="EMVK"/>
 *     <enumeration value="EMVO"/>
 *     <enumeration value="MRIT"/>
 *     <enumeration value="CHIT"/>
 *     <enumeration value="SECM"/>
 *     <enumeration value="PEDV"/>
 *     <enumeration value="AQPR"/>
 *     <enumeration value="MRPR"/>
 *     <enumeration value="VDPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
