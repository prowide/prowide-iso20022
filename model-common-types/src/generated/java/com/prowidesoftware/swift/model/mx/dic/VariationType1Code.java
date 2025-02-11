
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VariationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DECR"/>
 *     <enumeration value="INCR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
