
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIComponentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="POIComponentType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SOFT"/&gt;
 *     &lt;enumeration value="EMVK"/&gt;
 *     &lt;enumeration value="EMVO"/&gt;
 *     &lt;enumeration value="MRIT"/&gt;
 *     &lt;enumeration value="CHIT"/&gt;
 *     &lt;enumeration value="SECM"/&gt;
 *     &lt;enumeration value="PEDV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * EMV application kernel  (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).
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
