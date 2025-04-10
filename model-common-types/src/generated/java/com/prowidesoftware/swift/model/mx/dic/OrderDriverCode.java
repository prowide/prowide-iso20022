
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDriverCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderDriverCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUYI"/>
 *     <enumeration value="SELL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrderDriverCode")
@XmlEnum
public enum OrderDriverCode {


    /**
     * Order is buy driven.
     * 
     */
    BUYI,

    /**
     * Order is sell driven.
     * 
     */
    SELL;

    public String value() {
        return name();
    }

    public static OrderDriverCode fromValue(String v) {
        return valueOf(v);
    }

}
