
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodAndServiceDeliveryChannel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GoodAndServiceDeliveryChannel1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EDEL"/>
 *     <enumeration value="PULC"/>
 *     <enumeration value="NDEL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SCBA"/>
 *     <enumeration value="SCSA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GoodAndServiceDeliveryChannel1Code")
@XmlEnum
public enum GoodAndServiceDeliveryChannel1Code {


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
     * Other delivery channel defined at national level.
     * 
     * 
     */
    OTHN,

    /**
     * Other delivery channel defined at private level.
     * 
     */
    OTHP,

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

    public static GoodAndServiceDeliveryChannel1Code fromValue(String v) {
        return valueOf(v);
    }

}
