
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardholderVerificationCapability1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MNSG"/&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="FCPN"/&gt;
 *     &lt;enumeration value="FEPN"/&gt;
 *     &lt;enumeration value="FDSG"/&gt;
 *     &lt;enumeration value="FBIO"/&gt;
 *     &lt;enumeration value="MNVR"/&gt;
 *     &lt;enumeration value="FBIG"/&gt;
 *     &lt;enumeration value="APKI"/&gt;
 *     &lt;enumeration value="PKIS"/&gt;
 *     &lt;enumeration value="CHDT"/&gt;
 *     &lt;enumeration value="SCEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
