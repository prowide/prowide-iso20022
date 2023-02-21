
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpeningClosing1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpeningClosing1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLOP"/&gt;
 *     &lt;enumeration value="OPEP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpeningClosing1Code")
@XmlEnum
public enum OpeningClosing1Code {


    /**
     * Indicates that the trade is to close a position.
     * 
     */
    CLOP,

    /**
     * Indicates that the trade is to open a position.
     * 
     */
    OPEP;

    public String value() {
        return name();
    }

    public static OpeningClosing1Code fromValue(String v) {
        return valueOf(v);
    }

}
