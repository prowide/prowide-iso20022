
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardholderVerificationCapability3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPIN"/>
 *     <enumeration value="FCPN"/>
 *     <enumeration value="FEPN"/>
 *     <enumeration value="FDSG"/>
 *     <enumeration value="FBIO"/>
 *     <enumeration value="FBIG"/>
 *     <enumeration value="PKIS"/>
 *     <enumeration value="PCOD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardholderVerificationCapability3Code")
@XmlEnum
public enum CardholderVerificationCapability3Code {


    /**
     * Online PIN (Personal Identification Number).
     * 
     */
    NPIN,

    /**
     * Offline PIN in clear (Personal Identification Number).
     * 
     */
    FCPN,

    /**
     * Offline PIN encrypted (Personal Identification Number).
     * 
     */
    FEPN,

    /**
     * Offline digital signature analysis.
     * 
     */
    FDSG,

    /**
     * Offline biometrics.
     * 
     */
    FBIO,

    /**
     * Offline biographics.
     * 
     */
    FBIG,

    /**
     * PKI (Public Key Infrastructure) based digital signature.
     * 
     */
    PKIS,

    /**
     * Personal code of the customer for banking services.
     * 
     */
    PCOD;

    public String value() {
        return name();
    }

    public static CardholderVerificationCapability3Code fromValue(String v) {
        return valueOf(v);
    }

}
