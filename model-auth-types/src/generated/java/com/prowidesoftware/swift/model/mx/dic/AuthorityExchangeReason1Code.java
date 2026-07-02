
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorityExchangeReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorityExchangeReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAFI"/&gt;
 *     &lt;enumeration value="ADHR"/&gt;
 *     &lt;enumeration value="CABC"/&gt;
 *     &lt;enumeration value="CABB"/&gt;
 *     &lt;enumeration value="CADB"/&gt;
 *     &lt;enumeration value="CADU"/&gt;
 *     &lt;enumeration value="CAEB"/&gt;
 *     &lt;enumeration value="CAIX"/&gt;
 *     &lt;enumeration value="CAMB"/&gt;
 *     &lt;enumeration value="CASB"/&gt;
 *     &lt;enumeration value="CATV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
