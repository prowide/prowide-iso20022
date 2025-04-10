
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPOI"/>
 *     <enumeration value="ACCP"/>
 *     <enumeration value="MERC"/>
 *     <enumeration value="ACQR"/>
 *     <enumeration value="ITAG"/>
 *     <enumeration value="MTMG"/>
 *     <enumeration value="TMGT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyType5Code")
@XmlEnum
public enum PartyType5Code {


    /**
     * Point Of Interaction initiating the card payment transaction.
     * 
     */
    OPOI,

    /**
     * Card acceptor, party accepting the card and presenting transaction data to the acquirer.
     * 
     */
    ACCP,

    /**
     * Merchant providing goods and service in the card payment transaction.
     * 
     */
    MERC,

    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Party acting on behalf of other parties to process or forward data to other parties.
     * 
     */
    ITAG,

    /**
     * Responsible for the maintenance of a card payment acceptance terminal.
     * 
     */
    MTMG,

    /**
     * Responsible for one or several maintenance functions of a card payment acceptance terminal.
     * 
     */
    TMGT;

    public String value() {
        return name();
    }

    public static PartyType5Code fromValue(String v) {
        return valueOf(v);
    }

}
