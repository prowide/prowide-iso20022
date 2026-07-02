
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardholderVerificationCapability4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APKI"/&gt;
 *     &lt;enumeration value="CHDT"/&gt;
 *     &lt;enumeration value="MNSG"/&gt;
 *     &lt;enumeration value="MNVR"/&gt;
 *     &lt;enumeration value="FBIG"/&gt;
 *     &lt;enumeration value="FBIO"/&gt;
 *     &lt;enumeration value="FDSG"/&gt;
 *     &lt;enumeration value="FCPN"/&gt;
 *     &lt;enumeration value="FEPN"/&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="PKIS"/&gt;
 *     &lt;enumeration value="SCEC"/&gt;
 *     &lt;enumeration value="NBIO"/&gt;
 *     &lt;enumeration value="NOVF"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
