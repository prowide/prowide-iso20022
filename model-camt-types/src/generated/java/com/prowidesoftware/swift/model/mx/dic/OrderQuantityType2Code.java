
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderQuantityType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderQuantityType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNIT"/>
 *     <enumeration value="CASH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrderQuantityType2Code")
@XmlEnum
public enum OrderQuantityType2Code {


    /**
     * Order is placed by unit.
     * 
     */
    UNIT,

    /**
     * Order is placed by amount of money.
     * 
     */
    CASH;

    public String value() {
        return name();
    }

    public static OrderQuantityType2Code fromValue(String v) {
        return valueOf(v);
    }

}
