
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttestationValue1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AttestationValue1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLAI"/>
 *     <enumeration value="HONO"/>
 *     <enumeration value="NCLA"/>
 *     <enumeration value="NHON"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
