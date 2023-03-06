
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionEffect1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionEffect1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="ROLL"/&gt;
 *     &lt;enumeration value="FIFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionEffect1Code")
@XmlEnum
public enum PositionEffect1Code {


    /**
     * Position after the trade should be open.
     * 
     */
    OPEN,

    /**
     * Position after the trade should be closed.
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
    FIFO;

    public String value() {
        return name();
    }

    public static PositionEffect1Code fromValue(String v) {
        return valueOf(v);
    }

}
