
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrawdownType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DrawdownType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOTH"/>
 *     <enumeration value="CAPP"/>
 *     <enumeration value="FLEX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DrawdownType2Code")
@XmlEnum
public enum DrawdownType2Code {


    /**
     * Drawdown type is both flexi-access and capped.
     * 
     */
    BOTH,

    /**
     * Drawdown type is capped.
     * 
     */
    CAPP,

    /**
     * Drawdown type is flexi-access.
     * 
     */
    FLEX;

    public String value() {
        return name();
    }

    public static DrawdownType2Code fromValue(String v) {
        return valueOf(v);
    }

}
