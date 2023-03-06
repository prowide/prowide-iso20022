
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoRouting1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoRouting1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DDOT"/&gt;
 *     &lt;enumeration value="SDOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
