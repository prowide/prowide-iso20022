
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingInterestRateType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingInterestRateType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOND"/&gt;
 *     &lt;enumeration value="BNDF"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="IFUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
