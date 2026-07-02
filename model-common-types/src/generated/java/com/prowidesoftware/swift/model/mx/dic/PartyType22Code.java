
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType22Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType22Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRDH"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType22Code")
@XmlEnum
public enum PartyType22Code {


    /**
     * Holder of a payment card.
     * 
     */
    CRDH,

    /**
     * Merchant providing goods and service in the card payment transaction.
     * 
     */
    MERC,

    /**
     * Other card payment entity type defined at national level
     * 
     */
    OTHN,

    /**
     * Other card payment entity type defined at private level
     * 
     */
    OTHP,

    /**
     * Entity providing card payment processing services acting as an intermediary between an acquirer and an issuer.
     * 
     */
    AGNT;

    public String value() {
        return name();
    }

    public static PartyType22Code fromValue(String v) {
        return valueOf(v);
    }

}
