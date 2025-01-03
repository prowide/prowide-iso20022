
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INTC"/>
 *     <enumeration value="FEEP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="FEEA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount10Code")
@XmlEnum
public enum TypeOfAmount10Code {


    /**
     * Interchange fee.
     * 
     */
    INTC,

    /**
     * Processing fees.
     * 
     */
    FEEP,

    /**
     * Other type of amount defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of amount defined at private level.
     * 
     */
    OTHP,

    /**
     * International service assessment fees.
     * 
     */
    FEEA;

    public String value() {
        return name();
    }

    public static TypeOfAmount10Code fromValue(String v) {
        return valueOf(v);
    }

}
