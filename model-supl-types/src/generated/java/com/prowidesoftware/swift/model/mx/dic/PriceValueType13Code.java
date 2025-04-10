
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceValueType13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceValueType13Code")
@XmlEnum
public enum PriceValueType13Code {


    /**
     * Price is not required to be specified by account owner.
     * 
     */
    UNSP;

    public String value() {
        return name();
    }

    public static PriceValueType13Code fromValue(String v) {
        return valueOf(v);
    }

}
