
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrawdownEventType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DrawdownEventType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="UFPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DrawdownEventType1Code")
@XmlEnum
public enum DrawdownEventType1Code {


    /**
     * Event is a drawdown.
     * 
     */
    DRAW,

    /**
     * Event is an uncrystallised funds pension lump sum (UFPLS).
     * 
     */
    UFPL;

    public String value() {
        return name();
    }

    public static DrawdownEventType1Code fromValue(String v) {
        return valueOf(v);
    }

}
