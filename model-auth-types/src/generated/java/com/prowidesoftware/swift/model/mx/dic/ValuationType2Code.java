
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ValuationType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MTMO"/>
 *     <enumeration value="MTMA"/>
 *     <enumeration value="AMCS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ValuationType2Code")
@XmlEnum
public enum ValuationType2Code {


    /**
     * Mark to model valuation.
     * 
     * 
     */
    MTMO,

    /**
     * Mark to market valuation.
     * 
     * 
     * 
     */
    MTMA,

    /**
     * Amortised cost valuation.
     * 
     */
    AMCS;

    public String value() {
        return name();
    }

    public static ValuationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
