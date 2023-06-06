
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operation3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Operation3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANDD"/>
 *     <enumeration value="ORRR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Operation3Code")
@XmlEnum
public enum Operation3Code {


    /**
     * Indicates that only when all if all of its elements are valid, the whole expression is valid.
     * 
     */
    ANDD,

    /**
     * Indicates that when at least one of its elements is valid, the whole expression is valid.
     * 
     */
    ORRR;

    public String value() {
        return name();
    }

    public static Operation3Code fromValue(String v) {
        return valueOf(v);
    }

}
