
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConductClassification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConductClassification1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NSTA"/>
 *     <enumeration value="RCLT"/>
 *     <enumeration value="STAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConductClassification1Code")
@XmlEnum
public enum ConductClassification1Code {


    /**
     * Non standard or unusual.
     * 
     */
    NSTA,

    /**
     * Reluctant.
     * 
     */
    RCLT,

    /**
     * Standard.
     * 
     */
    STAN;

    public String value() {
        return name();
    }

    public static ConductClassification1Code fromValue(String v) {
        return valueOf(v);
    }

}
