
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DiscountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="QUAN"/>
 *     <enumeration value="PROM"/>
 *     <enumeration value="PRIC"/>
 *     <enumeration value="SPAG"/>
 *     <enumeration value="ENOR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
