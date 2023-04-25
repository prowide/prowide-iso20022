
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketIdentification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MarketIdentification1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SGMT"/>
 *     <enumeration value="OPRT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarketIdentification1Code")
@XmlEnum
public enum MarketIdentification1Code {


    /**
     * Market segment code.
     * 
     */
    SGMT,

    /**
     * Market operating code.
     * 
     */
    OPRT;

    public String value() {
        return name();
    }

    public static MarketIdentification1Code fromValue(String v) {
        return valueOf(v);
    }

}
