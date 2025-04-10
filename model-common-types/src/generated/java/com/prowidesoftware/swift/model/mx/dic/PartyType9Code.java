
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACQR"/>
 *     <enumeration value="ACQP"/>
 *     <enumeration value="CISS"/>
 *     <enumeration value="CISP"/>
 *     <enumeration value="CSCH"/>
 *     <enumeration value="SCHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
