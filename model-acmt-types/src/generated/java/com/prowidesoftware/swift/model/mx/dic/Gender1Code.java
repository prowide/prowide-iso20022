
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gender1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Gender1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FEMA"/>
 *     <enumeration value="MALE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Gender1Code")
@XmlEnum
public enum Gender1Code {


    /**
     * Individual is a female.
     * 
     */
    FEMA,

    /**
     * Individual is a male.
     * 
     */
    MALE;

    public String value() {
        return name();
    }

    public static Gender1Code fromValue(String v) {
        return valueOf(v);
    }

}
