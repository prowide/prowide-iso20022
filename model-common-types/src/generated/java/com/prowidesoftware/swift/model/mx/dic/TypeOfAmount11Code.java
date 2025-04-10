
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTL"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="ESTM"/>
 *     <enumeration value="MAXI"/>
 *     <enumeration value="RESD"/>
 *     <enumeration value="PRXY"/>
 *     <enumeration value="DPST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount11Code")
@XmlEnum
public enum TypeOfAmount11Code {


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
     * Reserved or updated reserved amount for reservation.
     * 
     */
    RESD,

    /**
     * Substitute for an amount to be authorised.
     * 
     */
    PRXY,

    /**
     * Deposit amount.
     * 
     */
    DPST;

    public String value() {
        return name();
    }

    public static TypeOfAmount11Code fromValue(String v) {
        return valueOf(v);
    }

}
