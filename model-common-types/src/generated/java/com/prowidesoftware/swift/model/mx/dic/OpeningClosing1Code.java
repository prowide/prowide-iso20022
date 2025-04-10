
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpeningClosing1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OpeningClosing1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLOP"/>
 *     <enumeration value="OPEP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OpeningClosing1Code")
@XmlEnum
public enum OpeningClosing1Code {


    /**
     * Indicates that the trade is to close a position.
     * 
     */
    CLOP,

    /**
     * Indicates that the trade is to open a position.
     * 
     */
    OPEP;

    public String value() {
        return name();
    }

    public static OpeningClosing1Code fromValue(String v) {
        return valueOf(v);
    }

}
