
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnicalValidationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TechnicalValidationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RCCF"/&gt;
 *     &lt;enumeration value="RCER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
