
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrawdownStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DrawdownStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FULL"/>
 *     <enumeration value="NONE"/>
 *     <enumeration value="PART"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DrawdownStatus1Code")
@XmlEnum
public enum DrawdownStatus1Code {


    /**
     * Pension is fully in drawdown.
     * 
     */
    FULL,

    /**
     * Pension is not in drawdown.
     * 
     */
    NONE,

    /**
     * Pension is in partial drawdown.
     * 
     */
    PART;

    public String value() {
        return name();
    }

    public static DrawdownStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
