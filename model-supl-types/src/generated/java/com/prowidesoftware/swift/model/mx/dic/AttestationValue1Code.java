
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttestationValue1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttestationValue1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLAI"/&gt;
 *     &lt;enumeration value="HONO"/&gt;
 *     &lt;enumeration value="NCLA"/&gt;
 *     &lt;enumeration value="NHON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttestationValue1Code")
@XmlEnum
public enum AttestationValue1Code {


    /**
     * Attestation claimed.
     * 
     */
    CLAI,

    /**
     * Attestation validated.
     * 
     */
    HONO,

    /**
     * Attestation not claimed.
     * 
     */
    NCLA,

    /**
     * Attestation failed validation.
     * 
     */
    NHON;

    public String value() {
        return name();
    }

    public static AttestationValue1Code fromValue(String v) {
        return valueOf(v);
    }

}
