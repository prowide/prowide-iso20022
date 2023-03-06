
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType18Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType18Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="CISS"/&gt;
 *     &lt;enumeration value="CSCH"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType18Code")
@XmlEnum
public enum PartyType18Code {


    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Party that issues cards.
     * 
     */
    CISS,

    /**
     * Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer.
     * 
     */
    CSCH,

    /**
     * Entity providing card payment processing services acting as an intermediary between an acquirer and an issuer.
     * 
     */
    AGNT;

    public String value() {
        return name();
    }

    public static PartyType18Code fromValue(String v) {
        return valueOf(v);
    }

}
