
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MarketType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIM"/>
 *     <enumeration value="SECM"/>
 *     <enumeration value="THIM"/>
 *     <enumeration value="FOUM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarketType1Code")
@XmlEnum
public enum MarketType1Code {


    /**
     * The place is a primary market.
     * 
     */
    PRIM,

    /**
     * The place is a secondary market.
     * 
     */
    SECM,

    /**
     * The place is a third market.
     * 
     */
    THIM,

    /**
     * The place is a fourth market.
     * 
     */
    FOUM;

    public String value() {
        return name();
    }

    public static MarketType1Code fromValue(String v) {
        return valueOf(v);
    }

}
