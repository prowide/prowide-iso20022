
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Standardisation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Standardisation1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLEX"/&gt;
 *     &lt;enumeration value="NSTA"/&gt;
 *     &lt;enumeration value="STAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
