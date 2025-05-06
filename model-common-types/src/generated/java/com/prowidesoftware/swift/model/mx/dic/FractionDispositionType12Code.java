
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionDispositionType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FractionDispositionType12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RDDN"/>
 *     <enumeration value="RDUP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FractionDispositionType12Code")
@XmlEnum
public enum FractionDispositionType12Code {


    /**
     * Round down to the nearest whole number.
     * 
     */
    RDDN,

    /**
     * Round up to the nearest whole number.
     * 
     */
    RDUP;

    public String value() {
        return name();
    }

    public static FractionDispositionType12Code fromValue(String v) {
        return valueOf(v);
    }

}
