
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateCalculationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DateCalculationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIFO"/>
 *     <enumeration value="LIFO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DateCalculationMethod1Code")
@XmlEnum
public enum DateCalculationMethod1Code {


    /**
     * First in, first out. 
     * 
     */
    FIFO,

    /**
     * Last in, first out. 
     * 
     */
    LIFO;

    public String value() {
        return name();
    }

    public static DateCalculationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
