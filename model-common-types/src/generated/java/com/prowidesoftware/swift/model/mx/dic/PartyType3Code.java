
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPOI"/>
 *     <enumeration value="MERC"/>
 *     <enumeration value="ACCP"/>
 *     <enumeration value="ITAG"/>
 *     <enumeration value="ACQR"/>
 *     <enumeration value="CISS"/>
 *     <enumeration value="DLIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyType3Code")
@XmlEnum
public enum PartyType3Code {


    /**
     * Point Of Interaction initiating the card payment transaction.
     * 
     */
    OPOI,

    /**
     * Merchant providing goods and service in the card payment transaction.
     * 
     */
    MERC,

    /**
     * Card acceptor, party accepting the card and presenting transaction data to the acquirer.
     * 
     */
    ACCP,

    /**
     * Party acting on behalf of other parties to process or forward data to other parties.
     * 
     */
    ITAG,

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
     * Party to whom the card issuer delegates to authorise card payment transactions.
     * 
     */
    DLIS;

    public String value() {
        return name();
    }

    public static PartyType3Code fromValue(String v) {
        return valueOf(v);
    }

}
