
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionEffect2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionEffect2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="ROLL"/&gt;
 *     &lt;enumeration value="FIFO"/&gt;
 *     &lt;enumeration value="CLOA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
