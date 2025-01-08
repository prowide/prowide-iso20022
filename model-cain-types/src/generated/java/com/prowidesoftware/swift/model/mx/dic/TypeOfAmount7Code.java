
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FEES"/>
 *     <enumeration value="FEEI"/>
 *     <enumeration value="FEEH"/>
 *     <enumeration value="FEEP"/>
 *     <enumeration value="FEEA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount7Code")
@XmlEnum
public enum TypeOfAmount7Code {


    /**
     * Fees.
     * 
     */
    FEES,

    /**
     * Fees amount from the card issuer.
     * 
     */
    FEEI,

    /**
     * Interchange fees.
     * 
     */
    FEEH,

    /**
     * Processing fees.
     * 
     */
    FEEP,

    /**
     * International service assessment fees.
     * 
     */
    FEEA;

    public String value() {
        return name();
    }

    public static TypeOfAmount7Code fromValue(String v) {
        return valueOf(v);
    }

}
