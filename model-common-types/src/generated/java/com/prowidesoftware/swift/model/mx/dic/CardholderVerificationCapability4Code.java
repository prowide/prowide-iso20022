
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardholderVerificationCapability4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APKI"/>
 *     <enumeration value="CHDT"/>
 *     <enumeration value="MNSG"/>
 *     <enumeration value="MNVR"/>
 *     <enumeration value="FBIG"/>
 *     <enumeration value="FBIO"/>
 *     <enumeration value="FDSG"/>
 *     <enumeration value="FCPN"/>
 *     <enumeration value="FEPN"/>
 *     <enumeration value="NPIN"/>
 *     <enumeration value="PKIS"/>
 *     <enumeration value="SCEC"/>
 *     <enumeration value="NBIO"/>
 *     <enumeration value="NOVF"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardholderVerificationCapability4Code")
@XmlEnum
public enum CardholderVerificationCapability4Code {


    /**
     * Account based digital signature.
     * 
     */
    APKI,

    /**
     * Cardholder authentication data.
     * 
     */
    CHDT,

    /**
     * Manual signature verification.
     * 
     */
    MNSG,

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
     * Offline biometrics.
     * 
     */
    FBIO,

    /**
     * Offline digital signature analysis.
     * 
     */
    FDSG,

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
     * Online PIN (Personal Identification Number).
     * 
     */
    NPIN,

    /**
     * PKI (Public Key Infrastructure) based digital signature.
     * 
     */
    PKIS,

    /**
     * Three domain secure (three domain secure authentication of the cardholder).
     * 
     */
    SCEC,

    /**
     * Online biometrics.
     * 
     */
    NBIO,

    /**
     * No cardholder verification capability.
     * 
     */
    NOVF,

    /**
     * Other cardholder verification capabilities.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CardholderVerificationCapability4Code fromValue(String v) {
        return valueOf(v);
    }

}
