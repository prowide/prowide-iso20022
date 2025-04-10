
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSHB"/>
 *     <enumeration value="GRTY"/>
 *     <enumeration value="FEES"/>
 *     <enumeration value="RBTS"/>
 *     <enumeration value="VATX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount2Code")
@XmlEnum
public enum TypeOfAmount2Code {


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
     * Fees.
     * 
     */
    FEES,

    /**
     * Global rebate of the transaction. This amount is counted as a negative amount.
     * 
     */
    RBTS,

    /**
     * Value added tax amount.
     * 
     */
    VATX;

    public String value() {
        return name();
    }

    public static TypeOfAmount2Code fromValue(String v) {
        return valueOf(v);
    }

}
