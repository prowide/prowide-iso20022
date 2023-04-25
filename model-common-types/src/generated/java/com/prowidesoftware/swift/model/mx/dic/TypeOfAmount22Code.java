
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount22Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount22Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTL"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="DPST"/>
 *     <enumeration value="ESTM"/>
 *     <enumeration value="MAXI"/>
 *     <enumeration value="PRXY"/>
 *     <enumeration value="RESD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount22Code")
@XmlEnum
public enum TypeOfAmount22Code {


    /**
     * Actual amount.
     * 
     */
    ACTL,

    /**
     * Default amount.
     * 
     */
    DFLT,

    /**
     * Deposit amount.
     * 
     */
    DPST,

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
     * Substitute for an amount to be authorised.
     * 
     */
    PRXY,

    /**
     * Reserved or updated reserved amount for reservation.
     * 
     */
    RESD;

    public String value() {
        return name();
    }

    public static TypeOfAmount22Code fromValue(String v) {
        return valueOf(v);
    }

}
