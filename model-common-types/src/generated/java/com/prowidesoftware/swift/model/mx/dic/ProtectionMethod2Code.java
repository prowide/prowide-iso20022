
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectionMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProtectionMethod2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SELM"/>
 *     <enumeration value="SNCL"/>
 *     <enumeration value="SOFT"/>
 *     <enumeration value="TEEN"/>
 *     <enumeration value="TPMD"/>
 *     <enumeration value="VTEE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProtectionMethod2Code")
@XmlEnum
public enum ProtectionMethod2Code {


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
    TEEN,

    /**
     * Trusted Platform Module (TPM).
     * 
     */
    TPMD,

    /**
     * Virtual trusted execution environment	
     * 
     */
    VTEE;

    public String value() {
        return name();
    }

    public static ProtectionMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
