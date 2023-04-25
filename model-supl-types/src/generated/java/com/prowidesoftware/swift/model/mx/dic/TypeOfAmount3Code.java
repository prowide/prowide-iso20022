
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSHB"/>
 *     <enumeration value="GRTY"/>
 *     <enumeration value="SRVF"/>
 *     <enumeration value="INTC"/>
 *     <enumeration value="ORIG"/>
 *     <enumeration value="SRCH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount3Code")
@XmlEnum
public enum TypeOfAmount3Code {


    /**
     * Cash-back amount.
     * 
     */
    CSHB,

    /**
     * Gratuity amount.
     * 
     */
    GRTY,

    /**
     * Service fee.
     * 
     */
    SRVF,

    /**
     * Interchange fee.
     * 
     */
    INTC,

    /**
     * Original amount authorised during the real-time authorisation process.
     * 
     */
    ORIG,

    /**
     * Extra fee for a purchase or a withdrawal.
     * 
     */
    SRCH;

    public String value() {
        return name();
    }

    public static TypeOfAmount3Code fromValue(String v) {
        return valueOf(v);
    }

}
