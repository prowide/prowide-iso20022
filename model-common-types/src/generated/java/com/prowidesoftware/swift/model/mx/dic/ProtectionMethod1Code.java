
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectionMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProtectionMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SELM"/>
 *     <enumeration value="SNCL"/>
 *     <enumeration value="SOFT"/>
 *     <enumeration value="TEEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProtectionMethod1Code")
@XmlEnum
public enum ProtectionMethod1Code {


    /**
     * Other code assigned by national organisation.
     * 
     */
    OTHN,

    /**
     * Other privately assigned code.
     * 
     */
    OTHP,

    /**
     * Secure element method.
     * 
     */
    SELM,

    /**
     * Secure enclave method.
     * 
     */
    SNCL,

    /**
     * Software protection method.
     * 
     */
    SOFT,

    /**
     * Trusted execution environment method.
     * 
     */
    TEEN;

    public String value() {
        return name();
    }

    public static ProtectionMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
