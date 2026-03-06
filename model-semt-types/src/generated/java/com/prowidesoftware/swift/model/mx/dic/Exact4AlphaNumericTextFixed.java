
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exact4AlphaNumericText_fixed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Exact4AlphaNumericText_fixed">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EVTP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Exact4AlphaNumericText_fixed")
@XmlEnum
public enum Exact4AlphaNumericTextFixed {


    /**
     * EVTP
     * 
     */
    EVTP;

    public String value() {
        return name();
    }

    public static Exact4AlphaNumericTextFixed fromValue(String v) {
        return valueOf(v);
    }

}
