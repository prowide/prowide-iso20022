
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MoveType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STAT"/>
 *     <enumeration value="FLOA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MoveType1Code")
@XmlEnum
public enum MoveType1Code {


    /**
     * Indicates that the peg is static/fixed.
     * 
     */
    STAT,

    /**
     * Indicates that peg floats.
     * 
     */
    FLOA;

    public String value() {
        return name();
    }

    public static MoveType1Code fromValue(String v) {
        return valueOf(v);
    }

}
