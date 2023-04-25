
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyValueType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LoyaltyValueType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MILE"/>
 *     <enumeration value="MONE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="POIN"/>
 *     <enumeration value="PRIV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LoyaltyValueType1Code")
@XmlEnum
public enum LoyaltyValueType1Code {


    /**
     * Value expressed in miles.
     * 
     */
    MILE,

    /**
     * Value expressed in monetary units.
     * 
     */
    MONE,

    /**
     * Value expressed in any other type of loyalty value.
     * 
     */
    OTHR,

    /**
     * Value expressed in points.
     * 
     */
    POIN,

    /**
     * Value expressed in a private currency.
     * 
     */
    PRIV;

    public String value() {
        return name();
    }

    public static LoyaltyValueType1Code fromValue(String v) {
        return valueOf(v);
    }

}
