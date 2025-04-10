
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonIdentificationType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PersonIdentificationType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATIN"/>
 *     <enumeration value="GTIN"/>
 *     <enumeration value="ITIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PersonIdentificationType7Code")
@XmlEnum
public enum PersonIdentificationType7Code {


    /**
     * Temporary tax processing number (used in the domestic adoption of a child).
     * 
     */
    ATIN,

    /**
     * Generic tax identification number.
     * 
     */
    GTIN,

    /**
     * Tax processing number.
     * 
     */
    ITIN;

    public String value() {
        return name();
    }

    public static PersonIdentificationType7Code fromValue(String v) {
        return valueOf(v);
    }

}
