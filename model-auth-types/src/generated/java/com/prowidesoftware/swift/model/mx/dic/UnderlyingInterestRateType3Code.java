
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingInterestRateType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnderlyingInterestRateType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOND"/>
 *     <enumeration value="BNDF"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="IFUT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnderlyingInterestRateType3Code")
@XmlEnum
public enum UnderlyingInterestRateType3Code {


    /**
     * Underlying is a bond.
     * 
     */
    BOND,

    /**
     * Underlying is a bond future.
     * 
     */
    BNDF,

    /**
     * Underlying is interest rate.
     * 
     */
    INTR,

    /**
     * Underlying is an interest rate future or a forward rate agreement (FRA).
     * 
     */
    IFUT;

    public String value() {
        return name();
    }

    public static UnderlyingInterestRateType3Code fromValue(String v) {
        return valueOf(v);
    }

}
