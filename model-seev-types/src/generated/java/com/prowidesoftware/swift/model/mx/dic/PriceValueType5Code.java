
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceValueType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UKWN"/>
 *     <enumeration value="OPEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceValueType5Code")
@XmlEnum
public enum PriceValueType5Code {


    /**
     * Price is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Price has not been established.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static PriceValueType5Code fromValue(String v) {
        return valueOf(v);
    }

}
