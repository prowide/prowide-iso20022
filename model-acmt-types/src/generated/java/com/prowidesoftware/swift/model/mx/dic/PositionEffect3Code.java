
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionEffect3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionEffect3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIFO"/&gt;
 *     &lt;enumeration value="LIFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionEffect3Code")
@XmlEnum
public enum PositionEffect3Code {


    /**
     * First in, first out. Results in a position obtained after having sold in priority the securities bought chronologically.
     * 
     */
    FIFO,

    /**
     * Last in, last out. Results in a position obtained after having sold in priority the securities bought chronologically.
     * 
     */
    LIFO;

    public String value() {
        return name();
    }

    public static PositionEffect3Code fromValue(String v) {
        return valueOf(v);
    }

}
