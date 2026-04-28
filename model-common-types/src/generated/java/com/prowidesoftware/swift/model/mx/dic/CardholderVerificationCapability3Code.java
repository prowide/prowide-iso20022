
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardholderVerificationCapability3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="FCPN"/&gt;
 *     &lt;enumeration value="FEPN"/&gt;
 *     &lt;enumeration value="FDSG"/&gt;
 *     &lt;enumeration value="FBIO"/&gt;
 *     &lt;enumeration value="FBIG"/&gt;
 *     &lt;enumeration value="PKIS"/&gt;
 *     &lt;enumeration value="PCOD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
