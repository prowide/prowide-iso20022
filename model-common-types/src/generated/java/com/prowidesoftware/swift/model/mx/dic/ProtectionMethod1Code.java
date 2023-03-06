
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectionMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectionMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SELM"/&gt;
 *     &lt;enumeration value="SNCL"/&gt;
 *     &lt;enumeration value="SOFT"/&gt;
 *     &lt;enumeration value="TEEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
