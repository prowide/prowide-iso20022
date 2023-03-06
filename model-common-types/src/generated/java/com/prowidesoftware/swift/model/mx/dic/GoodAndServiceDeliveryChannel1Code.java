
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodAndServiceDeliveryChannel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GoodAndServiceDeliveryChannel1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EDEL"/&gt;
 *     &lt;enumeration value="PULC"/&gt;
 *     &lt;enumeration value="NDEL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SCBA"/&gt;
 *     &lt;enumeration value="SCSA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
