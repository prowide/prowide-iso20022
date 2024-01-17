
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PNDG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceStatus2Code")
@XmlEnum
public enum PriceStatus2Code {


    /**
     * Price is pending.
     * 
     */
    PNDG;

    public String value() {
        return name();
    }

    public static PriceStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
