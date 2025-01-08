
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType28Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType28Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCP"/>
 *     <enumeration value="ACQR"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="WLPR"/>
 *     <enumeration value="ISUR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyType28Code")
@XmlEnum
public enum PartyType28Code {


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
    OTHP,

    /**
     * Provider of an electronic wallet
     * 
     */
    WLPR,

    /**
     * Issuer is the entitled party.
     * 
     */
    ISUR;

    public String value() {
        return name();
    }

    public static PartyType28Code fromValue(String v) {
        return valueOf(v);
    }

}
