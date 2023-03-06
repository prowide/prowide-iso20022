
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QUAN"/&gt;
 *     &lt;enumeration value="PROM"/&gt;
 *     &lt;enumeration value="PRIC"/&gt;
 *     &lt;enumeration value="SPAG"/&gt;
 *     &lt;enumeration value="ENOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiscountType1Code")
@XmlEnum
public enum DiscountType1Code {


    /**
     * Quantity discount.
     * 
     */
    QUAN,

    /**
     * Promotional discount.
     * 
     */
    PROM,

    /**
     * Pricing discount.
     * 
     */
    PRIC,

    /**
     * Special agreement discount.
     * 
     */
    SPAG,

    /**
     * End-of-range discount.
     * 
     */
    ENOR;

    public String value() {
        return name();
    }

    public static DiscountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
