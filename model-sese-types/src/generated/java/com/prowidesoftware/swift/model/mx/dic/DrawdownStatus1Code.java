
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrawdownStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DrawdownStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
