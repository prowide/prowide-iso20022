
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionEffect3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PositionEffect3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIFO"/>
 *     <enumeration value="LIFO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PositionEffect3Code")
@XmlEnum
public enum PositionEffect3Code {


    /**
     * First in, first out. Results in a position obtained after having sold in priority the securities bought chronologically.
     * 
     */
    FIFO,

    /**
     * Last in, last out. Results in a position obtained after having sold in priority the securities bought chronologically.
     * 
     */
    LIFO;

    public String value() {
        return name();
    }

    public static PositionEffect3Code fromValue(String v) {
        return valueOf(v);
    }

}
