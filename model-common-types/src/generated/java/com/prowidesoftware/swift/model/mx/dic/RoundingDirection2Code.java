
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundingDirection2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RoundingDirection2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RDUP"/>
 *     <enumeration value="RDWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoundingDirection2Code")
@XmlEnum
public enum RoundingDirection2Code {


    /**
     * Round up to the nearest whole number.
     * 
     */
    RDUP,

    /**
     * Round down to the nearest whole number.
     * 
     */
    RDWN;

    public String value() {
        return name();
    }

    public static RoundingDirection2Code fromValue(String v) {
        return valueOf(v);
    }

}
