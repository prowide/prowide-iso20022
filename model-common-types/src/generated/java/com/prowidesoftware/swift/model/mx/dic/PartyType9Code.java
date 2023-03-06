
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="ACQP"/&gt;
 *     &lt;enumeration value="CISS"/&gt;
 *     &lt;enumeration value="CISP"/&gt;
 *     &lt;enumeration value="CSCH"/&gt;
 *     &lt;enumeration value="SCHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType9Code")
@XmlEnum
public enum PartyType9Code {


    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Entity providing acquiring card payment processing services on behalf on an acquirer.
     * 
     */
    ACQP,

    /**
     * Party that issues cards.
     * 
     */
    CISS,

    /**
     * Entity providing issuing card payment processing services on behalf on an issuer.
     * 
     */
    CISP,

    /**
     * Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer.
     * 
     */
    CSCH,

    /**
     * Entity providing card payment processing services acting on behalf of a card scheme.
     * 
     */
    SCHP;

    public String value() {
        return name();
    }

    public static PartyType9Code fromValue(String v) {
        return valueOf(v);
    }

}
