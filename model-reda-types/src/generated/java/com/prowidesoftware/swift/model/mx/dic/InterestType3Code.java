
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZCPN"/&gt;
 *     &lt;enumeration value="FIXD"/&gt;
 *     &lt;enumeration value="FLRN"/&gt;
 *     &lt;enumeration value="DUAL"/&gt;
 *     &lt;enumeration value="INDE"/&gt;
 *     &lt;enumeration value="DSCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterestType3Code")
@XmlEnum
public enum InterestType3Code {


    /**
     * Indicates that the type of interest is a zero coupon.
     * 
     */
    ZCPN,

    /**
     * Indicates that the type of interest is fixed.
     * 
     */
    FIXD,

    /**
     * Indicates that the type of interest is a floating rate note.
     * 
     */
    FLRN,

    /**
     * Indicates that the type of interest is a dual basis.
     * 
     */
    DUAL,

    /**
     * Indicates that the type of interest is index.
     * 
     */
    INDE,

    /**
     * Indicates that the type of interest is discounted.
     * 
     */
    DSCO;

    public String value() {
        return name();
    }

    public static InterestType3Code fromValue(String v) {
        return valueOf(v);
    }

}
