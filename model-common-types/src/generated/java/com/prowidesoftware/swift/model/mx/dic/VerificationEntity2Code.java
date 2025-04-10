
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationEntity2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VerificationEntity2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MERC"/>
 *     <enumeration value="ACQR"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="ISSR"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="CDAD"/>
 *     <enumeration value="ICCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VerificationEntity2Code")
@XmlEnum
public enum VerificationEntity2Code {


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
     * Other type of authentication entity defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of authentication entity defined at private level.
     * 
     */
    OTHP,

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

    public static VerificationEntity2Code fromValue(String v) {
        return valueOf(v);
    }

}
