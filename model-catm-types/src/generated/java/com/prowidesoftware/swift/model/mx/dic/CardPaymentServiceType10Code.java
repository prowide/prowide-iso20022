
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRTC"/&gt;
 *     &lt;enumeration value="CRTR"/&gt;
 *     &lt;enumeration value="CRTK"/&gt;
 *     &lt;enumeration value="WLSR"/&gt;
 *     &lt;enumeration value="WLSA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType10Code")
@XmlEnum
public enum CardPaymentServiceType10Code {


    /**
     * Creation of an X.509 certificate with the public key and the information of the owner of the asymmetric key provided by the requestor.
     * 
     */
    CRTC,

    /**
     * Renewal of an X.509 certificate, protected by the certificate to renew.
     * 
     */
    CRTR,

    /**
     * Revocation of an active X.509 certificate.
     * 
     */
    CRTK,

    /**
     * Remove a POI from the white list of the terminal manager.
     * 
     */
    WLSR,

    /**
     * Add a POI in the white list of the terminal manager.
     * 
     */
    WLSA;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType10Code fromValue(String v) {
        return valueOf(v);
    }

}
