
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Max4AlphaNumericText_fixed__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Max4AlphaNumericText_fixed__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Max4AlphaNumericText_fixed__1")
@XmlEnum
public enum Max4AlphaNumericTextFixed1 {


    /**
     * RT
     * 
     */
    RT;

    public String value() {
        return name();
    }

    public static Max4AlphaNumericTextFixed1 fromValue(String v) {
        return valueOf(v);
    }

}
