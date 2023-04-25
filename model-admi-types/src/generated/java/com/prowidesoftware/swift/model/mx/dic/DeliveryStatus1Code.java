
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeliveryStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="SUCC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeliveryStatus1Code")
@XmlEnum
public enum DeliveryStatus1Code {


    /**
     * Delivery failed.
     * 
     */
    FAIL,

    /**
     * Delivery succeeded.
     * 
     */
    SUCC;

    public String value() {
        return name();
    }

    public static DeliveryStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
