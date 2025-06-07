
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
