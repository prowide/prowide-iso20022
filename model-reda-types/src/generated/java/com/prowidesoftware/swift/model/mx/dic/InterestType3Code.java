
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InterestType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ZCPN"/>
 *     <enumeration value="FIXD"/>
 *     <enumeration value="FLRN"/>
 *     <enumeration value="DUAL"/>
 *     <enumeration value="INDE"/>
 *     <enumeration value="DSCO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
