
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Operation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TILL"/>
 *     <enumeration value="ORRR"/>
 *     <enumeration value="ANDD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Operation1Code")
@XmlEnum
public enum Operation1Code {


    /**
     * Indicates a range delimited by two variables.
     * 
     */
    TILL,

    /**
     * Indicates either of two variables is valid, but not both.
     * 
     */
    ORRR,

    /**
     * Indicates that only when both variables are given, the operation is valid.
     * 
     */
    ANDD;

    public String value() {
        return name();
    }

    public static Operation1Code fromValue(String v) {
        return valueOf(v);
    }

}
