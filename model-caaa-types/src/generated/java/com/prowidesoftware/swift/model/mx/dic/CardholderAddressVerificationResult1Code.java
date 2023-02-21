
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderAddressVerificationResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardholderAddressVerificationResult1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMCH"/&gt;
 *     &lt;enumeration value="ANMH"/&gt;
 *     &lt;enumeration value="ANMT"/&gt;
 *     &lt;enumeration value="ANMO"/&gt;
 *     &lt;enumeration value="AMSS"/&gt;
 *     &lt;enumeration value="ANUS"/&gt;
 *     &lt;enumeration value="PMCH"/&gt;
 *     &lt;enumeration value="PNMH"/&gt;
 *     &lt;enumeration value="PNMT"/&gt;
 *     &lt;enumeration value="PNMO"/&gt;
 *     &lt;enumeration value="PMSS"/&gt;
 *     &lt;enumeration value="PNUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
