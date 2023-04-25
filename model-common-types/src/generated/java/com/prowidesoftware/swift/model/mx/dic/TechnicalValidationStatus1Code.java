
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnicalValidationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TechnicalValidationStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RCCF"/>
 *     <enumeration value="RCER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TechnicalValidationStatus1Code")
@XmlEnum
public enum TechnicalValidationStatus1Code {


    /**
     * Indicates that the request has been correctly received and that the technical validation was successful.
     * 
     */
    RCCF,

    /**
     * Indicates there was an error in the reception of the request or that the technical validation was not successful.
     * 
     */
    RCER;

    public String value() {
        return name();
    }

    public static TechnicalValidationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
