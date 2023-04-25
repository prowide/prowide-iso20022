
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardholderVerificationCapability5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APKI"/>
 *     <enumeration value="NOVF"/>
 *     <enumeration value="FBIG"/>
 *     <enumeration value="FBIO"/>
 *     <enumeration value="FDSG"/>
 *     <enumeration value="FCPN"/>
 *     <enumeration value="FEPN"/>
 *     <enumeration value="NBIO"/>
 *     <enumeration value="NPIN"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SIGN"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="VORN"/>
 *     <enumeration value="PKIS"/>
 *     <enumeration value="NOPN"/>
 *     <enumeration value="NOOP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardholderVerificationCapability5Code")
@XmlEnum
public enum CardholderVerificationCapability5Code {


    /**
     * Account based digital signature.
     * 
     */
    APKI,

    /**
     * No cardholder verification capability.
     * 
     */
    NOVF,

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
     * Online biometrics.
     * 
     */
    NBIO,

    /**
     * Online PIN (Personal Identification Number).
     * 
     */
    NPIN,

    /**
     * Other type of cardholder verification defined at national level
     * 
     */
    OTHN,

    /**
     * Other type of cardholder verification defined in a private manner.
     * 
     */
    OTHP,

    /**
     * Handwritten signature verification
     * 
     */
    SIGN,

    /**
     * Cardholder verification capability unspecified.
     * 
     */
    UNSP,

    /**
     * Recognition by voice.
     * 
     */
    VORN,

    /**
     * PKI (Public Key Infrastructure) based digital signature.
     * 
     */
    PKIS,

    /**
     * Device has no pin entry capability.
     * 
     */
    NOPN,

    /**
     * Device has no online pin entry capability.
     * 
     */
    NOOP;

    public String value() {
        return name();
    }

    public static CardholderVerificationCapability5Code fromValue(String v) {
        return valueOf(v);
    }

}
