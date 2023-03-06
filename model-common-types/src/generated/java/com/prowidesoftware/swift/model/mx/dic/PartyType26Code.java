
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType26Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType26Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="ICCA"/&gt;
 *     &lt;enumeration value="CISS"/&gt;
 *     &lt;enumeration value="DLIS"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType26Code")
@XmlEnum
public enum PartyType26Code {


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
     * Other card payment entity type defined at national level
     * 
     */
    OTHN,

    /**
     * Other card payment entity type defined at private level
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static PartyType26Code fromValue(String v) {
        return valueOf(v);
    }

}
