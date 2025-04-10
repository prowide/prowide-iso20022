
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateValueType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RateValueType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RateValueType7Code")
@XmlEnum
public enum RateValueType7Code {


    /**
     * Rate is unknown by the sender or has not been established.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static RateValueType7Code fromValue(String v) {
        return valueOf(v);
    }

}
