
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingEquityType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnderlyingEquityType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STIX"/>
 *     <enumeration value="DIVI"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="VOLI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnderlyingEquityType4Code")
@XmlEnum
public enum UnderlyingEquityType4Code {


    /**
     * Underlying is a stock index.
     * 
     */
    STIX,

    /**
     * Underlying is a dividend index.
     * 
     */
    DIVI,

    /**
     * Underlying is of other type.
     * 
     */
    OTHR,

    /**
     * Underlying is a volatility index.
     * 
     */
    VOLI;

    public String value() {
        return name();
    }

    public static UnderlyingEquityType4Code fromValue(String v) {
        return valueOf(v);
    }

}
