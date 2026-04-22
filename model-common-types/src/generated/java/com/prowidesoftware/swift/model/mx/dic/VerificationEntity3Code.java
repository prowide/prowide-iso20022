
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationEntity3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VerificationEntity3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MERC"/>
 *     <enumeration value="ACQR"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="ISSR"/>
 *     <enumeration value="CDAD"/>
 *     <enumeration value="ICCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VerificationEntity3Code")
@XmlEnum
public enum VerificationEntity3Code {


    /**
     * Acceptor (for example signature verification by the attendant).
     * 
     */
    MERC,

    /**
     * Acquirer of the transaction.
     * 
     */
    ACQR,

    /**
     * Entity providing card payment processing services acting as an intermediary between (or on behalf of) an acquirer and an issuer.
     * 
     */
    AGNT,

    /**
     * Card issuer.
     * 
     */
    ISSR,

    /**
     * Type of Device to accept payment
     * 
     */
    CDAD,

    /**
     * Application in the smart card.
     * 
     */
    ICCA;

    public String value() {
        return name();
    }

    public static VerificationEntity3Code fromValue(String v) {
        return valueOf(v);
    }

}
