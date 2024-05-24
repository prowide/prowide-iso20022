
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationEntity2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuthenticationEntity2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ICCD"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="MERC"/>
 *     <enumeration value="ACQR"/>
 *     <enumeration value="ISSR"/>
 *     <enumeration value="TRML"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
