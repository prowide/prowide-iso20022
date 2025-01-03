
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIComponentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="POIComponentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SOFT"/>
 *     <enumeration value="EMVK"/>
 *     <enumeration value="EMVO"/>
 *     <enumeration value="MRIT"/>
 *     <enumeration value="CHIT"/>
 *     <enumeration value="SECM"/>
 *     <enumeration value="PEDV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "POIComponentType1Code")
@XmlEnum
public enum POIComponentType1Code {


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
    PEDV;

    public String value() {
        return name();
    }

    public static POIComponentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
