
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTL"/>
 *     <enumeration value="ESTM"/>
 *     <enumeration value="MAXI"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="RPLT"/>
 *     <enumeration value="INCR"/>
 *     <enumeration value="DECR"/>
 *     <enumeration value="RESD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount8Code")
@XmlEnum
public enum TypeOfAmount8Code {


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
    RPLT,

    /**
     * Incremental amount for reservation.
     * 
     */
    INCR,

    /**
     * Decremental amount for reservation.
     * 
     */
    DECR,

    /**
     * Reserved or updated reserved amount for reservation.
     * 
     */
    RESD;

    public String value() {
        return name();
    }

    public static TypeOfAmount8Code fromValue(String v) {
        return valueOf(v);
    }

}
