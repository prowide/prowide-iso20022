
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardisationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StandardisationCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STAN"/>
 *     <enumeration value="NSTA"/>
 *     <enumeration value="FLEX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StandardisationCode")
@XmlEnum
public enum StandardisationCode {


    /**
     * The underlying instruments, expiration date and contract size of the derivatives are standardised.
     * 
     */
    STAN,

    /**
     * Custom-made instrument between two parties. Underlying
     * instruments, expiration date and contract size of the derivatives are not standardised.
     * 
     */
    NSTA,

    /**
     * Derivatives defined according to exchange specifications, but certain characteristics can be user defined.
     * 
     */
    FLEX;

    public String value() {
        return name();
    }

    public static StandardisationCode fromValue(String v) {
        return valueOf(v);
    }

}
