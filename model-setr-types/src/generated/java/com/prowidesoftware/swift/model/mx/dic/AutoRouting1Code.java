
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoRouting1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AutoRouting1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DDOT"/>
 *     <enumeration value="SDOT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AutoRouting1Code")
@XmlEnum
public enum AutoRouting1Code {


    /**
     * Indicates the Designated Order Turnaround system: computerized order routing system (used at the New York Stock Exchange) is to be used.
     * 
     */
    DDOT,

    /**
     * Indicates the evolution of the DOT system, a Designated Order Turnaround system: computerized order routing system (used at the New York Stock Exchange) is to be used.
     * 
     */
    SDOT;

    public String value() {
        return name();
    }

    public static AutoRouting1Code fromValue(String v) {
        return valueOf(v);
    }

}
