
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginProduct1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MarginProduct1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EQUI"/>
 *     <enumeration value="FIXI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarginProduct1Code")
@XmlEnum
public enum MarginProduct1Code {


    /**
     * Specifies that the margin is related to equities.
     * 
     */
    EQUI,

    /**
     * Specifies that the margin is related to fixed income.
     * 
     */
    FIXI;

    public String value() {
        return name();
    }

    public static MarginProduct1Code fromValue(String v) {
        return valueOf(v);
    }

}
