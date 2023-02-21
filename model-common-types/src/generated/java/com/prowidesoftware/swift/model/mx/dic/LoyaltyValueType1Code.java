
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyValueType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoyaltyValueType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MILE"/&gt;
 *     &lt;enumeration value="MONE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="POIN"/&gt;
 *     &lt;enumeration value="PRIV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
