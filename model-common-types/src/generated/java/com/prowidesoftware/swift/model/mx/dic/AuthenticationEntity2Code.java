
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationEntity2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationEntity2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ICCD"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="ISSR"/&gt;
 *     &lt;enumeration value="TRML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationEntity2Code")
@XmlEnum
public enum AuthenticationEntity2Code {


    /**
     * Application in the chip card (Integrated Circuit Card), for instance an offline PIN verification.
     * 
     */
    ICCD,

    /**
     * Authorisation agent of the issuer.
     * 
     */
    AGNT,

    /**
     * Merchant (for example signature verification by the attendant).
     * 
     */
    MERC,

    /**
     * Acquirer of the transaction.
     * 
     */
    ACQR,

    /**
     * Card issuer.
     * 
     */
    ISSR,

    /**
     * Secure application in the terminal.
     * 
     */
    TRML;

    public String value() {
        return name();
    }

    public static AuthenticationEntity2Code fromValue(String v) {
        return valueOf(v);
    }

}
