
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingContractForDifferenceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnderlyingContractForDifferenceType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOND"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="EMAL"/>
 *     <enumeration value="EQUI"/>
 *     <enumeration value="FTEQ"/>
 *     <enumeration value="OPEQ"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnderlyingContractForDifferenceType3Code")
@XmlEnum
public enum UnderlyingContractForDifferenceType3Code {


    /**
     * Underlying is a bond.
     * 
     */
    BOND,

    /**
     * Underlying is a commodity.
     * 
     */
    COMM,

    /**
     * Underlying is a currency.
     * 
     */
    CURR,

    /**
     * Underlying is an emission allowance.
     * 
     */
    EMAL,

    /**
     * Underlying is an equity.
     * 
     */
    EQUI,

    /**
     * Underlying is a future on equity.
     * 
     */
    FTEQ,

    /**
     * Underlying is an option on equity.
     * 
     */
    OPEQ,

    /**
     * Underlying is of other type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static UnderlyingContractForDifferenceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
