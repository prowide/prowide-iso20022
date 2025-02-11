
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionEffect2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PositionEffect2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPEN"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="ROLL"/>
 *     <enumeration value="FIFO"/>
 *     <enumeration value="CLOA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PositionEffect2Code")
@XmlEnum
public enum PositionEffect2Code {


    /**
     * Position after the trade the position should be open.
     * 
     */
    OPEN,

    /**
     * Position after the trade the position should be closed.
     * 
     */
    CLOS,

    /**
     * Results in a position obtained in a security previously held, sold and repurchased.
     * 
     */
    ROLL,

    /**
     * First in, first out. Results in a position obtained after having sold in priority the securities bought chronologically.
     * 
     */
    FIFO,

    /**
     * Trade relates to a closure of an account.
     * 
     */
    CLOA;

    public String value() {
        return name();
    }

    public static PositionEffect2Code fromValue(String v) {
        return valueOf(v);
    }

}
