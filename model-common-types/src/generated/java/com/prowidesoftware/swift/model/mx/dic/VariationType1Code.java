
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DECR"/&gt;
 *     &lt;enumeration value="INCR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VariationType1Code")
@XmlEnum
public enum VariationType1Code {


    /**
     * Decrease to undertaking amount.
     * 
     */
    DECR,

    /**
     * Increase to undertaking amount.
     * 
     */
    INCR;

    public String value() {
        return name();
    }

    public static VariationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
