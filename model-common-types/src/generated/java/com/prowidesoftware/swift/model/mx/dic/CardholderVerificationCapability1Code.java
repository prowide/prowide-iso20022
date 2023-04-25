
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardholderVerificationCapability1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MNSG"/>
 *     <enumeration value="NPIN"/>
 *     <enumeration value="FCPN"/>
 *     <enumeration value="FEPN"/>
 *     <enumeration value="FDSG"/>
 *     <enumeration value="FBIO"/>
 *     <enumeration value="MNVR"/>
 *     <enumeration value="FBIG"/>
 *     <enumeration value="APKI"/>
 *     <enumeration value="PKIS"/>
 *     <enumeration value="CHDT"/>
 *     <enumeration value="SCEC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardholderVerificationCapability1Code")
@XmlEnum
public enum CardholderVerificationCapability1Code {


    /**
     * Manual signature verification.
     * 
     */
    MNSG,

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
     * Other manual verification, for example passport or drivers license.
     * 
     */
    MNVR,

    /**
     * Offline biographics.
     * 
     */
    FBIG,

    /**
     * Account based digital signature.
     * 
     */
    APKI,

    /**
     * PKI (Public Key Infrastructure) based digital signature.
     * 
     */
    PKIS,

    /**
     * Cardholder authentication data.
     * 
     */
    CHDT,

    /**
     * Three domain secure (three domain secure authentication of the cardholder).
     * 
     */
    SCEC;

    public String value() {
        return name();
    }

    public static CardholderVerificationCapability1Code fromValue(String v) {
        return valueOf(v);
    }

}
