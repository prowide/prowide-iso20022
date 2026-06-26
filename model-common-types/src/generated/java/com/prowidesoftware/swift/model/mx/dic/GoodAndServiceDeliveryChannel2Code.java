
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodAndServiceDeliveryChannel2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GoodAndServiceDeliveryChannel2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EDEL"/>
 *     <enumeration value="PULC"/>
 *     <enumeration value="NDEL"/>
 *     <enumeration value="SCBA"/>
 *     <enumeration value="SCSA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GoodAndServiceDeliveryChannel2Code")
@XmlEnum
public enum GoodAndServiceDeliveryChannel2Code {


    /**
     * Electronic delivery.
     * 
     */
    EDEL,

    /**
     * Pick up locally
     * 
     */
    PULC,

    /**
     * No delivery.
     * 
     * 
     */
    NDEL,

    /**
     * Shipping to cardholder billing address
     * 
     */
    SCBA,

    /**
     * Shipping to consumer specified shipping address
     * 
     */
    SCSA;

    public String value() {
        return name();
    }

    public static GoodAndServiceDeliveryChannel2Code fromValue(String v) {
        return valueOf(v);
    }

}
