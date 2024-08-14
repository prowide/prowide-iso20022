
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorityExchangeReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuthorityExchangeReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAFI"/>
 *     <enumeration value="ADHR"/>
 *     <enumeration value="CABC"/>
 *     <enumeration value="CABB"/>
 *     <enumeration value="CADB"/>
 *     <enumeration value="CADU"/>
 *     <enumeration value="CAEB"/>
 *     <enumeration value="CAIX"/>
 *     <enumeration value="CAMB"/>
 *     <enumeration value="CASB"/>
 *     <enumeration value="CATV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AuthorityExchangeReason1Code")
@XmlEnum
public enum AuthorityExchangeReason1Code {


    /**
     * Competent Authority for Instrument.
     * 
     */
    CAFI,

    /**
     * Ad Hoc Request.
     * 
     */
    ADHR,

    /**
     * Competent Authority for Basket Constituent.
     * 
     */
    CABC,

    /**
     * Competent Authority for Buyer Branch.
     * 
     */
    CABB,

    /**
     * Competent Authority for Decision Making Branch.
     * 
     */
    CADB,

    /**
     * Competent Authority for Direct Underlying.
     * 
     */
    CADU,

    /**
     * Competent Authority for Executing Branch.
     * 
     */
    CAEB,

    /**
     * Competent Authority for Index.
     * 
     */
    CAIX,

    /**
     * Competent Authority for Membership Branch.
     * 
     */
    CAMB,

    /**
     * Competent Authority for Seller Branch.
     * 
     */
    CASB,

    /**
     * Competent Authority for Trading Venue.
     * 
     */
    CATV;

    public String value() {
        return name();
    }

    public static AuthorityExchangeReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
