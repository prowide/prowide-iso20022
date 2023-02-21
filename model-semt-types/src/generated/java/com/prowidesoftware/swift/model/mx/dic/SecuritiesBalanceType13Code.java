
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesBalanceType13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLOK"/&gt;
 *     &lt;enumeration value="AWAS"/&gt;
 *     &lt;enumeration value="AVAI"/&gt;
 *     &lt;enumeration value="NOMI"/&gt;
 *     &lt;enumeration value="PLED"/&gt;
 *     &lt;enumeration value="REGO"/&gt;
 *     &lt;enumeration value="RSTR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="SPOS"/&gt;
 *     &lt;enumeration value="UNRG"/&gt;
 *     &lt;enumeration value="ISSU"/&gt;
 *     &lt;enumeration value="QUAS"/&gt;
 *     &lt;enumeration value="COLA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType13Code")
@XmlEnum
public enum SecuritiesBalanceType13Code {


    /**
     * Balance of financial instruments that are blocked.
     * 
     */
    BLOK,

    /**
     * Balance of financial instruments that are freely available with no specific additional status.
     * 
     */
    AWAS,

    /**
     * Balance of financial instruments that are available.
     * 
     */
    AVAI,

    /**
     * Balance of financial instruments that are registered (in nominee name or in the name of the beneficial owner).
     * 
     */
    NOMI,

    /**
     * Balance of securities that belong to and is kept in the safekeeping account indicated within this message, and that are pledged.
     * 
     */
    PLED,

    /**
     * Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).
     * 
     */
    REGO,

    /**
     * Balance of financial instruments that may only be sold under certain conditions or require legal documents.
     * 
     */
    RSTR,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Balance of financial instruments that remain registered in the name of the prior beneficial owner.
     * 
     */
    SPOS,

    /**
     * Balance of securities that could not be registered due to foreign ownership limitation.
     * 
     */
    UNRG,

    /**
     * In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has been received.
     * 
     */
    ISSU,

    /**
     * In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has not yet been received.
     * 
     */
    QUAS,

    /**
     * Balance of securities that are eligible for use for collateral purposes.
     * 
     */
    COLA;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType13Code fromValue(String v) {
        return valueOf(v);
    }

}
