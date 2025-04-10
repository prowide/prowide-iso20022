
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Standardisation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Standardisation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FLEX"/>
 *     <enumeration value="NSTA"/>
 *     <enumeration value="STAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Standardisation1Code")
@XmlEnum
public enum Standardisation1Code {


    /**
     * Derivatives defined according to exchange specifications, but certain characteristics can be user defined.
     * 
     */
    FLEX,

    /**
     * Custom-made instrument between two parties. Underlying
     * instruments, expiration date and contract size of the derivatives are not standardised.
     * 
     */
    NSTA,

    /**
     * The underlying instruments, expiration date and contract size of the derivatives are standardised.
     * 
     */
    STAN;

    public String value() {
        return name();
    }

    public static Standardisation1Code fromValue(String v) {
        return valueOf(v);
    }

}
