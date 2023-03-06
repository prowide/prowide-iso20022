
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType32Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType32Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="ISUR"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType32Code")
@XmlEnum
public enum PartyType32Code {


    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Entity providing card payment processing services acting as an intermediary between an acquirer and an issuer.
     * 
     */
    AGNT,

    /**
     * Issuer is the entitled party.
     * 
     */
    ISUR,

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

    public static PartyType32Code fromValue(String v) {
        return valueOf(v);
    }

}
