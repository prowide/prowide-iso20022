
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderAddressVerificationResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardholderAddressVerificationResult1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMCH"/>
 *     <enumeration value="ANMH"/>
 *     <enumeration value="ANMT"/>
 *     <enumeration value="ANMO"/>
 *     <enumeration value="AMSS"/>
 *     <enumeration value="ANUS"/>
 *     <enumeration value="PMCH"/>
 *     <enumeration value="PNMH"/>
 *     <enumeration value="PNMT"/>
 *     <enumeration value="PNMO"/>
 *     <enumeration value="PMSS"/>
 *     <enumeration value="PNUS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardholderAddressVerificationResult1Code")
@XmlEnum
public enum CardholderAddressVerificationResult1Code {


    /**
     * Address numeric match.
     * 
     */
    AMCH,

    /**
     * Address numerics do not match.
     * 
     */
    ANMH,

    /**
     * Address numeric not processed for technical reason.
     * 
     */
    ANMT,

    /**
     * Address numeric not processed for non-technical reason.
     * 
     */
    ANMO,

    /**
     * Address numeric missing in request.
     * 
     */
    AMSS,

    /**
     * Address numeric not used by issuer.
     * 
     */
    ANUS,

    /**
     * Postal code matches.
     * 
     */
    PMCH,

    /**
     * Postal code does not match.
     * 
     */
    PNMH,

    /**
     * Postal code not processed for technical reason.
     * 
     */
    PNMT,

    /**
     * Postal code not processed for non-technical reason.
     * 
     */
    PNMO,

    /**
     * Postal code missing in request.
     * 
     */
    PMSS,

    /**
     * Postal code not used by issuer.
     * 
     */
    PNUS;

    public String value() {
        return name();
    }

    public static CardholderAddressVerificationResult1Code fromValue(String v) {
        return valueOf(v);
    }

}
