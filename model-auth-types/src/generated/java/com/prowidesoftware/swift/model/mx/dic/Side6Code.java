
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Side6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Side6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUYI"/>
 *     <enumeration value="SELL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Side6Code")
@XmlEnum
public enum Side6Code {


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

    public static Side6Code fromValue(String v) {
        return valueOf(v);
    }

}
