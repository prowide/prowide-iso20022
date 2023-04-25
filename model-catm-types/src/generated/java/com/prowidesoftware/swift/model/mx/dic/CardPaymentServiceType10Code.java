
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRTC"/>
 *     <enumeration value="CRTR"/>
 *     <enumeration value="CRTK"/>
 *     <enumeration value="WLSR"/>
 *     <enumeration value="WLSA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
