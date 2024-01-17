
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RestrictionStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="INAC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RestrictionStatus1Code")
@XmlEnum
public enum RestrictionStatus1Code {


    /**
     * Status of the restriction is active.
     * 
     */
    ACTV,

    /**
     * Status of the restriction is inactive.
     * 
     */
    INAC;

    public String value() {
        return name();
    }

    public static RestrictionStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
