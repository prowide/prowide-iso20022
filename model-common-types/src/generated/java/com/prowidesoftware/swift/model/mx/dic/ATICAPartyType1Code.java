
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATICAPartyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATICAPartyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCP"/>
 *     <enumeration value="ACQR"/>
 *     <enumeration value="ICCA"/>
 *     <enumeration value="CISS"/>
 *     <enumeration value="DLIS"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="ACQP"/>
 *     <enumeration value="CISP"/>
 *     <enumeration value="WLPR"/>
 *     <enumeration value="PASP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATICAPartyType1Code")
@XmlEnum
public enum ATICAPartyType1Code {


    /**
     * Card acceptor, party accepting the card and presenting transaction data to the acquirer.
     * 
     */
    ACCP,

    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Application in the smart card.
     * 
     */
    ICCA,

    /**
     * Party that issues cards.
     * 
     */
    CISS,

    /**
     * Party to whom the card issuer delegates to authorise card payment transactions.
     * 
     */
    DLIS,

    /**
     * Entity providing card payment processing services acting as an intermediary between an acquirer and an issuer.
     * 
     */
    AGNT,

    /**
     * Entity providing acquiring card payment processing services on behalf on an acquirer.
     * 
     */
    ACQP,

    /**
     * Entity providing issuing card payment processing services on behalf on an issuer.
     * 
     */
    CISP,

    /**
     * Provider of an electronic wallet
     * 
     */
    WLPR,

    /**
     * Entity provding payments services.
     * 
     */
    PASP;

    public String value() {
        return name();
    }

    public static ATICAPartyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
