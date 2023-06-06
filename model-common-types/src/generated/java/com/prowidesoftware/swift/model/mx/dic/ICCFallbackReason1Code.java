
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICCFallbackReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ICCFallbackReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CIIA"/>
 *     <enumeration value="EDIP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="TERI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ICCFallbackReason1Code")
@XmlEnum
public enum ICCFallbackReason1Code {


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
     * Other ICC fallback reason defined at national level.
     * 
     */
    OTHN,

    /**
     * Other ICC fallback reason defined at private level.
     * 
     */
    OTHP,

    /**
     * Terminal error reading IC data.
     * 
     * 
     */
    TERI;

    public String value() {
        return name();
    }

    public static ICCFallbackReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
