
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundingDirection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RoundingDirection1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RDUP"/>
 *     <enumeration value="RDWN"/>
 *     <enumeration value="STAN"/>
 *     <enumeration value="DIST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoundingDirection1Code")
@XmlEnum
public enum RoundingDirection1Code {


    /**
     * Round up to the nearest whole number.
     * 
     */
    RDUP,

    /**
     * Round down to the nearest whole number.
     * 
     */
    RDWN,

    /**
     * Round up or down to the nearest whole number.
     * 
     */
    STAN,

    /**
     * Do not round.
     * 
     */
    DIST;

    public String value() {
        return name();
    }

    public static RoundingDirection1Code fromValue(String v) {
        return valueOf(v);
    }

}
