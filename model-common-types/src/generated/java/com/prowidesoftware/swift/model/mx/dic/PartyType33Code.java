
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType33Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType33Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPOI"/>
 *     <enumeration value="MERC"/>
 *     <enumeration value="ACCP"/>
 *     <enumeration value="ITAG"/>
 *     <enumeration value="ACQR"/>
 *     <enumeration value="CISS"/>
 *     <enumeration value="DLIS"/>
 *     <enumeration value="MTMG"/>
 *     <enumeration value="TAXH"/>
 *     <enumeration value="TMGT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyType33Code")
@XmlEnum
public enum PartyType33Code {


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
    DLIS,

    /**
     * Responsible for the maintenance of a card payment acceptance terminal.
     * 
     */
    MTMG,

    /**
     * Tax authority.
     * 
     */
    TAXH,

    /**
     * Responsible for one or several maintenance functions of a card payment acceptance terminal.
     * 
     */
    TMGT;

    public String value() {
        return name();
    }

    public static PartyType33Code fromValue(String v) {
        return valueOf(v);
    }

}
