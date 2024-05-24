
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaturityRedemptionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MaturityRedemptionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FRED"/>
 *     <enumeration value="PRNR"/>
 *     <enumeration value="PRWR"/>
 *     <enumeration value="RNDM"/>
 *     <enumeration value="PRRA"/>
 *     <enumeration value="CALL"/>
 *     <enumeration value="PUUT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MaturityRedemptionType1Code")
@XmlEnum
public enum MaturityRedemptionType1Code {


    /**
     * Indicates that the type of redemption at maturity is final.
     * 
     */
    FRED,

    /**
     * Indicates that the type of redemption at maturity is partial without reduction.
     * 
     */
    PRNR,

    /**
     * Indicates that the type of redemption at maturity is partial with reduction.
     * 
     */
    PRWR,

    /**
     * Indicates that the type of redemption at maturity is drawing at random.
     * 
     */
    RNDM,

    /**
     * Indicates that the type of redemption at maturity is drawing pro-rata.
     * 
     */
    PRRA,

    /**
     * Indicates that the type of redemption at maturity is call.
     * 
     */
    CALL,

    /**
     * Indicates that the type of redemption at maturity is put.
     * 
     */
    PUUT;

    public String value() {
        return name();
    }

    public static MaturityRedemptionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
