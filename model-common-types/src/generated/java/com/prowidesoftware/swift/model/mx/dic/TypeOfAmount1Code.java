
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTL"/>
 *     <enumeration value="ESTM"/>
 *     <enumeration value="MAXI"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="RPLT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount1Code")
@XmlEnum
public enum TypeOfAmount1Code {


    /**
     * Actual amount.
     * 
     */
    ACTL,

    /**
     * Estimated amount (the final amount could be above or below).
     * 
     */
    ESTM,

    /**
     * Maximum amount (the final amount must be less or equal).
     * 
     */
    MAXI,

    /**
     * Default amount.
     * 
     */
    DFLT,

    /**
     * Replacement amount.
     * 
     */
    RPLT;

    public String value() {
        return name();
    }

    public static TypeOfAmount1Code fromValue(String v) {
        return valueOf(v);
    }

}
