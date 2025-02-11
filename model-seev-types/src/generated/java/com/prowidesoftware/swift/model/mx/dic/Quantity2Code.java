
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Quantity2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="QALL"/>
 *     <enumeration value="OPEN"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Quantity2Code")
@XmlEnum
public enum Quantity2Code {


    /**
     * Instruction applies to the entire eligible balance of underlying securities.
     * 
     */
    QALL,

    /**
     * Quantity has not been established.
     * 
     */
    OPEN,

    /**
     * Quantity is unknown by the sender or has not been established.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static Quantity2Code fromValue(String v) {
        return valueOf(v);
    }

}
