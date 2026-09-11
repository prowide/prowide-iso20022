
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICCFallbackReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ICCFallbackReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CIIA"/>
 *     <enumeration value="EDIP"/>
 *     <enumeration value="TERI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ICCFallbackReason2Code")
@XmlEnum
public enum ICCFallbackReason2Code {


    /**
     * Choosing incorrect IC application.
     * 
     */
    CIIA,

    /**
     * Error during IC app processing.
     * 
     * 
     */
    EDIP,

    /**
     * Terminal error reading IC data.
     * 
     * 
     */
    TERI;

    public String value() {
        return name();
    }

    public static ICCFallbackReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
