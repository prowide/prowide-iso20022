
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MoveType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STAT"/&gt;
 *     &lt;enumeration value="FLOA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
