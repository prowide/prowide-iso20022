
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardholderVerificationCapability5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APKI"/&gt;
 *     &lt;enumeration value="NOVF"/&gt;
 *     &lt;enumeration value="FBIG"/&gt;
 *     &lt;enumeration value="FBIO"/&gt;
 *     &lt;enumeration value="FDSG"/&gt;
 *     &lt;enumeration value="FCPN"/&gt;
 *     &lt;enumeration value="FEPN"/&gt;
 *     &lt;enumeration value="NBIO"/&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SIGN"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *     &lt;enumeration value="VORN"/&gt;
 *     &lt;enumeration value="PKIS"/&gt;
 *     &lt;enumeration value="NOPN"/&gt;
 *     &lt;enumeration value="NOOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
